
package br.com.lemontech.wsclient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contaBancaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contaBancaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionarioContaBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioContaBancariaRef"/>
 *         &lt;element name="instituicaoBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}instituicaoBancariaRef"/>
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="padrao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaBancaria", propOrder = {
    "funcionarioContaBancariaRef",
    "instituicaoBancariaRef",
    "agencia",
    "conta",
    "padrao",
    "status",
    "id"
})
public class ContaBancaria {

    @XmlElement(required = true)
    protected FuncionarioContaBancariaRef funcionarioContaBancariaRef;
    @XmlElement(required = true)
    protected InstituicaoBancariaRef instituicaoBancariaRef;
    @XmlElement(required = true)
    protected String agencia;
    @XmlElement(required = true)
    protected String conta;
    protected boolean padrao;
    protected boolean status;
    @XmlElement(required = true)
    protected BigInteger id;

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
     */
    public boolean isPadrao() {
        return padrao;
    }

    /**
     * Sets the value of the padrao property.
     * 
     */
    public void setPadrao(boolean value) {
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
