
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cadastrarTreinamentoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarTreinamentoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigoTreinamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTurma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoRegional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCentroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoSubCentroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRegionalContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarTreinamentoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "ativo",
    "codigoTreinamento",
    "descricao",
    "codigoTurma",
    "codigoRegional",
    "codigoCentroDeCusto",
    "codigoSubCentroDeCusto",
    "codigoRegionalContaContabil",
    "codigoContaContabil",
    "dataInicio",
    "dataFim",
    "pais",
    "uf",
    "cidade",
    "iata",
    "endereco"
})
public class CadastrarTreinamentoRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected String codigoTreinamento;
    protected String descricao;
    @XmlElement(required = true)
    protected String codigoTurma;
    @XmlElement(required = true)
    protected String codigoRegional;
    @XmlElement(required = true)
    protected String codigoCentroDeCusto;
    protected String codigoSubCentroDeCusto;
    @XmlElement(required = true)
    protected String codigoRegionalContaContabil;
    @XmlElement(required = true)
    protected String codigoContaContabil;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFim;
    protected String pais;
    protected String uf;
    protected String cidade;
    protected String iata;
    @XmlElement(required = true)
    protected String endereco;

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
     * Gets the value of the codigoTreinamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTreinamento() {
        return codigoTreinamento;
    }

    /**
     * Sets the value of the codigoTreinamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTreinamento(String value) {
        this.codigoTreinamento = value;
    }

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
     * Gets the value of the codigoTurma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTurma() {
        return codigoTurma;
    }

    /**
     * Sets the value of the codigoTurma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTurma(String value) {
        this.codigoTurma = value;
    }

    /**
     * Gets the value of the codigoRegional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegional() {
        return codigoRegional;
    }

    /**
     * Sets the value of the codigoRegional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegional(String value) {
        this.codigoRegional = value;
    }

    /**
     * Gets the value of the codigoCentroDeCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCentroDeCusto() {
        return codigoCentroDeCusto;
    }

    /**
     * Sets the value of the codigoCentroDeCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCentroDeCusto(String value) {
        this.codigoCentroDeCusto = value;
    }

    /**
     * Gets the value of the codigoSubCentroDeCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSubCentroDeCusto() {
        return codigoSubCentroDeCusto;
    }

    /**
     * Sets the value of the codigoSubCentroDeCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSubCentroDeCusto(String value) {
        this.codigoSubCentroDeCusto = value;
    }

    /**
     * Gets the value of the codigoRegionalContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegionalContaContabil() {
        return codigoRegionalContaContabil;
    }

    /**
     * Sets the value of the codigoRegionalContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegionalContaContabil(String value) {
        this.codigoRegionalContaContabil = value;
    }

    /**
     * Gets the value of the codigoContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoContaContabil() {
        return codigoContaContabil;
    }

    /**
     * Sets the value of the codigoContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoContaContabil(String value) {
        this.codigoContaContabil = value;
    }

    /**
     * Gets the value of the dataInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Sets the value of the dataInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicio(XMLGregorianCalendar value) {
        this.dataInicio = value;
    }

    /**
     * Gets the value of the dataFim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Sets the value of the dataFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
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
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
    }

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

}
