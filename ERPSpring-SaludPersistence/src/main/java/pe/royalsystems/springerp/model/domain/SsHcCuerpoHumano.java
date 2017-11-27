package pe.royalsystems.springerp.model.domain;
// Generated Aug 27, 2015 10:29:28 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SsHcCuerpoHumano generated by hbm2java
 */
@Entity
@Table(name = "SS_HC_CuerpoHumano")
public class SsHcCuerpoHumano extends Entidad implements java.io.Serializable {

	private int idCuerpoHumano;
	private SsHcCuerpoHumano ssHcCuerpoHumano;
	private String codigo;
	private String descripcion;
	private String descripcionIngles;
	private Integer nivel;
	private Character ultimoNivelFlag;
	private String cadenaRecursiva;
	private Integer orden;
	private String icono;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String accion;
	private String nombreTabla;
	private String codigoPadre;
	private Integer tipofolder;
	private Set<SsHcCuerpoHumano> ssHcCuerpoHumanos = new HashSet<SsHcCuerpoHumano>(0);

	public SsHcCuerpoHumano() {
	}

	public SsHcCuerpoHumano(int idCuerpoHumano) {
		this.idCuerpoHumano = idCuerpoHumano;
	}

	public SsHcCuerpoHumano(int idCuerpoHumano, SsHcCuerpoHumano ssHcCuerpoHumano, String codigo, String descripcion,
			String descripcionIngles, Integer nivel, Character ultimoNivelFlag, String cadenaRecursiva, Integer orden,
			String icono, Integer estado, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion,
			Date fechaModificacion, String accion, String nombreTabla, String codigoPadre, Integer tipofolder,
			Set<SsHcCuerpoHumano> ssHcCuerpoHumanos) {
		this.idCuerpoHumano = idCuerpoHumano;
		this.ssHcCuerpoHumano = ssHcCuerpoHumano;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.descripcionIngles = descripcionIngles;
		this.nivel = nivel;
		this.ultimoNivelFlag = ultimoNivelFlag;
		this.cadenaRecursiva = cadenaRecursiva;
		this.orden = orden;
		this.icono = icono;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.accion = accion;
		this.nombreTabla = nombreTabla;
		this.codigoPadre = codigoPadre;
		this.tipofolder = tipofolder;
		this.ssHcCuerpoHumanos = ssHcCuerpoHumanos;
	}

	@Id

	@Column(name = "IdCuerpoHumano", unique = true, nullable = false)
	public int getIdCuerpoHumano() {
		return this.idCuerpoHumano;
	}

	public void setIdCuerpoHumano(int idCuerpoHumano) {
		this.idCuerpoHumano = idCuerpoHumano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdCuerpoHumanoPadre")
	public SsHcCuerpoHumano getSsHcCuerpoHumano() {
		return this.ssHcCuerpoHumano;
	}

	public void setSsHcCuerpoHumano(SsHcCuerpoHumano ssHcCuerpoHumano) {
		this.ssHcCuerpoHumano = ssHcCuerpoHumano;
	}

	@Column(name = "Codigo", length = 20)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "Descripcion", length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "DescripcionIngles", length = 100)
	public String getDescripcionIngles() {
		return this.descripcionIngles;
	}

	public void setDescripcionIngles(String descripcionIngles) {
		this.descripcionIngles = descripcionIngles;
	}

	@Column(name = "Nivel")
	public Integer getNivel() {
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Column(name = "UltimoNivelFlag", length = 1)
	public Character getUltimoNivelFlag() {
		return this.ultimoNivelFlag;
	}

	public void setUltimoNivelFlag(Character ultimoNivelFlag) {
		this.ultimoNivelFlag = ultimoNivelFlag;
	}

	@Column(name = "CadenaRecursiva", length = 100)
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

	@Column(name = "Icono", length = 100)
	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
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

	@Column(name = "ACCION", length = 30)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Column(name = "NombreTabla", length = 100)
	public String getNombreTabla() {
		return this.nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	@Column(name = "CodigoPadre", length = 30)
	public String getCodigoPadre() {
		return this.codigoPadre;
	}

	public void setCodigoPadre(String codigoPadre) {
		this.codigoPadre = codigoPadre;
	}

	@Column(name = "tipofolder")
	public Integer getTipofolder() {
		return this.tipofolder;
	}

	public void setTipofolder(Integer tipofolder) {
		this.tipofolder = tipofolder;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ssHcCuerpoHumano")
	public Set<SsHcCuerpoHumano> getSsHcCuerpoHumanos() {
		return this.ssHcCuerpoHumanos;
	}

	public void setSsHcCuerpoHumanos(Set<SsHcCuerpoHumano> ssHcCuerpoHumanos) {
		this.ssHcCuerpoHumanos = ssHcCuerpoHumanos;
	}

}
