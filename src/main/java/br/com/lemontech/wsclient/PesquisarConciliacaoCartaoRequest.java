
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pesquisarConciliacaoCartaoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarConciliacaoCartaoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="codRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusAprovacaoConciliacao" minOccurs="0"/>
 *         &lt;element name="registroInicial">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="quantidadeRegistros" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="50"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarConciliacaoCartaoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "numeroProtocolo",
    "dataVencimento",
    "codRegional",
    "statusAprovacao",
    "registroInicial",
    "quantidadeRegistros"
})
public class PesquisarConciliacaoCartaoRequest {

    protected Integer numeroProtocolo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVencimento;
    protected String codRegional;
    @XmlSchemaType(name = "string")
    protected StatusAprovacaoConciliacao statusAprovacao;
    protected int registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;

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
     * Gets the value of the registroInicial property.
     * 
     */
    public int getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Sets the value of the registroInicial property.
     * 
     */
    public void setRegistroInicial(int value) {
        this.registroInicial = value;
    }

    /**
     * Gets the value of the quantidadeRegistros property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Sets the value of the quantidadeRegistros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeRegistros(Integer value) {
        this.quantidadeRegistros = value;
    }

}
