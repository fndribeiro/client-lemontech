
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adiantamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}adiantamento" minOccurs="0"/>
 *         &lt;element name="prestacaoContas" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContas" minOccurs="0"/>
 *         &lt;element name="produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expense", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", propOrder = {
    "adiantamento",
    "prestacaoContas",
    "produto"
})
public class Expense {

    protected Adiantamento adiantamento;
    protected PrestacaoContas prestacaoContas;
    protected String produto;

    /**
     * Gets the value of the adiantamento property.
     * 
     * @return
     *     possible object is
     *     {@link Adiantamento }
     *     
     */
    public Adiantamento getAdiantamento() {
        return adiantamento;
    }

    /**
     * Sets the value of the adiantamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adiantamento }
     *     
     */
    public void setAdiantamento(Adiantamento value) {
        this.adiantamento = value;
    }

    /**
     * Gets the value of the prestacaoContas property.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContas }
     *     
     */
    public PrestacaoContas getPrestacaoContas() {
        return prestacaoContas;
    }

    /**
     * Sets the value of the prestacaoContas property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContas }
     *     
     */
    public void setPrestacaoContas(PrestacaoContas value) {
        this.prestacaoContas = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduto() {
        return produto;
    }

    /**
     * Sets the value of the produto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduto(String value) {
        this.produto = value;
    }

}
