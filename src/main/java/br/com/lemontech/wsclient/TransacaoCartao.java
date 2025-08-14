
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transacaoCartao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transacaoCartao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="itemSV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seguimentoContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataTransacaoCartao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="transacaoCartaoBilhete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusTransacaoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusTransacaoCartao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transacaoCartao", propOrder = {
    "idSv",
    "itemSV",
    "seguimentoContabil",
    "codRegional",
    "dataTransacaoCartao",
    "transacaoCartaoBilhete",
    "localizador",
    "moeda",
    "valorTotal",
    "statusTransacaoCartao"
})
public class TransacaoCartao {

    protected Integer idSv;
    protected Integer itemSV;
    protected String seguimentoContabil;
    protected String codRegional;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTransacaoCartao;
    protected String transacaoCartaoBilhete;
    protected String localizador;
    protected String moeda;
    protected Double valorTotal;
    @XmlSchemaType(name = "string")
    protected StatusTransacaoCartao statusTransacaoCartao;

    /**
     * Gets the value of the idSv property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSv() {
        return idSv;
    }

    /**
     * Sets the value of the idSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSv(Integer value) {
        this.idSv = value;
    }

    /**
     * Gets the value of the itemSV property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemSV() {
        return itemSV;
    }

    /**
     * Sets the value of the itemSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemSV(Integer value) {
        this.itemSV = value;
    }

    /**
     * Gets the value of the seguimentoContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeguimentoContabil() {
        return seguimentoContabil;
    }

    /**
     * Sets the value of the seguimentoContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeguimentoContabil(String value) {
        this.seguimentoContabil = value;
    }

    /**
     * Gets the value of the codRegional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegional() {
        return codRegional;
    }

    /**
     * Sets the value of the codRegional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegional(String value) {
        this.codRegional = value;
    }

    /**
     * Gets the value of the dataTransacaoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTransacaoCartao() {
        return dataTransacaoCartao;
    }

    /**
     * Sets the value of the dataTransacaoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTransacaoCartao(XMLGregorianCalendar value) {
        this.dataTransacaoCartao = value;
    }

    /**
     * Gets the value of the transacaoCartaoBilhete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacaoCartaoBilhete() {
        return transacaoCartaoBilhete;
    }

    /**
     * Sets the value of the transacaoCartaoBilhete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacaoCartaoBilhete(String value) {
        this.transacaoCartaoBilhete = value;
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
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotal(Double value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the statusTransacaoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTransacaoCartao }
     *     
     */
    public StatusTransacaoCartao getStatusTransacaoCartao() {
        return statusTransacaoCartao;
    }

    /**
     * Sets the value of the statusTransacaoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTransacaoCartao }
     *     
     */
    public void setStatusTransacaoCartao(StatusTransacaoCartao value) {
        this.statusTransacaoCartao = value;
    }

}
