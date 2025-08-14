
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reemissao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reemissao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bilheteOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bilheteReemissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credito" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="multa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="documentoMulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoColetaMulta" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoColetaMulta" minOccurs="0"/>
 *         &lt;element name="taxaColeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaBaseOrginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxaOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMultaOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorResidualOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotalPagarOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaBaseNovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaNovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxaNovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalNovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMultaNovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorResidualNovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotalPagarNovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorResidual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotalPagar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reemissaoOuRemarcacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reemissao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", propOrder = {
    "bilheteOriginal",
    "bilheteReemissao",
    "credito",
    "multa",
    "documentoMulta",
    "documentoCredito",
    "tipoColetaMulta",
    "taxaColeta",
    "tarifaBaseOrginal",
    "tarifaOriginal",
    "taxaOriginal",
    "totalOriginal",
    "totalMultaOriginal",
    "valorResidualOriginal",
    "valorTotalPagarOriginal",
    "tarifaBaseNovo",
    "tarifaNovo",
    "taxaNovo",
    "totalNovo",
    "totalMultaNovo",
    "valorResidualNovo",
    "valorTotalPagarNovo",
    "tarifaBase",
    "tarifa",
    "taxa",
    "total",
    "totalMulta",
    "valorResidual",
    "valorTotalPagar",
    "reemissaoOuRemarcacao"
})
public class Reemissao {

    protected String bilheteOriginal;
    protected String bilheteReemissao;
    protected Double credito;
    protected Double multa;
    protected String documentoMulta;
    protected String documentoCredito;
    @XmlSchemaType(name = "string")
    protected TipoColetaMulta tipoColetaMulta;
    protected String taxaColeta;
    protected String tarifaBaseOrginal;
    protected String tarifaOriginal;
    protected String taxaOriginal;
    protected String totalOriginal;
    protected String totalMultaOriginal;
    protected String valorResidualOriginal;
    protected String valorTotalPagarOriginal;
    protected String tarifaBaseNovo;
    protected String tarifaNovo;
    protected String taxaNovo;
    protected String totalNovo;
    protected String totalMultaNovo;
    protected String valorResidualNovo;
    protected String valorTotalPagarNovo;
    protected String tarifaBase;
    protected String tarifa;
    protected String taxa;
    protected String total;
    protected String totalMulta;
    protected String valorResidual;
    protected String valorTotalPagar;
    protected String reemissaoOuRemarcacao;

    /**
     * Gets the value of the bilheteOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilheteOriginal() {
        return bilheteOriginal;
    }

    /**
     * Sets the value of the bilheteOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilheteOriginal(String value) {
        this.bilheteOriginal = value;
    }

    /**
     * Gets the value of the bilheteReemissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilheteReemissao() {
        return bilheteReemissao;
    }

    /**
     * Sets the value of the bilheteReemissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilheteReemissao(String value) {
        this.bilheteReemissao = value;
    }

    /**
     * Gets the value of the credito property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCredito() {
        return credito;
    }

    /**
     * Sets the value of the credito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCredito(Double value) {
        this.credito = value;
    }

    /**
     * Gets the value of the multa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMulta() {
        return multa;
    }

    /**
     * Sets the value of the multa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMulta(Double value) {
        this.multa = value;
    }

    /**
     * Gets the value of the documentoMulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoMulta() {
        return documentoMulta;
    }

    /**
     * Sets the value of the documentoMulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoMulta(String value) {
        this.documentoMulta = value;
    }

    /**
     * Gets the value of the documentoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoCredito() {
        return documentoCredito;
    }

    /**
     * Sets the value of the documentoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoCredito(String value) {
        this.documentoCredito = value;
    }

    /**
     * Gets the value of the tipoColetaMulta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoColetaMulta }
     *     
     */
    public TipoColetaMulta getTipoColetaMulta() {
        return tipoColetaMulta;
    }

    /**
     * Sets the value of the tipoColetaMulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoColetaMulta }
     *     
     */
    public void setTipoColetaMulta(TipoColetaMulta value) {
        this.tipoColetaMulta = value;
    }

