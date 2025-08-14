
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarParametrizacaoCentroDeCustoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="centroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="registroInicial">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="quantidadeRegistros" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="50"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarParametrizacaoCentroDeCustoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "ativo",
    "centroDeCusto",
    "registroInicial",
    "quantidadeRegistros"
})
public class ListarParametrizacaoCentroDeCustoRequest {

    @XmlElement(defaultValue = "true")
    protected boolean ativo;
    @XmlElement(defaultValue = " ")
    protected String centroDeCusto;
    @XmlElement(defaultValue = "1")
    protected int registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;

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
     * Gets the value of the centroDeCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Sets the value of the centroDeCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroDeCusto(String value) {
        this.centroDeCusto = value;
    }

    /**
     * Gets the value of the registroInicial property.
     * 
     */
    public int getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Sets the value of the registroInicial property.
     * 
     */
    public void setRegistroInicial(int value) {
        this.registroInicial = value;
    }

    /**
     * Gets the value of the quantidadeRegistros property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Sets the value of the quantidadeRegistros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeRegistros(Integer value) {
        this.quantidadeRegistros = value;
    }

}
