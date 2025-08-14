
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moeda.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="moeda">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="NUC"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="AFA"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="AZM"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="MZN"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="ECS"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CUC"/>
 *     &lt;enumeration value="MRU"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="RMB"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="RON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "moeda", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum Moeda {

    ARS,
    BRL,
    USD,
    NUC,
    EUR,
    GBP,
    JPY,
    CNY,
    KHR,
    PLN,
    CAD,
    MXN,
    COP,
    AFA,
    PEN,
    SGD,
    PYG,
    CLP,
    CHF,
    AED,
    SEK,
    UAH,
    BOB,
    NGN,
    ZAR,
    DKK,
    AZM,
    RUB,
    HKD,
    KRW,
    CZK,
    INR,
    AUD,
    THB,
    BND,
    TRY,
    NOK,
    MZN,
    BMD,
    MYR,
    NZD,
    QAR,
    OMR,
    EGP,
    IDR,
    SAR,
    XAF,
    MAD,
    NAD,
    TND,
    TWD,
    HUF,
    BDT,
    AWG,
    GYD,
    PHP,
    XOF,
    UYU,
    GTQ,
    HNL,
    NIO,
    CRC,
    PAB,
    VEF,
    ECS,
    CUP,
    CUC,
    MRU,
    MUR,
    RMB,
    ISK,
    JOD,
    RON;

    public String value() {
        return name();
    }

    public static Moeda fromValue(String v) {
        return valueOf(v);
    }

}
