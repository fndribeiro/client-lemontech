
package br.com.lemontech.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for aereo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aereo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localizadorGds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="menorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maiorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ciaMenorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPassageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aereoTarifa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoTarifa" minOccurs="0"/>
 *         &lt;element name="aereoSeguimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoSeguimento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formaPagamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aereoBilhete" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoBilhete" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="selfbook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="justificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canceladoEmitido" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="codigoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoVoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorBackOfficeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}remarks" minOccurs="0"/>
 *         &lt;element name="statusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valorMulta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorReembolso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dataModificacaoStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalAereo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cancelado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="identificadoresIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}identificadoresIntegracao" minOccurs="0"/>
 *         &lt;element name="reemissao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}reemissao" minOccurs="0"/>
 *         &lt;element name="consolidadora" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}consolidadora" minOccurs="0"/>
 *         &lt;element name="autoEmissao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="importado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="complementoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agenteOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="opcaoRota" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pontoVenda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}pontoVendaOrcamento" minOccurs="0"/>
 *         &lt;element name="localizadorPreTripGds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credencial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}credencial" minOccurs="0"/>
 *         &lt;element name="ciaValidadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milhas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agenteCotacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}agente" minOccurs="0"/>
 *         &lt;element name="agenteEmissao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}agente" minOccurs="0"/>
 *         &lt;element name="observacoesGerais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUsuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusBilhete" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}enumStatusBilhete" minOccurs="0"/>
 *         &lt;element name="dataOrcamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="quantidadeConexao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="validadeBilhete" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="carbono" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantidadeArvores" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantidadeEscala" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ordemcompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaMedia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="idCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cartaoCp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fonePax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rgPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascimentoPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aprovado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereo", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", propOrder = {
    "id",
    "localizador",
    "localizadorGds",
    "source",
    "codigoEmissor",
    "nomeEmissor",
    "emailEmissor",
    "codigoReservador",
    "nomeReservador",
    "dataVencimento",
    "dataEmissao",
    "dataReserva",
    "menorTarifa",
    "maiorTarifa",
    "ciaMenorTarifa",
    "codigoFornecedor",
    "idPassageiroRef",
    "aereoTarifa",
    "aereoSeguimento",
    "formaPagamento",
    "aereoBilhete",
    "selfbook",
    "justificativaMaiorTarifa",
    "canceladoEmitido",
    "nacional",
    "codigoJustificativaMaiorTarifa",
    "observacao",
    "tipoVoo",
    "identificadorIntegracao",
    "identificadorBackOfficeTipoProduto",
    "remarks",
    "statusCancelamento",
    "valorMulta",
    "valorReembolso",
    "dataModificacaoStatusCancelamento",
    "usuarioModificouStatusCancelamento",
    "totalAereo",
    "cancelado",
    "identificadoresIntegracao",
    "reemissao",
    "consolidadora",
    "autoEmissao",
    "importado",
    "online",
    "complementoJustificativaMaiorTarifa",
    "agenteOnline",
    "opcaoRota",
    "pontoVenda",
    "localizadorPreTripGds",
    "credencial",
    "ciaValidadora",
    "milhas",
    "codigoConsultor",
    "nomeConsultor",
    "emailConsultor",
    "nomeTipoProduto",
    "baseTarifaria",
    "agenteCotacao",
    "agenteEmissao",
    "observacoesGerais",
    "tarifaFornecedor",
    "idOperador",
    "nomeUsuarioModificouStatusCancelamento",
    "statusBilhete",
    "dataOrcamento",
    "quantidadeConexao",
    "validadeBilhete",
    "carbono",
    "quantidadeArvores",
    "quantidadeEscala",
    "ordemcompra",
    "tarifaMedia",
    "idCartao",
    "cartaoCp",
    "emailPax",
    "fonePax",
    "rgPax",
    "cpfPax",
    "dataNascimentoPax",
    "aprovado"
})
public class Aereo {