    /**
     * Gets the value of the taxaColeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxaColeta() {
        return taxaColeta;
    }

    /**
     * Sets the value of the taxaColeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxaColeta(String value) {
        this.taxaColeta = value;
    }

    /**
     * Gets the value of the tarifaBaseOrginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaBaseOrginal() {
        return tarifaBaseOrginal;
    }

    /**
     * Sets the value of the tarifaBaseOrginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaBaseOrginal(String value) {
        this.tarifaBaseOrginal = value;
    }

    /**
     * Gets the value of the tarifaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaOriginal() {
        return tarifaOriginal;
    }

    /**
     * Sets the value of the tarifaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaOriginal(String value) {
        this.tarifaOriginal = value;
    }

    /**
     * Gets the value of the taxaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxaOriginal() {
        return taxaOriginal;
    }

    /**
     * Sets the value of the taxaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxaOriginal(String value) {
        this.taxaOriginal = value;
    }

    /**
     * Gets the value of the totalOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOriginal() {
        return totalOriginal;
    }

    /**
     * Sets the value of the totalOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOriginal(String value) {
        this.totalOriginal = value;
    }

    /**
     * Gets the value of the totalMultaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMultaOriginal() {
        return totalMultaOriginal;
    }

    /**
     * Sets the value of the totalMultaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMultaOriginal(String value) {
        this.totalMultaOriginal = value;
    }

    /**
     * Gets the value of the valorResidualOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorResidualOriginal() {
        return valorResidualOriginal;
    }

    /**
     * Sets the value of the valorResidualOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorResidualOriginal(String value) {
        this.valorResidualOriginal = value;
    }

    /**
     * Gets the value of the valorTotalPagarOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTotalPagarOriginal() {
        return valorTotalPagarOriginal;
    }

    /**
     * Sets the value of the valorTotalPagarOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTotalPagarOriginal(String value) {
        this.valorTotalPagarOriginal = value;
    }

    /**
     * Gets the value of the tarifaBaseNovo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaBaseNovo() {
        return tarifaBaseNovo;
    }

    /**
     * Sets the value of the tarifaBaseNovo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaBaseNovo(String value) {
        this.tarifaBaseNovo = value;
    }

    /**
     * Gets the value of the tarifaNovo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaNovo() {
        return tarifaNovo;
    }

    /**
     * Sets the value of the tarifaNovo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaNovo(String value) {
        this.tarifaNovo = value;
    }

    /**
     * Gets the value of the taxaNovo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxaNovo() {
        return taxaNovo;
    }

    /**
     * Sets the value of the taxaNovo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxaNovo(String value) {
        this.taxaNovo = value;
    }

    /**
     * Gets the value of the totalNovo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNovo() {
        return totalNovo;
    }

    /**
     * Sets the value of the totalNovo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNovo(String value) {
        this.totalNovo = value;
    }

    /**
     * Gets the value of the totalMultaNovo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMultaNovo() {
        return totalMultaNovo;
    }

    /**
     * Sets the value of the totalMultaNovo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMultaNovo(String value) {
        this.totalMultaNovo = value;
    }

    /**
     * Gets the value of the valorResidualNovo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorResidualNovo() {
        return valorResidualNovo;
    }

    /**
     * Sets the value of the valorResidualNovo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorResidualNovo(String value) {
        this.valorResidualNovo = value;
    }

    /**
     * Gets the value of the valorTotalPagarNovo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTotalPagarNovo() {
        return valorTotalPagarNovo;
    }

    /**
     * Sets the value of the valorTotalPagarNovo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTotalPagarNovo(String value) {
        this.valorTotalPagarNovo = value;
    }

    /**
     * Gets the value of the tarifaBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaBase() {
        return tarifaBase;
    }

    /**
     * Sets the value of the tarifaBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaBase(String value) {
        this.tarifaBase = value;
    }

    /**
     * Gets the value of the tarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifa() {
        return tarifa;
    }

    /**
     * Sets the value of the tarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifa(String value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the taxa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxa() {
        return taxa;
    }

    /**
     * Sets the value of the taxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxa(String value) {
        this.taxa = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the totalMulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMulta() {
        return totalMulta;
    }

    /**
     * Sets the value of the totalMulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMulta(String value) {
        this.totalMulta = value;
    }

    /**
     * Gets the value of the valorResidual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorResidual() {
        return valorResidual;
    }

    /**
     * Sets the value of the valorResidual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorResidual(String value) {
        this.valorResidual = value;
    }

    /**
     * Gets the value of the valorTotalPagar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTotalPagar() {
        return valorTotalPagar;
    }

    /**
     * Sets the value of the valorTotalPagar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTotalPagar(String value) {
        this.valorTotalPagar = value;
    }

    /**
     * Gets the value of the reemissaoOuRemarcacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReemissaoOuRemarcacao() {
        return reemissaoOuRemarcacao;
    }

    /**
     * Sets the value of the reemissaoOuRemarcacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReemissaoOuRemarcacao(String value) {
        this.reemissaoOuRemarcacao = value;
    }

}
