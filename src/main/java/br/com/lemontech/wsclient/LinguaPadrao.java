
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linguaPadrao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="linguaPadrao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PORTUGUES"/>
 *     &lt;enumeration value="INGLES"/>
 *     &lt;enumeration value="ESPANHOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "linguaPadrao", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum LinguaPadrao {

    PORTUGUES,
    INGLES,
    ESPANHOL;

    public String value() {
        return name();
    }

    public static LinguaPadrao fromValue(String v) {
        return valueOf(v);
    }

}
