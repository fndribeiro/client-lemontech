
package br.com.lemontech.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fluxos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fluxos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fluxo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}fluxo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fluxos", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", propOrder = {
    "fluxo"
})
public class Fluxos2 {

    protected List<Fluxo2> fluxo;

    /**
     * Gets the value of the fluxo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fluxo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFluxo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fluxo2 }
     * 
     * 
     */
    public List<Fluxo2> getFluxo() {
        if (fluxo == null) {
            fluxo = new ArrayList<Fluxo2>();
        }
        return this.fluxo;
    }

}
