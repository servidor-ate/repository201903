package pe.royalsystems.springerp.model.domain;

import java.text.DecimalFormat;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "VW_SS_HC_TABLAFORMATO_VALIDACION")
public class VwSsHcTablaformatoValidacion implements java.io.Serializable {

	private VwSsHcTablaformatoValidacionId id;

	public VwSsHcTablaformatoValidacion() {
	}

	public VwSsHcTablaformatoValidacion(VwSsHcTablaformatoValidacionId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idFormato", column = @Column(name = "IdFormato", nullable = false) ),
			@AttributeOverride(name = "formatoNivelId", column = @Column(name = "FormatoNivelID") ),
			@AttributeOverride(name = "idFormatoPadre", column = @Column(name = "IdFormatoPadre") ),
			@AttributeOverride(name = "codigoFormato", column = @Column(name = "CodigoFormato", nullable = false, length = 20) ),
			@AttributeOverride(name = "codigoFormatoPadre", column = @Column(name = "CodigoFormatoPadre", length = 20) ),
			@AttributeOverride(name = "descripcionFormato", column = @Column(name = "DescripcionFormato", length = 100) ),
			@AttributeOverride(name = "tipoFormato", column = @Column(name = "TipoFormato") ),
			@AttributeOverride(name = "estadoFormato", column = @Column(name = "EstadoFormato") ),
			@AttributeOverride(name = "idFavoritoTabla", column = @Column(name = "IdFavoritoTabla", nullable = false) ),
			@AttributeOverride(name = "nombreTabla", column = @Column(name = "NombreTabla", length = 128) ),
			@AttributeOverride(name = "descripcionTabla", column = @Column(name = "DescripcionTabla", length = 100) ),
			@AttributeOverride(name = "tipoTabla", column = @Column(name = "TipoTabla") ),
			@AttributeOverride(name = "estadoTabla", column = @Column(name = "EstadoTabla") ),
			@AttributeOverride(name = "idCampo", column = @Column(name = "IdCampo", nullable = false) ),
			@AttributeOverride(name = "nombreCampo", column = @Column(name = "NombreCampo", length = 128) ),
			@AttributeOverride(name = "descripcionCampo", column = @Column(name = "DescripcionCampo", length = 100) ),
			@AttributeOverride(name = "tipoCampo", column = @Column(name = "TipoCampo") ),
			@AttributeOverride(name = "longitud", column = @Column(name = "Longitud") ),
			@AttributeOverride(name = "decimales", column = @Column(name = "Decimales") ),
			@AttributeOverride(name = "estadoTablaCampo", column = @Column(name = "EstadoTablaCampo") ),
			@AttributeOverride(name = "secuenciaCampo", column = @Column(name = "SecuenciaCampo", nullable = false) ),
			@AttributeOverride(name = "idSeccionFormato", column = @Column(name = "IdSeccionFormato") ),
			@AttributeOverride(name = "valorPorDefecto", column = @Column(name = "ValorPorDefecto", length = 100) ),
			@AttributeOverride(name = "indicadorObligatorio", column = @Column(name = "IndicadorObligatorio") ),
			@AttributeOverride(name = "indicadorCampoCalculado", column = @Column(name = "IndicadorCampoCalculado") ),
			@AttributeOverride(name = "formula", column = @Column(name = "Formula", length = 500) ),
			@AttributeOverride(name = "indicadorValoresVarios", column = @Column(name = "IndicadorValoresVarios") ),
			@AttributeOverride(name = "tablaValoresVarios", column = @Column(name = "TablaValoresVarios", length = 15) ),
			@AttributeOverride(name = "indicadorRango", column = @Column(name = "IndicadorRango") ),
			@AttributeOverride(name = "rangoDesde", column = @Column(name = "RangoDesde", precision = 20, scale = 6) ),
			@AttributeOverride(name = "rangoHasta", column = @Column(name = "RangoHasta", precision = 20, scale = 6) ),
			@AttributeOverride(name = "indicadorReglaNegocio", column = @Column(name = "IndicadorReglaNegocio", length = 10) ),
			@AttributeOverride(name = "reglaNegocio", column = @Column(name = "ReglaNegocio", length = 100) ),
			@AttributeOverride(name = "observaciones", column = @Column(name = "Observaciones", length = 500) ),
			@AttributeOverride(name = "estadoFormatoCampo", column = @Column(name = "EstadoFormatoCampo") ),
			@AttributeOverride(name = "idConcepto", column = @Column(name = "IdConcepto") ),
			@AttributeOverride(name = "idAgrupadorNivel", column = @Column(name = "IdAgrupadorNivel") ),
			@AttributeOverride(name = "idObjetoAgrupador", column = @Column(name = "IdObjetoAgrupador") ),
			@AttributeOverride(name = "idColumna", column = @Column(name = "IdColumna") ),
			@AttributeOverride(name = "idFila", column = @Column(name = "IdFila") ),
			@AttributeOverride(name = "idEvento", column = @Column(name = "IdEvento") ),
			@AttributeOverride(name = "idParameterEnvio", column = @Column(name = "IdParameterEnvio") ),
			@AttributeOverride(name = "orden", column = @Column(name = "Orden") ),
			@AttributeOverride(name = "idAgrupadorNivelPadre", column = @Column(name = "IdAgrupadorNivelPadre") ),
			@AttributeOverride(name = "secuenciaValidacion", column = @Column(name = "SecuenciaValidacion") ),
			@AttributeOverride(name = "idComponente", column = @Column(name = "IdComponente") ),
			@AttributeOverride(name = "idAtributo", column = @Column(name = "IdAtributo") ),
			@AttributeOverride(name = "tipoValidacion", column = @Column(name = "TipoValidacion", length = 10) ),
			@AttributeOverride(name = "flagTipoDato", column = @Column(name = "FlagTipoDato", length = 1) ),
			@AttributeOverride(name = "valorTexto", column = @Column(name = "ValorTexto", length = 200) ),
			@AttributeOverride(name = "valorNumerico", column = @Column(name = "ValorNumerico", precision = 10) ),
			@AttributeOverride(name = "valorDate", column = @Column(name = "ValorDate", length = 23) ),
			@AttributeOverride(name = "secuenciaValidacionRef", column = @Column(name = "SecuenciaValidacionRef") ),
			@AttributeOverride(name = "estadoValidacion", column = @Column(name = "EstadoValidacion") ),
			@AttributeOverride(name = "usuarioCreacion", column = @Column(name = "UsuarioCreacion", length = 25) ),
			@AttributeOverride(name = "fechaCreacion", column = @Column(name = "FechaCreacion", length = 23) ),
			@AttributeOverride(name = "usuarioModificacion", column = @Column(name = "UsuarioModificacion", length = 25) ),
			@AttributeOverride(name = "fechaModificacion", column = @Column(name = "FechaModificacion", length = 23) ),
			@AttributeOverride(name = "accion", column = @Column(name = "Accion", length = 25) ),
			@AttributeOverride(name = "version", column = @Column(name = "Version", length = 25) ),
			@AttributeOverride(name = "nombreComponente", column = @Column(name = "NombreComponente", length = 200) ),
			@AttributeOverride(name = "tipoComponente", column = @Column(name = "TipoComponente", length = 10) ),
			@AttributeOverride(name = "estadoComponente", column = @Column(name = "EstadoComponente") ),
			@AttributeOverride(name = "nombreAtributo", column = @Column(name = "NombreAtributo", length = 200) ),
			@AttributeOverride(name = "estadoAtributo", column = @Column(name = "EstadoAtributo") ),
			@AttributeOverride(name = "idiomaProperty", column = @Column(name = "IdiomaProperty", length = 20) ) })
	public VwSsHcTablaformatoValidacionId getId() {
		return this.id;
	}

	public void setId(VwSsHcTablaformatoValidacionId id) {
		this.id = id;
	}

}

