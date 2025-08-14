
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for garantiaNoShow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="garantiaNoShow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GARANTIA_AGENCIA"/>
 *     &lt;enumeration value="GARANTIA_CARTAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "garantiaNoShow", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum GarantiaNoShow {

    GARANTIA_AGENCIA,
    GARANTIA_CARTAO;

    public String value() {
        return name();
    }

    public static GarantiaNoShow fromValue(String v) {
        return valueOf(v);
    }

}
