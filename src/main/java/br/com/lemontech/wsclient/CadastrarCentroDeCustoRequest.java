
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cadastrarCentroDeCustoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarCentroDeCustoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCusto"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarCentroDeCustoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "centroDeCusto",
    "idCliente"
})
public class CadastrarCentroDeCustoRequest {

    @XmlElement(required = true)
    protected CentroDeCusto centroDeCusto;
    protected Integer idCliente;

    /**
     * Gets the value of the centroDeCusto property.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCusto }
     *     
     */
    public CentroDeCusto getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Sets the value of the centroDeCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCusto }
     *     
     */
    public void setCentroDeCusto(CentroDeCusto value) {
        this.centroDeCusto = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

}
