
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumFornecedorVCN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumFornecedorVCN">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEX"/>
 *     &lt;enumeration value="CONFERMA"/>
 *     &lt;enumeration value="B2BPAY"/>
 *     &lt;enumeration value="BRADESCOVCN"/>
 *     &lt;enumeration value="BEE2PAY"/>
 *     &lt;enumeration value="JAZZVCN"/>
 *     &lt;enumeration value="BEE2PAY_V2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumFornecedorVCN", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum EnumFornecedorVCN {

    WEX("WEX"),
    CONFERMA("CONFERMA"),
    @XmlEnumValue("B2BPAY")
    B_2_BPAY("B2BPAY"),
    BRADESCOVCN("BRADESCOVCN"),
    @XmlEnumValue("BEE2PAY")
    BEE_2_PAY("BEE2PAY"),
    JAZZVCN("JAZZVCN"),
    @XmlEnumValue("BEE2PAY_V2")
    BEE_2_PAY_V_2("BEE2PAY_V2");
    private final String value;

    EnumFornecedorVCN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumFornecedorVCN fromValue(String v) {
        for (EnumFornecedorVCN c: EnumFornecedorVCN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
