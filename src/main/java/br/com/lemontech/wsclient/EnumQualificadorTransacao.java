
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumQualificadorTransacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumQualificadorTransacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEBITO"/>
 *     &lt;enumeration value="CREDITO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumQualificadorTransacao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense")
@XmlEnum
public enum EnumQualificadorTransacao {

    DEBITO,
    CREDITO;

    public String value() {
        return name();
    }

    public static EnumQualificadorTransacao fromValue(String v) {
        return valueOf(v);
    }

}
