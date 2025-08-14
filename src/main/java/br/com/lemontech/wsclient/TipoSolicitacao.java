
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoSolicitacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoSolicitacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TODOS"/>
 *     &lt;enumeration value="CORPORATIVO"/>
 *     &lt;enumeration value="EXPENSE"/>
 *     &lt;enumeration value="INCENTIVO"/>
 *     &lt;enumeration value="TREINAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoSolicitacao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum TipoSolicitacao {

    TODOS,
    CORPORATIVO,
    EXPENSE,
    INCENTIVO,
    TREINAMENTO;

    public String value() {
        return name();
    }

    public static TipoSolicitacao fromValue(String v) {
        return valueOf(v);
    }

}
