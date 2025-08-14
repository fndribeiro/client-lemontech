
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for importarDespesaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importarDespesaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="dataTransacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda"/>
 *         &lt;element name="valorTransacao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moedaOriginal" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/>
 *         &lt;element name="valorTransacaoOriginal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estabelecimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="codigoAutorizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/>
 *         &lt;element name="qualificadorDespesa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}qualificadorDespesa" minOccurs="0"/>
 *         &lt;element name="enderecoPartida" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="horaPartida" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="enderecoChegada" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="horaChegada" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dataContabil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="codigoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/>
 *         &lt;element name="paisOrigem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/>
 *         &lt;element name="numeroIdentificador" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataVencimentoFatura" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="qualificadorTransacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}qualificadorTransacao" minOccurs="0"/>
 *         &lt;element name="valorTotalFatura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numeroCartaoMascarado6d" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}numeroCartaoMascarado" minOccurs="0"/>
 *         &lt;element name="idTipoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCartao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importarDespesaRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "funcionario",
    "dataTransacao",
    "moeda",
    "valorTransacao",
    "moedaOriginal",
    "valorTransacaoOriginal",
    "estabelecimento",
    "codigoAutorizacao",
    "qualificadorDespesa",
    "enderecoPartida",
    "horaPartida",
    "enderecoChegada",
    "horaChegada",
    "distancia",
    "dataContabil",
    "codigoCartao",
    "cidade",
    "paisOrigem",
    "numeroIdentificador",
    "dataVencimentoFatura",
    "qualificadorTransacao",
    "valorTotalFatura",
    "numeroCartaoMascarado6D",
    "idTipoCartao"
})
public class ImportarDespesaRequest {

    @XmlElement(required = true)
    protected FuncionarioRef funcionario;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataTransacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected double valorTransacao;
    @XmlSchemaType(name = "string")
    protected Moeda moedaOriginal;
    protected Double valorTransacaoOriginal;
    protected String estabelecimento;
    protected String codigoAutorizacao;
    @XmlSchemaType(name = "string")
    protected QualificadorDespesa qualificadorDespesa;
    protected String enderecoPartida;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaPartida;
    protected String enderecoChegada;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaChegada;
    protected Double distancia;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataContabil;
    protected String codigoCartao;
    protected String cidade;
    protected String paisOrigem;
    protected Long numeroIdentificador;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVencimentoFatura;
    protected String qualificadorTransacao;
    protected Double valorTotalFatura;
    @XmlElement(name = "numeroCartaoMascarado6d")
    protected String numeroCartaoMascarado6D;
    protected String idTipoCartao;

    /**
     * Gets the value of the funcionario property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionario() {
        return funcionario;
    }

    /**
     * Sets the value of the funcionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionario(FuncionarioRef value) {
        this.funcionario = value;
    }

    /**
     * Gets the value of the dataTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTransacao() {
        return dataTransacao;
    }

    /**
     * Sets the value of the dataTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTransacao(XMLGregorianCalendar value) {
        this.dataTransacao = value;
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
     * Gets the value of the valorTransacao property.
     * 
     */
    public double getValorTransacao() {
        return valorTransacao;
    }

    /**
     * Sets the value of the valorTransacao property.
     * 
     */
    public void setValorTransacao(double value) {
        this.valorTransacao = value;
    }

    /**
     * Gets the value of the moedaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoedaOriginal() {
        return moedaOriginal;
    }

    /**
     * Sets the value of the moedaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoedaOriginal(Moeda value) {
        this.moedaOriginal = value;
    }

    /**
     * Gets the value of the valorTransacaoOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTransacaoOriginal() {
        return valorTransacaoOriginal;
    }

    /**
     * Sets the value of the valorTransacaoOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTransacaoOriginal(Double value) {
        this.valorTransacaoOriginal = value;
    }

    /**
     * Gets the value of the estabelecimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * Sets the value of the estabelecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstabelecimento(String value) {
        this.estabelecimento = value;
    }

    /**
     * Gets the value of the codigoAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAutorizacao() {
        return codigoAutorizacao;
    }

    /**
     * Sets the value of the codigoAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAutorizacao(String value) {
        this.codigoAutorizacao = value;
    }

    /**
     * Gets the value of the qualificadorDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link QualificadorDespesa }
     *     
     */
    public QualificadorDespesa getQualificadorDespesa() {
        return qualificadorDespesa;
    }

    /**
     * Sets the value of the qualificadorDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificadorDespesa }
     *     
     */
    public void setQualificadorDespesa(QualificadorDespesa value) {
        this.qualificadorDespesa = value;
    }

    /**
     * Gets the value of the enderecoPartida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoPartida() {
        return enderecoPartida;
    }

    /**
     * Sets the value of the enderecoPartida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoPartida(String value) {
        this.enderecoPartida = value;
    }

    /**
     * Gets the value of the horaPartida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraPartida() {
        return horaPartida;
    }

    /**
     * Sets the value of the horaPartida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraPartida(XMLGregorianCalendar value) {
        this.horaPartida = value;
    }

    /**
     * Gets the value of the enderecoChegada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoChegada() {
        return enderecoChegada;
    }

    /**
     * Sets the value of the enderecoChegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoChegada(String value) {
        this.enderecoChegada = value;
    }

    /**
     * Gets the value of the horaChegada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraChegada() {
        return horaChegada;
    }

    /**
     * Sets the value of the horaChegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraChegada(XMLGregorianCalendar value) {
        this.horaChegada = value;
    }

    /**
     * Gets the value of the distancia property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistancia() {
        return distancia;
    }

    /**
     * Sets the value of the distancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistancia(Double value) {
        this.distancia = value;
    }

    /**
     * Gets the value of the dataContabil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataContabil() {
        return dataContabil;
    }

    /**
     * Sets the value of the dataContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataContabil(XMLGregorianCalendar value) {
        this.dataContabil = value;
    }

    /**
     * Gets the value of the codigoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCartao() {
        return codigoCartao;
    }

    /**
     * Sets the value of the codigoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCartao(String value) {
        this.codigoCartao = value;
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
     * Gets the value of the numeroIdentificador property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroIdentificador() {
        return numeroIdentificador;
    }

    /**
     * Sets the value of the numeroIdentificador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroIdentificador(Long value) {
        this.numeroIdentificador = value;
    }

    /**
     * Gets the value of the dataVencimentoFatura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimentoFatura() {
        return dataVencimentoFatura;
    }

    /**
     * Sets the value of the dataVencimentoFatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimentoFatura(XMLGregorianCalendar value) {
        this.dataVencimentoFatura = value;
    }

    /**
     * Gets the value of the qualificadorTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificadorTransacao() {
        return qualificadorTransacao;
    }

    /**
     * Sets the value of the qualificadorTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificadorTransacao(String value) {
        this.qualificadorTransacao = value;
    }

    /**
     * Gets the value of the valorTotalFatura property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotalFatura() {
        return valorTotalFatura;
    }

    /**
     * Sets the value of the valorTotalFatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotalFatura(Double value) {
        this.valorTotalFatura = value;
    }

    /**
     * Gets the value of the numeroCartaoMascarado6D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartaoMascarado6D() {
        return numeroCartaoMascarado6D;
    }

    /**
     * Sets the value of the numeroCartaoMascarado6D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartaoMascarado6D(String value) {
        this.numeroCartaoMascarado6D = value;
    }

    /**
     * Gets the value of the idTipoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoCartao() {
        return idTipoCartao;
    }

    /**
     * Sets the value of the idTipoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoCartao(String value) {
        this.idTipoCartao = value;
    }

}
