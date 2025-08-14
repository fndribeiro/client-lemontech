
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classeRodoviario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="classeRodoviario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIMEIRA_CLASSE"/>
 *     &lt;enumeration value="CONVENCIONAL"/>
 *     &lt;enumeration value="EXECUTIVO"/>
 *     &lt;enumeration value="LEITO"/>
 *     &lt;enumeration value="LEITO_CAMA"/>
 *     &lt;enumeration value="SEMI_LEITO"/>
 *     &lt;enumeration value="SEMILEITO"/>
 *     &lt;enumeration value="ESTRUTURAL"/>
 *     &lt;enumeration value="LEITO_INDIVIDUAL"/>
 *     &lt;enumeration value="LEITO_TOTAL_CONJUGADO"/>
 *     &lt;enumeration value="PREMIUM"/>
 *     &lt;enumeration value="SEMI_LEITO_CONFORTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "classeRodoviario", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum ClasseRodoviario {

    PRIMEIRA_CLASSE,
    CONVENCIONAL,
    EXECUTIVO,
    LEITO,
    LEITO_CAMA,
    SEMI_LEITO,
    SEMILEITO,
    ESTRUTURAL,
    LEITO_INDIVIDUAL,
    LEITO_TOTAL_CONJUGADO,
    PREMIUM,
    SEMI_LEITO_CONFORTO;

    public String value() {
        return name();
    }

    public static ClasseRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