    protected int id;
    protected String localizador;
    protected Boolean localizadorGds;
    protected String source;
    protected String codigoEmissor;
    protected String nomeEmissor;
    protected String emailEmissor;
    protected String codigoReservador;
    protected String nomeReservador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    protected Double menorTarifa;
    protected Double maiorTarifa;
    protected String ciaMenorTarifa;
    protected String codigoFornecedor;
    @XmlElement(nillable = true)
    protected List<Integer> idPassageiroRef;
    protected AereoTarifa aereoTarifa;
    @XmlElement(nillable = true)
    protected List<AereoSeguimento> aereoSeguimento;
    @XmlElement(nillable = true)
    protected List<FormaPagamento> formaPagamento;
    @XmlElement(nillable = true)
    protected List<AereoBilhete> aereoBilhete;
    protected boolean selfbook;
    protected String justificativaMaiorTarifa;
    protected Boolean canceladoEmitido;
    protected Boolean nacional;
    protected String codigoJustificativaMaiorTarifa;
    protected String observacao;
    protected String tipoVoo;
    protected String identificadorIntegracao;
    protected String identificadorBackOfficeTipoProduto;
    protected Remarks remarks;
    protected Integer statusCancelamento;
    protected Double valorMulta;
    protected Double valorReembolso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModificacaoStatusCancelamento;
    protected Integer usuarioModificouStatusCancelamento;
    protected Double totalAereo;
    protected boolean cancelado;
    protected IdentificadoresIntegracao identificadoresIntegracao;
    protected Reemissao reemissao;
    protected Consolidadora consolidadora;
    protected boolean autoEmissao;
    protected boolean importado;
    protected boolean online;
    protected String complementoJustificativaMaiorTarifa;
    protected boolean agenteOnline;
    protected boolean opcaoRota;
    protected PontoVendaOrcamento pontoVenda;
    protected String localizadorPreTripGds;
    protected Credencial credencial;
    protected String ciaValidadora;
    protected Integer milhas;
    protected String codigoConsultor;
    protected String nomeConsultor;
    protected String emailConsultor;
    protected String nomeTipoProduto;
    protected String baseTarifaria;
    @XmlSchemaType(name = "string")
    protected Agente agenteCotacao;
    @XmlSchemaType(name = "string")
    protected Agente agenteEmissao;
    protected String observacoesGerais;
    protected String tarifaFornecedor;
    protected String idOperador;
    protected String nomeUsuarioModificouStatusCancelamento;
    @XmlSchemaType(name = "string")
    protected EnumStatusBilhete statusBilhete;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOrcamento;
    protected Integer quantidadeConexao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validadeBilhete;
    protected Double carbono;
    protected Double quantidadeArvores;
    protected Integer quantidadeEscala;
    protected String ordemcompra;
    protected Double tarifaMedia;
    protected String idCartao;
    protected String cartaoCp;
    protected String emailPax;
    protected String fonePax;
    protected String rgPax;
    protected String cpfPax;
    protected String dataNascimentoPax;
    protected boolean aprovado;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the localizador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Sets the value of the localizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Gets the value of the localizadorGds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalizadorGds() {
        return localizadorGds;
    }

