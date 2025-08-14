
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
 * <p>Java class for prestacaoContaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/>
 *         &lt;element name="urlImagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deslocamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}deslocamentoTerrestre" minOccurs="0"/>
 *         &lt;element name="codigoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reembolsavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="custoCliente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nomeClienteCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaPagamentoPrestacaoContaItem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}formaPagamentoPrestacaoContaItem" minOccurs="0"/>
 *         &lt;element name="classificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moedaCambio" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/>
 *         &lt;element name="valorMoedaCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorMoedaCambioTesouraria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConvertido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusEstorno" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}statusEstorno" minOccurs="0"/>
 *         &lt;element name="rateios" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}rateios" minOccurs="0"/>
 *         &lt;element name="enumTipoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}enumTipoCartao" minOccurs="0"/>
 *         &lt;element name="dataDespesa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVencimentoFatura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="enumQualificadorTransacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}enumQualificadorTransacao" minOccurs="0"/>
 *         &lt;element name="codigoDespesaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}imagens" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoCombo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoComboValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}enumRelatorioDespesasItemStatus" minOccurs="0"/>
 *         &lt;element name="idTipoViagem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalConversaoTesouraria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContaItem", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", propOrder = {
    "tipoDespesa",
    "valor",
    "moeda",
    "urlImagem",
    "observacao",
    "identificadorExterno",
    "deslocamento",
    "codigoDespesa",
    "reembolsavel",
    "custoCliente",
    "nomeClienteCusto",
    "formaPagamentoPrestacaoContaItem",
    "classificacao",
    "id",
    "moedaCambio",
    "valorMoedaCambio",
    "valorMoedaCambioTesouraria",
    "totalConvertido",
    "statusEstorno",
    "rateios",
    "enumTipoCartao",
    "dataDespesa",
    "dataFim",
    "dataVencimentoFatura",
    "enumQualificadorTransacao",
    "codigoDespesaCredito",
    "imagens",
    "complemento",
    "complementoCombo",
    "descricao",
    "dataInicio",
    "numeroCartao",
    "complementoValor",
    "complementoComboValor",
    "nomeCidade",
    "horaInicial",
    "horaFinal",
    "status",
    "idTipoViagem",
    "totalConversaoTesouraria"
})
public class PrestacaoContaItem {

    protected String tipoDespesa;
    protected Double valor;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected String urlImagem;
    protected String observacao;
    protected String identificadorExterno;
    protected DeslocamentoTerrestre deslocamento;
    protected String codigoDespesa;
    protected Boolean reembolsavel;
    protected Boolean custoCliente;
    protected String nomeClienteCusto;
    @XmlSchemaType(name = "string")
    protected FormaPagamentoPrestacaoContaItem formaPagamentoPrestacaoContaItem;
    protected String classificacao;
    protected int id;
    @XmlSchemaType(name = "string")
    protected Moeda moedaCambio;
    protected Double valorMoedaCambio;
    protected Double valorMoedaCambioTesouraria;
    protected Double totalConvertido;
    @XmlSchemaType(name = "string")
    protected StatusEstorno statusEstorno;
    protected Rateios rateios;
    @XmlSchemaType(name = "string")
    protected EnumTipoCartao enumTipoCartao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDespesa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFim;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimentoFatura;
    @XmlSchemaType(name = "string")
    protected EnumQualificadorTransacao enumQualificadorTransacao;
    protected String codigoDespesaCredito;
    @XmlElement(nillable = true)
    protected List<Imagens> imagens;
    protected String complemento;
    protected String complementoCombo;
    protected String descricao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicio;
    protected String numeroCartao;
    protected String complementoValor;
    protected String complementoComboValor;
    protected String nomeCidade;
    protected String horaInicial;
    protected String horaFinal;
    @XmlSchemaType(name = "string")
    protected EnumRelatorioDespesasItemStatus status;
    @XmlElement(required = true)
    protected String idTipoViagem;
    protected Double totalConversaoTesouraria;

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
     * Gets the value of the urlImagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Sets the value of the urlImagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the identificadorExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorExterno() {
        return identificadorExterno;
    }

    /**
     * Sets the value of the identificadorExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorExterno(String value) {
        this.identificadorExterno = value;
    }

    /**
     * Gets the value of the deslocamento property.
     * 
     * @return
     *     possible object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public DeslocamentoTerrestre getDeslocamento() {
        return deslocamento;
    }

    /**
     * Sets the value of the deslocamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public void setDeslocamento(DeslocamentoTerrestre value) {
        this.deslocamento = value;
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
     * Gets the value of the reembolsavel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReembolsavel() {
        return reembolsavel;
    }

    /**
     * Sets the value of the reembolsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReembolsavel(Boolean value) {
        this.reembolsavel = value;
    }

    /**
     * Gets the value of the custoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustoCliente() {
        return custoCliente;
    }

    /**
     * Sets the value of the custoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustoCliente(Boolean value) {
        this.custoCliente = value;
    }

    /**
     * Gets the value of the nomeClienteCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeClienteCusto() {
        return nomeClienteCusto;
    }

    /**
     * Sets the value of the nomeClienteCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeClienteCusto(String value) {
        this.nomeClienteCusto = value;
    }

    /**
     * Gets the value of the formaPagamentoPrestacaoContaItem property.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagamentoPrestacaoContaItem }
     *     
     */
    public FormaPagamentoPrestacaoContaItem getFormaPagamentoPrestacaoContaItem() {
        return formaPagamentoPrestacaoContaItem;
    }

