
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for conciliacaoCartao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conciliacaoCartao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomeFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataReferencia" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="statusAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusAprovacaoConciliacao" minOccurs="0"/>
 *         &lt;element name="dataAprovacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transacoesCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}transacoesCartao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conciliacaoCartao", propOrder = {
    "numeroProtocolo",
    "nomeFornecedor",
    "cnpjFornecedor",
    "dataReferencia",
    "dataVencimento",
    "statusAprovacao",
    "dataAprovacao",
    "numeroCartao",
    "nomeTitular",
    "transacoesCartao"
})
public class ConciliacaoCartao {

    protected Integer numeroProtocolo;
    protected String nomeFornecedor;
    protected String cnpjFornecedor;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataReferencia;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVencimento;
    @XmlSchemaType(name = "string")
    protected StatusAprovacaoConciliacao statusAprovacao;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAprovacao;
    protected String numeroCartao;
    protected String nomeTitular;
    protected TransacoesCartao transacoesCartao;

    /**
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroProtocolo(Integer value) {
        this.numeroProtocolo = value;
    }

    /**
     * Gets the value of the nomeFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * Sets the value of the nomeFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFornecedor(String value) {
        this.nomeFornecedor = value;
    }

    /**
     * Gets the value of the cnpjFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    /**
     * Sets the value of the cnpjFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjFornecedor(String value) {
        this.cnpjFornecedor = value;
    }

    /**
     * Gets the value of the dataReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReferencia() {
        return dataReferencia;
    }

    /**
     * Sets the value of the dataReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReferencia(XMLGregorianCalendar value) {
        this.dataReferencia = value;
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
     * Gets the value of the statusAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAprovacaoConciliacao }
     *     
     */
    public StatusAprovacaoConciliacao getStatusAprovacao() {
        return statusAprovacao;
    }

    /**
     * Sets the value of the statusAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAprovacaoConciliacao }
     *     
     */
    public void setStatusAprovacao(StatusAprovacaoConciliacao value) {
        this.statusAprovacao = value;
    }

    /**
     * Gets the value of the dataAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAprovacao() {
        return dataAprovacao;
    }

    /**
     * Sets the value of the dataAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAprovacao(XMLGregorianCalendar value) {
        this.dataAprovacao = value;
    }

    /**
     * Gets the value of the numeroCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Sets the value of the numeroCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartao(String value) {
        this.numeroCartao = value;
    }

    /**
     * Gets the value of the nomeTitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * Sets the value of the nomeTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTitular(String value) {
        this.nomeTitular = value;
    }

    /**
     * Gets the value of the transacoesCartao property.
     * 
     * @return
     *     possible object is
     *     {@link TransacoesCartao }
     *     
     */
    public TransacoesCartao getTransacoesCartao() {
        return transacoesCartao;
    }

    /**
     * Sets the value of the transacoesCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransacoesCartao }
     *     
     */
    public void setTransacoesCartao(TransacoesCartao value) {
        this.transacoesCartao = value;
    }

}
