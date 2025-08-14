
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formaPagamentoPrestacaoContaItem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="formaPagamentoPrestacaoContaItem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DINHEIRO"/>
 *     &lt;enumeration value="CARTAO_CREDITO"/>
 *     &lt;enumeration value="CARTAO_DEBITO"/>
 *     &lt;enumeration value="CARTAO_CORPORATIVO"/>
 *     &lt;enumeration value="FATURADO"/>
 *     &lt;enumeration value="CARTAO_RENDIMENTO"/>
 *     &lt;enumeration value="RECURSO_PROPRIO"/>
 *     &lt;enumeration value="DEBITO_EM_CONTA"/>
 *     &lt;enumeration value="CREDITO_EM_CONTA"/>
 *     &lt;enumeration value="CARTAO_PRE_PAGO"/>
 *     &lt;enumeration value="PIX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "formaPagamentoPrestacaoContaItem", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense")
@XmlEnum
public enum FormaPagamentoPrestacaoContaItem {

    DINHEIRO,
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    CARTAO_CORPORATIVO,
    FATURADO,
    CARTAO_RENDIMENTO,
    RECURSO_PROPRIO,
    DEBITO_EM_CONTA,
    CREDITO_EM_CONTA,
    CARTAO_PRE_PAGO,
    PIX;

    public String value() {
        return name();
    }

    public static FormaPagamentoPrestacaoContaItem fromValue(String v) {
        return valueOf(v);
    }

}
