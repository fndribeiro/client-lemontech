
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumStatusBilhete.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumStatusBilhete">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAO_UTILIZADO"/>
 *     &lt;enumeration value="UTILIZADO"/>
 *     &lt;enumeration value="INDETERMINADO"/>
 *     &lt;enumeration value="NAO_LOCALIZADO"/>
 *     &lt;enumeration value="ACESSO_RESTRITO"/>
 *     &lt;enumeration value="REEMBOLSO"/>
 *     &lt;enumeration value="CREDITO_CIA_AEREA"/>
 *     &lt;enumeration value="EM_ABERTO"/>
 *     &lt;enumeration value="NAO_REEMBOLSAVEL"/>
 *     &lt;enumeration value="SEM_CREDITO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumStatusBilhete", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum EnumStatusBilhete {

    NAO_UTILIZADO,
    UTILIZADO,
    INDETERMINADO,
    NAO_LOCALIZADO,
    ACESSO_RESTRITO,
    REEMBOLSO,
    CREDITO_CIA_AEREA,
    EM_ABERTO,
    NAO_REEMBOLSAVEL,
    SEM_CREDITO;

    public String value() {
        return name();
    }

    public static EnumStatusBilhete fromValue(String v) {
        return valueOf(v);
    }

}
