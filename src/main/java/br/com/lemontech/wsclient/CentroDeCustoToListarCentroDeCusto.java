
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for centroDeCustoToListarCentroDeCusto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="centroDeCustoToListarCentroDeCusto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regionalRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoAprovavel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="debitaBudget" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centroDeCustoToListarCentroDeCusto", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/centrodecustotolistarcentrodecusto", propOrder = {
    "codigo",
    "regionalRef",
    "descricao",
    "autoAprovavel",
    "debitaBudget"
})
public class CentroDeCustoToListarCentroDeCusto {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String regionalRef;
    @XmlElement(required = true)
    protected String descricao;
    protected boolean autoAprovavel;
    protected boolean debitaBudget;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the regionalRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalRef() {
        return regionalRef;
    }

    /**
     * Sets the value of the regionalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionalRef(String value) {
        this.regionalRef = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the autoAprovavel property.
     * 
     */
    public boolean isAutoAprovavel() {
        return autoAprovavel;
    }

    /**
     * Sets the value of the autoAprovavel property.
     * 
     */
    public void setAutoAprovavel(boolean value) {
        this.autoAprovavel = value;
    }

    /**
     * Gets the value of the debitaBudget property.
     * 
     */
    public boolean isDebitaBudget() {
        return debitaBudget;
    }

    /**
     * Sets the value of the debitaBudget property.
     * 
     */
    public void setDebitaBudget(boolean value) {
        this.debitaBudget = value;
    }

}
