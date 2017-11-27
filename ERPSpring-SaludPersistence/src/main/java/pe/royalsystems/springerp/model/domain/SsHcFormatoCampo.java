package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SS_HC_FormatoCampo")
public class SsHcFormatoCampo extends Entidad implements Serializable {

	private SsHcFormatoCampoId id;
	private String version;
	private SsHcFormato ssHcFormato;
	private Integer idFavoritoTabla;
	private Integer idCampo;
	private Integer idSeccionFormato;
	private Integer tipoCampo;
	private String valorPorDefecto;
	private Integer indicadorObligatorio;
	private Integer indicadorCampoCalculado;
	private String formula;
	private Integer indicadorValoresVarios;
	private String tablaValoresVarios;
	private Integer indicadorRango;
	private BigDecimal rangoDesde;
	private BigDecimal rangoHasta;
	private String indicadorReglaNegocio;
	private String reglaNegocio;
	private String observaciones;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String accion;
	private String descripcionLocal;
	private String descripcionExtranjera;
	private Integer idConcepto;
	private Integer idAgrupadorNivel;
	private Integer idObjetoAgrupador;
	private Integer idColumna;
	private Integer idFila;
	private Integer idEvento;
	private Integer idParameterEnvio;
	private Integer orden;
	private Integer idAgrupadorNivelPadre;

	public SsHcFormatoCampo() {
	}

	public SsHcFormatoCampo(SsHcFormatoCampoId id, SsHcFormato ssHcFormato) {
		this.id = id;
		this.ssHcFormato = ssHcFormato;
	}

