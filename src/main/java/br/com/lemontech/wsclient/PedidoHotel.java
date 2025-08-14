
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pedidoHotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pedidoHotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkIn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checkOut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tipoApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoApartamento" minOccurs="0"/>
 *         &lt;element name="categoriaApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}categoriaApartamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoHotel", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", propOrder = {
    "cidade",
    "estado",
    "pais",
    "checkIn",
    "checkOut",
    "tipoApartamento",
    "categoriaApartamento"
})
public class PedidoHotel {

    @XmlElement(required = true)
    protected String cidade;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String pais;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkIn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(defaultValue = "INDIVIDUAL")
    @XmlSchemaType(name = "string")
    protected TipoApartamento tipoApartamento;
    @XmlSchemaType(name = "string")
    protected CategoriaApartamento categoriaApartamento;

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the tipoApartamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoApartamento }
     *     
     */
    public TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }

    /**
     * Sets the value of the tipoApartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoApartamento }
     *     
     */
    public void setTipoApartamento(TipoApartamento value) {
        this.tipoApartamento = value;
    }

    /**
     * Gets the value of the categoriaApartamento property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaApartamento }
     *     
     */
    public CategoriaApartamento getCategoriaApartamento() {
        return categoriaApartamento;
    }

    /**
     * Sets the value of the categoriaApartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaApartamento }
     *     
     */
    public void setCategoriaApartamento(CategoriaApartamento value) {
        this.categoriaApartamento = value;
    }

}
