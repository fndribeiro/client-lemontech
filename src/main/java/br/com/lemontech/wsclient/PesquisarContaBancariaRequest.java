
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pesquisarContaBancariaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarContaBancariaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionarioContaBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioContaBancariaRef"/>
 *         &lt;element name="padrao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarContaBancariaRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "funcionarioContaBancariaRef",
    "padrao",
    "status"
})
public class PesquisarContaBancariaRequest {

    @XmlElement(required = true)
    protected FuncionarioContaBancariaRef funcionarioContaBancariaRef;
    protected Boolean padrao;
    protected Boolean status;

    /**
     * Gets the value of the funcionarioContaBancariaRef property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioContaBancariaRef }
     *     
     */
    public FuncionarioContaBancariaRef getFuncionarioContaBancariaRef() {
        return funcionarioContaBancariaRef;
    }

    /**
     * Sets the value of the funcionarioContaBancariaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioContaBancariaRef }
     *     
     */
    public void setFuncionarioContaBancariaRef(FuncionarioContaBancariaRef value) {
        this.funcionarioContaBancariaRef = value;
    }

    /**
     * Gets the value of the padrao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPadrao() {
        return padrao;
    }

    /**
     * Sets the value of the padrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPadrao(Boolean value) {
        this.padrao = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

}
