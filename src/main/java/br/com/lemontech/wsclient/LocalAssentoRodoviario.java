
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localAssentoRodoviario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="localAssentoRodoviario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JANELA"/>
 *     &lt;enumeration value="CORREDOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "localAssentoRodoviario", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum LocalAssentoRodoviario {

    JANELA,
    CORREDOR;

    public String value() {
        return name();
    }

    public static LocalAssentoRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
