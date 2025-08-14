
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atrelarUsuariosRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atrelarUsuariosRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principal" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="secundario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="acessoLogas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acessoExpense" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atrelarUsuariosRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "principal",
    "secundario",
    "acessoLogas",
    "acessoExpense"
})
public class AtrelarUsuariosRequest {

    @XmlElement(required = true)
    protected FuncionarioRef principal;
    @XmlElement(required = true)
    protected FuncionarioRef secundario;
    protected boolean acessoLogas;
    protected boolean acessoExpense;

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setPrincipal(FuncionarioRef value) {
        this.principal = value;
    }

    /**
     * Gets the value of the secundario property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getSecundario() {
        return secundario;
    }

    /**
     * Sets the value of the secundario property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setSecundario(FuncionarioRef value) {
        this.secundario = value;
    }

    /**
     * Gets the value of the acessoLogas property.
     * 
     */
    public boolean isAcessoLogas() {
        return acessoLogas;
    }

    /**
     * Sets the value of the acessoLogas property.
     * 
     */
    public void setAcessoLogas(boolean value) {
        this.acessoLogas = value;
    }

    /**
     * Gets the value of the acessoExpense property.
     * 
     */
    public boolean isAcessoExpense() {
        return acessoExpense;
    }

    /**
     * Sets the value of the acessoExpense property.
     * 
     */
    public void setAcessoExpense(boolean value) {
        this.acessoExpense = value;
    }

}
