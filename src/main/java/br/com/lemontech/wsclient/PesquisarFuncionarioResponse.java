
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pesquisarFuncionarioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarFuncionarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoOperacao" minOccurs="0"/>
 *         &lt;element name="funcionarios" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarFuncionarioResponse", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/response", propOrder = {
    "resultadoOperacao",
    "funcionarios"
})
public class PesquisarFuncionarioResponse {

    protected ResultadoOperacao resultadoOperacao;
    protected Funcionarios funcionarios;

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
     * Gets the value of the funcionarios property.
     * 
     * @return
     *     possible object is
     *     {@link Funcionarios }
     *     
     */
    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    /**
     * Sets the value of the funcionarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link Funcionarios }
     *     
     */
    public void setFuncionarios(Funcionarios value) {
        this.funcionarios = value;
    }

}
