
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pedidoCarro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pedidoCarro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cidadeRetirada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoRetirada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cidadeDevolucao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoDevolucao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataRetirada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataDevolucao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeLocadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modeloPreferencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoCarro", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", propOrder = {
    "cidadeRetirada",
    "estadoRetirada",
    "cidadeDevolucao",
    "estadoDevolucao",
    "dataRetirada",
    "dataDevolucao",
    "pais",
    "nomeLocadora",
    "modeloPreferencia"
})
public class PedidoCarro {

    @XmlElement(required = true)
    protected String cidadeRetirada;
    @XmlElement(required = true)
    protected String estadoRetirada;
    @XmlElement(required = true)
    protected String cidadeDevolucao;
    @XmlElement(required = true)
    protected String estadoDevolucao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRetirada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDevolucao;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String nomeLocadora;
    @XmlElement(required = true)
    protected String modeloPreferencia;

    /**
     * Gets the value of the cidadeRetirada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeRetirada() {
        return cidadeRetirada;
    }

    /**
     * Sets the value of the cidadeRetirada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeRetirada(String value) {
        this.cidadeRetirada = value;
    }

    /**
     * Gets the value of the estadoRetirada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoRetirada() {
        return estadoRetirada;
    }

    /**
     * Sets the value of the estadoRetirada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoRetirada(String value) {
        this.estadoRetirada = value;
    }

    /**
     * Gets the value of the cidadeDevolucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDevolucao() {
        return cidadeDevolucao;
    }

    /**
     * Sets the value of the cidadeDevolucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDevolucao(String value) {
        this.cidadeDevolucao = value;
    }

    /**
     * Gets the value of the estadoDevolucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDevolucao() {
        return estadoDevolucao;
    }

    /**
     * Sets the value of the estadoDevolucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDevolucao(String value) {
        this.estadoDevolucao = value;
    }

    /**
     * Gets the value of the dataRetirada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRetirada() {
        return dataRetirada;
    }

    /**
     * Sets the value of the dataRetirada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRetirada(XMLGregorianCalendar value) {
        this.dataRetirada = value;
    }

    /**
     * Gets the value of the dataDevolucao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * Sets the value of the dataDevolucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDevolucao(XMLGregorianCalendar value) {
        this.dataDevolucao = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the nomeLocadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLocadora() {
        return nomeLocadora;
    }

    /**
     * Sets the value of the nomeLocadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLocadora(String value) {
        this.nomeLocadora = value;
    }

    /**
     * Gets the value of the modeloPreferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloPreferencia() {
        return modeloPreferencia;
    }

    /**
     * Sets the value of the modeloPreferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloPreferencia(String value) {
        this.modeloPreferencia = value;
    }

}
