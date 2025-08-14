
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contaBancariaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contaBancariaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="instituicaoBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}instituicaoBancariaRef"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="padrao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaBancariaRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "funcionarioRef",
    "instituicaoBancariaRef",
    "agencia",
    "conta",
    "padrao",
    "status"
})
public class ContaBancariaRequest {

    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRef;
    @XmlElement(required = true)
    protected InstituicaoBancariaRef instituicaoBancariaRef;
    @XmlElement(required = true)
    protected String agencia;
    @XmlElement(required = true)
    protected String conta;
    protected Boolean padrao;
    protected boolean status;

    /**
     * Gets the value of the funcionarioRef property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }

    /**
     * Sets the value of the funcionarioRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRef(FuncionarioRef value) {
        this.funcionarioRef = value;
    }

    /**
     * Gets the value of the instituicaoBancariaRef property.
     * 
     * @return
     *     possible object is
     *     {@link InstituicaoBancariaRef }
     *     
     */
    public InstituicaoBancariaRef getInstituicaoBancariaRef() {
        return instituicaoBancariaRef;
    }

    /**
     * Sets the value of the instituicaoBancariaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstituicaoBancariaRef }
     *     
     */
    public void setInstituicaoBancariaRef(InstituicaoBancariaRef value) {
        this.instituicaoBancariaRef = value;
    }

    /**
     * Gets the value of the agencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Sets the value of the agencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Gets the value of the conta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConta() {
        return conta;
    }

    /**
     * Sets the value of the conta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConta(String value) {
        this.conta = value;
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
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

}
