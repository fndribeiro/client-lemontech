
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for hotelFinalizar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hotelFinalizar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="controleAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoConfirmacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataConfirmacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelFinalizar", propOrder = {
    "localizador",
    "controleAgencia",
    "codigoFornecedor",
    "codigoConfirmacao",
    "dataConfirmacao"
})
public class HotelFinalizar {

    @XmlElement(required = true)
    protected String localizador;
    @XmlElement(required = true)
    protected String controleAgencia;
    @XmlElement(required = true)
    protected String codigoFornecedor;
    @XmlElement(required = true)
    protected String codigoConfirmacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataConfirmacao;

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
     * Gets the value of the controleAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleAgencia() {
        return controleAgencia;
    }

    /**
     * Sets the value of the controleAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleAgencia(String value) {
        this.controleAgencia = value;
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
     * Gets the value of the codigoConfirmacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConfirmacao() {
        return codigoConfirmacao;
    }

    /**
     * Sets the value of the codigoConfirmacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConfirmacao(String value) {
        this.codigoConfirmacao = value;
    }

    /**
     * Gets the value of the dataConfirmacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataConfirmacao() {
        return dataConfirmacao;
    }

    /**
     * Sets the value of the dataConfirmacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataConfirmacao(XMLGregorianCalendar value) {
        this.dataConfirmacao = value;
    }

}
