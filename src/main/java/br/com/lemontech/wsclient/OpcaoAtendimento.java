
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opcaoAtendimento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="opcaoAtendimento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PADRAO"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="EXTRA_ATENDIMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "opcaoAtendimento", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo")
@XmlEnum
public enum OpcaoAtendimento {

    PADRAO,
    VIP,
    EXTRA_ATENDIMENTO;

    public String value() {
        return name();
    }

    public static OpcaoAtendimento fromValue(String v) {
        return valueOf(v);
    }

}
