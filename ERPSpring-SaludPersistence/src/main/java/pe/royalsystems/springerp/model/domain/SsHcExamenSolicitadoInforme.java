package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the SS_HC_ExamenSolicitadoInforme database table.
 * 
 */
@Entity
@Table(name = "SS_HC_ExamenSolicitadoInforme")
public class SsHcExamenSolicitadoInforme extends  Entidad {
	private static final long serialVersionUID = 1L;
	private SsHcExamenSolicitadoInformePK id;
	private String accion;
	private Integer estado;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private String nombre;
	private String rutaInforme;
	private String usuarioCreacion;
	private String usuarioModificacion;

	public SsHcExamenSolicitadoInforme() {
		id  = new SsHcExamenSolicitadoInformePK();
	}


	@EmbeddedId
	public SsHcExamenSolicitadoInformePK getId() {
		return this.id;
	}

	public void setId(SsHcExamenSolicitadoInformePK id) {
		this.id = id;
	}


	@Column(name="ACCION")
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}


	@Column(name="Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
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


	@Column(name="Nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Column(name="RutaInforme")
	public String getRutaInforme() {
		return this.rutaInforme;
	}

	public void setRutaInforme(String rutaInforme) {
		this.rutaInforme = rutaInforme;
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

}