
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for importarFaturaCartaoCreditoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importarFaturaCartaoCreditoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoTransacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoTransacaoCartao"/>
 *         &lt;element name="dataTransacao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="valorTransacao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numeroAutorizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codCia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bilhete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorBilhete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorTaxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoGerencial1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoGerencial2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoGerencial3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoGerencial4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoGerencial5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importarFaturaCartaoCreditoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "tipoTransacao",
    "dataTransacao",
    "valorTransacao",
    "numeroAutorizacao",
    "codCia",
    "bilhete",
    "valorBilhete",
    "valorTaxa",
    "numeroCartao",
    "campoGerencial1",
    "campoGerencial2",
    "campoGerencial3",
    "campoGerencial4",
    "campoGerencial5"
})
public class ImportarFaturaCartaoCreditoRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTransacaoCartao tipoTransacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTransacao;
    protected double valorTransacao;
    protected Integer numeroAutorizacao;
    protected String codCia;
    protected String bilhete;
    protected Double valorBilhete;
    protected Double valorTaxa;
    protected String numeroCartao;
    protected String campoGerencial1;
    protected String campoGerencial2;
    protected String campoGerencial3;
    protected String campoGerencial4;
    protected String campoGerencial5;

    /**
     * Gets the value of the tipoTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTransacaoCartao }
     *     
     */
    public TipoTransacaoCartao getTipoTransacao() {
        return tipoTransacao;
    }

    /**
     * Sets the value of the tipoTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTransacaoCartao }
     *     
     */
    public void setTipoTransacao(TipoTransacaoCartao value) {
        this.tipoTransacao = value;
    }

    /**
     * Gets the value of the dataTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTransacao() {
        return dataTransacao;
    }

    /**
     * Sets the value of the dataTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTransacao(XMLGregorianCalendar value) {
        this.dataTransacao = value;
    }

    /**
     * Gets the value of the valorTransacao property.
     * 
     */
    public double getValorTransacao() {
        return valorTransacao;
    }

    /**
     * Sets the value of the valorTransacao property.
     * 
     */
    public void setValorTransacao(double value) {
        this.valorTransacao = value;
    }

    /**
     * Gets the value of the numeroAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    /**
     * Sets the value of the numeroAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroAutorizacao(Integer value) {
        this.numeroAutorizacao = value;
    }

    /**
     * Gets the value of the codCia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCia() {
        return codCia;
    }

    /**
     * Sets the value of the codCia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCia(String value) {
        this.codCia = value;
    }

    /**
     * Gets the value of the bilhete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilhete() {
        return bilhete;
    }

    /**
     * Sets the value of the bilhete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilhete(String value) {
        this.bilhete = value;
    }

    /**
     * Gets the value of the valorBilhete property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorBilhete() {
        return valorBilhete;
    }

    /**
     * Sets the value of the valorBilhete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorBilhete(Double value) {
        this.valorBilhete = value;
    }

    /**
     * Gets the value of the valorTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTaxa() {
        return valorTaxa;
    }

    /**
     * Sets the value of the valorTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTaxa(Double value) {
        this.valorTaxa = value;
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
     * Gets the value of the campoGerencial1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial1() {
        return campoGerencial1;
    }

    /**
     * Sets the value of the campoGerencial1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial1(String value) {
        this.campoGerencial1 = value;
    }

    /**
     * Gets the value of the campoGerencial2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial2() {
        return campoGerencial2;
    }

    /**
     * Sets the value of the campoGerencial2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial2(String value) {
        this.campoGerencial2 = value;
    }

    /**
     * Gets the value of the campoGerencial3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial3() {
        return campoGerencial3;
    }

    /**
     * Sets the value of the campoGerencial3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial3(String value) {
        this.campoGerencial3 = value;
    }

    /**
     * Gets the value of the campoGerencial4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial4() {
        return campoGerencial4;
    }

    /**
     * Sets the value of the campoGerencial4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial4(String value) {
        this.campoGerencial4 = value;
    }

    /**
     * Gets the value of the campoGerencial5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial5() {
        return campoGerencial5;
    }

    /**
     * Sets the value of the campoGerencial5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial5(String value) {
        this.campoGerencial5 = value;
    }

}
