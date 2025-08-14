
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delegarTodasParametrizacoes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delegarTodasParametrizacoes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoParametrizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoParametrizacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delegarTodasParametrizacoes", propOrder = {
    "tipoParametrizacao"
})
public class DelegarTodasParametrizacoes {

    @XmlSchemaType(name = "string")
    protected TipoParametrizacao tipoParametrizacao;

    /**
     * Gets the value of the tipoParametrizacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoParametrizacao }
     *     
     */
    public TipoParametrizacao getTipoParametrizacao() {
        return tipoParametrizacao;
    }

    /**
     * Sets the value of the tipoParametrizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoParametrizacao }
     *     
     */
    public void setTipoParametrizacao(TipoParametrizacao value) {
        this.tipoParametrizacao = value;
    }

}
