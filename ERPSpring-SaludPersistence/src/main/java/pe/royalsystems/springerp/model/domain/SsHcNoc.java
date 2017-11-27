package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SS_HC_NOC")
public class SsHcNoc extends Entidad implements java.io.Serializable {

	private int idNoc;
	private String version;
	private Integer idNocpadre;
	private String codigo;
	private String codigoPadre;
	private String descripcion;
	private String descripcionCorta;
	private Integer tipoNive4;
	private Integer nivel;
	private String cadenaRecursiva;
	private Integer orden;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String accion;

	public SsHcNoc() {
	}

	public SsHcNoc(int idNoc) {
		this.idNoc = idNoc;
	}

	public SsHcNoc(int idNoc, Integer idNocpadre, String codigo, String codigoPadre, String descripcion,
			String descripcionCorta, Integer tipoNive4, Integer nivel, String cadenaRecursiva, Integer orden,
			Integer estado, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion,
			Date fechaModificacion, String accion) {
		this.idNoc = idNoc;
		this.idNocpadre = idNocpadre;
		this.codigo = codigo;
		this.codigoPadre = codigoPadre;
		this.descripcion = descripcion;
		this.descripcionCorta = descripcionCorta;
		this.tipoNive4 = tipoNive4;
		this.nivel = nivel;
		this.cadenaRecursiva = cadenaRecursiva;
		this.orden = orden;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.accion = accion;
	}

	@Id

	@Column(name = "IdNOC", unique = true, nullable = false)
	public int getIdNoc() {
		return this.idNoc;
	}

	public void setIdNoc(int idNoc) {
		this.idNoc = idNoc;
	}

	@Column(name = "Version", length = 25)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "IdNOCPadre")
	public Integer getIdNocpadre() {
		return this.idNocpadre;
	}

	public void setIdNocpadre(Integer idNocpadre) {
		this.idNocpadre = idNocpadre;
	}

	@Column(name = "Codigo", length = 10)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "CodigoPadre", length = 10)
	public String getCodigoPadre() {
		return this.codigoPadre;
	}

	public void setCodigoPadre(String codigoPadre) {
		this.codigoPadre = codigoPadre;
	}

	@Column(name = "Descripcion", length = 300)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "DescripcionCorta", length = 100)
	public String getDescripcionCorta() {
		return this.descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	@Column(name = "TipoNive4")
	public Integer getTipoNive4() {
		return this.tipoNive4;
	}

	public void setTipoNive4(Integer tipoNive4) {
		this.tipoNive4 = tipoNive4;
	}

	@Column(name = "Nivel")
	public Integer getNivel() {
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Column(name = "CadenaRecursiva", length = 150)
	public String getCadenaRecursiva() {
		return this.cadenaRecursiva;
	}

	public void setCadenaRecursiva(String cadenaRecursiva) {
		this.cadenaRecursiva = cadenaRecursiva;
	}

	@Column(name = "Orden")
	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
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

}

