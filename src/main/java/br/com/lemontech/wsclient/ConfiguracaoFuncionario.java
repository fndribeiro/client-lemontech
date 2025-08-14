
package br.com.lemontech.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configuracaoFuncionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuracaoFuncionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoAprova" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="solicitaParaTodos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preAprovaTodos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forcaDeVenda" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nivelHierarquico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoCadastro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCadastroFuncionario" minOccurs="0"/>
 *         &lt;element name="categoriaHospedagem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="perfilFuncionario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilFuncionario"/>
 *         &lt;element name="perfilAereo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilAereo" minOccurs="0"/>
 *         &lt;element name="perfilHospedagem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilHospedagem" minOccurs="0"/>
 *         &lt;element name="visualizaSaldoBudgetAprovacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="aprovaBudgetNegativo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="usuarioTerceiro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="antecedenciaViagemNacional" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="antecedenciaViagemInternacional" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="politicaDespesa" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bloqueiaSolicitarViagem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="podeSerAprovadoSemSaldoBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bloqueiaSolicitarViagemAdiantamento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permiteSolicitarCarro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="politicaPercurso" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maximoSvAdiantamentoAberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recebeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permiteNotificacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="utilizaUsuarioLogado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permiteCadastrarClienteProjetoReembolsavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excecaoRegraRestricaoHotelRegional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bloqueiaUsuarioParaViajar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permiteSelecionarAgencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bloqueiaSolicitarViagemPrestacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bloqueiaAutoAprovacaoDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="linguaPadrao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}linguaPadrao" minOccurs="0"/>
 *         &lt;element name="emailEnvioCopiaDeVoucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bypassAprovacaoNacionalSomenteDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="comprarBagagens" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="comprarAssentos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="categoriaLocacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuracaoFuncionario", propOrder = {
    "autoAprova",
    "solicitaParaTodos",
    "preAprovaTodos",
    "forcaDeVenda",
    "nivelHierarquico",
    "tipoCadastro",
    "categoriaHospedagem",
    "perfilFuncionario",
    "perfilAereo",
    "perfilHospedagem",
    "visualizaSaldoBudgetAprovacao",
    "aprovaBudgetNegativo",
    "usuarioTerceiro",
    "antecedenciaViagemNacional",
    "antecedenciaViagemInternacional",
    "politicaDespesa",
    "bloqueiaSolicitarViagem",
    "podeSerAprovadoSemSaldoBudget",
    "bloqueiaSolicitarViagemAdiantamento",
    "permiteSolicitarCarro",
    "politicaPercurso",
    "maximoSvAdiantamentoAberto",
    "recebeEmail",
    "permiteNotificacaoFinanceiro",
    "utilizaUsuarioLogado",
    "permiteCadastrarClienteProjetoReembolsavel",
    "excecaoRegraRestricaoHotelRegional",
    "bloqueiaUsuarioParaViajar",
    "permiteSelecionarAgencia",
    "bloqueiaSolicitarViagemPrestacao",
    "bloqueiaAutoAprovacaoDentroDaPolitica",
    "linguaPadrao",
    "emailEnvioCopiaDeVoucher",
    "bypassAprovacaoNacionalSomenteDentroDaPolitica",
    "comprarBagagens",
    "comprarAssentos",
    "categoriaLocacao"
})
public class ConfiguracaoFuncionario {

