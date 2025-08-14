
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitacaoListarParametrizacaoCentroDeCusto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitacaoListarParametrizacaoCentroDeCusto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subCentroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aprovadorNome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nivelDeAprovacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoDeViagemDaAprocacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aprovaSomenteAprovador" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aprovaSomenteDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tipoDePassageiro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDeSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodoViagemInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodoViagemFinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valorAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaoListarParametrizacaoCentroDeCusto", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/solicitacaotolistarparametrizacaocentrodecusto", propOrder = {
    "centroDeCusto",
    "subCentroDeCusto",
    "regional",
    "aprovadorNome",
    "matricula",
    "nivelDeAprovacao",
    "tipoDeViagemDaAprocacao",
    "aprovaSomenteAprovador",
    "aprovaSomenteDentroDaPolitica",
    "tipoDePassageiro",
    "tipoDeSolicitacao",
    "vencimento",
    "periodoViagemInicial",
    "periodoViagemFinal",
    "valorAlcadaInicial",
    "valorAlcadaFinal"
})
public class SolicitacaoListarParametrizacaoCentroDeCusto {

    @XmlElement(required = true)
    protected String centroDeCusto;
    @XmlElement(required = true)
    protected String subCentroDeCusto;
    @XmlElement(required = true)
    protected String regional;
    @XmlElement(required = true)
    protected String aprovadorNome;
    @XmlElement(required = true)
    protected String matricula;
    protected int nivelDeAprovacao;
    @XmlElement(required = true)
    protected String tipoDeViagemDaAprocacao;
    protected boolean aprovaSomenteAprovador;
    protected boolean aprovaSomenteDentroDaPolitica;
    @XmlElement(required = true)
    protected String tipoDePassageiro;
    @XmlElement(required = true)
    protected String tipoDeSolicitacao;
    @XmlElement(required = true)
    protected String vencimento;
    @XmlElement(required = true)
    protected String periodoViagemInicial;
    @XmlElement(required = true)
    protected String periodoViagemFinal;
    protected double valorAlcadaInicial;
    protected double valorAlcadaFinal;

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
     * Gets the value of the subCentroDeCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCentroDeCusto() {
        return subCentroDeCusto;
    }

    /**
     * Sets the value of the subCentroDeCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCentroDeCusto(String value) {
        this.subCentroDeCusto = value;
    }

    /**
     * Gets the value of the regional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegional() {
        return regional;
    }

    /**
     * Sets the value of the regional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegional(String value) {
        this.regional = value;
    }

    /**
     * Gets the value of the aprovadorNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAprovadorNome() {
        return aprovadorNome;
    }

    /**
     * Sets the value of the aprovadorNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAprovadorNome(String value) {
        this.aprovadorNome = value;
    }

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
     * Gets the value of the nivelDeAprovacao property.
     * 
     */
    public int getNivelDeAprovacao() {
        return nivelDeAprovacao;
    }

    /**
     * Sets the value of the nivelDeAprovacao property.
     * 
     */
    public void setNivelDeAprovacao(int value) {
        this.nivelDeAprovacao = value;
    }

    /**
     * Gets the value of the tipoDeViagemDaAprocacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeViagemDaAprocacao() {
        return tipoDeViagemDaAprocacao;
    }

    /**
     * Sets the value of the tipoDeViagemDaAprocacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeViagemDaAprocacao(String value) {
        this.tipoDeViagemDaAprocacao = value;
    }

    /**
     * Gets the value of the aprovaSomenteAprovador property.
     * 
     */
    public boolean isAprovaSomenteAprovador() {
        return aprovaSomenteAprovador;
    }

    /**
     * Sets the value of the aprovaSomenteAprovador property.
     * 
     */
    public void setAprovaSomenteAprovador(boolean value) {
        this.aprovaSomenteAprovador = value;
    }

    /**
     * Gets the value of the aprovaSomenteDentroDaPolitica property.
     * 
     */
    public boolean isAprovaSomenteDentroDaPolitica() {
        return aprovaSomenteDentroDaPolitica;
    }

    /**
     * Sets the value of the aprovaSomenteDentroDaPolitica property.
     * 
     */
    public void setAprovaSomenteDentroDaPolitica(boolean value) {
        this.aprovaSomenteDentroDaPolitica = value;
    }

    /**
     * Gets the value of the tipoDePassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDePassageiro() {
        return tipoDePassageiro;
    }

    /**
     * Sets the value of the tipoDePassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDePassageiro(String value) {
        this.tipoDePassageiro = value;
    }

    /**
     * Gets the value of the tipoDeSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeSolicitacao() {
        return tipoDeSolicitacao;
    }

    /**
     * Sets the value of the tipoDeSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeSolicitacao(String value) {
        this.tipoDeSolicitacao = value;
    }

    /**
     * Gets the value of the vencimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * Sets the value of the vencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimento(String value) {
        this.vencimento = value;
    }

    /**
     * Gets the value of the periodoViagemInicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoViagemInicial() {
        return periodoViagemInicial;
    }

    /**
     * Sets the value of the periodoViagemInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoViagemInicial(String value) {
        this.periodoViagemInicial = value;
    }

    /**
     * Gets the value of the periodoViagemFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoViagemFinal() {
        return periodoViagemFinal;
    }

    /**
     * Sets the value of the periodoViagemFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoViagemFinal(String value) {
        this.periodoViagemFinal = value;
    }

    /**
     * Gets the value of the valorAlcadaInicial property.
     * 
     */
    public double getValorAlcadaInicial() {
        return valorAlcadaInicial;
    }

    /**
     * Sets the value of the valorAlcadaInicial property.
     * 
     */
    public void setValorAlcadaInicial(double value) {
        this.valorAlcadaInicial = value;
    }

    /**
     * Gets the value of the valorAlcadaFinal property.
     * 
     */
    public double getValorAlcadaFinal() {
        return valorAlcadaFinal;
    }

    /**
     * Sets the value of the valorAlcadaFinal property.
     * 
     */
    public void setValorAlcadaFinal(double value) {
        this.valorAlcadaFinal = value;
    }

}
