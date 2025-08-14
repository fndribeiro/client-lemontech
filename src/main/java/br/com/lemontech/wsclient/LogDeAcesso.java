
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for logDeAcesso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logDeAcesso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLogAcesso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataAcesso" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ipOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonBancoDados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoAplicacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logDeAcesso", propOrder = {
    "idLogAcesso",
    "idUsuario",
    "dataAcesso",
    "ipOrigem",
    "numCPF",
    "codigoPessoa",
    "nonBancoDados",
    "codigoTipoAplicacao"
})
public class LogDeAcesso {

    protected int idLogAcesso;
    protected int idUsuario;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAcesso;
    protected String ipOrigem;
    protected String numCPF;
    protected String codigoPessoa;
    protected String nonBancoDados;
    protected String codigoTipoAplicacao;

    /**
     * Gets the value of the idLogAcesso property.
     * 
     */
    public int getIdLogAcesso() {
        return idLogAcesso;
    }

    /**
     * Sets the value of the idLogAcesso property.
     * 
     */
    public void setIdLogAcesso(int value) {
        this.idLogAcesso = value;
    }

    /**
     * Gets the value of the idUsuario property.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the dataAcesso property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAcesso() {
        return dataAcesso;
    }

    /**
     * Sets the value of the dataAcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAcesso(XMLGregorianCalendar value) {
        this.dataAcesso = value;
    }

    /**
     * Gets the value of the ipOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpOrigem() {
        return ipOrigem;
    }

    /**
     * Sets the value of the ipOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpOrigem(String value) {
        this.ipOrigem = value;
    }

    /**
     * Gets the value of the numCPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCPF() {
        return numCPF;
    }

    /**
     * Sets the value of the numCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCPF(String value) {
        this.numCPF = value;
    }

    /**
     * Gets the value of the codigoPessoa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPessoa() {
        return codigoPessoa;
    }

    /**
     * Sets the value of the codigoPessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPessoa(String value) {
        this.codigoPessoa = value;
    }

    /**
     * Gets the value of the nonBancoDados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonBancoDados() {
        return nonBancoDados;
    }

    /**
     * Sets the value of the nonBancoDados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonBancoDados(String value) {
        this.nonBancoDados = value;
    }

    /**
     * Gets the value of the codigoTipoAplicacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoAplicacao() {
        return codigoTipoAplicacao;
    }

    /**
     * Sets the value of the codigoTipoAplicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoAplicacao(String value) {
        this.codigoTipoAplicacao = value;
    }

}
