
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametrizacaoViajanteAprovacaoDeletarTodosRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoViajanteAprovacaoDeletarTodosRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viajanteRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoViajanteAprovacaoDeletarTodosRef", propOrder = {
    "viajanteRef"
})
public class ParametrizacaoViajanteAprovacaoDeletarTodosRef {

    @XmlElement(required = true)
    protected FuncionarioRef viajanteRef;

    /**
     * Gets the value of the viajanteRef property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getViajanteRef() {
        return viajanteRef;
    }

    /**
     * Sets the value of the viajanteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setViajanteRef(FuncionarioRef value) {
        this.viajanteRef = value;
    }

}
