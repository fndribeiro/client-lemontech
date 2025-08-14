
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preferenciaAssentoRodoviario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="preferenciaAssentoRodoviario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FRENTE"/>
 *     &lt;enumeration value="MEIO"/>
 *     &lt;enumeration value="FUNDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "preferenciaAssentoRodoviario", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum PreferenciaAssentoRodoviario {

    FRENTE,
    MEIO,
    FUNDO;

    public String value() {
        return name();
    }

    public static PreferenciaAssentoRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