    /**
     * Sets the value of the formaPagamentoPrestacaoContaItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagamentoPrestacaoContaItem }
     *     
     */
    public void setFormaPagamentoPrestacaoContaItem(FormaPagamentoPrestacaoContaItem value) {
        this.formaPagamentoPrestacaoContaItem = value;
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
     * Gets the value of the valorMoedaCambioTesouraria property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMoedaCambioTesouraria() {
        return valorMoedaCambioTesouraria;
    }

    /**
     * Sets the value of the valorMoedaCambioTesouraria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMoedaCambioTesouraria(Double value) {
        this.valorMoedaCambioTesouraria = value;
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
     * Gets the value of the statusEstorno property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEstorno }
     *     
     */
    public StatusEstorno getStatusEstorno() {
        return statusEstorno;
    }

    /**
     * Sets the value of the statusEstorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEstorno }
     *     
     */
    public void setStatusEstorno(StatusEstorno value) {
        this.statusEstorno = value;
    }

    /**
     * Gets the value of the rateios property.
     * 
     * @return
     *     possible object is
     *     {@link Rateios }
     *     
     */
    public Rateios getRateios() {
        return rateios;
    }

    /**
     * Sets the value of the rateios property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rateios }
     *     
     */
    public void setRateios(Rateios value) {
        this.rateios = value;
    }

    /**
     * Gets the value of the enumTipoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTipoCartao }
     *     
     */
    public EnumTipoCartao getEnumTipoCartao() {
        return enumTipoCartao;
    }

    /**
     * Sets the value of the enumTipoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTipoCartao }
     *     
     */
    public void setEnumTipoCartao(EnumTipoCartao value) {
        this.enumTipoCartao = value;
    }

    /**
     * Gets the value of the dataDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDespesa() {
        return dataDespesa;
    }

    /**
     * Sets the value of the dataDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDespesa(XMLGregorianCalendar value) {
        this.dataDespesa = value;
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
     * Gets the value of the enumQualificadorTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link EnumQualificadorTransacao }
     *     
     */
    public EnumQualificadorTransacao getEnumQualificadorTransacao() {
        return enumQualificadorTransacao;
    }

    /**
     * Sets the value of the enumQualificadorTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumQualificadorTransacao }
     *     
     */
    public void setEnumQualificadorTransacao(EnumQualificadorTransacao value) {
        this.enumQualificadorTransacao = value;
    }

    /**
     * Gets the value of the codigoDespesaCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespesaCredito() {
        return codigoDespesaCredito;
    }

    /**
     * Sets the value of the codigoDespesaCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespesaCredito(String value) {
        this.codigoDespesaCredito = value;
    }

    /**
     * Gets the value of the imagens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Imagens }
     * 
     * 
     */
    public List<Imagens> getImagens() {
        if (imagens == null) {
            imagens = new ArrayList<Imagens>();
        }
        return this.imagens;
    }

    /**
     * Gets the value of the complemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Sets the value of the complemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
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
     * Gets the value of the numeroCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Sets the value of the numeroCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartao(String value) {
        this.numeroCartao = value;
    }

    /**
     * Gets the value of the complementoValor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoValor() {
        return complementoValor;
    }

    /**
     * Sets the value of the complementoValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoValor(String value) {
        this.complementoValor = value;
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
     * Gets the value of the nomeCidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCidade() {
        return nomeCidade;
    }

    /**
     * Sets the value of the nomeCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCidade(String value) {
        this.nomeCidade = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumRelatorioDespesasItemStatus }
     *     
     */
    public EnumRelatorioDespesasItemStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumRelatorioDespesasItemStatus }
     *     
     */
    public void setStatus(EnumRelatorioDespesasItemStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the idTipoViagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoViagem() {
        return idTipoViagem;
    }

    /**
     * Sets the value of the idTipoViagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoViagem(String value) {
        this.idTipoViagem = value;
    }

    /**
     * Gets the value of the totalConversaoTesouraria property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConversaoTesouraria() {
        return totalConversaoTesouraria;
    }

    /**
     * Sets the value of the totalConversaoTesouraria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConversaoTesouraria(Double value) {
        this.totalConversaoTesouraria = value;
    }

}
