
package br.com.lemontech.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transacoesCartao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transacoesCartao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transacaoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}transacaoCartao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transacoesCartao", propOrder = {
    "transacaoCartao"
})
public class TransacoesCartao {

    @XmlElement(nillable = true)
    protected List<TransacaoCartao> transacaoCartao;

    /**
     * Gets the value of the transacaoCartao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transacaoCartao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransacaoCartao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransacaoCartao }
     * 
     * 
     */
    public List<TransacaoCartao> getTransacaoCartao() {
        if (transacaoCartao == null) {
            transacaoCartao = new ArrayList<TransacaoCartao>();
        }
        return this.transacaoCartao;
    }

}
