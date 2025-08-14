
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTransacaoCartao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoTransacaoCartao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="RC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoTransacaoCartao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum TipoTransacaoCartao {

    D,
    CC,
    C,
    RC;

    public String value() {
        return name();
    }

    public static TipoTransacaoCartao fromValue(String v) {
        return valueOf(v);
    }

}
