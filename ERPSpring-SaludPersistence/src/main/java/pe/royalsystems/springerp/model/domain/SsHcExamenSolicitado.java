package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SS_HC_ExamenSolicitado database table.
 * 
 */
@Entity
@Table(name = "SS_HC_ExamenSolicitado")
public class SsHcExamenSolicitado extends Entidad {
	private static final long serialVersionUID = 1L;
	private SsHcExamenSolicitadoPK id;
	private String accion;
	private Integer cantidad;
	private String codigoComponente;
	private String conceptos;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private Date fechaSolitada;
	private Integer idEspecialidad;
	private Integer idProcedimiento;
	private Integer idTipoExamen;
	private Integer indicadorEPS;
	private String observacion;
	private Integer tipoOrdenAtencion;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private String version;
	
	private List<SsHcExamenSolicitadoInforme> listaSsHcExamenSolicitadoInforme;

	public SsHcExamenSolicitado() {
		id = new SsHcExamenSolicitadoPK();
	}


	@EmbeddedId
	public SsHcExamenSolicitadoPK getId() {
		return this.id;
	}

	public void setId(SsHcExamenSolicitadoPK id) {
		this.id = id;
	}


	@Column(name="Accion")
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}


	@Column(name="Cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	@Column(name="CodigoComponente")
	public String getCodigoComponente() {
		return this.codigoComponente;
	}

	public void setCodigoComponente(String codigoComponente) {
		this.codigoComponente = codigoComponente;
	}


	@Column(name="Conceptos")
	public String getConceptos() {
		return this.conceptos;
	}

	public void setConceptos(String conceptos) {
		this.conceptos = conceptos;
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


	@Column(name="FechaSolitada")
	public Date getFechaSolitada() {
		return this.fechaSolitada;
	}

	public void setFechaSolitada(Date fechaSolitada) {
		this.fechaSolitada = fechaSolitada;
	}


	@Column(name="IdEspecialidad")
	public Integer getIdEspecialidad() {
		return this.idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}


	@Column(name="IdProcedimiento")
	public Integer getIdProcedimiento() {
		return this.idProcedimiento;
	}

	public void setIdProcedimiento(Integer idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}


	@Column(name="IdTipoExamen")
	public Integer getIdTipoExamen() {
		return this.idTipoExamen;
	}

	public void setIdTipoExamen(Integer idTipoExamen) {
		this.idTipoExamen = idTipoExamen;
	}


	@Column(name="IndicadorEPS")
	public Integer getIndicadorEPS() {
		return this.indicadorEPS;
	}

	public void setIndicadorEPS(Integer indicadorEPS) {
		this.indicadorEPS = indicadorEPS;
	}


	@Column(name="Observacion")
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	@Column(name="TipoOrdenAtencion")
	public Integer getTipoOrdenAtencion() {
		return this.tipoOrdenAtencion;
	}

	public void setTipoOrdenAtencion(Integer tipoOrdenAtencion) {
		this.tipoOrdenAtencion = tipoOrdenAtencion;
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

	@Transient
	public List<SsHcExamenSolicitadoInforme> getListaSsHcExamenSolicitadoInforme() {
		return listaSsHcExamenSolicitadoInforme;
	}


	public void setListaSsHcExamenSolicitadoInforme(List<SsHcExamenSolicitadoInforme> listaSsHcExamenSolicitadoInforme) {
		this.listaSsHcExamenSolicitadoInforme = listaSsHcExamenSolicitadoInforme;
	}


	


}