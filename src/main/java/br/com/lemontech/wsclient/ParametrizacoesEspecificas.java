
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametrizacoesEspecificas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametrizacoesEspecificas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametrizacoesSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacoesSolicitacao" minOccurs="0"/>
 *         &lt;element name="parametrizacoesAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacoesAprovacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacoesEspecificas", propOrder = {
    "parametrizacoesSolicitacao",
    "parametrizacoesAprovacao"
})
public class ParametrizacoesEspecificas {

    protected ParametrizacoesSolicitacao parametrizacoesSolicitacao;
    protected ParametrizacoesAprovacao parametrizacoesAprovacao;

    /**
     * Gets the value of the parametrizacoesSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacoesSolicitacao }
     *     
     */
    public ParametrizacoesSolicitacao getParametrizacoesSolicitacao() {
        return parametrizacoesSolicitacao;
    }

    /**
     * Sets the value of the parametrizacoesSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacoesSolicitacao }
     *     
     */
    public void setParametrizacoesSolicitacao(ParametrizacoesSolicitacao value) {
        this.parametrizacoesSolicitacao = value;
    }

    /**
     * Gets the value of the parametrizacoesAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacoesAprovacao }
     *     
     */
    public ParametrizacoesAprovacao getParametrizacoesAprovacao() {
        return parametrizacoesAprovacao;
    }

    /**
     * Sets the value of the parametrizacoesAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacoesAprovacao }
     *     
     */
    public void setParametrizacoesAprovacao(ParametrizacoesAprovacao value) {
        this.parametrizacoesAprovacao = value;
    }

}
