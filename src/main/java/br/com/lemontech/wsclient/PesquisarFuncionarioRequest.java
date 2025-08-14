
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pesquisarFuncionarioRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarFuncionarioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idClienteRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="dataInicialAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             &lt;element name="dataFinalAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             &lt;element name="registroInicial">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="1"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="quantidadeRegistros" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;maxInclusive value="100"/>
 *                   &lt;minInclusive value="1"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarFuncionarioRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "idClienteRef",
    "funcionarioRef",
    "dataInicialAtualizacao",
    "dataFinalAtualizacao",
    "registroInicial",
    "quantidadeRegistros"
})
public class PesquisarFuncionarioRequest {

    protected Integer idClienteRef;
    protected FuncionarioRef funcionarioRef;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicialAtualizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinalAtualizacao;
    protected Integer registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;

    /**
     * Gets the value of the idClienteRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClienteRef() {
        return idClienteRef;
    }

    /**
     * Sets the value of the idClienteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClienteRef(Integer value) {
        this.idClienteRef = value;
    }

    /**
     * Gets the value of the funcionarioRef property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }

    /**
     * Sets the value of the funcionarioRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRef(FuncionarioRef value) {
        this.funcionarioRef = value;
    }

    /**
     * Gets the value of the dataInicialAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicialAtualizacao() {
        return dataInicialAtualizacao;
    }

    /**
     * Sets the value of the dataInicialAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicialAtualizacao(XMLGregorianCalendar value) {
        this.dataInicialAtualizacao = value;
    }

    /**
     * Gets the value of the dataFinalAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalAtualizacao() {
        return dataFinalAtualizacao;
    }

    /**
     * Sets the value of the dataFinalAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalAtualizacao(XMLGregorianCalendar value) {
        this.dataFinalAtualizacao = value;
    }

    /**
     * Gets the value of the registroInicial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Sets the value of the registroInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistroInicial(Integer value) {
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
