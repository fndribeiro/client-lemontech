
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for passageiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passageiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPassageiro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sobrenome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}matricula" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPassageiro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoPassageiro" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoDocumento" minOccurs="0"/>
 *         &lt;element name="valorDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}email" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}sexo" minOccurs="0"/>
 *         &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dddTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dddCel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terceiro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="acompanhante" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logAs" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}logAs" minOccurs="0"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centrocusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef" minOccurs="0"/>
 *         &lt;element name="nivelHierarquico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="politicaDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="possuiCartao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="comprarBagagens" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="comprarAssentos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passageiro", propOrder = {
    "idPassageiro",
    "nome",
    "sobrenome",
    "matricula",
    "departamento",
    "tipoPassageiro",
    "tipoDocumento",
    "valorDocumento",
    "email",
    "dataNascimento",
    "sexo",
    "empresa",
    "telefone",
    "celular",
    "dddTel",
    "dddCel",
    "terceiro",
    "acompanhante",
    "cpf",
    "nomeCompleto",
    "logAs",
    "vip",
    "cargo",
    "rg",
    "centrocusto",
    "nivelHierarquico",
    "username",
    "atividade",
    "politicaDespesa",
    "possuiCartao",
    "comprarBagagens",
    "comprarAssentos",
    "nacionalidade"
})
public class Passageiro {

    protected int idPassageiro;
    protected String nome;
    protected String sobrenome;
    protected String matricula;
    protected String departamento;
    @XmlSchemaType(name = "string")
    protected TipoPassageiro tipoPassageiro;
    @XmlSchemaType(name = "string")
    protected TipoDocumento tipoDocumento;
    protected String valorDocumento;
    protected String email;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlSchemaType(name = "string")
    protected Sexo sexo;
    protected String empresa;
    protected String telefone;
    protected String celular;
    protected String dddTel;
    protected String dddCel;
    protected Boolean terceiro;
    protected Boolean acompanhante;
    protected String cpf;
    protected String nomeCompleto;
    protected LogAs logAs;
    protected Boolean vip;
    protected String cargo;
    protected String rg;
    protected CentroDeCustoRef centrocusto;
    protected Integer nivelHierarquico;
    protected String username;
    protected String atividade;
    protected String politicaDespesa;
    protected Boolean possuiCartao;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarBagagens;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarAssentos;
    protected String nacionalidade;

    /**
     * Gets the value of the idPassageiro property.
     * 
     */
    public int getIdPassageiro() {
        return idPassageiro;
    }

    /**
     * Sets the value of the idPassageiro property.
     * 
     */
    public void setIdPassageiro(int value) {
        this.idPassageiro = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the sobrenome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Sets the value of the sobrenome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobrenome(String value) {
        this.sobrenome = value;
    }

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the tipoPassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPassageiro }
     *     
     */
    public TipoPassageiro getTipoPassageiro() {
        return tipoPassageiro;
    }

    /**
     * Sets the value of the tipoPassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPassageiro }
     *     
     */
    public void setTipoPassageiro(TipoPassageiro value) {
        this.tipoPassageiro = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the valorDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDocumento() {
        return valorDocumento;
    }

    /**
     * Sets the value of the valorDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDocumento(String value) {
        this.valorDocumento = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the dataNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Sets the value of the dataNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link Sexo }
     *     
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sexo }
     *     
     */
    public void setSexo(Sexo value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the telefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Sets the value of the telefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Gets the value of the celular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Sets the value of the celular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Gets the value of the dddTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddTel() {
        return dddTel;
    }

    /**
     * Sets the value of the dddTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddTel(String value) {
        this.dddTel = value;
    }

    /**
     * Gets the value of the dddCel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddCel() {
        return dddCel;
    }

    /**
     * Sets the value of the dddCel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddCel(String value) {
        this.dddCel = value;
    }

    /**
     * Gets the value of the terceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerceiro() {
        return terceiro;
    }

    /**
     * Sets the value of the terceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerceiro(Boolean value) {
        this.terceiro = value;
    }

    /**
     * Gets the value of the acompanhante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcompanhante() {
        return acompanhante;
    }

    /**
     * Sets the value of the acompanhante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcompanhante(Boolean value) {
        this.acompanhante = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the nomeCompleto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Sets the value of the nomeCompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCompleto(String value) {
        this.nomeCompleto = value;
    }

    /**
     * Gets the value of the logAs property.
     * 
     * @return
     *     possible object is
     *     {@link LogAs }
     *     
     */
    public LogAs getLogAs() {
        return logAs;
    }

    /**
     * Sets the value of the logAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogAs }
     *     
     */
    public void setLogAs(LogAs value) {
        this.logAs = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVip(Boolean value) {
        this.vip = value;
    }

    /**
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the rg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRg() {
        return rg;
    }

    /**
     * Sets the value of the rg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRg(String value) {
        this.rg = value;
    }

    /**
     * Gets the value of the centrocusto property.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentrocusto() {
        return centrocusto;
    }

    /**
     * Sets the value of the centrocusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentrocusto(CentroDeCustoRef value) {
        this.centrocusto = value;
    }

    /**
     * Gets the value of the nivelHierarquico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelHierarquico() {
        return nivelHierarquico;
    }

    /**
     * Sets the value of the nivelHierarquico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelHierarquico(Integer value) {
        this.nivelHierarquico = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the atividade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtividade() {
        return atividade;
    }

    /**
     * Sets the value of the atividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtividade(String value) {
        this.atividade = value;
    }

    /**
     * Gets the value of the politicaDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticaDespesa() {
        return politicaDespesa;
    }

    /**
     * Sets the value of the politicaDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticaDespesa(String value) {
        this.politicaDespesa = value;
    }

    /**
     * Gets the value of the possuiCartao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPossuiCartao() {
        return possuiCartao;
    }

    /**
     * Sets the value of the possuiCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossuiCartao(Boolean value) {
        this.possuiCartao = value;
    }

    /**
     * Gets the value of the comprarBagagens property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComprarBagagens() {
        return comprarBagagens;
    }

    /**
     * Sets the value of the comprarBagagens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComprarBagagens(Boolean value) {
        this.comprarBagagens = value;
    }

    /**
     * Gets the value of the comprarAssentos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComprarAssentos() {
        return comprarAssentos;
    }

    /**
     * Sets the value of the comprarAssentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComprarAssentos(Boolean value) {
        this.comprarAssentos = value;
    }

    /**
     * Gets the value of the nacionalidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Sets the value of the nacionalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidade(String value) {
        this.nacionalidade = value;
    }

}
