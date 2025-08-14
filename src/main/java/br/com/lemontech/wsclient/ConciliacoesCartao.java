
package br.com.lemontech.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conciliacoesCartao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conciliacoesCartao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conciliacaoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}conciliacaoCartao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conciliacoesCartao", propOrder = {
    "conciliacaoCartao"
})
public class ConciliacoesCartao {

    @XmlElement(nillable = true)
    protected List<ConciliacaoCartao> conciliacaoCartao;

    /**
     * Gets the value of the conciliacaoCartao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conciliacaoCartao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConciliacaoCartao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConciliacaoCartao }
     * 
     * 
     */
    public List<ConciliacaoCartao> getConciliacaoCartao() {
        if (conciliacaoCartao == null) {
            conciliacaoCartao = new ArrayList<ConciliacaoCartao>();
        }
        return this.conciliacaoCartao;
    }

}
