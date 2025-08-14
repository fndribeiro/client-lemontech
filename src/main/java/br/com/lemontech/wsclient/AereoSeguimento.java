
package br.com.lemontech.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for aereoSeguimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aereoSeguimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataChegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="aereoVoo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoVoo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="localizadorCia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milhas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paisOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCancelada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="statusCancelamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusCancelamento" minOccurs="0"/>
 *         &lt;element name="seguimentoCancelado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="valorTetoPolitica" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="solicitacaoAeroporto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}solicitacaoAeroporto" minOccurs="0"/>
 *         &lt;element name="tarifaSegmento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoSeguimento", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", propOrder = {
    "origem",
    "dataSaida",
    "destino",
    "dataChegada",
    "aereoVoo",
    "localizadorCia",
    "milhas",
    "paisOrigem",
    "estadoOrigem",
    "paisDestino",
    "estadoDestino",
    "cidadeOrigem",
    "cidadeDestino",
    "dataCancelada",
    "statusCancelamento",
    "seguimentoCancelado",
    "valorTetoPolitica",
    "solicitacaoAeroporto",
    "tarifaSegmento"
})
public class AereoSeguimento {

    protected String origem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    protected String destino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChegada;
    @XmlElement(nillable = true)
    protected List<AereoVoo> aereoVoo;
    protected String localizadorCia;
    protected Double milhas;
    protected String paisOrigem;
    protected String estadoOrigem;
    protected String paisDestino;
    protected String estadoDestino;
    protected String cidadeOrigem;
    protected String cidadeDestino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelada;
    @XmlSchemaType(name = "string")
    protected StatusCancelamento statusCancelamento;
    protected Boolean seguimentoCancelado;
    protected Double valorTetoPolitica;
    protected SolicitacaoAeroporto solicitacaoAeroporto;
    protected Double tarifaSegmento;

    /**
     * Gets the value of the origem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Sets the value of the origem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Gets the value of the dataSaida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Sets the value of the dataSaida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Gets the value of the dataChegada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChegada() {
        return dataChegada;
    }

    /**
     * Sets the value of the dataChegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChegada(XMLGregorianCalendar value) {
        this.dataChegada = value;
    }

    /**
     * Gets the value of the aereoVoo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aereoVoo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoVoo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoVoo }
     * 
     * 
     */
    public List<AereoVoo> getAereoVoo() {
        if (aereoVoo == null) {
            aereoVoo = new ArrayList<AereoVoo>();
        }
        return this.aereoVoo;
    }

    /**
     * Gets the value of the localizadorCia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizadorCia() {
        return localizadorCia;
    }

    /**
     * Sets the value of the localizadorCia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizadorCia(String value) {
        this.localizadorCia = value;
    }

    /**
     * Gets the value of the milhas property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMilhas() {
        return milhas;
    }

    /**
     * Sets the value of the milhas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMilhas(Double value) {
        this.milhas = value;
    }

    /**
     * Gets the value of the paisOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigem() {
        return paisOrigem;
    }

    /**
     * Sets the value of the paisOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigem(String value) {
        this.paisOrigem = value;
    }

    /**
     * Gets the value of the estadoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    /**
     * Sets the value of the estadoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoOrigem(String value) {
        this.estadoOrigem = value;
    }

    /**
     * Gets the value of the paisDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestino() {
        return paisDestino;
    }

    /**
     * Sets the value of the paisDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestino(String value) {
        this.paisDestino = value;
    }

    /**
     * Gets the value of the estadoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDestino() {
        return estadoDestino;
    }

    /**
     * Sets the value of the estadoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDestino(String value) {
        this.estadoDestino = value;
    }

    /**
     * Gets the value of the cidadeOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    /**
     * Sets the value of the cidadeOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeOrigem(String value) {
        this.cidadeOrigem = value;
    }

    /**
     * Gets the value of the cidadeDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDestino() {
        return cidadeDestino;
    }

    /**
     * Sets the value of the cidadeDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDestino(String value) {
        this.cidadeDestino = value;
    }

    /**
     * Gets the value of the dataCancelada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelada() {
        return dataCancelada;
    }

    /**
     * Sets the value of the dataCancelada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelada(XMLGregorianCalendar value) {
        this.dataCancelada = value;
    }

    /**
     * Gets the value of the statusCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCancelamento }
     *     
     */
    public StatusCancelamento getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Sets the value of the statusCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCancelamento }
     *     
     */
    public void setStatusCancelamento(StatusCancelamento value) {
        this.statusCancelamento = value;
    }

    /**
     * Gets the value of the seguimentoCancelado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeguimentoCancelado() {
        return seguimentoCancelado;
    }

    /**
     * Sets the value of the seguimentoCancelado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeguimentoCancelado(Boolean value) {
        this.seguimentoCancelado = value;
    }

    /**
     * Gets the value of the valorTetoPolitica property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTetoPolitica() {
        return valorTetoPolitica;
    }

    /**
     * Sets the value of the valorTetoPolitica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTetoPolitica(Double value) {
        this.valorTetoPolitica = value;
    }

    /**
     * Gets the value of the solicitacaoAeroporto property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitacaoAeroporto }
     *     
     */
    public SolicitacaoAeroporto getSolicitacaoAeroporto() {
        return solicitacaoAeroporto;
    }

    /**
     * Sets the value of the solicitacaoAeroporto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitacaoAeroporto }
     *     
     */
    public void setSolicitacaoAeroporto(SolicitacaoAeroporto value) {
        this.solicitacaoAeroporto = value;
    }

    /**
     * Gets the value of the tarifaSegmento property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifaSegmento() {
        return tarifaSegmento;
    }

    /**
     * Sets the value of the tarifaSegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifaSegmento(Double value) {
        this.tarifaSegmento = value;
    }

}
