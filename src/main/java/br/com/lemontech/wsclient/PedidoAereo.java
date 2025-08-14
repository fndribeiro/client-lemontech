
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pedidoAereo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pedidoAereo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeroportoOrigem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aeroportoDestino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataPartida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tarifaCombinada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bagagem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoAereo", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", propOrder = {
    "aeroportoOrigem",
    "aeroportoDestino",
    "dataPartida",
    "tarifaCombinada",
    "bagagem"
})
public class PedidoAereo {

    @XmlElement(required = true)
    protected String aeroportoOrigem;
    @XmlElement(required = true)
    protected String aeroportoDestino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPartida;
    protected boolean tarifaCombinada;
    protected boolean bagagem;

    /**
     * Gets the value of the aeroportoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    /**
     * Sets the value of the aeroportoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeroportoOrigem(String value) {
        this.aeroportoOrigem = value;
    }

    /**
     * Gets the value of the aeroportoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    /**
     * Sets the value of the aeroportoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeroportoDestino(String value) {
        this.aeroportoDestino = value;
    }

    /**
     * Gets the value of the dataPartida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPartida() {
        return dataPartida;
    }

    /**
     * Sets the value of the dataPartida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPartida(XMLGregorianCalendar value) {
        this.dataPartida = value;
    }

    /**
     * Gets the value of the tarifaCombinada property.
     * 
     */
    public boolean isTarifaCombinada() {
        return tarifaCombinada;
    }

    /**
     * Sets the value of the tarifaCombinada property.
     * 
     */
    public void setTarifaCombinada(boolean value) {
        this.tarifaCombinada = value;
    }

    /**
     * Gets the value of the bagagem property.
     * 
     */
    public boolean isBagagem() {
        return bagagem;
    }

    /**
     * Sets the value of the bagagem property.
     * 
     */
    public void setBagagem(boolean value) {
        this.bagagem = value;
    }

}
