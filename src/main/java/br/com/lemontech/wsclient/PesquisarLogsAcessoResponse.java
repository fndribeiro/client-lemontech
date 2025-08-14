
package br.com.lemontech.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pesquisarLogsAcessoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarLogsAcessoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoAcao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoAcao" minOccurs="0"/>
 *         &lt;element name="numeroLogsRastreados" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logDeAcesso" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}logDeAcesso" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mensagemRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarLogsAcessoResponse", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/response", propOrder = {
    "resultadoAcao",
    "numeroLogsRastreados",
    "logDeAcesso",
    "mensagemRetorno"
})
public class PesquisarLogsAcessoResponse {

    @XmlSchemaType(name = "string")
    protected ResultadoAcao resultadoAcao;
    protected Integer numeroLogsRastreados;
    protected List<LogDeAcesso> logDeAcesso;
    protected String mensagemRetorno;

    /**
     * Gets the value of the resultadoAcao property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoAcao }
     *     
     */
    public ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }

    /**
     * Sets the value of the resultadoAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoAcao }
     *     
     */
    public void setResultadoAcao(ResultadoAcao value) {
        this.resultadoAcao = value;
    }

    /**
     * Gets the value of the numeroLogsRastreados property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroLogsRastreados() {
        return numeroLogsRastreados;
    }

    /**
     * Sets the value of the numeroLogsRastreados property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroLogsRastreados(Integer value) {
        this.numeroLogsRastreados = value;
    }

    /**
     * Gets the value of the logDeAcesso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logDeAcesso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogDeAcesso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogDeAcesso }
     * 
     * 
     */
    public List<LogDeAcesso> getLogDeAcesso() {
        if (logDeAcesso == null) {
            logDeAcesso = new ArrayList<LogDeAcesso>();
        }
        return this.logDeAcesso;
    }

    /**
     * Gets the value of the mensagemRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Sets the value of the mensagemRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemRetorno(String value) {
        this.mensagemRetorno = value;
    }

}