    /**
     * Sets the value of the localizadorGds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalizadorGds(Boolean value) {
        this.localizadorGds = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the codigoEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmissor() {
        return codigoEmissor;
    }

    /**
     * Sets the value of the codigoEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmissor(String value) {
        this.codigoEmissor = value;
    }

    /**
     * Gets the value of the nomeEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmissor() {
        return nomeEmissor;
    }

    /**
     * Sets the value of the nomeEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmissor(String value) {
        this.nomeEmissor = value;
    }

    /**
     * Gets the value of the emailEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEmissor() {
        return emailEmissor;
    }

    /**
     * Sets the value of the emailEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEmissor(String value) {
        this.emailEmissor = value;
    }

    /**
     * Gets the value of the codigoReservador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservador() {
        return codigoReservador;
    }

    /**
     * Sets the value of the codigoReservador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservador(String value) {
        this.codigoReservador = value;
    }

    /**
     * Gets the value of the nomeReservador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeReservador() {
        return nomeReservador;
    }

    /**
     * Sets the value of the nomeReservador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeReservador(String value) {
        this.nomeReservador = value;
    }

    /**
     * Gets the value of the dataVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Sets the value of the dataVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the dataReserva property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReserva() {
        return dataReserva;
    }

    /**
     * Sets the value of the dataReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReserva(XMLGregorianCalendar value) {
        this.dataReserva = value;
    }

    /**
     * Gets the value of the menorTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMenorTarifa() {
        return menorTarifa;
    }

    /**
     * Sets the value of the menorTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMenorTarifa(Double value) {
        this.menorTarifa = value;
    }

    /**
     * Gets the value of the maiorTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaiorTarifa() {
        return maiorTarifa;
    }

    /**
     * Sets the value of the maiorTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaiorTarifa(Double value) {
        this.maiorTarifa = value;
    }

    /**
     * Gets the value of the ciaMenorTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiaMenorTarifa() {
        return ciaMenorTarifa;
    }

    /**
     * Sets the value of the ciaMenorTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiaMenorTarifa(String value) {
        this.ciaMenorTarifa = value;
    }

    /**
     * Gets the value of the codigoFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * Sets the value of the codigoFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFornecedor(String value) {
        this.codigoFornecedor = value;
    }

    /**
     * Gets the value of the idPassageiroRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idPassageiroRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdPassageiroRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdPassageiroRef() {
        if (idPassageiroRef == null) {
            idPassageiroRef = new ArrayList<Integer>();
        }
        return this.idPassageiroRef;
    }

    /**
     * Gets the value of the aereoTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link AereoTarifa }
     *     
     */
    public AereoTarifa getAereoTarifa() {
        return aereoTarifa;
    }

    /**
     * Sets the value of the aereoTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AereoTarifa }
     *     
     */
    public void setAereoTarifa(AereoTarifa value) {
        this.aereoTarifa = value;
    }

    /**
     * Gets the value of the aereoSeguimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aereoSeguimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoSeguimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoSeguimento }
     * 
     * 
     */
    public List<AereoSeguimento> getAereoSeguimento() {
        if (aereoSeguimento == null) {
            aereoSeguimento = new ArrayList<AereoSeguimento>();
        }
        return this.aereoSeguimento;
    }

    /**
     * Gets the value of the formaPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formaPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormaPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormaPagamento }
     * 
     * 
     */
    public List<FormaPagamento> getFormaPagamento() {
        if (formaPagamento == null) {
            formaPagamento = new ArrayList<FormaPagamento>();
        }
        return this.formaPagamento;
    }

    /**
     * Gets the value of the aereoBilhete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aereoBilhete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoBilhete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoBilhete }
     * 
     * 
     */
    public List<AereoBilhete> getAereoBilhete() {
        if (aereoBilhete == null) {
            aereoBilhete = new ArrayList<AereoBilhete>();
        }
        return this.aereoBilhete;
    }

    /**
     * Gets the value of the selfbook property.
     * 
     */
    public boolean isSelfbook() {
        return selfbook;
    }

    /**
     * Sets the value of the selfbook property.
     * 
     */
    public void setSelfbook(boolean value) {
        this.selfbook = value;
    }