	public SsHcFormatoCampo(SsHcFormatoCampoId id, SsHcFormato ssHcFormato, Integer idFavoritoTabla, Integer idCampo,
			Integer idSeccionFormato, Integer tipoCampo, String valorPorDefecto, Integer indicadorObligatorio,
			Integer indicadorCampoCalculado, String formula, Integer indicadorValoresVarios, String tablaValoresVarios,
			Integer indicadorRango, BigDecimal rangoDesde, BigDecimal rangoHasta, String indicadorReglaNegocio,
			String reglaNegocio, String observaciones, Integer estado, String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion, String accion, String version, String descripcionLocal,
			String descripcionExtranjera, Integer idConcepto, Integer idAgrupadorNivel, Integer idObjetoAgrupador,
			Integer idColumna, Integer idFila, Integer idEvento, Integer idParameterEnvio, Integer orden,
			Integer idAgrupadorNivelPadre) {
		this.id = id;
		this.ssHcFormato = ssHcFormato;
		this.idFavoritoTabla = idFavoritoTabla;
		this.idCampo = idCampo;
		this.idSeccionFormato = idSeccionFormato;
		this.tipoCampo = tipoCampo;
		this.valorPorDefecto = valorPorDefecto;
		this.indicadorObligatorio = indicadorObligatorio;
		this.indicadorCampoCalculado = indicadorCampoCalculado;
		this.formula = formula;
		this.indicadorValoresVarios = indicadorValoresVarios;
		this.tablaValoresVarios = tablaValoresVarios;
		this.indicadorRango = indicadorRango;
		this.rangoDesde = rangoDesde;
		this.rangoHasta = rangoHasta;
		this.indicadorReglaNegocio = indicadorReglaNegocio;
		this.reglaNegocio = reglaNegocio;
		this.observaciones = observaciones;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.accion = accion;
		this.version = version;
		this.descripcionLocal = descripcionLocal;
		this.descripcionExtranjera = descripcionExtranjera;
		this.idConcepto = idConcepto;
		this.idAgrupadorNivel = idAgrupadorNivel;
		this.idObjetoAgrupador = idObjetoAgrupador;
		this.idColumna = idColumna;
		this.idFila = idFila;
		this.idEvento = idEvento;
		this.idParameterEnvio = idParameterEnvio;
		this.orden = orden;
		this.idAgrupadorNivelPadre = idAgrupadorNivelPadre;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idFormato", column = @Column(name = "IdFormato", nullable = false) ),
			@AttributeOverride(name = "secuenciaCampo", column = @Column(name = "SecuenciaCampo", nullable = false) ) })
	public SsHcFormatoCampoId getId() {
		return this.id;
	}

	public void setId(SsHcFormatoCampoId id) {
		this.id = id;
	}

	@Column(name = "Version", length = 25)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdFormato", nullable = false, insertable = false, updatable = false)
	public SsHcFormato getSsHcFormato() {
		return this.ssHcFormato;
	}

	public void setSsHcFormato(SsHcFormato ssHcFormato) {
		this.ssHcFormato = ssHcFormato;
	}

	@Column(name = "IdFavoritoTabla")
	public Integer getIdFavoritoTabla() {
		return this.idFavoritoTabla;
	}

	public void setIdFavoritoTabla(Integer idFavoritoTabla) {
		this.idFavoritoTabla = idFavoritoTabla;
	}

	@Column(name = "IdCampo")
	public Integer getIdCampo() {
		return this.idCampo;
	}

	public void setIdCampo(Integer idCampo) {
		this.idCampo = idCampo;
	}

	@Column(name = "IdSeccionFormato")
	public Integer getIdSeccionFormato() {
		return this.idSeccionFormato;
	}

	public void setIdSeccionFormato(Integer idSeccionFormato) {
		this.idSeccionFormato = idSeccionFormato;
	}

	@Column(name = "TipoCampo")
	public Integer getTipoCampo() {
		return this.tipoCampo;
	}

	public void setTipoCampo(Integer tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	@Column(name = "ValorPorDefecto", length = 100)
	public String getValorPorDefecto() {
		return this.valorPorDefecto;
	}

	public void setValorPorDefecto(String valorPorDefecto) {
		this.valorPorDefecto = valorPorDefecto;
	}

	@Column(name = "IndicadorObligatorio")
	public Integer getIndicadorObligatorio() {
		return this.indicadorObligatorio;
	}

	public void setIndicadorObligatorio(Integer indicadorObligatorio) {
		this.indicadorObligatorio = indicadorObligatorio;
	}

	@Column(name = "IndicadorCampoCalculado")
	public Integer getIndicadorCampoCalculado() {
		return this.indicadorCampoCalculado;
	}

	public void setIndicadorCampoCalculado(Integer indicadorCampoCalculado) {
		this.indicadorCampoCalculado = indicadorCampoCalculado;
	}

	@Column(name = "Formula", length = 500)
	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@Column(name = "IndicadorValoresVarios")
	public Integer getIndicadorValoresVarios() {
		return this.indicadorValoresVarios;
	}

	public void setIndicadorValoresVarios(Integer indicadorValoresVarios) {
		this.indicadorValoresVarios = indicadorValoresVarios;
	}

	@Column(name = "TablaValoresVarios", length = 15)
	public String getTablaValoresVarios() {
		return this.tablaValoresVarios;
	}

	public void setTablaValoresVarios(String tablaValoresVarios) {
		this.tablaValoresVarios = tablaValoresVarios;
	}

	@Column(name = "IndicadorRango")
	public Integer getIndicadorRango() {
		return this.indicadorRango;
	}

	public void setIndicadorRango(Integer indicadorRango) {
		this.indicadorRango = indicadorRango;
	}

	@Column(name = "RangoDesde", precision = 20, scale = 6)
	public BigDecimal getRangoDesde() {
		return this.rangoDesde;
	}

	public void setRangoDesde(BigDecimal rangoDesde) {
		this.rangoDesde = rangoDesde;
	}

	@Column(name = "RangoHasta", precision = 20, scale = 6)
	public BigDecimal getRangoHasta() {
		return this.rangoHasta;
	}

	public void setRangoHasta(BigDecimal rangoHasta) {
		this.rangoHasta = rangoHasta;
	}

	@Column(name = "IndicadorReglaNegocio", length = 10)
	public String getIndicadorReglaNegocio() {
		return this.indicadorReglaNegocio;
	}

	public void setIndicadorReglaNegocio(String indicadorReglaNegocio) {
		this.indicadorReglaNegocio = indicadorReglaNegocio;
	}

	@Column(name = "ReglaNegocio", length = 100)
	public String getReglaNegocio() {
		return this.reglaNegocio;
	}

	public void setReglaNegocio(String reglaNegocio) {
		this.reglaNegocio = reglaNegocio;
	}

	@Column(name = "Observaciones", length = 500)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "UsuarioCreacion", length = 25)
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FechaCreacion", length = 23)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Column(name = "UsuarioModificacion", length = 25)
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FechaModificacion", length = 23)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Column(name = "Accion", length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Column(name = "DescripcionLocal", length = 500)
	public String getDescripcionLocal() {
		return this.descripcionLocal;
	}

	public void setDescripcionLocal(String descripcionLocal) {
		this.descripcionLocal = descripcionLocal;
	}

	@Column(name = "DescripcionExtranjera", length = 500)
	public String getDescripcionExtranjera() {
		return this.descripcionExtranjera;
	}

	public void setDescripcionExtranjera(String descripcionExtranjera) {
		this.descripcionExtranjera = descripcionExtranjera;
	}

	@Column(name = "IdConcepto")
	public Integer getIdConcepto() {
		return this.idConcepto;
	}

	public void setIdConcepto(Integer idConcepto) {
		this.idConcepto = idConcepto;
	}

	@Column(name = "IdAgrupadorNivel")
	public Integer getIdAgrupadorNivel() {
		return this.idAgrupadorNivel;
	}

	public void setIdAgrupadorNivel(Integer idAgrupadorNivel) {
		this.idAgrupadorNivel = idAgrupadorNivel;
	}

	@Column(name = "IdObjetoAgrupador")
	public Integer getIdObjetoAgrupador() {
		return this.idObjetoAgrupador;
	}

	public void setIdObjetoAgrupador(Integer idObjetoAgrupador) {
		this.idObjetoAgrupador = idObjetoAgrupador;
	}

	@Column(name = "IdColumna")
	public Integer getIdColumna() {
		return this.idColumna;
	}

	public void setIdColumna(Integer idColumna) {
		this.idColumna = idColumna;
	}

	@Column(name = "IdFila")
	public Integer getIdFila() {
		return this.idFila;
	}

	public void setIdFila(Integer idFila) {
		this.idFila = idFila;
	}

	@Column(name = "IdEvento")
	public Integer getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	@Column(name = "IdParameterEnvio")
	public Integer getIdParameterEnvio() {
		return this.idParameterEnvio;
	}

	public void setIdParameterEnvio(Integer idParameterEnvio) {
		this.idParameterEnvio = idParameterEnvio;
	}

	@Column(name = "Orden")
	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	@Column(name = "IdAgrupadorNivelPadre")
	public Integer getIdAgrupadorNivelPadre() {
		return this.idAgrupadorNivelPadre;
	}

	public void setIdAgrupadorNivelPadre(Integer idAgrupadorNivelPadre) {
		this.idAgrupadorNivelPadre = idAgrupadorNivelPadre;
	}

}
