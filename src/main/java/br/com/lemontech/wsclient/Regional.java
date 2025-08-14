
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regional">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef">
 *       &lt;sequence>
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
 *         &lt;element name="pcc" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="identificadorBackofficeFranquia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="corporateIdGol" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}corporateIdGol" minOccurs="0"/>
 *         &lt;element name="numeroDk" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroDkTreinamento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroDkEvento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emitirNotaFiscalEmNomeDoHospede" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emitirNotaFiscalEmNomeDaRegional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permiteAlterarAgencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regional", propOrder = {
    "descricao",
    "pcc",
    "identificadorBackofficeCliente",
    "identificadorBackofficeFranquia",
    "ativo",
    "taxaFee",
    "corporateIdGol",
    "numeroDk",
    "numeroDkTreinamento",
    "numeroDkEvento",
    "emitirNotaFiscalEmNomeDoHospede",
    "emitirNotaFiscalEmNomeDaRegional",
    "permiteAlterarAgencia",
    "cnpj"
})
public class Regional
    extends RegionalRef
{

    @XmlElement(required = true)
    protected String descricao;
    protected String pcc;
    protected String identificadorBackofficeCliente;
    protected String identificadorBackofficeFranquia;
    protected boolean ativo;
    protected Double taxaFee;
    protected String corporateIdGol;
    protected String numeroDk;
    protected String numeroDkTreinamento;
    protected String numeroDkEvento;
    @XmlElement(defaultValue = "false")
    protected Boolean emitirNotaFiscalEmNomeDoHospede;
    @XmlElement(defaultValue = "false")
    protected Boolean emitirNotaFiscalEmNomeDaRegional;
    @XmlElement(defaultValue = "true")
    protected Boolean permiteAlterarAgencia;
    protected String cnpj;

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
     * Gets the value of the pcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcc() {
        return pcc;
    }

    /**
     * Sets the value of the pcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcc(String value) {
        this.pcc = value;
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
     * Gets the value of the identificadorBackofficeFranquia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFranquia() {
        return identificadorBackofficeFranquia;
    }

    /**
     * Sets the value of the identificadorBackofficeFranquia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFranquia(String value) {
        this.identificadorBackofficeFranquia = value;
    }

    /**
     * Gets the value of the ativo property.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Sets the value of the ativo property.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Gets the value of the taxaFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Sets the value of the taxaFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Gets the value of the corporateIdGol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateIdGol() {
        return corporateIdGol;
    }

    /**
     * Sets the value of the corporateIdGol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateIdGol(String value) {
        this.corporateIdGol = value;
    }

    /**
     * Gets the value of the numeroDk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDk() {
        return numeroDk;
    }

    /**
     * Sets the value of the numeroDk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDk(String value) {
        this.numeroDk = value;
    }

    /**
     * Gets the value of the numeroDkTreinamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDkTreinamento() {
        return numeroDkTreinamento;
    }

    /**
     * Sets the value of the numeroDkTreinamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDkTreinamento(String value) {
        this.numeroDkTreinamento = value;
    }

    /**
     * Gets the value of the numeroDkEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDkEvento() {
        return numeroDkEvento;
    }

    /**
     * Sets the value of the numeroDkEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDkEvento(String value) {
        this.numeroDkEvento = value;
    }

    /**
     * Gets the value of the emitirNotaFiscalEmNomeDoHospede property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitirNotaFiscalEmNomeDoHospede() {
        return emitirNotaFiscalEmNomeDoHospede;
    }

    /**
     * Sets the value of the emitirNotaFiscalEmNomeDoHospede property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitirNotaFiscalEmNomeDoHospede(Boolean value) {
        this.emitirNotaFiscalEmNomeDoHospede = value;
    }

    /**
     * Gets the value of the emitirNotaFiscalEmNomeDaRegional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitirNotaFiscalEmNomeDaRegional() {
        return emitirNotaFiscalEmNomeDaRegional;
    }

    /**
     * Sets the value of the emitirNotaFiscalEmNomeDaRegional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitirNotaFiscalEmNomeDaRegional(Boolean value) {
        this.emitirNotaFiscalEmNomeDaRegional = value;
    }

    /**
     * Gets the value of the permiteAlterarAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteAlterarAgencia() {
        return permiteAlterarAgencia;
    }

    /**
     * Sets the value of the permiteAlterarAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteAlterarAgencia(Boolean value) {
        this.permiteAlterarAgencia = value;
    }

    /**
     * Gets the value of the cnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Sets the value of the cnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

}
