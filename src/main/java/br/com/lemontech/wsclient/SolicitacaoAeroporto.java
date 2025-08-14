
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for solicitacaoAeroporto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitacaoAeroporto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSolicitacaoAeroporto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuarioCriador" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/>
 *         &lt;element name="usuarioConcluiu" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/>
 *         &lt;element name="usuarioCancelou" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/>
 *         &lt;element name="baseAtendimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}baseAtendimento" minOccurs="0"/>
 *         &lt;element name="statusSolicitacaoAeroporto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}statusSolicitacaoAeroporto" minOccurs="0"/>
 *         &lt;element name="tipoAtendimentoAeroporto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}tipoAtendimentoAeroporto" minOccurs="0"/>
 *         &lt;element name="obsConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obsAtendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCriacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFinalizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="opcaoAtendimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}opcaoAtendimento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaoAeroporto", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", propOrder = {
    "idSolicitacaoAeroporto",
    "usuarioCriador",
    "usuarioConcluiu",
    "usuarioCancelou",
    "baseAtendimento",
    "statusSolicitacaoAeroporto",
    "tipoAtendimentoAeroporto",
    "obsConsultor",
    "obsAtendente",
    "dataCriacao",
    "dataFinalizacao",
    "dataCancelamento",
    "opcaoAtendimento"
})
public class SolicitacaoAeroporto {

    protected Integer idSolicitacaoAeroporto;
    protected Passageiro usuarioCriador;
    protected Passageiro usuarioConcluiu;
    protected Passageiro usuarioCancelou;
    protected BaseAtendimento baseAtendimento;
    @XmlSchemaType(name = "string")
    protected StatusSolicitacaoAeroporto statusSolicitacaoAeroporto;
    @XmlSchemaType(name = "string")
    protected TipoAtendimentoAeroporto tipoAtendimentoAeroporto;
    protected String obsConsultor;
    protected String obsAtendente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinalizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelamento;
    @XmlSchemaType(name = "string")
    protected OpcaoAtendimento opcaoAtendimento;

    /**
     * Gets the value of the idSolicitacaoAeroporto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitacaoAeroporto() {
        return idSolicitacaoAeroporto;
    }

    /**
     * Sets the value of the idSolicitacaoAeroporto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitacaoAeroporto(Integer value) {
        this.idSolicitacaoAeroporto = value;
    }

    /**
     * Gets the value of the usuarioCriador property.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getUsuarioCriador() {
        return usuarioCriador;
    }

    /**
     * Sets the value of the usuarioCriador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setUsuarioCriador(Passageiro value) {
        this.usuarioCriador = value;
    }

    /**
     * Gets the value of the usuarioConcluiu property.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getUsuarioConcluiu() {
        return usuarioConcluiu;
    }

    /**
     * Sets the value of the usuarioConcluiu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setUsuarioConcluiu(Passageiro value) {
        this.usuarioConcluiu = value;
    }

    /**
     * Gets the value of the usuarioCancelou property.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getUsuarioCancelou() {
        return usuarioCancelou;
    }

    /**
     * Sets the value of the usuarioCancelou property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setUsuarioCancelou(Passageiro value) {
        this.usuarioCancelou = value;
    }

    /**
     * Gets the value of the baseAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAtendimento }
     *     
     */
    public BaseAtendimento getBaseAtendimento() {
        return baseAtendimento;
    }

    /**
     * Sets the value of the baseAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAtendimento }
     *     
     */
    public void setBaseAtendimento(BaseAtendimento value) {
        this.baseAtendimento = value;
    }

    /**
     * Gets the value of the statusSolicitacaoAeroporto property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSolicitacaoAeroporto }
     *     
     */
    public StatusSolicitacaoAeroporto getStatusSolicitacaoAeroporto() {
        return statusSolicitacaoAeroporto;
    }

    /**
     * Sets the value of the statusSolicitacaoAeroporto property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSolicitacaoAeroporto }
     *     
     */
    public void setStatusSolicitacaoAeroporto(StatusSolicitacaoAeroporto value) {
        this.statusSolicitacaoAeroporto = value;
    }

    /**
     * Gets the value of the tipoAtendimentoAeroporto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoAtendimentoAeroporto }
     *     
     */
    public TipoAtendimentoAeroporto getTipoAtendimentoAeroporto() {
        return tipoAtendimentoAeroporto;
    }

    /**
     * Sets the value of the tipoAtendimentoAeroporto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAtendimentoAeroporto }
     *     
     */
    public void setTipoAtendimentoAeroporto(TipoAtendimentoAeroporto value) {
        this.tipoAtendimentoAeroporto = value;
    }

    /**
     * Gets the value of the obsConsultor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsConsultor() {
        return obsConsultor;
    }

    /**
     * Sets the value of the obsConsultor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsConsultor(String value) {
        this.obsConsultor = value;
    }

    /**
     * Gets the value of the obsAtendente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsAtendente() {
        return obsAtendente;
    }

    /**
     * Sets the value of the obsAtendente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsAtendente(String value) {
        this.obsAtendente = value;
    }

    /**
     * Gets the value of the dataCriacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Sets the value of the dataCriacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacao(XMLGregorianCalendar value) {
        this.dataCriacao = value;
    }

    /**
     * Gets the value of the dataFinalizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    /**
     * Sets the value of the dataFinalizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalizacao(XMLGregorianCalendar value) {
        this.dataFinalizacao = value;
    }

    /**
     * Gets the value of the dataCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelamento() {
        return dataCancelamento;
    }

    /**
     * Sets the value of the dataCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelamento(XMLGregorianCalendar value) {
        this.dataCancelamento = value;
    }

    /**
     * Gets the value of the opcaoAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link OpcaoAtendimento }
     *     
     */
    public OpcaoAtendimento getOpcaoAtendimento() {
        return opcaoAtendimento;
    }

    /**
     * Sets the value of the opcaoAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpcaoAtendimento }
     *     
     */
    public void setOpcaoAtendimento(OpcaoAtendimento value) {
        this.opcaoAtendimento = value;
    }

}
