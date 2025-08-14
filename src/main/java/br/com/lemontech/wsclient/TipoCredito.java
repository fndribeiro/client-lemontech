
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCredito.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCredito">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPOSITO"/>
 *     &lt;enumeration value="CARTAO_CREDITO"/>
 *     &lt;enumeration value="ESPECIE"/>
 *     &lt;enumeration value="MISTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCredito", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum TipoCredito {

    DEPOSITO,
    CARTAO_CREDITO,
    ESPECIE,
    MISTO;

    public String value() {
        return name();
    }

    public static TipoCredito fromValue(String v) {
        return valueOf(v);
    }

}
