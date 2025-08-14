
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cadastrarParticipanteTreinamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParticipanteTreinamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoTreinamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desviaPoliticaAereo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="desviaPoliticaHotel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="desviaPoliticaCarro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarParticipanteTreinamento", propOrder = {
    "matricula",
    "codigoTreinamento",
    "desviaPoliticaAereo",
    "desviaPoliticaHotel",
    "desviaPoliticaCarro",
    "pais",
    "uf",
    "cidade",
    "iata"
})
public class CadastrarParticipanteTreinamento {

    @XmlElement(required = true)
    protected String matricula;
    @XmlElement(required = true)
    protected String codigoTreinamento;
    protected boolean desviaPoliticaAereo;
    protected boolean desviaPoliticaHotel;
    protected boolean desviaPoliticaCarro;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String uf;
    protected String cidade;
    protected String iata;

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
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
     * Gets the value of the desviaPoliticaAereo property.
     * 
     */
    public boolean isDesviaPoliticaAereo() {
        return desviaPoliticaAereo;
    }

    /**
     * Sets the value of the desviaPoliticaAereo property.
     * 
     */
    public void setDesviaPoliticaAereo(boolean value) {
        this.desviaPoliticaAereo = value;
    }

    /**
     * Gets the value of the desviaPoliticaHotel property.
     * 
     */
    public boolean isDesviaPoliticaHotel() {
        return desviaPoliticaHotel;
    }

    /**
     * Sets the value of the desviaPoliticaHotel property.
     * 
     */
    public void setDesviaPoliticaHotel(boolean value) {
        this.desviaPoliticaHotel = value;
    }

    /**
     * Gets the value of the desviaPoliticaCarro property.
     * 
     */
    public boolean isDesviaPoliticaCarro() {
        return desviaPoliticaCarro;
    }

    /**
     * Sets the value of the desviaPoliticaCarro property.
     * 
     */
    public void setDesviaPoliticaCarro(boolean value) {
        this.desviaPoliticaCarro = value;
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

}
