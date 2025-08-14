
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumTipoFormaPagamento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumTipoFormaPagamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BILHETE"/>
 *     &lt;enumeration value="EMD_MULTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumTipoFormaPagamento", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum EnumTipoFormaPagamento {

    BILHETE,
    EMD_MULTA;

    public String value() {
        return name();
    }

    public static EnumTipoFormaPagamento fromValue(String v) {
        return valueOf(v);
    }

}
