
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitacaoToListarCentroDeCusto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitacaoToListarCentroDeCusto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/centrodecustotolistarcentrodecusto}centroDeCustoToListarCentroDeCusto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaoToListarCentroDeCusto", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/solicitacaotolistarcentrodecusto", propOrder = {
    "centroDeCusto"
})
public class SolicitacaoToListarCentroDeCusto {

    @XmlElement(required = true)
    protected CentroDeCustoToListarCentroDeCusto centroDeCusto;

    /**
     * Gets the value of the centroDeCusto property.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoToListarCentroDeCusto }
     *     
     */
    public CentroDeCustoToListarCentroDeCusto getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Sets the value of the centroDeCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoToListarCentroDeCusto }
     *     
     */
    public void setCentroDeCusto(CentroDeCustoToListarCentroDeCusto value) {
        this.centroDeCusto = value;
    }

}
