
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for produtoAprovacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="produtoAprovacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TODOS"/>
 *     &lt;enumeration value="AEREO"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="CARRO"/>
 *     &lt;enumeration value="OUTRO"/>
 *     &lt;enumeration value="TRASLADO"/>
 *     &lt;enumeration value="SEGURO"/>
 *     &lt;enumeration value="RODOVIARIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "produtoAprovacao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum ProdutoAprovacao {

    TODOS,
    AEREO,
    HOTEL,
    CARRO,
    OUTRO,
    TRASLADO,
    SEGURO,
    RODOVIARIO;

    public String value() {
        return name();
    }

    public static ProdutoAprovacao fromValue(String v) {
        return valueOf(v);
    }

}
