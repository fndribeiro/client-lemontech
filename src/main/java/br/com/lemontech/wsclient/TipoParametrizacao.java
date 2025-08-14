
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoParametrizacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoParametrizacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOLICITACAO"/>
 *     &lt;enumeration value="APROVACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoParametrizacao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum TipoParametrizacao {

    SOLICITACAO,
    APROVACAO;

    public String value() {
        return name();
    }

    public static TipoParametrizacao fromValue(String v) {
        return valueOf(v);
    }

}
