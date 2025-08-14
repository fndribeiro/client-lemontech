package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Manual implementation of "pesquisarSolicitacaoRequest"
 * All fields are Strings for easier manual usage.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "pesquisarSolicitacaoRequest",
    namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request",
    propOrder = {
        "dataInicial",
        "dataFinal",
        "registroInicial",
        "quantidadeRegistros",
        "tipoSolicitacao",
    }
)
public class PesquisarSolicitacaoRequest {

    @XmlElement(name = "dataInicial")
    private XMLGregorianCalendar dataInicial;

    @XmlElement(name = "dataFinal")
    private XMLGregorianCalendar dataFinal;

    @XmlElement(name = "registroInicial")
    private int registroInicial;

    @XmlElement(name = "quantidadeRegistros")
    private int quantidadeRegistros;

    @XmlElement(name = "tipoSolicitacao")
    private String tipoSolicitacao;

	public XMLGregorianCalendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(XMLGregorianCalendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public XMLGregorianCalendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(XMLGregorianCalendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public int getRegistroInicial() {
		return registroInicial;
	}

	public void setRegistroInicial(int registroInicial) {
		this.registroInicial = registroInicial;
	}

	public int getQuantidadeRegistros() {
		return quantidadeRegistros;
	}

	public void setQuantidadeRegistros(int quantidadeRegistros) {
		this.quantidadeRegistros = quantidadeRegistros;
	}

	public String getTipoSolicitacao() {
		return tipoSolicitacao;
	}

	public void setTipoSolicitacao(String tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}

}