    protected Boolean autoAprova;
    protected Boolean solicitaParaTodos;
    protected Boolean preAprovaTodos;
    @XmlElement(defaultValue = "false")
    protected Boolean forcaDeVenda;
    @XmlElement(defaultValue = "0")
    protected Integer nivelHierarquico;
    @XmlElement(defaultValue = "SELF_BOOKING")
    @XmlSchemaType(name = "string")
    protected TipoCadastroFuncionario tipoCadastro;
    protected String categoriaHospedagem;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerfilFuncionario perfilFuncionario;
    @XmlSchemaType(name = "string")
    protected PerfilAereo perfilAereo;
    @XmlSchemaType(name = "string")
    protected PerfilHospedagem perfilHospedagem;
    @XmlElement(defaultValue = "false")
    protected Boolean visualizaSaldoBudgetAprovacao;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaBudgetNegativo;
    @XmlElement(defaultValue = "false")
    protected Boolean usuarioTerceiro;
    protected Integer antecedenciaViagemNacional;
    protected Integer antecedenciaViagemInternacional;
    protected String politicaDespesa;
    protected Boolean bloqueiaSolicitarViagem;
    @XmlElement(defaultValue = "false")
    protected Boolean podeSerAprovadoSemSaldoBudget;
    protected Boolean bloqueiaSolicitarViagemAdiantamento;
    protected Boolean permiteSolicitarCarro;
    protected String politicaPercurso;
    @XmlElement(defaultValue = "0")
    protected Integer maximoSvAdiantamentoAberto;
    protected Boolean recebeEmail;
    protected Boolean permiteNotificacaoFinanceiro;
    protected Boolean utilizaUsuarioLogado;
    protected Boolean permiteCadastrarClienteProjetoReembolsavel;
    protected Boolean excecaoRegraRestricaoHotelRegional;
    protected Boolean bloqueiaUsuarioParaViajar;
    protected Boolean permiteSelecionarAgencia;
    protected Boolean bloqueiaSolicitarViagemPrestacao;
    protected Boolean bloqueiaAutoAprovacaoDentroDaPolitica;
    @XmlSchemaType(name = "string")
    protected LinguaPadrao linguaPadrao;
    protected String emailEnvioCopiaDeVoucher;
    protected Boolean bypassAprovacaoNacionalSomenteDentroDaPolitica;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarBagagens;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarAssentos;
    protected String categoriaLocacao;

    /**
     * Gets the value of the autoAprova property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAprova() {
        return autoAprova;
    }

    /**
     * Sets the value of the autoAprova property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAprova(Boolean value) {
        this.autoAprova = value;
    }

    /**
     * Gets the value of the solicitaParaTodos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaParaTodos() {
        return solicitaParaTodos;
    }

    /**
     * Sets the value of the solicitaParaTodos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaParaTodos(Boolean value) {
        this.solicitaParaTodos = value;
    }

    /**
     * Gets the value of the preAprovaTodos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAprovaTodos() {
        return preAprovaTodos;
    }

    /**
     * Sets the value of the preAprovaTodos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreAprovaTodos(Boolean value) {
        this.preAprovaTodos = value;
    }

    /**
     * Gets the value of the forcaDeVenda property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcaDeVenda() {
        return forcaDeVenda;
    }

    /**
     * Sets the value of the forcaDeVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcaDeVenda(Boolean value) {
        this.forcaDeVenda = value;
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
     * Gets the value of the tipoCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCadastroFuncionario }
     *     
     */
    public TipoCadastroFuncionario getTipoCadastro() {
        return tipoCadastro;
    }

    /**
     * Sets the value of the tipoCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCadastroFuncionario }
     *     
     */
    public void setTipoCadastro(TipoCadastroFuncionario value) {
        this.tipoCadastro = value;
    }

    /**
     * Gets the value of the categoriaHospedagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaHospedagem() {
        return categoriaHospedagem;
    }

    /**
     * Sets the value of the categoriaHospedagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaHospedagem(String value) {
        this.categoriaHospedagem = value;
    }

    /**
     * Gets the value of the perfilFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link PerfilFuncionario }
     *     
     */
    public PerfilFuncionario getPerfilFuncionario() {
        return perfilFuncionario;
    }

    /**
     * Sets the value of the perfilFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilFuncionario }
     *     
     */
    public void setPerfilFuncionario(PerfilFuncionario value) {
        this.perfilFuncionario = value;
    }

    /**
     * Gets the value of the perfilAereo property.
     * 
     * @return
     *     possible object is
     *     {@link PerfilAereo }
     *     
     */
    public PerfilAereo getPerfilAereo() {
        return perfilAereo;
    }

    /**
     * Sets the value of the perfilAereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilAereo }
     *     
     */
    public void setPerfilAereo(PerfilAereo value) {
        this.perfilAereo = value;
    }

    /**
     * Gets the value of the perfilHospedagem property.
     * 
     * @return
     *     possible object is
     *     {@link PerfilHospedagem }
     *     
     */
    public PerfilHospedagem getPerfilHospedagem() {
        return perfilHospedagem;
    }

    /**
     * Sets the value of the perfilHospedagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilHospedagem }
     *     
     */
    public void setPerfilHospedagem(PerfilHospedagem value) {
        this.perfilHospedagem = value;
    }

