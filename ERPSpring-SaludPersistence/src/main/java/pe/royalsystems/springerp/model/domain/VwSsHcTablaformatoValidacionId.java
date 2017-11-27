package pe.royalsystems.springerp.model.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VwSsHcTablaformatoValidacionId implements java.io.Serializable {

	private int idFormato;
	private Integer formatoNivelId;
	private Integer idFormatoPadre;
	private String codigoFormato;
	private String codigoFormatoPadre;
	private String descripcionFormato;
	private Integer tipoFormato;
	private Integer estadoFormato;
	private int idFavoritoTabla;
	private String nombreTabla;
	private String descripcionTabla;
	private Integer tipoTabla;
	private Integer estadoTabla;
	private int idCampo;
	private String nombreCampo;
	private String descripcionCampo;
	private Integer tipoCampo;
	private Integer longitud;
	private Integer decimales;
	private Integer estadoTablaCampo;
	private int secuenciaCampo;
	private Integer idSeccionFormato;
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
	private Integer estadoFormatoCampo;
	private Integer idConcepto;
	private Integer idAgrupadorNivel;
	private Integer idObjetoAgrupador;
	private Integer idColumna;
	private Integer idFila;
	private Integer idEvento;
	private Integer idParameterEnvio;
	private Integer orden;
	private Integer idAgrupadorNivelPadre;
	private Integer secuenciaValidacion;
	private Integer idComponente;
	private Integer idAtributo;
	private String tipoValidacion;
	private String flagTipoDato;
	private String valorTexto;
	private BigDecimal valorNumerico;
	private Date valorDate;
	private Integer secuenciaValidacionRef;
	private Integer estadoValidacion;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String accion;
	private String version;
	private String nombreComponente;
	private String tipoComponente;
	private Integer estadoComponente;
	private String nombreAtributo;
	private Integer estadoAtributo;
	private String idiomaProperty;

	public VwSsHcTablaformatoValidacionId() {
	}

	public VwSsHcTablaformatoValidacionId(int idFormato, String codigoFormato, int idFavoritoTabla, int idCampo,
			int secuenciaCampo) {
		this.idFormato = idFormato;
		this.codigoFormato = codigoFormato;
		this.idFavoritoTabla = idFavoritoTabla;
		this.idCampo = idCampo;
		this.secuenciaCampo = secuenciaCampo;
	}

	public VwSsHcTablaformatoValidacionId(int idFormato, Integer formatoNivelId, Integer idFormatoPadre,
			String codigoFormato, String codigoFormatoPadre, String descripcionFormato, Integer tipoFormato,
			Integer estadoFormato, int idFavoritoTabla, String nombreTabla, String descripcionTabla, Integer tipoTabla,
			Integer estadoTabla, int idCampo, String nombreCampo, String descripcionCampo, Integer tipoCampo,
			Integer longitud, Integer decimales, Integer estadoTablaCampo, int secuenciaCampo, Integer idSeccionFormato,
			String valorPorDefecto, Integer indicadorObligatorio, Integer indicadorCampoCalculado, String formula,
			Integer indicadorValoresVarios, String tablaValoresVarios, Integer indicadorRango, BigDecimal rangoDesde,
			BigDecimal rangoHasta, String indicadorReglaNegocio, String reglaNegocio, String observaciones,
			Integer estadoFormatoCampo, Integer idConcepto, Integer idAgrupadorNivel, Integer idObjetoAgrupador,
			Integer idColumna, Integer idFila, Integer idEvento, Integer idParameterEnvio, Integer orden,
			Integer idAgrupadorNivelPadre, Integer secuenciaValidacion, Integer idComponente, Integer idAtributo,
			String tipoValidacion, String flagTipoDato, String valorTexto, BigDecimal valorNumerico, Date valorDate,
			Integer secuenciaValidacionRef, Integer estadoValidacion, String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion, String accion, String version, String nombreComponente,
			String tipoComponente, Integer estadoComponente, String nombreAtributo, Integer estadoAtributo,
			String idiomaProperty) {
		this.idFormato = idFormato;
		this.formatoNivelId = formatoNivelId;
		this.idFormatoPadre = idFormatoPadre;
		this.codigoFormato = codigoFormato;
		this.codigoFormatoPadre = codigoFormatoPadre;
		this.descripcionFormato = descripcionFormato;
		this.tipoFormato = tipoFormato;
		this.estadoFormato = estadoFormato;
		this.idFavoritoTabla = idFavoritoTabla;
		this.nombreTabla = nombreTabla;
		this.descripcionTabla = descripcionTabla;
		this.tipoTabla = tipoTabla;
		this.estadoTabla = estadoTabla;
		this.idCampo = idCampo;
		this.nombreCampo = nombreCampo;
		this.descripcionCampo = descripcionCampo;
		this.tipoCampo = tipoCampo;
		this.longitud = longitud;
		this.decimales = decimales;
		this.estadoTablaCampo = estadoTablaCampo;
		this.secuenciaCampo = secuenciaCampo;
		this.idSeccionFormato = idSeccionFormato;
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
		this.estadoFormatoCampo = estadoFormatoCampo;
		this.idConcepto = idConcepto;
		this.idAgrupadorNivel = idAgrupadorNivel;
		this.idObjetoAgrupador = idObjetoAgrupador;
		this.idColumna = idColumna;
		this.idFila = idFila;
		this.idEvento = idEvento;
		this.idParameterEnvio = idParameterEnvio;
		this.orden = orden;
		this.idAgrupadorNivelPadre = idAgrupadorNivelPadre;
		this.secuenciaValidacion = secuenciaValidacion;
		this.idComponente = idComponente;
		this.idAtributo = idAtributo;
		this.tipoValidacion = tipoValidacion;
		this.flagTipoDato = flagTipoDato;
		this.valorTexto = valorTexto;
		this.valorNumerico = valorNumerico;
		this.valorDate = valorDate;
		this.secuenciaValidacionRef = secuenciaValidacionRef;
		this.estadoValidacion = estadoValidacion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.accion = accion;
		this.version = version;
		this.nombreComponente = nombreComponente;
		this.tipoComponente = tipoComponente;
		this.estadoComponente = estadoComponente;
		this.nombreAtributo = nombreAtributo;
		this.estadoAtributo = estadoAtributo;
		this.idiomaProperty = idiomaProperty;
	}

	@Column(name = "IdFormato", nullable = false)
	public int getIdFormato() {
		return this.idFormato;
	}

	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}

	@Column(name = "FormatoNivelID")
	public Integer getFormatoNivelId() {
		return this.formatoNivelId;
	}

	public void setFormatoNivelId(Integer formatoNivelId) {
		this.formatoNivelId = formatoNivelId;
	}

	@Column(name = "IdFormatoPadre")
	public Integer getIdFormatoPadre() {
		return this.idFormatoPadre;
	}

	public void setIdFormatoPadre(Integer idFormatoPadre) {
		this.idFormatoPadre = idFormatoPadre;
	}

	@Column(name = "CodigoFormato", nullable = false, length = 20)
	public String getCodigoFormato() {
		return this.codigoFormato;
	}

	public void setCodigoFormato(String codigoFormato) {
		this.codigoFormato = codigoFormato;
	}

	@Column(name = "CodigoFormatoPadre", length = 20)
	public String getCodigoFormatoPadre() {
		return this.codigoFormatoPadre;
	}

	public void setCodigoFormatoPadre(String codigoFormatoPadre) {
		this.codigoFormatoPadre = codigoFormatoPadre;
	}

	@Column(name = "DescripcionFormato", length = 100)
	public String getDescripcionFormato() {
		return this.descripcionFormato;
	}

	public void setDescripcionFormato(String descripcionFormato) {
		this.descripcionFormato = descripcionFormato;
	}

	@Column(name = "TipoFormato")
	public Integer getTipoFormato() {
		return this.tipoFormato;
	}

	public void setTipoFormato(Integer tipoFormato) {
		this.tipoFormato = tipoFormato;
	}

	@Column(name = "EstadoFormato")
	public Integer getEstadoFormato() {
		return this.estadoFormato;
	}

	public void setEstadoFormato(Integer estadoFormato) {
		this.estadoFormato = estadoFormato;
	}

	@Column(name = "IdFavoritoTabla", nullable = false)
	public int getIdFavoritoTabla() {
		return this.idFavoritoTabla;
	}

	public void setIdFavoritoTabla(int idFavoritoTabla) {
		this.idFavoritoTabla = idFavoritoTabla;
	}

	@Column(name = "NombreTabla", length = 128)
	public String getNombreTabla() {
		return this.nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	@Column(name = "DescripcionTabla", length = 100)
	public String getDescripcionTabla() {
		return this.descripcionTabla;
	}

	public void setDescripcionTabla(String descripcionTabla) {
		this.descripcionTabla = descripcionTabla;
	}

	@Column(name = "TipoTabla")
	public Integer getTipoTabla() {
		return this.tipoTabla;
	}

	public void setTipoTabla(Integer tipoTabla) {
		this.tipoTabla = tipoTabla;
	}

	@Column(name = "EstadoTabla")
	public Integer getEstadoTabla() {
		return this.estadoTabla;
	}

	public void setEstadoTabla(Integer estadoTabla) {
		this.estadoTabla = estadoTabla;
	}

	@Column(name = "IdCampo", nullable = false)
	public int getIdCampo() {
		return this.idCampo;
	}

	public void setIdCampo(int idCampo) {
		this.idCampo = idCampo;
	}

	@Column(name = "NombreCampo", length = 128)
	public String getNombreCampo() {
		return this.nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	@Column(name = "DescripcionCampo", length = 100)
	public String getDescripcionCampo() {
		return this.descripcionCampo;
	}

	public void setDescripcionCampo(String descripcionCampo) {
		this.descripcionCampo = descripcionCampo;
	}

	@Column(name = "TipoCampo")
	public Integer getTipoCampo() {
		return this.tipoCampo;
	}

	public void setTipoCampo(Integer tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	@Column(name = "Longitud")
	public Integer getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	@Column(name = "Decimales")
	public Integer getDecimales() {
		return this.decimales;
	}

	public void setDecimales(Integer decimales) {
		this.decimales = decimales;
	}

	@Column(name = "EstadoTablaCampo")
	public Integer getEstadoTablaCampo() {
		return this.estadoTablaCampo;
	}

	public void setEstadoTablaCampo(Integer estadoTablaCampo) {
		this.estadoTablaCampo = estadoTablaCampo;
	}

	@Column(name = "SecuenciaCampo", nullable = false)
	public int getSecuenciaCampo() {
		return this.secuenciaCampo;
	}

	public void setSecuenciaCampo(int secuenciaCampo) {
		this.secuenciaCampo = secuenciaCampo;
	}

	@Column(name = "IdSeccionFormato")
	public Integer getIdSeccionFormato() {
		return this.idSeccionFormato;
	}

	public void setIdSeccionFormato(Integer idSeccionFormato) {
		this.idSeccionFormato = idSeccionFormato;
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

	@Column(name = "EstadoFormatoCampo")
	public Integer getEstadoFormatoCampo() {
		return this.estadoFormatoCampo;
	}

	public void setEstadoFormatoCampo(Integer estadoFormatoCampo) {
		this.estadoFormatoCampo = estadoFormatoCampo;
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

	@Column(name = "SecuenciaValidacion")
	public Integer getSecuenciaValidacion() {
		return this.secuenciaValidacion;
	}

	public void setSecuenciaValidacion(Integer secuenciaValidacion) {
		this.secuenciaValidacion = secuenciaValidacion;
	}

	@Column(name = "IdComponente")
	public Integer getIdComponente() {
		return this.idComponente;
	}

	public void setIdComponente(Integer idComponente) {
		this.idComponente = idComponente;
	}

	@Column(name = "IdAtributo")
	public Integer getIdAtributo() {
		return this.idAtributo;
	}

	public void setIdAtributo(Integer idAtributo) {
		this.idAtributo = idAtributo;
	}

	@Column(name = "TipoValidacion", length = 10)
	public String getTipoValidacion() {
		return this.tipoValidacion;
	}

	public void setTipoValidacion(String tipoValidacion) {
		this.tipoValidacion = tipoValidacion;
	}

	@Column(name = "FlagTipoDato", length = 1)
	public String getFlagTipoDato() {
		return this.flagTipoDato;
	}

	public void setFlagTipoDato(String flagTipoDato) {
		this.flagTipoDato = flagTipoDato;
	}

	@Column(name = "ValorTexto", length = 200)
	public String getValorTexto() {
		return this.valorTexto;
	}

	public void setValorTexto(String valorTexto) {
		this.valorTexto = valorTexto;
	}

	@Column(name = "ValorNumerico", precision = 10)
	public BigDecimal getValorNumerico() {
		return this.valorNumerico;
	}

	public void setValorNumerico(BigDecimal valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

	@Column(name = "ValorDate", length = 23)
	public Date getValorDate() {
		return this.valorDate;
	}

	public void setValorDate(Date valorDate) {
		this.valorDate = valorDate;
	}

	@Column(name = "SecuenciaValidacionRef")
	public Integer getSecuenciaValidacionRef() {
		return this.secuenciaValidacionRef;
	}

	public void setSecuenciaValidacionRef(Integer secuenciaValidacionRef) {
		this.secuenciaValidacionRef = secuenciaValidacionRef;
	}

	@Column(name = "EstadoValidacion")
	public Integer getEstadoValidacion() {
		return this.estadoValidacion;
	}

	public void setEstadoValidacion(Integer estadoValidacion) {
		this.estadoValidacion = estadoValidacion;
	}

	@Column(name = "UsuarioCreacion", length = 25)
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

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

	@Column(name = "Version", length = 25)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "NombreComponente", length = 200)
	public String getNombreComponente() {
		return this.nombreComponente;
	}

	public void setNombreComponente(String nombreComponente) {
		this.nombreComponente = nombreComponente;
	}

	@Column(name = "TipoComponente", length = 10)
	public String getTipoComponente() {
		return this.tipoComponente;
	}

	public void setTipoComponente(String tipoComponente) {
		this.tipoComponente = tipoComponente;
	}

	@Column(name = "EstadoComponente")
	public Integer getEstadoComponente() {
		return this.estadoComponente;
	}

	public void setEstadoComponente(Integer estadoComponente) {
		this.estadoComponente = estadoComponente;
	}

	@Column(name = "NombreAtributo", length = 200)
	public String getNombreAtributo() {
		return this.nombreAtributo;
	}

	public void setNombreAtributo(String nombreAtributo) {
		this.nombreAtributo = nombreAtributo;
	}

	@Column(name = "EstadoAtributo")
	public Integer getEstadoAtributo() {
		return this.estadoAtributo;
	}

	public void setEstadoAtributo(Integer estadoAtributo) {
		this.estadoAtributo = estadoAtributo;
	}

	@Column(name = "IdiomaProperty", length = 20)
	public String getIdiomaProperty() {
		return this.idiomaProperty;
	}

	public void setIdiomaProperty(String idiomaProperty) {
		this.idiomaProperty = idiomaProperty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwSsHcTablaformatoValidacionId))
			return false;
		VwSsHcTablaformatoValidacionId castOther = (VwSsHcTablaformatoValidacionId) other;

		return (this.getIdFormato() == castOther.getIdFormato())
				&& ((this.getFormatoNivelId() == castOther.getFormatoNivelId())
						|| (this.getFormatoNivelId() != null && castOther.getFormatoNivelId() != null
								&& this.getFormatoNivelId().equals(castOther.getFormatoNivelId())))
				&& ((this.getIdFormatoPadre() == castOther.getIdFormatoPadre())
						|| (this.getIdFormatoPadre() != null && castOther.getIdFormatoPadre() != null
								&& this.getIdFormatoPadre().equals(castOther.getIdFormatoPadre())))
				&& ((this.getCodigoFormato() == castOther.getCodigoFormato())
						|| (this.getCodigoFormato() != null && castOther.getCodigoFormato() != null
								&& this.getCodigoFormato().equals(castOther.getCodigoFormato())))
				&& ((this.getCodigoFormatoPadre() == castOther.getCodigoFormatoPadre())
						|| (this.getCodigoFormatoPadre() != null && castOther.getCodigoFormatoPadre() != null
								&& this.getCodigoFormatoPadre().equals(castOther.getCodigoFormatoPadre())))
				&& ((this.getDescripcionFormato() == castOther.getDescripcionFormato())
						|| (this.getDescripcionFormato() != null && castOther.getDescripcionFormato() != null
								&& this.getDescripcionFormato().equals(castOther.getDescripcionFormato())))
				&& ((this.getTipoFormato() == castOther.getTipoFormato())
						|| (this.getTipoFormato() != null && castOther.getTipoFormato() != null
								&& this.getTipoFormato().equals(castOther.getTipoFormato())))
				&& ((this.getEstadoFormato() == castOther.getEstadoFormato())
						|| (this.getEstadoFormato() != null && castOther.getEstadoFormato() != null
								&& this.getEstadoFormato().equals(castOther.getEstadoFormato())))
				&& (this.getIdFavoritoTabla() == castOther.getIdFavoritoTabla())
				&& ((this.getNombreTabla() == castOther.getNombreTabla())
						|| (this.getNombreTabla() != null && castOther.getNombreTabla() != null
								&& this.getNombreTabla().equals(castOther.getNombreTabla())))
				&& ((this.getDescripcionTabla() == castOther.getDescripcionTabla())
						|| (this.getDescripcionTabla() != null && castOther.getDescripcionTabla() != null
								&& this.getDescripcionTabla().equals(castOther.getDescripcionTabla())))
				&& ((this.getTipoTabla() == castOther.getTipoTabla()) || (this.getTipoTabla() != null
						&& castOther.getTipoTabla() != null && this.getTipoTabla().equals(castOther.getTipoTabla())))
				&& ((this.getEstadoTabla() == castOther.getEstadoTabla())
						|| (this.getEstadoTabla() != null && castOther.getEstadoTabla() != null
								&& this.getEstadoTabla().equals(castOther.getEstadoTabla())))
				&& (this.getIdCampo() == castOther.getIdCampo())
				&& ((this.getNombreCampo() == castOther.getNombreCampo())
						|| (this.getNombreCampo() != null && castOther.getNombreCampo() != null
								&& this.getNombreCampo().equals(castOther.getNombreCampo())))
				&& ((this.getDescripcionCampo() == castOther.getDescripcionCampo())
						|| (this.getDescripcionCampo() != null && castOther.getDescripcionCampo() != null
								&& this.getDescripcionCampo().equals(castOther.getDescripcionCampo())))
				&& ((this.getTipoCampo() == castOther.getTipoCampo()) || (this.getTipoCampo() != null
						&& castOther.getTipoCampo() != null && this.getTipoCampo().equals(castOther.getTipoCampo())))
				&& ((this.getLongitud() == castOther.getLongitud()) || (this.getLongitud() != null
						&& castOther.getLongitud() != null && this.getLongitud().equals(castOther.getLongitud())))
				&& ((this.getDecimales() == castOther.getDecimales()) || (this.getDecimales() != null
						&& castOther.getDecimales() != null && this.getDecimales().equals(castOther.getDecimales())))
				&& ((this.getEstadoTablaCampo() == castOther.getEstadoTablaCampo())
						|| (this.getEstadoTablaCampo() != null && castOther.getEstadoTablaCampo() != null
								&& this.getEstadoTablaCampo().equals(castOther.getEstadoTablaCampo())))
				&& (this.getSecuenciaCampo() == castOther.getSecuenciaCampo())
				&& ((this.getIdSeccionFormato() == castOther.getIdSeccionFormato())
						|| (this.getIdSeccionFormato() != null && castOther.getIdSeccionFormato() != null
								&& this.getIdSeccionFormato().equals(castOther.getIdSeccionFormato())))
				&& ((this.getValorPorDefecto() == castOther.getValorPorDefecto())
						|| (this.getValorPorDefecto() != null && castOther.getValorPorDefecto() != null
								&& this.getValorPorDefecto().equals(castOther.getValorPorDefecto())))
				&& ((this.getIndicadorObligatorio() == castOther.getIndicadorObligatorio())
						|| (this.getIndicadorObligatorio() != null && castOther.getIndicadorObligatorio() != null
								&& this.getIndicadorObligatorio().equals(castOther.getIndicadorObligatorio())))
				&& ((this.getIndicadorCampoCalculado() == castOther.getIndicadorCampoCalculado())
						|| (this.getIndicadorCampoCalculado() != null && castOther.getIndicadorCampoCalculado() != null
								&& this.getIndicadorCampoCalculado().equals(castOther.getIndicadorCampoCalculado())))
				&& ((this.getFormula() == castOther.getFormula()) || (this.getFormula() != null
						&& castOther.getFormula() != null && this.getFormula().equals(castOther.getFormula())))
				&& ((this.getIndicadorValoresVarios() == castOther.getIndicadorValoresVarios())
						|| (this.getIndicadorValoresVarios() != null && castOther.getIndicadorValoresVarios() != null
								&& this.getIndicadorValoresVarios().equals(castOther.getIndicadorValoresVarios())))
				&& ((this.getTablaValoresVarios() == castOther.getTablaValoresVarios())
						|| (this.getTablaValoresVarios() != null && castOther.getTablaValoresVarios() != null
								&& this.getTablaValoresVarios().equals(castOther.getTablaValoresVarios())))
				&& ((this.getIndicadorRango() == castOther.getIndicadorRango())
						|| (this.getIndicadorRango() != null && castOther.getIndicadorRango() != null
								&& this.getIndicadorRango().equals(castOther.getIndicadorRango())))
				&& ((this.getRangoDesde() == castOther.getRangoDesde()) || (this.getRangoDesde() != null
						&& castOther.getRangoDesde() != null && this.getRangoDesde().equals(castOther.getRangoDesde())))
				&& ((this.getRangoHasta() == castOther.getRangoHasta()) || (this.getRangoHasta() != null
						&& castOther.getRangoHasta() != null && this.getRangoHasta().equals(castOther.getRangoHasta())))
				&& ((this.getIndicadorReglaNegocio() == castOther.getIndicadorReglaNegocio())
						|| (this.getIndicadorReglaNegocio() != null && castOther.getIndicadorReglaNegocio() != null
								&& this.getIndicadorReglaNegocio().equals(castOther.getIndicadorReglaNegocio())))
				&& ((this.getReglaNegocio() == castOther.getReglaNegocio())
						|| (this.getReglaNegocio() != null && castOther.getReglaNegocio() != null
								&& this.getReglaNegocio().equals(castOther.getReglaNegocio())))
				&& ((this.getObservaciones() == castOther.getObservaciones())
						|| (this.getObservaciones() != null && castOther.getObservaciones() != null
								&& this.getObservaciones().equals(castOther.getObservaciones())))
				&& ((this.getEstadoFormatoCampo() == castOther.getEstadoFormatoCampo())
						|| (this.getEstadoFormatoCampo() != null && castOther.getEstadoFormatoCampo() != null
								&& this.getEstadoFormatoCampo().equals(castOther.getEstadoFormatoCampo())))
				&& ((this.getIdConcepto() == castOther.getIdConcepto()) || (this.getIdConcepto() != null
						&& castOther.getIdConcepto() != null && this.getIdConcepto().equals(castOther.getIdConcepto())))
				&& ((this.getIdAgrupadorNivel() == castOther.getIdAgrupadorNivel())
						|| (this.getIdAgrupadorNivel() != null && castOther.getIdAgrupadorNivel() != null
								&& this.getIdAgrupadorNivel().equals(castOther.getIdAgrupadorNivel())))
				&& ((this.getIdObjetoAgrupador() == castOther.getIdObjetoAgrupador())
						|| (this.getIdObjetoAgrupador() != null && castOther.getIdObjetoAgrupador() != null
								&& this.getIdObjetoAgrupador().equals(castOther.getIdObjetoAgrupador())))
				&& ((this.getIdColumna() == castOther.getIdColumna()) || (this.getIdColumna() != null
						&& castOther.getIdColumna() != null && this.getIdColumna().equals(castOther.getIdColumna())))
				&& ((this.getIdFila() == castOther.getIdFila()) || (this.getIdFila() != null
						&& castOther.getIdFila() != null && this.getIdFila().equals(castOther.getIdFila())))
				&& ((this.getIdEvento() == castOther.getIdEvento()) || (this.getIdEvento() != null
						&& castOther.getIdEvento() != null && this.getIdEvento().equals(castOther.getIdEvento())))
				&& ((this.getIdParameterEnvio() == castOther.getIdParameterEnvio())
						|| (this.getIdParameterEnvio() != null && castOther.getIdParameterEnvio() != null
								&& this.getIdParameterEnvio().equals(castOther.getIdParameterEnvio())))
				&& ((this.getOrden() == castOther.getOrden()) || (this.getOrden() != null
						&& castOther.getOrden() != null && this.getOrden().equals(castOther.getOrden())))
				&& ((this.getIdAgrupadorNivelPadre() == castOther.getIdAgrupadorNivelPadre())
						|| (this.getIdAgrupadorNivelPadre() != null && castOther.getIdAgrupadorNivelPadre() != null
								&& this.getIdAgrupadorNivelPadre().equals(castOther.getIdAgrupadorNivelPadre())))
				&& ((this.getSecuenciaValidacion() == castOther.getSecuenciaValidacion())
						|| (this.getSecuenciaValidacion() != null && castOther.getSecuenciaValidacion() != null
								&& this.getSecuenciaValidacion().equals(castOther.getSecuenciaValidacion())))
				&& ((this.getIdComponente() == castOther.getIdComponente())
						|| (this.getIdComponente() != null && castOther.getIdComponente() != null
								&& this.getIdComponente().equals(castOther.getIdComponente())))
				&& ((this.getIdAtributo() == castOther.getIdAtributo()) || (this.getIdAtributo() != null
						&& castOther.getIdAtributo() != null && this.getIdAtributo().equals(castOther.getIdAtributo())))
				&& ((this.getTipoValidacion() == castOther.getTipoValidacion())
						|| (this.getTipoValidacion() != null && castOther.getTipoValidacion() != null
								&& this.getTipoValidacion().equals(castOther.getTipoValidacion())))
				&& ((this.getFlagTipoDato() == castOther.getFlagTipoDato())
						|| (this.getFlagTipoDato() != null && castOther.getFlagTipoDato() != null
								&& this.getFlagTipoDato().equals(castOther.getFlagTipoDato())))
				&& ((this.getValorTexto() == castOther.getValorTexto()) || (this.getValorTexto() != null
						&& castOther.getValorTexto() != null && this.getValorTexto().equals(castOther.getValorTexto())))
				&& ((this.getValorNumerico() == castOther.getValorNumerico())
						|| (this.getValorNumerico() != null && castOther.getValorNumerico() != null
								&& this.getValorNumerico().equals(castOther.getValorNumerico())))
				&& ((this.getValorDate() == castOther.getValorDate()) || (this.getValorDate() != null
						&& castOther.getValorDate() != null && this.getValorDate().equals(castOther.getValorDate())))
				&& ((this.getSecuenciaValidacionRef() == castOther.getSecuenciaValidacionRef())
						|| (this.getSecuenciaValidacionRef() != null && castOther.getSecuenciaValidacionRef() != null
								&& this.getSecuenciaValidacionRef().equals(castOther.getSecuenciaValidacionRef())))
				&& ((this.getEstadoValidacion() == castOther.getEstadoValidacion())
						|| (this.getEstadoValidacion() != null && castOther.getEstadoValidacion() != null
								&& this.getEstadoValidacion().equals(castOther.getEstadoValidacion())))
				&& ((this.getUsuarioCreacion() == castOther.getUsuarioCreacion())
						|| (this.getUsuarioCreacion() != null && castOther.getUsuarioCreacion() != null
								&& this.getUsuarioCreacion().equals(castOther.getUsuarioCreacion())))
				&& ((this.getFechaCreacion() == castOther.getFechaCreacion())
						|| (this.getFechaCreacion() != null && castOther.getFechaCreacion() != null
								&& this.getFechaCreacion().equals(castOther.getFechaCreacion())))
				&& ((this.getUsuarioModificacion() == castOther.getUsuarioModificacion())
						|| (this.getUsuarioModificacion() != null && castOther.getUsuarioModificacion() != null
								&& this.getUsuarioModificacion().equals(castOther.getUsuarioModificacion())))
				&& ((this.getFechaModificacion() == castOther.getFechaModificacion())
						|| (this.getFechaModificacion() != null && castOther.getFechaModificacion() != null
								&& this.getFechaModificacion().equals(castOther.getFechaModificacion())))
				&& ((this.getAccion() == castOther.getAccion()) || (this.getAccion() != null
						&& castOther.getAccion() != null && this.getAccion().equals(castOther.getAccion())))
				&& ((this.getVersion() == castOther.getVersion()) || (this.getVersion() != null
						&& castOther.getVersion() != null && this.getVersion().equals(castOther.getVersion())))
				&& ((this.getNombreComponente() == castOther.getNombreComponente())
						|| (this.getNombreComponente() != null && castOther.getNombreComponente() != null
								&& this.getNombreComponente().equals(castOther.getNombreComponente())))
				&& ((this.getTipoComponente() == castOther.getTipoComponente())
						|| (this.getTipoComponente() != null && castOther.getTipoComponente() != null
								&& this.getTipoComponente().equals(castOther.getTipoComponente())))
				&& ((this.getEstadoComponente() == castOther.getEstadoComponente())
						|| (this.getEstadoComponente() != null && castOther.getEstadoComponente() != null
								&& this.getEstadoComponente().equals(castOther.getEstadoComponente())))
				&& ((this.getNombreAtributo() == castOther.getNombreAtributo())
						|| (this.getNombreAtributo() != null && castOther.getNombreAtributo() != null
								&& this.getNombreAtributo().equals(castOther.getNombreAtributo())))
				&& ((this.getEstadoAtributo() == castOther.getEstadoAtributo())
						|| (this.getEstadoAtributo() != null && castOther.getEstadoAtributo() != null
								&& this.getEstadoAtributo().equals(castOther.getEstadoAtributo())))
				&& ((this.getIdiomaProperty() == castOther.getIdiomaProperty())
						|| (this.getIdiomaProperty() != null && castOther.getIdiomaProperty() != null
								&& this.getIdiomaProperty().equals(castOther.getIdiomaProperty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdFormato();
		result = 37 * result + (getFormatoNivelId() == null ? 0 : this.getFormatoNivelId().hashCode());
		result = 37 * result + (getIdFormatoPadre() == null ? 0 : this.getIdFormatoPadre().hashCode());
		result = 37 * result + (getCodigoFormato() == null ? 0 : this.getCodigoFormato().hashCode());
		result = 37 * result + (getCodigoFormatoPadre() == null ? 0 : this.getCodigoFormatoPadre().hashCode());
		result = 37 * result + (getDescripcionFormato() == null ? 0 : this.getDescripcionFormato().hashCode());
		result = 37 * result + (getTipoFormato() == null ? 0 : this.getTipoFormato().hashCode());
		result = 37 * result + (getEstadoFormato() == null ? 0 : this.getEstadoFormato().hashCode());
		result = 37 * result + this.getIdFavoritoTabla();
		result = 37 * result + (getNombreTabla() == null ? 0 : this.getNombreTabla().hashCode());
		result = 37 * result + (getDescripcionTabla() == null ? 0 : this.getDescripcionTabla().hashCode());
		result = 37 * result + (getTipoTabla() == null ? 0 : this.getTipoTabla().hashCode());
		result = 37 * result + (getEstadoTabla() == null ? 0 : this.getEstadoTabla().hashCode());
		result = 37 * result + this.getIdCampo();
		result = 37 * result + (getNombreCampo() == null ? 0 : this.getNombreCampo().hashCode());
		result = 37 * result + (getDescripcionCampo() == null ? 0 : this.getDescripcionCampo().hashCode());
		result = 37 * result + (getTipoCampo() == null ? 0 : this.getTipoCampo().hashCode());
		result = 37 * result + (getLongitud() == null ? 0 : this.getLongitud().hashCode());
		result = 37 * result + (getDecimales() == null ? 0 : this.getDecimales().hashCode());
		result = 37 * result + (getEstadoTablaCampo() == null ? 0 : this.getEstadoTablaCampo().hashCode());
		result = 37 * result + this.getSecuenciaCampo();
		result = 37 * result + (getIdSeccionFormato() == null ? 0 : this.getIdSeccionFormato().hashCode());
		result = 37 * result + (getValorPorDefecto() == null ? 0 : this.getValorPorDefecto().hashCode());
		result = 37 * result + (getIndicadorObligatorio() == null ? 0 : this.getIndicadorObligatorio().hashCode());
		result = 37 * result
				+ (getIndicadorCampoCalculado() == null ? 0 : this.getIndicadorCampoCalculado().hashCode());
		result = 37 * result + (getFormula() == null ? 0 : this.getFormula().hashCode());
		result = 37 * result + (getIndicadorValoresVarios() == null ? 0 : this.getIndicadorValoresVarios().hashCode());
		result = 37 * result + (getTablaValoresVarios() == null ? 0 : this.getTablaValoresVarios().hashCode());
		result = 37 * result + (getIndicadorRango() == null ? 0 : this.getIndicadorRango().hashCode());
		result = 37 * result + (getRangoDesde() == null ? 0 : this.getRangoDesde().hashCode());
		result = 37 * result + (getRangoHasta() == null ? 0 : this.getRangoHasta().hashCode());
		result = 37 * result + (getIndicadorReglaNegocio() == null ? 0 : this.getIndicadorReglaNegocio().hashCode());
		result = 37 * result + (getReglaNegocio() == null ? 0 : this.getReglaNegocio().hashCode());
		result = 37 * result + (getObservaciones() == null ? 0 : this.getObservaciones().hashCode());
		result = 37 * result + (getEstadoFormatoCampo() == null ? 0 : this.getEstadoFormatoCampo().hashCode());
		result = 37 * result + (getIdConcepto() == null ? 0 : this.getIdConcepto().hashCode());
		result = 37 * result + (getIdAgrupadorNivel() == null ? 0 : this.getIdAgrupadorNivel().hashCode());
		result = 37 * result + (getIdObjetoAgrupador() == null ? 0 : this.getIdObjetoAgrupador().hashCode());
		result = 37 * result + (getIdColumna() == null ? 0 : this.getIdColumna().hashCode());
		result = 37 * result + (getIdFila() == null ? 0 : this.getIdFila().hashCode());
		result = 37 * result + (getIdEvento() == null ? 0 : this.getIdEvento().hashCode());
		result = 37 * result + (getIdParameterEnvio() == null ? 0 : this.getIdParameterEnvio().hashCode());
		result = 37 * result + (getOrden() == null ? 0 : this.getOrden().hashCode());
		result = 37 * result + (getIdAgrupadorNivelPadre() == null ? 0 : this.getIdAgrupadorNivelPadre().hashCode());
		result = 37 * result + (getSecuenciaValidacion() == null ? 0 : this.getSecuenciaValidacion().hashCode());
		result = 37 * result + (getIdComponente() == null ? 0 : this.getIdComponente().hashCode());
		result = 37 * result + (getIdAtributo() == null ? 0 : this.getIdAtributo().hashCode());
		result = 37 * result + (getTipoValidacion() == null ? 0 : this.getTipoValidacion().hashCode());
		result = 37 * result + (getFlagTipoDato() == null ? 0 : this.getFlagTipoDato().hashCode());
		result = 37 * result + (getValorTexto() == null ? 0 : this.getValorTexto().hashCode());
		result = 37 * result + (getValorNumerico() == null ? 0 : this.getValorNumerico().hashCode());
		result = 37 * result + (getValorDate() == null ? 0 : this.getValorDate().hashCode());
		result = 37 * result + (getSecuenciaValidacionRef() == null ? 0 : this.getSecuenciaValidacionRef().hashCode());
		result = 37 * result + (getEstadoValidacion() == null ? 0 : this.getEstadoValidacion().hashCode());
		result = 37 * result + (getUsuarioCreacion() == null ? 0 : this.getUsuarioCreacion().hashCode());
		result = 37 * result + (getFechaCreacion() == null ? 0 : this.getFechaCreacion().hashCode());
		result = 37 * result + (getUsuarioModificacion() == null ? 0 : this.getUsuarioModificacion().hashCode());
		result = 37 * result + (getFechaModificacion() == null ? 0 : this.getFechaModificacion().hashCode());
		result = 37 * result + (getAccion() == null ? 0 : this.getAccion().hashCode());
		result = 37 * result + (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37 * result + (getNombreComponente() == null ? 0 : this.getNombreComponente().hashCode());
		result = 37 * result + (getTipoComponente() == null ? 0 : this.getTipoComponente().hashCode());
		result = 37 * result + (getEstadoComponente() == null ? 0 : this.getEstadoComponente().hashCode());
		result = 37 * result + (getNombreAtributo() == null ? 0 : this.getNombreAtributo().hashCode());
		result = 37 * result + (getEstadoAtributo() == null ? 0 : this.getEstadoAtributo().hashCode());
		result = 37 * result + (getIdiomaProperty() == null ? 0 : this.getIdiomaProperty().hashCode());
		return result;
	}

}

