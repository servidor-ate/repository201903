package pe.royalsystems.springerp.model.domain.vista;

import java.util.Date;

import javax.persistence.*;

import pe.royalsystems.springerp.model.domain.Entidad;



/**
 * The persistent class for the VW_TABLAMAESTRODETALLE database table.
 * 
 */
@Entity
@Table(name="VW_TABLAMAESTRODETALLE")
public class VwTablamaestrodetalle extends Entidad {
	private static final Long serialVersionUID = 1L;
	private String codigo;
	private String codigoTabla;
	private String descripcionMaestro;
	private String descripcionMaestroDet;
	private Integer estadoMaestro;
	private Integer estadoMaestroDet;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private Integer idCodigo;
	private Integer idTablaMaestro;
	private String nombreMaestro;
	private String nombreMaestroDet;
	private Long numeroFila;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private String version;

	public VwTablamaestrodetalle() {
	}


	@Column(name="Codigo")
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Column(name="CodigoTabla")
	public String getCodigoTabla() {
		return this.codigoTabla;
	}

	public void setCodigoTabla(String codigoTabla) {
		this.codigoTabla = codigoTabla;
	}


	@Column(name="DescripcionMaestro")
	public String getDescripcionMaestro() {
		return this.descripcionMaestro;
	}

	public void setDescripcionMaestro(String descripcionMaestro) {
		this.descripcionMaestro = descripcionMaestro;
	}


	@Column(name="DescripcionMaestroDet")
	public String getDescripcionMaestroDet() {
		return this.descripcionMaestroDet;
	}

	public void setDescripcionMaestroDet(String descripcionMaestroDet) {
		this.descripcionMaestroDet = descripcionMaestroDet;
	}


	@Column(name="EstadoMaestro")
	public Integer getEstadoMaestro() {
		return this.estadoMaestro;
	}

	public void setEstadoMaestro(Integer estadoMaestro) {
		this.estadoMaestro = estadoMaestro;
	}


	@Column(name="EstadoMaestroDet")
	public Integer getEstadoMaestroDet() {
		return this.estadoMaestroDet;
	}

	public void setEstadoMaestroDet(Integer estadoMaestroDet) {
		this.estadoMaestroDet = estadoMaestroDet;
	}


	@Column(name="FechaCreacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="FechaModificacion")
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	@Column(name="IdCodigo")
	public Integer getIdCodigo() {
		return this.idCodigo;
	}

	public void setIdCodigo(Integer idCodigo) {
		this.idCodigo = idCodigo;
	}


	@Column(name="IdTablaMaestro")
	public Integer getIdTablaMaestro() {
		return this.idTablaMaestro;
	}

	public void setIdTablaMaestro(Integer idTablaMaestro) {
		this.idTablaMaestro = idTablaMaestro;
	}


	@Column(name="NombreMaestro")
	public String getNombreMaestro() {
		return this.nombreMaestro;
	}

	public void setNombreMaestro(String nombreMaestro) {
		this.nombreMaestro = nombreMaestro;
	}


	@Column(name="NombreMaestroDet")
	public String getNombreMaestroDet() {
		return this.nombreMaestroDet;
	}

	public void setNombreMaestroDet(String nombreMaestroDet) {
		this.nombreMaestroDet = nombreMaestroDet;
	}

	@Id
	@Column(name="NumeroFila")
	public Long getNumeroFila() {
		return this.numeroFila;
	}

	public void setNumeroFila(Long numeroFila) {
		this.numeroFila = numeroFila;
	}


	@Column(name="UsuarioCreacion")
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}


	@Column(name="UsuarioModificacion")
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}


	@Column(name="Version")
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}