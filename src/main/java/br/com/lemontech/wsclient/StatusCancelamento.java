
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusCancelamento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCancelamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REEMBOLSO"/>
 *     &lt;enumeration value="CREDITO_CIA"/>
 *     &lt;enumeration value="EM_ABERTO"/>
 *     &lt;enumeration value="NO_SHOW"/>
 *     &lt;enumeration value="TAXA_CANCELAMENTO"/>
 *     &lt;enumeration value="NAO_REEMBOLSAVEL"/>
 *     &lt;enumeration value="SEM_CREDITO"/>
 *     &lt;enumeration value="CANCELAMENTO_SEM_MULTA"/>
 *     &lt;enumeration value="BILHETE_VOID"/>
 *     &lt;enumeration value="FORA_PRAZO_CANCELAMENTO"/>
 *     &lt;enumeration value="EMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCancelamento", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum StatusCancelamento {

    REEMBOLSO,
    CREDITO_CIA,
    EM_ABERTO,
    NO_SHOW,
    TAXA_CANCELAMENTO,
    NAO_REEMBOLSAVEL,
    SEM_CREDITO,
    CANCELAMENTO_SEM_MULTA,
    BILHETE_VOID,
    FORA_PRAZO_CANCELAMENTO,
    EMD;

    public String value() {
        return name();
    }

    public static StatusCancelamento fromValue(String v) {
        return valueOf(v);
    }

}
