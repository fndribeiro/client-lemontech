
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoAtendimentoAeroporto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoAtendimentoAeroporto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMBARQUE"/>
 *     &lt;enumeration value="DESEMBARQUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoAtendimentoAeroporto", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo")
@XmlEnum
public enum TipoAtendimentoAeroporto {

    EMBARQUE,
    DESEMBARQUE;

    public String value() {
        return name();
    }

    public static TipoAtendimentoAeroporto fromValue(String v) {
        return valueOf(v);
    }

}
