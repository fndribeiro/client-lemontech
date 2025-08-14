
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for perfilFuncionario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="perfilFuncionario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZERO"/>
 *     &lt;enumeration value="ADM"/>
 *     &lt;enumeration value="GESTOR"/>
 *     &lt;enumeration value="APROVADOR"/>
 *     &lt;enumeration value="SOLICITANTE"/>
 *     &lt;enumeration value="PASSAGEIRO"/>
 *     &lt;enumeration value="AGENCIA"/>
 *     &lt;enumeration value="ADMINISTRADOR"/>
 *     &lt;enumeration value="SOLICITANTE_MASTER"/>
 *     &lt;enumeration value="APROVADOR_MASTER"/>
 *     &lt;enumeration value="NEUTRO"/>
 *     &lt;enumeration value="PASSAGEIRO_TERCEIRO"/>
 *     &lt;enumeration value="ACORDO"/>
 *     &lt;enumeration value="HOTELARIA"/>
 *     &lt;enumeration value="AGENCIA_GESTOR"/>
 *     &lt;enumeration value="OPERADOR_AEROPORTO"/>
 *     &lt;enumeration value="CONEXAO_GESTOR"/>
 *     &lt;enumeration value="USUARIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "perfilFuncionario", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum PerfilFuncionario {

    ZERO,
    ADM,
    GESTOR,
    APROVADOR,
    SOLICITANTE,
    PASSAGEIRO,
    AGENCIA,
    ADMINISTRADOR,
    SOLICITANTE_MASTER,
    APROVADOR_MASTER,
    NEUTRO,
    PASSAGEIRO_TERCEIRO,
    ACORDO,
    HOTELARIA,
    AGENCIA_GESTOR,
    OPERADOR_AEROPORTO,
    CONEXAO_GESTOR,
    USUARIO;

    public String value() {
        return name();
    }

    public static PerfilFuncionario fromValue(String v) {
        return valueOf(v);
    }

}