    /**
     * Gets the value of the justificativaMaiorTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }

    /**
     * Sets the value of the justificativaMaiorTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaMaiorTarifa(String value) {
        this.justificativaMaiorTarifa = value;
    }

    /**
     * Gets the value of the canceladoEmitido property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanceladoEmitido() {
        return canceladoEmitido;
    }

    /**
     * Sets the value of the canceladoEmitido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanceladoEmitido(Boolean value) {
        this.canceladoEmitido = value;
    }

    /**
     * Gets the value of the nacional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNacional() {
        return nacional;
    }

    /**
     * Sets the value of the nacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNacional(Boolean value) {
        this.nacional = value;
    }

    /**
     * Gets the value of the codigoJustificativaMaiorTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }

    /**
     * Sets the value of the codigoJustificativaMaiorTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJustificativaMaiorTarifa(String value) {
        this.codigoJustificativaMaiorTarifa = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the tipoVoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVoo() {
        return tipoVoo;
    }

    /**
     * Sets the value of the tipoVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVoo(String value) {
        this.tipoVoo = value;
    }

    /**
     * Gets the value of the identificadorIntegracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }

    /**
     * Sets the value of the identificadorIntegracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorIntegracao(String value) {
        this.identificadorIntegracao = value;
    }

    /**
     * Gets the value of the identificadorBackOfficeTipoProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }

    /**
     * Sets the value of the identificadorBackOfficeTipoProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOfficeTipoProduto(String value) {
        this.identificadorBackOfficeTipoProduto = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the statusCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Sets the value of the statusCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCancelamento(Integer value) {
        this.statusCancelamento = value;
    }

    /**
     * Gets the value of the valorMulta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMulta() {
        return valorMulta;
    }

    /**
     * Sets the value of the valorMulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMulta(Double value) {
        this.valorMulta = value;
    }

    /**
     * Gets the value of the valorReembolso property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorReembolso() {
        return valorReembolso;
    }

    /**
     * Sets the value of the valorReembolso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorReembolso(Double value) {
        this.valorReembolso = value;
    }

    /**
     * Gets the value of the dataModificacaoStatusCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }

    /**
     * Sets the value of the dataModificacaoStatusCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModificacaoStatusCancelamento(XMLGregorianCalendar value) {
        this.dataModificacaoStatusCancelamento = value;
    }

    /**
     * Gets the value of the usuarioModificouStatusCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }

    /**
     * Sets the value of the usuarioModificouStatusCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioModificouStatusCancelamento(Integer value) {
        this.usuarioModificouStatusCancelamento = value;
    }

    /**
     * Gets the value of the totalAereo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAereo() {
        return totalAereo;
    }

    /**
     * Sets the value of the totalAereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAereo(Double value) {
        this.totalAereo = value;
    }

    /**
     * Gets the value of the cancelado property.
     * 
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * Sets the value of the cancelado property.
     * 
     */
    public void setCancelado(boolean value) {
        this.cancelado = value;
    }

    /**
     * Gets the value of the identificadoresIntegracao property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public IdentificadoresIntegracao getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }

    /**
     * Sets the value of the identificadoresIntegracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public void setIdentificadoresIntegracao(IdentificadoresIntegracao value) {
        this.identificadoresIntegracao = value;
    }

    /**
     * Gets the value of the reemissao property.
     * 
     * @return
     *     possible object is
     *     {@link Reemissao }
     *     
     */
    public Reemissao getReemissao() {
        return reemissao;
    }

    /**
     * Sets the value of the reemissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reemissao }
     *     
     */
    public void setReemissao(Reemissao value) {
        this.reemissao = value;
    }

    /**
     * Gets the value of the consolidadora property.
     * 
     * @return
     *     possible object is
     *     {@link Consolidadora }
     *     
     */
    public Consolidadora getConsolidadora() {
        return consolidadora;
    }

    /**
     * Sets the value of the consolidadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidadora }
     *     
     */
    public void setConsolidadora(Consolidadora value) {
        this.consolidadora = value;
    }

    /**
     * Gets the value of the autoEmissao property.
     * 
     */
    public boolean isAutoEmissao() {
        return autoEmissao;
    }

    /**
     * Sets the value of the autoEmissao property.
     * 
     */
    public void setAutoEmissao(boolean value) {
        this.autoEmissao = value;
    }

    /**
     * Gets the value of the importado property.
     * 
     */
    public boolean isImportado() {
        return importado;
    }

    /**
     * Sets the value of the importado property.
     * 
     */
    public void setImportado(boolean value) {
        this.importado = value;
    }

    /**
     * Gets the value of the online property.
     * 
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     */
    public void setOnline(boolean value) {
        this.online = value;
    }

    /**
     * Gets the value of the complementoJustificativaMaiorTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoJustificativaMaiorTarifa() {
        return complementoJustificativaMaiorTarifa;
    }

    /**
     * Sets the value of the complementoJustificativaMaiorTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoJustificativaMaiorTarifa(String value) {
        this.complementoJustificativaMaiorTarifa = value;
    }

    /**
     * Gets the value of the agenteOnline property.
     * 
     */
    public boolean isAgenteOnline() {
        return agenteOnline;
    }

    /**
     * Sets the value of the agenteOnline property.
     * 
     */
    public void setAgenteOnline(boolean value) {
        this.agenteOnline = value;
    }

