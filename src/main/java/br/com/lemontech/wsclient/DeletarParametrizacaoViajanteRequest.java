
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletarParametrizacaoViajanteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletarParametrizacaoViajanteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="parametrizacaoViajanteAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacaoRef"/>
 *           &lt;element name="parametrizacaoViajanteAprovacaoDeletarTodosRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacaoDeletarTodosRef"/>
 *         &lt;/choice>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarParametrizacaoViajanteRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "parametrizacaoViajanteAprovacaoRef",
    "parametrizacaoViajanteAprovacaoDeletarTodosRef",
    "idCliente"
})
public class DeletarParametrizacaoViajanteRequest {

    protected ParametrizacaoViajanteAprovacaoRef parametrizacaoViajanteAprovacaoRef;
    protected ParametrizacaoViajanteAprovacaoDeletarTodosRef parametrizacaoViajanteAprovacaoDeletarTodosRef;
    protected Integer idCliente;

    /**
     * Gets the value of the parametrizacaoViajanteAprovacaoRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public ParametrizacaoViajanteAprovacaoRef getParametrizacaoViajanteAprovacaoRef() {
        return parametrizacaoViajanteAprovacaoRef;
    }

    /**
     * Sets the value of the parametrizacaoViajanteAprovacaoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public void setParametrizacaoViajanteAprovacaoRef(ParametrizacaoViajanteAprovacaoRef value) {
        this.parametrizacaoViajanteAprovacaoRef = value;
    }

    /**
     * Gets the value of the parametrizacaoViajanteAprovacaoDeletarTodosRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacaoDeletarTodosRef }
     *     
     */
    public ParametrizacaoViajanteAprovacaoDeletarTodosRef getParametrizacaoViajanteAprovacaoDeletarTodosRef() {
        return parametrizacaoViajanteAprovacaoDeletarTodosRef;
    }

    /**
     * Sets the value of the parametrizacaoViajanteAprovacaoDeletarTodosRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacaoDeletarTodosRef }
     *     
     */
    public void setParametrizacaoViajanteAprovacaoDeletarTodosRef(ParametrizacaoViajanteAprovacaoDeletarTodosRef value) {
        this.parametrizacaoViajanteAprovacaoDeletarTodosRef = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

}
