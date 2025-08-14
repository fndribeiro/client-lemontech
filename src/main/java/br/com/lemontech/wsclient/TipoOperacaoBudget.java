
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoOperacaoBudget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoOperacaoBudget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREDITO"/>
 *     &lt;enumeration value="DEBITO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoOperacaoBudget", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum TipoOperacaoBudget {

    CREDITO,
    DEBITO;

    public String value() {
        return name();
    }

    public static TipoOperacaoBudget fromValue(String v) {
        return valueOf(v);
    }

}
