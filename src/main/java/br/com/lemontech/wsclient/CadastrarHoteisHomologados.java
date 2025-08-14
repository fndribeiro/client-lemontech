
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cadastrarHoteisHomologados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarHoteisHomologados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorBackOffice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hotelHomologado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vencimentoHomologacao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarHoteisHomologados", propOrder = {
    "identificadorBackOffice",
    "hotelHomologado",
    "vencimentoHomologacao"
})
public class CadastrarHoteisHomologados {

    @XmlElement(required = true)
    protected String identificadorBackOffice;
    protected boolean hotelHomologado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimentoHomologacao;

    /**
     * Gets the value of the identificadorBackOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOffice() {
        return identificadorBackOffice;
    }

    /**
     * Sets the value of the identificadorBackOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOffice(String value) {
        this.identificadorBackOffice = value;
    }

    /**
     * Gets the value of the hotelHomologado property.
     * 
     */
    public boolean isHotelHomologado() {
        return hotelHomologado;
    }

    /**
     * Sets the value of the hotelHomologado property.
     * 
     */
    public void setHotelHomologado(boolean value) {
        this.hotelHomologado = value;
    }

    /**
     * Gets the value of the vencimentoHomologacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoHomologacao() {
        return vencimentoHomologacao;
    }

    /**
     * Sets the value of the vencimentoHomologacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoHomologacao(XMLGregorianCalendar value) {
        this.vencimentoHomologacao = value;
    }

}
