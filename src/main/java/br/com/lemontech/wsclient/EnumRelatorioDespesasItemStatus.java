
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumRelatorioDespesasItemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumRelatorioDespesasItemStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APROVADO"/>
 *     &lt;enumeration value="REPROVADO"/>
 *     &lt;enumeration value="CORRIGIDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumRelatorioDespesasItemStatus", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense")
@XmlEnum
public enum EnumRelatorioDespesasItemStatus {

    APROVADO,
    REPROVADO,
    CORRIGIDO;

    public String value() {
        return name();
    }

    public static EnumRelatorioDespesasItemStatus fromValue(String v) {
        return valueOf(v);
    }

}
