
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusEstorno.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusEstorno">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="ESTORNADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusEstorno", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense")
@XmlEnum
public enum StatusEstorno {

    PENDENTE,
    ESTORNADO;

    public String value() {
        return name();
    }

    public static StatusEstorno fromValue(String v) {
        return valueOf(v);
    }

}