    /**
     * Gets the value of the visualizaSaldoBudgetAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualizaSaldoBudgetAprovacao() {
        return visualizaSaldoBudgetAprovacao;
    }

    /**
     * Sets the value of the visualizaSaldoBudgetAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualizaSaldoBudgetAprovacao(Boolean value) {
        this.visualizaSaldoBudgetAprovacao = value;
    }

    /**
     * Gets the value of the aprovaBudgetNegativo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAprovaBudgetNegativo() {
        return aprovaBudgetNegativo;
    }

    /**
     * Sets the value of the aprovaBudgetNegativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAprovaBudgetNegativo(Boolean value) {
        this.aprovaBudgetNegativo = value;
    }

    /**
     * Gets the value of the usuarioTerceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsuarioTerceiro() {
        return usuarioTerceiro;
    }

    /**
     * Sets the value of the usuarioTerceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsuarioTerceiro(Boolean value) {
        this.usuarioTerceiro = value;
    }

    /**
     * Gets the value of the antecedenciaViagemNacional property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntecedenciaViagemNacional() {
        return antecedenciaViagemNacional;
    }

    /**
     * Sets the value of the antecedenciaViagemNacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntecedenciaViagemNacional(Integer value) {
        this.antecedenciaViagemNacional = value;
    }

    /**
     * Gets the value of the antecedenciaViagemInternacional property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntecedenciaViagemInternacional() {
        return antecedenciaViagemInternacional;
    }

    /**
     * Sets the value of the antecedenciaViagemInternacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntecedenciaViagemInternacional(Integer value) {
        this.antecedenciaViagemInternacional = value;
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
     * Gets the value of the bloqueiaSolicitarViagem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaSolicitarViagem() {
        return bloqueiaSolicitarViagem;
    }

    /**
     * Sets the value of the bloqueiaSolicitarViagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaSolicitarViagem(Boolean value) {
        this.bloqueiaSolicitarViagem = value;
    }

    /**
     * Gets the value of the podeSerAprovadoSemSaldoBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPodeSerAprovadoSemSaldoBudget() {
        return podeSerAprovadoSemSaldoBudget;
    }

    /**
     * Sets the value of the podeSerAprovadoSemSaldoBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPodeSerAprovadoSemSaldoBudget(Boolean value) {
        this.podeSerAprovadoSemSaldoBudget = value;
    }

    /**
     * Gets the value of the bloqueiaSolicitarViagemAdiantamento property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaSolicitarViagemAdiantamento() {
        return bloqueiaSolicitarViagemAdiantamento;
    }

    /**
     * Sets the value of the bloqueiaSolicitarViagemAdiantamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaSolicitarViagemAdiantamento(Boolean value) {
        this.bloqueiaSolicitarViagemAdiantamento = value;
    }

    /**
     * Gets the value of the permiteSolicitarCarro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteSolicitarCarro() {
        return permiteSolicitarCarro;
    }

    /**
     * Sets the value of the permiteSolicitarCarro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteSolicitarCarro(Boolean value) {
        this.permiteSolicitarCarro = value;
    }

    /**
     * Gets the value of the politicaPercurso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticaPercurso() {
        return politicaPercurso;
    }

    /**
     * Sets the value of the politicaPercurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticaPercurso(String value) {
        this.politicaPercurso = value;
    }

    /**
     * Gets the value of the maximoSvAdiantamentoAberto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximoSvAdiantamentoAberto() {
        return maximoSvAdiantamentoAberto;
    }

    /**
     * Sets the value of the maximoSvAdiantamentoAberto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximoSvAdiantamentoAberto(Integer value) {
        this.maximoSvAdiantamentoAberto = value;
    }

    /**
     * Gets the value of the recebeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecebeEmail() {
        return recebeEmail;
    }

    /**
     * Sets the value of the recebeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecebeEmail(Boolean value) {
        this.recebeEmail = value;
    }

    /**
     * Gets the value of the permiteNotificacaoFinanceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteNotificacaoFinanceiro() {
        return permiteNotificacaoFinanceiro;
    }

    /**
     * Sets the value of the permiteNotificacaoFinanceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteNotificacaoFinanceiro(Boolean value) {
        this.permiteNotificacaoFinanceiro = value;
    }

    /**
     * Gets the value of the utilizaUsuarioLogado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtilizaUsuarioLogado() {
        return utilizaUsuarioLogado;
    }

    /**
     * Sets the value of the utilizaUsuarioLogado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtilizaUsuarioLogado(Boolean value) {
        this.utilizaUsuarioLogado = value;
    }

    /**
     * Gets the value of the permiteCadastrarClienteProjetoReembolsavel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteCadastrarClienteProjetoReembolsavel() {
        return permiteCadastrarClienteProjetoReembolsavel;
    }

    /**
     * Sets the value of the permiteCadastrarClienteProjetoReembolsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteCadastrarClienteProjetoReembolsavel(Boolean value) {
        this.permiteCadastrarClienteProjetoReembolsavel = value;
    }

    /**
     * Gets the value of the excecaoRegraRestricaoHotelRegional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcecaoRegraRestricaoHotelRegional() {
        return excecaoRegraRestricaoHotelRegional;
    }

    /**
     * Sets the value of the excecaoRegraRestricaoHotelRegional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcecaoRegraRestricaoHotelRegional(Boolean value) {
        this.excecaoRegraRestricaoHotelRegional = value;
    }

    /**
     * Gets the value of the bloqueiaUsuarioParaViajar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaUsuarioParaViajar() {
        return bloqueiaUsuarioParaViajar;
    }

    /**
     * Sets the value of the bloqueiaUsuarioParaViajar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaUsuarioParaViajar(Boolean value) {
        this.bloqueiaUsuarioParaViajar = value;
    }

    /**
     * Gets the value of the permiteSelecionarAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteSelecionarAgencia() {
        return permiteSelecionarAgencia;
    }

    /**
     * Sets the value of the permiteSelecionarAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteSelecionarAgencia(Boolean value) {
        this.permiteSelecionarAgencia = value;
    }

    /**
     * Gets the value of the bloqueiaSolicitarViagemPrestacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaSolicitarViagemPrestacao() {
        return bloqueiaSolicitarViagemPrestacao;
    }

    /**
     * Sets the value of the bloqueiaSolicitarViagemPrestacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaSolicitarViagemPrestacao(Boolean value) {
        this.bloqueiaSolicitarViagemPrestacao = value;
    }

    /**
     * Gets the value of the bloqueiaAutoAprovacaoDentroDaPolitica property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaAutoAprovacaoDentroDaPolitica() {
        return bloqueiaAutoAprovacaoDentroDaPolitica;
    }

    /**
     * Sets the value of the bloqueiaAutoAprovacaoDentroDaPolitica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaAutoAprovacaoDentroDaPolitica(Boolean value) {
        this.bloqueiaAutoAprovacaoDentroDaPolitica = value;
    }

    /**
     * Gets the value of the linguaPadrao property.
     * 
     * @return
     *     possible object is
     *     {@link LinguaPadrao }
     *     
     */
    public LinguaPadrao getLinguaPadrao() {
        return linguaPadrao;
    }

