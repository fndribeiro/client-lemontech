
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumTipoCartao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumTipoCartao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CTH"/>
 *     &lt;enumeration value="CTA"/>
 *     &lt;enumeration value="CORPORATIVO"/>
 *     &lt;enumeration value="CARTAO_COMPRAS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumTipoCartao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense")
@XmlEnum
public enum EnumTipoCartao {

    CTH,
    CTA,
    CORPORATIVO,
    CARTAO_COMPRAS;

    public String value() {
        return name();
    }

    public static EnumTipoCartao fromValue(String v) {
        return valueOf(v);
    }

}
