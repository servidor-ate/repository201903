package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * The persistent class for the GE_DiaFeriado database table.
 * 
 */
@Entity
public class GE_DiaFeriado extends Entidad {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IdDiaFeriado")
	private Integer idDiaFeriado;

	@Column(name="Descripcion")
	private String descripcion;

	@Column(name="Estado")
	private Integer estado;

	@Column(name="Fecha")
	private Date fecha;

	@Column(name="FechaCreacion")
	private Date fechaCreacion;

	@Column(name="FechaModificacion")
	private Date fechaModificacion;

	@Column(name="UsuarioCreacion")
	private String usuarioCreacion;

	@Column(name="UsuarioModificacion")
	private String usuarioModificacion;

	public GE_DiaFeriado() {
	}

	public Integer getIdDiaFeriado() {
		return this.idDiaFeriado;
	}

	public void setIdDiaFeriado(Integer idDiaFeriado) {
		this.idDiaFeriado = idDiaFeriado;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

}