    /**
     * Sets the value of the linguaPadrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguaPadrao }
     *     
     */
    public void setLinguaPadrao(LinguaPadrao value) {
        this.linguaPadrao = value;
    }

    /**
     * Gets the value of the emailEnvioCopiaDeVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEnvioCopiaDeVoucher() {
        return emailEnvioCopiaDeVoucher;
    }

    /**
     * Sets the value of the emailEnvioCopiaDeVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEnvioCopiaDeVoucher(String value) {
        this.emailEnvioCopiaDeVoucher = value;
    }

    /**
     * Gets the value of the bypassAprovacaoNacionalSomenteDentroDaPolitica property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassAprovacaoNacionalSomenteDentroDaPolitica() {
        return bypassAprovacaoNacionalSomenteDentroDaPolitica;
    }

    /**
     * Sets the value of the bypassAprovacaoNacionalSomenteDentroDaPolitica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassAprovacaoNacionalSomenteDentroDaPolitica(Boolean value) {
        this.bypassAprovacaoNacionalSomenteDentroDaPolitica = value;
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
     * Gets the value of the categoriaLocacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaLocacao() {
        return categoriaLocacao;
    }

    /**
     * Sets the value of the categoriaLocacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaLocacao(String value) {
        this.categoriaLocacao = value;
    }

}
