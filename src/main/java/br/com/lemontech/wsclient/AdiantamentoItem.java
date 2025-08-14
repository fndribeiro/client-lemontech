
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for adiantamentoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adiantamentoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/>
 *         &lt;element name="codigoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moedaCambio" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/>
 *         &lt;element name="valorMoedaCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConvertido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="complementoCombo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoComboValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iof" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adiantamentoItem", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", propOrder = {
    "tipoDespesa",
    "valor",
    "moeda",
    "codigoDespesa",
    "classificacao",
    "id",
    "moedaCambio",
    "valorMoedaCambio",
    "totalConvertido",
    "complementoCombo",
    "complementoComboValor",
    "cidade",
    "horaInicial",
    "horaFinal",
    "iof",
    "dataInicial",
    "dataFinal"
})
public class AdiantamentoItem {

    protected String tipoDespesa;
    protected Double valor;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected String codigoDespesa;
    protected String classificacao;
    protected int id;
    @XmlSchemaType(name = "string")
    protected Moeda moedaCambio;
    protected Double valorMoedaCambio;
    protected Double totalConvertido;
    protected String complementoCombo;
    protected String complementoComboValor;
    protected String cidade;
    protected String horaInicial;
    protected String horaFinal;
    protected Double iof;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinal;

    /**
     * Gets the value of the tipoDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Sets the value of the tipoDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDespesa(String value) {
        this.tipoDespesa = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Gets the value of the codigoDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespesa() {
        return codigoDespesa;
    }

    /**
     * Sets the value of the codigoDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespesa(String value) {
        this.codigoDespesa = value;
    }

    /**
     * Gets the value of the classificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * Sets the value of the classificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificacao(String value) {
        this.classificacao = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the moedaCambio property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoedaCambio() {
        return moedaCambio;
    }

    /**
     * Sets the value of the moedaCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoedaCambio(Moeda value) {
        this.moedaCambio = value;
    }

    /**
     * Gets the value of the valorMoedaCambio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMoedaCambio() {
        return valorMoedaCambio;
    }

    /**
     * Sets the value of the valorMoedaCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMoedaCambio(Double value) {
        this.valorMoedaCambio = value;
    }

    /**
     * Gets the value of the totalConvertido property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConvertido() {
        return totalConvertido;
    }

    /**
     * Sets the value of the totalConvertido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConvertido(Double value) {
        this.totalConvertido = value;
    }

    /**
     * Gets the value of the complementoCombo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoCombo() {
        return complementoCombo;
    }

    /**
     * Sets the value of the complementoCombo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoCombo(String value) {
        this.complementoCombo = value;
    }

    /**
     * Gets the value of the complementoComboValor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoComboValor() {
        return complementoComboValor;
    }

    /**
     * Sets the value of the complementoComboValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoComboValor(String value) {
        this.complementoComboValor = value;
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
     * Gets the value of the horaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicial() {
        return horaInicial;
    }

    /**
     * Sets the value of the horaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicial(String value) {
        this.horaInicial = value;
    }

    /**
     * Gets the value of the horaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Sets the value of the horaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFinal(String value) {
        this.horaFinal = value;
    }

    /**
     * Gets the value of the iof property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIof() {
        return iof;
    }

    /**
     * Sets the value of the iof property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIof(Double value) {
        this.iof = value;
    }

    /**
     * Gets the value of the dataInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Sets the value of the dataInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicial(XMLGregorianCalendar value) {
        this.dataInicial = value;
    }

    /**
     * Gets the value of the dataFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Sets the value of the dataFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinal(XMLGregorianCalendar value) {
        this.dataFinal = value;
    }

}
