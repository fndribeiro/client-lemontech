
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for importarDelegacaoParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importarDelegacaoParametrizacaoCentroDeCustoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionarioRefOrigem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="funcionarioRefDestino" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="vencimentoDelegacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="delegarTodasParametrizacoes" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}delegarTodasParametrizacoes"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="parametrizacoesEspecificas" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacoesEspecificas"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importarDelegacaoParametrizacaoCentroDeCustoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "funcionarioRefOrigem",
    "funcionarioRefDestino",
    "vencimentoDelegacao",
    "delegarTodasParametrizacoes",
    "parametrizacoesEspecificas"
})
public class ImportarDelegacaoParametrizacaoCentroDeCustoRequest {

    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRefOrigem;
    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRefDestino;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimentoDelegacao;
    protected DelegarTodasParametrizacoes delegarTodasParametrizacoes;
    protected ParametrizacoesEspecificas parametrizacoesEspecificas;

    /**
     * Gets the value of the funcionarioRefOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRefOrigem() {
        return funcionarioRefOrigem;
    }

    /**
     * Sets the value of the funcionarioRefOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRefOrigem(FuncionarioRef value) {
        this.funcionarioRefOrigem = value;
    }

    /**
     * Gets the value of the funcionarioRefDestino property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRefDestino() {
        return funcionarioRefDestino;
    }

    /**
     * Sets the value of the funcionarioRefDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRefDestino(FuncionarioRef value) {
        this.funcionarioRefDestino = value;
    }

    /**
     * Gets the value of the vencimentoDelegacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoDelegacao() {
        return vencimentoDelegacao;
    }

    /**
     * Sets the value of the vencimentoDelegacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoDelegacao(XMLGregorianCalendar value) {
        this.vencimentoDelegacao = value;
    }

    /**
     * Gets the value of the delegarTodasParametrizacoes property.
     * 
     * @return
     *     possible object is
     *     {@link DelegarTodasParametrizacoes }
     *     
     */
    public DelegarTodasParametrizacoes getDelegarTodasParametrizacoes() {
        return delegarTodasParametrizacoes;
    }

    /**
     * Sets the value of the delegarTodasParametrizacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegarTodasParametrizacoes }
     *     
     */
    public void setDelegarTodasParametrizacoes(DelegarTodasParametrizacoes value) {
        this.delegarTodasParametrizacoes = value;
    }

    /**
     * Gets the value of the parametrizacoesEspecificas property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacoesEspecificas }
     *     
     */
    public ParametrizacoesEspecificas getParametrizacoesEspecificas() {
        return parametrizacoesEspecificas;
    }

    /**
     * Sets the value of the parametrizacoesEspecificas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacoesEspecificas }
     *     
     */
    public void setParametrizacoesEspecificas(ParametrizacoesEspecificas value) {
        this.parametrizacoesEspecificas = value;
    }

}
