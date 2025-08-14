
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for prestacaoContas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matriculaAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}presacaoContasStatus" minOccurs="0"/>
 *         &lt;element name="observacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justificativaReprovacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reembolso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="itens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContaItens" minOccurs="0"/>
 *         &lt;element name="fluxos" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}fluxos" minOccurs="0"/>
 *         &lt;element name="tipoViagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contaBancaria" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}contaBancariaAdiantamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContas", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", propOrder = {
    "id",
    "matriculaAutorizador",
    "nomeAutorizador",
    "status",
    "observacaoFinanceiro",
    "justificativaReprovacao",
    "reembolso",
    "itens",
    "fluxos",
    "tipoViagem",
    "dataPagamento",
    "origem",
    "destino",
    "contaBancaria"
})
public class PrestacaoContas {

    protected int id;
    protected String matriculaAutorizador;
    protected String nomeAutorizador;
    @XmlSchemaType(name = "string")
    protected PresacaoContasStatus status;
    protected String observacaoFinanceiro;
    protected String justificativaReprovacao;
    protected boolean reembolso;
    protected PrestacaoContaItens itens;
    protected Fluxos2 fluxos;
    protected String tipoViagem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPagamento;
    protected String origem;
    protected String destino;
    protected ContaBancariaAdiantamento contaBancaria;

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
     * Gets the value of the matriculaAutorizador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaAutorizador() {
        return matriculaAutorizador;
    }

    /**
     * Sets the value of the matriculaAutorizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaAutorizador(String value) {
        this.matriculaAutorizador = value;
    }

    /**
     * Gets the value of the nomeAutorizador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAutorizador() {
        return nomeAutorizador;
    }

    /**
     * Sets the value of the nomeAutorizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAutorizador(String value) {
        this.nomeAutorizador = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public PresacaoContasStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public void setStatus(PresacaoContasStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the observacaoFinanceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoFinanceiro() {
        return observacaoFinanceiro;
    }

    /**
     * Sets the value of the observacaoFinanceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoFinanceiro(String value) {
        this.observacaoFinanceiro = value;
    }

    /**
     * Gets the value of the justificativaReprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaReprovacao() {
        return justificativaReprovacao;
    }

    /**
     * Sets the value of the justificativaReprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaReprovacao(String value) {
        this.justificativaReprovacao = value;
    }

    /**
     * Gets the value of the reembolso property.
     * 
     */
    public boolean isReembolso() {
        return reembolso;
    }

    /**
     * Sets the value of the reembolso property.
     * 
     */
    public void setReembolso(boolean value) {
        this.reembolso = value;
    }

    /**
     * Gets the value of the itens property.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public PrestacaoContaItens getItens() {
        return itens;
    }

    /**
     * Sets the value of the itens property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public void setItens(PrestacaoContaItens value) {
        this.itens = value;
    }

    /**
     * Gets the value of the fluxos property.
     * 
     * @return
     *     possible object is
     *     {@link Fluxos2 }
     *     
     */
    public Fluxos2 getFluxos() {
        return fluxos;
    }

    /**
     * Sets the value of the fluxos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fluxos2 }
     *     
     */
    public void setFluxos(Fluxos2 value) {
        this.fluxos = value;
    }

    /**
     * Gets the value of the tipoViagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoViagem() {
        return tipoViagem;
    }

    /**
     * Sets the value of the tipoViagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoViagem(String value) {
        this.tipoViagem = value;
    }

    /**
     * Gets the value of the dataPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Sets the value of the dataPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Gets the value of the origem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Sets the value of the origem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Gets the value of the contaBancaria property.
     * 
     * @return
     *     possible object is
     *     {@link ContaBancariaAdiantamento }
     *     
     */
    public ContaBancariaAdiantamento getContaBancaria() {
        return contaBancaria;
    }

    /**
     * Sets the value of the contaBancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaBancariaAdiantamento }
     *     
     */
    public void setContaBancaria(ContaBancariaAdiantamento value) {
        this.contaBancaria = value;
    }

}
