
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for budget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="budget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="regionalRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef"/>
 *           &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/>
 *           &lt;element name="subCentroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef"/>
 *           &lt;element name="projetoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projetoRef"/>
 *         &lt;/choice>
 *         &lt;element name="modalidadeLancamentoBudget" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}modalidadeLancamentoBudget"/>
 *         &lt;element name="tipoOperacaoBudget" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoOperacaoBudget"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "budget", propOrder = {
    "regionalRef",
    "centroDeCustoRef",
    "subCentroDeCustoRef",
    "projetoRef",
    "modalidadeLancamentoBudget",
    "tipoOperacaoBudget",
    "valor"
})
public class Budget {

    protected RegionalRef regionalRef;
    protected CentroDeCustoRef centroDeCustoRef;
    protected SubCentroDeCustoRef subCentroDeCustoRef;
    protected ProjetoRef projetoRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ModalidadeLancamentoBudget modalidadeLancamentoBudget;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoOperacaoBudget tipoOperacaoBudget;
    protected double valor;

    /**
     * Gets the value of the regionalRef property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalRef }
     *     
     */
    public RegionalRef getRegionalRef() {
        return regionalRef;
    }

    /**
     * Sets the value of the regionalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalRef }
     *     
     */
    public void setRegionalRef(RegionalRef value) {
        this.regionalRef = value;
    }

    /**
     * Gets the value of the centroDeCustoRef property.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Sets the value of the centroDeCustoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Gets the value of the subCentroDeCustoRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }

    /**
     * Sets the value of the subCentroDeCustoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCustoRef(SubCentroDeCustoRef value) {
        this.subCentroDeCustoRef = value;
    }

    /**
     * Gets the value of the projetoRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProjetoRef }
     *     
     */
    public ProjetoRef getProjetoRef() {
        return projetoRef;
    }

    /**
     * Sets the value of the projetoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjetoRef }
     *     
     */
    public void setProjetoRef(ProjetoRef value) {
        this.projetoRef = value;
    }

    /**
     * Gets the value of the modalidadeLancamentoBudget property.
     * 
     * @return
     *     possible object is
     *     {@link ModalidadeLancamentoBudget }
     *     
     */
    public ModalidadeLancamentoBudget getModalidadeLancamentoBudget() {
        return modalidadeLancamentoBudget;
    }

    /**
     * Sets the value of the modalidadeLancamentoBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalidadeLancamentoBudget }
     *     
     */
    public void setModalidadeLancamentoBudget(ModalidadeLancamentoBudget value) {
        this.modalidadeLancamentoBudget = value;
    }

    /**
     * Gets the value of the tipoOperacaoBudget property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacaoBudget }
     *     
     */
    public TipoOperacaoBudget getTipoOperacaoBudget() {
        return tipoOperacaoBudget;
    }

    /**
     * Sets the value of the tipoOperacaoBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacaoBudget }
     *     
     */
    public void setTipoOperacaoBudget(TipoOperacaoBudget value) {
        this.tipoOperacaoBudget = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
