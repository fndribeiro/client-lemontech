
package br.com.lemontech.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pesquisarConciliacaoCartaoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarConciliacaoCartaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoAcao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoAcao" minOccurs="0"/>
 *         &lt;element name="numeroConciliacoes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conciliacoesCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}conciliacoesCartao" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mensagemRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarConciliacaoCartaoResponse", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/response", propOrder = {
    "resultadoAcao",
    "numeroConciliacoes",
    "conciliacoesCartao",
    "mensagemRetorno"
})
public class PesquisarConciliacaoCartaoResponse {

    @XmlSchemaType(name = "string")
    protected ResultadoAcao resultadoAcao;
    protected Integer numeroConciliacoes;
    protected List<ConciliacoesCartao> conciliacoesCartao;
    protected String mensagemRetorno;

    /**
     * Gets the value of the resultadoAcao property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoAcao }
     *     
     */
    public ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }

    /**
     * Sets the value of the resultadoAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoAcao }
     *     
     */
    public void setResultadoAcao(ResultadoAcao value) {
        this.resultadoAcao = value;
    }

    /**
     * Gets the value of the numeroConciliacoes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroConciliacoes() {
        return numeroConciliacoes;
    }

    /**
     * Sets the value of the numeroConciliacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroConciliacoes(Integer value) {
        this.numeroConciliacoes = value;
    }

    /**
     * Gets the value of the conciliacoesCartao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conciliacoesCartao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConciliacoesCartao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConciliacoesCartao }
     * 
     * 
     */
    public List<ConciliacoesCartao> getConciliacoesCartao() {
        if (conciliacoesCartao == null) {
            conciliacoesCartao = new ArrayList<ConciliacoesCartao>();
        }
        return this.conciliacoesCartao;
    }

    /**
     * Gets the value of the mensagemRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Sets the value of the mensagemRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemRetorno(String value) {
        this.mensagemRetorno = value;
    }

}
