
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pesquisarContaBancariaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarContaBancariaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoOperacao" minOccurs="0"/>
 *         &lt;element name="contasBancaria" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contasBancaria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarContaBancariaResponse", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/response", propOrder = {
    "resultadoOperacao",
    "contasBancaria"
})
public class PesquisarContaBancariaResponse {

    protected ResultadoOperacao resultadoOperacao;
    protected ContasBancaria contasBancaria;

    /**
     * Gets the value of the resultadoOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoOperacao }
     *     
     */
    public ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }

    /**
     * Sets the value of the resultadoOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoOperacao }
     *     
     */
    public void setResultadoOperacao(ResultadoOperacao value) {
        this.resultadoOperacao = value;
    }

    /**
     * Gets the value of the contasBancaria property.
     * 
     * @return
     *     possible object is
     *     {@link ContasBancaria }
     *     
     */
    public ContasBancaria getContasBancaria() {
        return contasBancaria;
    }

    /**
     * Sets the value of the contasBancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContasBancaria }
     *     
     */
    public void setContasBancaria(ContasBancaria value) {
        this.contasBancaria = value;
    }

}
