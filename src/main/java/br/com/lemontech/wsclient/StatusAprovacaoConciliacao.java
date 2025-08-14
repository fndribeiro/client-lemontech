
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusAprovacaoConciliacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusAprovacaoConciliacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDENTE_CONCILIACAO_MANUAL"/>
 *     &lt;enumeration value="PENDENTE_APROVACAO"/>
 *     &lt;enumeration value="APROVADA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusAprovacaoConciliacao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum StatusAprovacaoConciliacao {

    PENDENTE_CONCILIACAO_MANUAL,
    PENDENTE_APROVACAO,
    APROVADA;

    public String value() {
        return name();
    }

    public static StatusAprovacaoConciliacao fromValue(String v) {
        return valueOf(v);
    }

}