    /**
     * Gets the value of the opcaoRota property.
     * 
     */
    public boolean isOpcaoRota() {
        return opcaoRota;
    }

    /**
     * Sets the value of the opcaoRota property.
     * 
     */
    public void setOpcaoRota(boolean value) {
        this.opcaoRota = value;
    }

    /**
     * Gets the value of the pontoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }

    /**
     * Sets the value of the pontoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public void setPontoVenda(PontoVendaOrcamento value) {
        this.pontoVenda = value;
    }

    /**
     * Gets the value of the localizadorPreTripGds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizadorPreTripGds() {
        return localizadorPreTripGds;
    }

    /**
     * Sets the value of the localizadorPreTripGds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizadorPreTripGds(String value) {
        this.localizadorPreTripGds = value;
    }

    /**
     * Gets the value of the credencial property.
     * 
     * @return
     *     possible object is
     *     {@link Credencial }
     *     
     */
    public Credencial getCredencial() {
        return credencial;
    }

    /**
     * Sets the value of the credencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credencial }
     *     
     */
    public void setCredencial(Credencial value) {
        this.credencial = value;
    }

    /**
     * Gets the value of the ciaValidadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiaValidadora() {
        return ciaValidadora;
    }

    /**
     * Sets the value of the ciaValidadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiaValidadora(String value) {
        this.ciaValidadora = value;
    }

    /**
     * Gets the value of the milhas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMilhas() {
        return milhas;
    }

    /**
     * Sets the value of the milhas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMilhas(Integer value) {
        this.milhas = value;
    }

    /**
     * Gets the value of the codigoConsultor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConsultor() {
        return codigoConsultor;
    }

    /**
     * Sets the value of the codigoConsultor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConsultor(String value) {
        this.codigoConsultor = value;
    }

    /**
     * Gets the value of the nomeConsultor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConsultor() {
        return nomeConsultor;
    }

    /**
     * Sets the value of the nomeConsultor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConsultor(String value) {
        this.nomeConsultor = value;
    }

    /**
     * Gets the value of the emailConsultor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailConsultor() {
        return emailConsultor;
    }

    /**
     * Sets the value of the emailConsultor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailConsultor(String value) {
        this.emailConsultor = value;
    }

    /**
     * Gets the value of the nomeTipoProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTipoProduto() {
        return nomeTipoProduto;
    }

    /**
     * Sets the value of the nomeTipoProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTipoProduto(String value) {
        this.nomeTipoProduto = value;
    }

    /**
     * Gets the value of the baseTarifaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTarifaria() {
        return baseTarifaria;
    }

    /**
     * Sets the value of the baseTarifaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTarifaria(String value) {
        this.baseTarifaria = value;
    }

    /**
     * Gets the value of the agenteCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link Agente }
     *     
     */
    public Agente getAgenteCotacao() {
        return agenteCotacao;
    }

    /**
     * Sets the value of the agenteCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agente }
     *     
     */
    public void setAgenteCotacao(Agente value) {
        this.agenteCotacao = value;
    }

    /**
     * Gets the value of the agenteEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link Agente }
     *     
     */
    public Agente getAgenteEmissao() {
        return agenteEmissao;
    }

    /**
     * Sets the value of the agenteEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agente }
     *     
     */
    public void setAgenteEmissao(Agente value) {
        this.agenteEmissao = value;
    }

    /**
     * Gets the value of the observacoesGerais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    /**
     * Sets the value of the observacoesGerais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoesGerais(String value) {
        this.observacoesGerais = value;
    }

    /**
     * Gets the value of the tarifaFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaFornecedor() {
        return tarifaFornecedor;
    }

    /**
     * Sets the value of the tarifaFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaFornecedor(String value) {
        this.tarifaFornecedor = value;
    }

    /**
     * Gets the value of the idOperador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOperador() {
        return idOperador;
    }

    /**
     * Sets the value of the idOperador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOperador(String value) {
        this.idOperador = value;
    }

    /**
     * Gets the value of the nomeUsuarioModificouStatusCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUsuarioModificouStatusCancelamento() {
        return nomeUsuarioModificouStatusCancelamento;
    }

    /**
     * Sets the value of the nomeUsuarioModificouStatusCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUsuarioModificouStatusCancelamento(String value) {
        this.nomeUsuarioModificouStatusCancelamento = value;
    }

    /**
     * Gets the value of the statusBilhete property.
     * 
     * @return
     *     possible object is
     *     {@link EnumStatusBilhete }
     *     
     */
    public EnumStatusBilhete getStatusBilhete() {
        return statusBilhete;
    }

