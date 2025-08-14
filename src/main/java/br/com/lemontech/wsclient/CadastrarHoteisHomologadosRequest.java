
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cadastrarHoteisHomologadosRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarHoteisHomologadosRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadastrarHoteisHomologados" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}cadastrarHoteisHomologados"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarHoteisHomologadosRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "cadastrarHoteisHomologados"
})
public class CadastrarHoteisHomologadosRequest {

    @XmlElement(required = true)
    protected CadastrarHoteisHomologados cadastrarHoteisHomologados;

    /**
     * Gets the value of the cadastrarHoteisHomologados property.
     * 
     * @return
     *     possible object is
     *     {@link CadastrarHoteisHomologados }
     *     
     */
    public CadastrarHoteisHomologados getCadastrarHoteisHomologados() {
        return cadastrarHoteisHomologados;
    }

    /**
     * Sets the value of the cadastrarHoteisHomologados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CadastrarHoteisHomologados }
     *     
     */
    public void setCadastrarHoteisHomologados(CadastrarHoteisHomologados value) {
        this.cadastrarHoteisHomologados = value;
    }

}
