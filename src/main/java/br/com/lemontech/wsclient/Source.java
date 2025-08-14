
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for source.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="source">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AZUL"/>
 *     &lt;enumeration value="PASSAREDO"/>
 *     &lt;enumeration value="SETE"/>
 *     &lt;enumeration value="PUMAAIR"/>
 *     &lt;enumeration value="NHT"/>
 *     &lt;enumeration value="PIQUIATUBA"/>
 *     &lt;enumeration value="AVIANCA"/>
 *     &lt;enumeration value="AVIANCA_V2"/>
 *     &lt;enumeration value="TRAVELPORT"/>
 *     &lt;enumeration value="SABRE"/>
 *     &lt;enumeration value="FLYWAYS"/>
 *     &lt;enumeration value="LATAM"/>
 *     &lt;enumeration value="GOL_GWS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "source", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum Source {

    AZUL("AZUL"),
    PASSAREDO("PASSAREDO"),
    SETE("SETE"),
    PUMAAIR("PUMAAIR"),
    NHT("NHT"),
    PIQUIATUBA("PIQUIATUBA"),
    AVIANCA("AVIANCA"),
    @XmlEnumValue("AVIANCA_V2")
    AVIANCA_V_2("AVIANCA_V2"),
    TRAVELPORT("TRAVELPORT"),
    SABRE("SABRE"),
    FLYWAYS("FLYWAYS"),
    LATAM("LATAM"),
    GOL_GWS("GOL_GWS");
    private final String value;

    Source(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Source fromValue(String v) {
        for (Source c: Source.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
