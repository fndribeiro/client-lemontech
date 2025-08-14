
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for criarPreSolicitacaoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criarPreSolicitacaoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="solicitante" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="passageiro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="acompanhantes" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}acompanhanteRef" minOccurs="0"/>
 *         &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/>
 *         &lt;element name="pedidosAereos" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}pedidosAereos" minOccurs="0"/>
 *         &lt;element name="pedidosHoteis" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel}pedidosHoteis" minOccurs="0"/>
 *         &lt;element name="pedidosCarros" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro}pedidosCarros" minOccurs="0"/>
 *         &lt;element name="controleCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="camposAdicionais" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}camposAdicionais" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarPreSolicitacaoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "solicitante",
    "passageiro",
    "acompanhantes",
    "centroDeCustoRef",
    "pedidosAereos",
    "pedidosHoteis",
    "pedidosCarros",
    "controleCliente",
    "camposAdicionais"
})
public class CriarPreSolicitacaoRequest {

    @XmlElement(required = true)
    protected FuncionarioRef solicitante;
    @XmlElement(required = true)
    protected FuncionarioRef passageiro;
    protected AcompanhanteRef acompanhantes;
    @XmlElement(required = true)
    protected CentroDeCustoRef centroDeCustoRef;
    protected PedidosAereos pedidosAereos;
    protected PedidosHoteis pedidosHoteis;
    protected PedidosCarros pedidosCarros;
    protected String controleCliente;
    protected CamposAdicionais camposAdicionais;

    /**
     * Gets the value of the solicitante property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getSolicitante() {
        return solicitante;
    }

    /**
     * Sets the value of the solicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setSolicitante(FuncionarioRef value) {
        this.solicitante = value;
    }

    /**
     * Gets the value of the passageiro property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getPassageiro() {
        return passageiro;
    }

    /**
     * Sets the value of the passageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setPassageiro(FuncionarioRef value) {
        this.passageiro = value;
    }

    /**
     * Gets the value of the acompanhantes property.
     * 
     * @return
     *     possible object is
     *     {@link AcompanhanteRef }
     *     
     */
    public AcompanhanteRef getAcompanhantes() {
        return acompanhantes;
    }

    /**
     * Sets the value of the acompanhantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcompanhanteRef }
     *     
     */
    public void setAcompanhantes(AcompanhanteRef value) {
        this.acompanhantes = value;
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
     * Gets the value of the pedidosAereos property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosAereos }
     *     
     */
    public PedidosAereos getPedidosAereos() {
        return pedidosAereos;
    }

    /**
     * Sets the value of the pedidosAereos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosAereos }
     *     
     */
    public void setPedidosAereos(PedidosAereos value) {
        this.pedidosAereos = value;
    }

    /**
     * Gets the value of the pedidosHoteis property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosHoteis }
     *     
     */
    public PedidosHoteis getPedidosHoteis() {
        return pedidosHoteis;
    }

    /**
     * Sets the value of the pedidosHoteis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosHoteis }
     *     
     */
    public void setPedidosHoteis(PedidosHoteis value) {
        this.pedidosHoteis = value;
    }

    /**
     * Gets the value of the pedidosCarros property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosCarros }
     *     
     */
    public PedidosCarros getPedidosCarros() {
        return pedidosCarros;
    }

    /**
     * Sets the value of the pedidosCarros property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosCarros }
     *     
     */
    public void setPedidosCarros(PedidosCarros value) {
        this.pedidosCarros = value;
    }

    /**
     * Gets the value of the controleCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleCliente() {
        return controleCliente;
    }

    /**
     * Sets the value of the controleCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleCliente(String value) {
        this.controleCliente = value;
    }

    /**
     * Gets the value of the camposAdicionais property.
     * 
     * @return
     *     possible object is
     *     {@link CamposAdicionais }
     *     
     */
    public CamposAdicionais getCamposAdicionais() {
        return camposAdicionais;
    }

    /**
     * Sets the value of the camposAdicionais property.
     * 
     * @param value
     *     allowed object is
     *     {@link CamposAdicionais }
     *     
     */
    public void setCamposAdicionais(CamposAdicionais value) {
        this.camposAdicionais = value;
    }

}
