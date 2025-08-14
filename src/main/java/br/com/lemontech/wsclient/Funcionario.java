
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for funcionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
 *         &lt;element name="departamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/>
 *         &lt;element name="cpf" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="passaporte" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}sexo"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/>
 *           &lt;element name="subCentroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef"/>
 *         &lt;/choice>
 *         &lt;element name="contato" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contato"/>
 *         &lt;element name="login" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}login" minOccurs="0"/>
 *         &lt;element name="bypassAprovacaoNacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bypassAprovacaoInternacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="configuracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}configuracaoFuncionario"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nomeaAgenciaPreferencial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/>
 *         &lt;element name="atividade" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataAdmissao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nomeSocial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/>
 *         &lt;element name="saldoFundoFixo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="possuiCartao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionario", propOrder = {
    "nome",
    "departamento",
    "cargo",
    "cpf",
    "passaporte",
    "dataNascimento",
    "sexo",
    "centroDeCustoRef",
    "subCentroDeCustoRef",
    "contato",
    "login",
    "bypassAprovacaoNacional",
    "bypassAprovacaoInternacional",
    "configuracao",
    "ativo",
    "nomeaAgenciaPreferencial",
    "atividade",
    "idUsuario",
    "dataAdmissao",
    "nomeSocial",
    "saldoFundoFixo",
    "nacionalidade",
    "possuiCartao"
})
public class Funcionario
    extends FuncionarioRef
{

    @XmlElement(required = true)
    protected String nome;
    protected String departamento;
    protected String cargo;
    protected String cpf;
    protected String passaporte;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Sexo sexo;
    protected CentroDeCustoRef centroDeCustoRef;
    protected SubCentroDeCustoRef subCentroDeCustoRef;
    @XmlElement(required = true)
    protected Contato contato;
    protected Login login;
    protected Boolean bypassAprovacaoNacional;
    protected Boolean bypassAprovacaoInternacional;
    @XmlElement(required = true)
    protected ConfiguracaoFuncionario configuracao;
    protected boolean ativo;
    protected String nomeaAgenciaPreferencial;
    protected String atividade;
    protected Integer idUsuario;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAdmissao;
    protected String nomeSocial;
    protected Double saldoFundoFixo;
    protected String nacionalidade;
    @XmlElement(defaultValue = "false")
    protected Boolean possuiCartao;

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
     * Gets the value of the passaporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassaporte() {
        return passaporte;
    }

    /**
     * Sets the value of the passaporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassaporte(String value) {
        this.passaporte = value;
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
     * Gets the value of the centroDeCustoRef property.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Sets the value of the centroDeCustoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Gets the value of the subCentroDeCustoRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }

    /**
     * Sets the value of the subCentroDeCustoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCustoRef(SubCentroDeCustoRef value) {
        this.subCentroDeCustoRef = value;
    }

    /**
     * Gets the value of the contato property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContato() {
        return contato;
    }

    /**
     * Sets the value of the contato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContato(Contato value) {
        this.contato = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link Login }
     *     
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link Login }
     *     
     */
    public void setLogin(Login value) {
        this.login = value;
    }

    /**
     * Gets the value of the bypassAprovacaoNacional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassAprovacaoNacional() {
        return bypassAprovacaoNacional;
    }

    /**
     * Sets the value of the bypassAprovacaoNacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassAprovacaoNacional(Boolean value) {
        this.bypassAprovacaoNacional = value;
    }

    /**
     * Gets the value of the bypassAprovacaoInternacional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassAprovacaoInternacional() {
        return bypassAprovacaoInternacional;
    }

    /**
     * Sets the value of the bypassAprovacaoInternacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassAprovacaoInternacional(Boolean value) {
        this.bypassAprovacaoInternacional = value;
    }

    /**
     * Gets the value of the configuracao property.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguracaoFuncionario }
     *     
     */
    public ConfiguracaoFuncionario getConfiguracao() {
        return configuracao;
    }

    /**
     * Sets the value of the configuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguracaoFuncionario }
     *     
     */
    public void setConfiguracao(ConfiguracaoFuncionario value) {
        this.configuracao = value;
    }

    /**
     * Gets the value of the ativo property.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Sets the value of the ativo property.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Gets the value of the nomeaAgenciaPreferencial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeaAgenciaPreferencial() {
        return nomeaAgenciaPreferencial;
    }

    /**
     * Sets the value of the nomeaAgenciaPreferencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeaAgenciaPreferencial(String value) {
        this.nomeaAgenciaPreferencial = value;
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
     * Gets the value of the idUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUsuario(Integer value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the dataAdmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * Sets the value of the dataAdmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAdmissao(XMLGregorianCalendar value) {
        this.dataAdmissao = value;
    }

    /**
     * Gets the value of the nomeSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocial() {
        return nomeSocial;
    }

    /**
     * Sets the value of the nomeSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocial(String value) {
        this.nomeSocial = value;
    }

    /**
     * Gets the value of the saldoFundoFixo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoFundoFixo() {
        return saldoFundoFixo;
    }

    /**
     * Sets the value of the saldoFundoFixo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoFundoFixo(Double value) {
        this.saldoFundoFixo = value;
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

}
