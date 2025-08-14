
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tarifarioFornecedorRodoviarioRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorRodoviarioRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorBackofficeFornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/>
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="classeRodoviario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}classeRodoviario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorRodoviarioRef", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", propOrder = {
    "identificadorBackofficeFornecedor",
    "identificadorBackofficeCliente",
    "classeRodoviario"
})
@XmlSeeAlso({
    TarifarioFornecedorRodoviario.class
})
public class TarifarioFornecedorRodoviarioRef {

    @XmlElement(required = true)
    protected String identificadorBackofficeFornecedor;
    protected String identificadorBackofficeCliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ClasseRodoviario classeRodoviario;

    /**
     * Gets the value of the identificadorBackofficeFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }

    /**
     * Sets the value of the identificadorBackofficeFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFornecedor(String value) {
        this.identificadorBackofficeFornecedor = value;
    }

    /**
     * Gets the value of the identificadorBackofficeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Sets the value of the identificadorBackofficeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

    /**
     * Gets the value of the classeRodoviario property.
     * 
     * @return
     *     possible object is
     *     {@link ClasseRodoviario }
     *     
     */
    public ClasseRodoviario getClasseRodoviario() {
        return classeRodoviario;
    }

    /**
     * Sets the value of the classeRodoviario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseRodoviario }
     *     
     */
    public void setClasseRodoviario(ClasseRodoviario value) {
        this.classeRodoviario = value;
    }

}
