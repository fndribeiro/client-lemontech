
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusTransacaoCartao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusTransacaoCartao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCILIADO_AUTOMATICAMENTE"/>
 *     &lt;enumeration value="CONCILIADO_MANUALMENTE"/>
 *     &lt;enumeration value="INCONSISTENTE"/>
 *     &lt;enumeration value="NAO_CONCILIADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusTransacaoCartao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum StatusTransacaoCartao {

    CONCILIADO_AUTOMATICAMENTE,
    CONCILIADO_MANUALMENTE,
    INCONSISTENTE,
    NAO_CONCILIADO;

    public String value() {
        return name();
    }

    public static StatusTransacaoCartao fromValue(String v) {
        return valueOf(v);
    }

}
