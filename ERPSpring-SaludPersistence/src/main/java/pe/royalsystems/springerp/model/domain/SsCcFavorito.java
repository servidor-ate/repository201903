package pe.royalsystems.springerp.model.domain;

import java.util.Date;
import javax.persistence.*;


/**
 * The persistent class for the SS_CC_Favorito database table.
 * 
 */
@Entity
@Table(name="SS_CC_Favorito")
public class SsCcFavorito extends Entidad{
	private static final long serialVersionUID = 1L;
	private Integer idFavorito;
	private String codigoTablaFavorito;
	private String descripcion;
	private String estado;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private Integer idAgente;
	private String tipoFavorito;
	private String usuarioCreacion;
	private String usuarioModificacion;

	public SsCcFavorito() {
	}


	@Id
	@Column(name="IdFavorito")
	public Integer getIdFavorito() {
		return this.idFavorito;
	}

	public void setIdFavorito(Integer idFavorito) {
		this.idFavorito = idFavorito;
	}


	@Column(name="CodigoTablaFavorito")
	public String getCodigoTablaFavorito() {
		return this.codigoTablaFavorito;
	}

	public void setCodigoTablaFavorito(String codigoTablaFavorito) {
		this.codigoTablaFavorito = codigoTablaFavorito;
	}


	@Column(name="Descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Column(name="Estado")
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
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


	@Column(name="IdAgente")
	public Integer getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}


	@Column(name="TipoFavorito")
	public String getTipoFavorito() {
		return this.tipoFavorito;
	}

	public void setTipoFavorito(String tipoFavorito) {
		this.tipoFavorito = tipoFavorito;
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