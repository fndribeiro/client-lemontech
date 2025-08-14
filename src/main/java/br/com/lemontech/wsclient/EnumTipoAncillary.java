
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumTipoAncillary.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumTipoAncillary">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAGAGEM"/>
 *     &lt;enumeration value="ASSENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumTipoAncillary", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum EnumTipoAncillary {

    BAGAGEM,
    ASSENTO;

    public String value() {
        return name();
    }

    public static EnumTipoAncillary fromValue(String v) {
        return valueOf(v);
    }

}
