
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qualificadorDespesa.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="qualificadorDespesa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CARTAO_CREDITO"/>
 *     &lt;enumeration value="UBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "qualificadorDespesa", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum QualificadorDespesa {

    CARTAO_CREDITO,
    UBER;

    public String value() {
        return name();
    }

    public static QualificadorDespesa fromValue(String v) {
        return valueOf(v);
    }

}
