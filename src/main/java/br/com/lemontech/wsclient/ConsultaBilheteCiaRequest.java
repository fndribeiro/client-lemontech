
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaBilheteCiaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaBilheteCiaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultaBilheteCia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}consultaBilheteCia"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaBilheteCiaRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "consultaBilheteCia"
})
public class ConsultaBilheteCiaRequest {

    @XmlElement(required = true)
    protected ConsultaBilheteCia consultaBilheteCia;

    /**
     * Gets the value of the consultaBilheteCia property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBilheteCia }
     *     
     */
    public ConsultaBilheteCia getConsultaBilheteCia() {
        return consultaBilheteCia;
    }

    /**
     * Sets the value of the consultaBilheteCia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBilheteCia }
     *     
     */
    public void setConsultaBilheteCia(ConsultaBilheteCia value) {
        this.consultaBilheteCia = value;
    }

}
