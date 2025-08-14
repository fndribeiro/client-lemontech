
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cadastrarSubCentroDeCustoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarSubCentroDeCustoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subCentroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCusto"/>
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
@XmlType(name = "cadastrarSubCentroDeCustoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "subCentroDeCusto",
    "idCliente"
})
public class CadastrarSubCentroDeCustoRequest {

    @XmlElement(required = true)
    protected SubCentroDeCusto subCentroDeCusto;
    protected Integer idCliente;

    /**
     * Gets the value of the subCentroDeCusto property.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCusto }
     *     
     */
    public SubCentroDeCusto getSubCentroDeCusto() {
        return subCentroDeCusto;
    }

    /**
     * Sets the value of the subCentroDeCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCusto }
     *     
     */
    public void setSubCentroDeCusto(SubCentroDeCusto value) {
        this.subCentroDeCusto = value;
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