    /**
     * Sets the value of the statusBilhete property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumStatusBilhete }
     *     
     */
    public void setStatusBilhete(EnumStatusBilhete value) {
        this.statusBilhete = value;
    }

    /**
     * Gets the value of the dataOrcamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOrcamento() {
        return dataOrcamento;
    }

    /**
     * Sets the value of the dataOrcamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOrcamento(XMLGregorianCalendar value) {
        this.dataOrcamento = value;
    }

    /**
     * Gets the value of the quantidadeConexao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeConexao() {
        return quantidadeConexao;
    }

    /**
     * Sets the value of the quantidadeConexao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeConexao(Integer value) {
        this.quantidadeConexao = value;
    }

    /**
     * Gets the value of the validadeBilhete property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeBilhete() {
        return validadeBilhete;
    }

    /**
     * Sets the value of the validadeBilhete property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeBilhete(XMLGregorianCalendar value) {
        this.validadeBilhete = value;
    }

    /**
     * Gets the value of the carbono property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCarbono() {
        return carbono;
    }

    /**
     * Sets the value of the carbono property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCarbono(Double value) {
        this.carbono = value;
    }

    /**
     * Gets the value of the quantidadeArvores property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantidadeArvores() {
        return quantidadeArvores;
    }

    /**
     * Sets the value of the quantidadeArvores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantidadeArvores(Double value) {
        this.quantidadeArvores = value;
    }

    /**
     * Gets the value of the quantidadeEscala property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeEscala() {
        return quantidadeEscala;
    }

    /**
     * Sets the value of the quantidadeEscala property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeEscala(Integer value) {
        this.quantidadeEscala = value;
    }

    /**
     * Gets the value of the ordemcompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdemcompra() {
        return ordemcompra;
    }

    /**
     * Sets the value of the ordemcompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdemcompra(String value) {
        this.ordemcompra = value;
    }

    /**
     * Gets the value of the tarifaMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifaMedia() {
        return tarifaMedia;
    }

    /**
     * Sets the value of the tarifaMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifaMedia(Double value) {
        this.tarifaMedia = value;
    }

    /**
     * Gets the value of the idCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCartao() {
        return idCartao;
    }

    /**
     * Sets the value of the idCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCartao(String value) {
        this.idCartao = value;
    }

    /**
     * Gets the value of the cartaoCp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartaoCp() {
        return cartaoCp;
    }

    /**
     * Sets the value of the cartaoCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartaoCp(String value) {
        this.cartaoCp = value;
    }

    /**
     * Gets the value of the emailPax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPax() {
        return emailPax;
    }

    /**
     * Sets the value of the emailPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPax(String value) {
        this.emailPax = value;
    }

    /**
     * Gets the value of the fonePax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonePax() {
        return fonePax;
    }

    /**
     * Sets the value of the fonePax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonePax(String value) {
        this.fonePax = value;
    }

    /**
     * Gets the value of the rgPax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgPax() {
        return rgPax;
    }

    /**
     * Sets the value of the rgPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgPax(String value) {
        this.rgPax = value;
    }

    /**
     * Gets the value of the cpfPax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfPax() {
        return cpfPax;
    }

    /**
     * Sets the value of the cpfPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfPax(String value) {
        this.cpfPax = value;
    }

    /**
     * Gets the value of the dataNascimentoPax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimentoPax() {
        return dataNascimentoPax;
    }

    /**
     * Sets the value of the dataNascimentoPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimentoPax(String value) {
        this.dataNascimentoPax = value;
    }

    /**
     * Gets the value of the aprovado property.
     * 
     */
    public boolean isAprovado() {
        return aprovado;
    }

    /**
     * Sets the value of the aprovado property.
     * 
     */
    public void setAprovado(boolean value) {
        this.aprovado = value;
    }

}
