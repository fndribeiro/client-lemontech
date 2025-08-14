package br.com.ribeiro.fernando;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingProvider;

import br.com.lemontech.wsclient.ObjectFactory;
import br.com.lemontech.wsclient.PesquisarSolicitacaoRequest;
import br.com.lemontech.wsclient.PesquisarSolicitacaoResponse;
import br.com.lemontech.wsclient.WsSelfBooking;
import br.com.lemontech.wsclient.WsSelfBookingService;

public class Main {

    private static final String KEY_CLIENT = "";
    private static final String USER_NAME  = "";
    private static final String PASSWORD   = "";

    private static final String ENDPOINT   = "https://wsselfbooking.lemontech.com.br:443/wsselfbooking/WsSelfBookingService";
    private static final int TOTAL_RESULTS = 119414;
    private static final int PAGE_SIZE     = 50;
    private static final int TOTAL_REQUESTS = (int) Math.ceil(TOTAL_RESULTS / (double) PAGE_SIZE);

    private static final int THREAD_POOL_SIZE = 50; // maximum concurrent threads
    
    private static final ObjectFactory factory = new ObjectFactory();

    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();
        System.out.println("=== Starting process for " + TOTAL_RESULTS + " results, " 
                           + TOTAL_REQUESTS + " requests needed ===");

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        DatatypeFactory factory = DatatypeFactory.newInstance();
        JAXBContext jaxbContext = JAXBContext.newInstance(PesquisarSolicitacaoResponse.class);

        List<Future<PesquisarSolicitacaoResponse>> futures = new ArrayList<>();

        int registroInicial = 1;
        for (int reqNum = 1; reqNum <= TOTAL_REQUESTS; reqNum++) {
            final int start = registroInicial;
            final int requestNumber = reqNum;

            futures.add(executor.submit(() -> {
                System.out.println("[REQ " + requestNumber + "] Sending request with registroInicial=" + start);

                WsSelfBookingService service = new WsSelfBookingService();
                WsSelfBooking port = service.getWsSelfBookingPort();

                BindingProvider bp = (BindingProvider) port;
                Map<String, Object> ctx = bp.getRequestContext();
                ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT);

                PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
                request.setDataInicial(factory.newXMLGregorianCalendar("2023-09-01T00:00:00"));
                request.setDataFinal(factory.newXMLGregorianCalendar("2025-07-31T23:59:59"));
                request.setRegistroInicial(start);
                request.setQuantidadeRegistros(PAGE_SIZE);
                request.setTipoSolicitacao("TODOS");

                PesquisarSolicitacaoResponse response = port.pesquisarSolicitacao(KEY_CLIENT, USER_NAME, PASSWORD, request);
                System.out.println("[REQ " + requestNumber + "] Response received for registroInicial=" + start);
                return response;
            }));

            registroInicial += PAGE_SIZE;
        }

        int fileCounter = 1;
        int responsesInFile = 0;
        List<PesquisarSolicitacaoResponse> buffer = new ArrayList<>();

        for (Future<PesquisarSolicitacaoResponse> future : futures) {
            PesquisarSolicitacaoResponse resp = future.get();
            buffer.add(resp);
            responsesInFile++;
            System.out.println("Number response in file: " + responsesInFile);

            if (responsesInFile == 1000) {
                saveResponses(buffer, fileCounter++, jaxbContext);
                buffer.clear();
                responsesInFile = 0;
            }
        }

        if (!buffer.isEmpty()) {
            saveResponses(buffer, fileCounter, jaxbContext);
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("=== Process completed in " + (totalTime / 1000.0) + " seconds ===");
    }

    private static void saveResponses(List<PesquisarSolicitacaoResponse> responses, int fileNumber, JAXBContext ctx) throws Exception {
        File outFile = Paths.get("src", "main", "resources", "response_" + fileNumber + ".xml").toFile();
        try (FileOutputStream fos = new FileOutputStream(outFile)) {
            Marshaller marshaller = ctx.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            for (PesquisarSolicitacaoResponse r : responses) {
                JAXBElement<PesquisarSolicitacaoResponse> element = factory.createPesquisarSolicitacaoResponse(r);
                marshaller.marshal(element, fos);
            }
        }
        System.out.println("[SAVE] Saved file: " + outFile.getAbsolutePath() + " (" + responses.size() + " responses)");
    }

}
