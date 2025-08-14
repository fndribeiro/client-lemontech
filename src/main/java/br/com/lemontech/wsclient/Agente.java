
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agente.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agente">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEMONTECH"/>
 *     &lt;enumeration value="AGENCIA"/>
 *     &lt;enumeration value="CLIENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agente", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum Agente {

    LEMONTECH,
    AGENCIA,
    CLIENTE;

    public String value() {
        return name();
    }

    public static Agente fromValue(String v) {
        return valueOf(v);
    }

}
