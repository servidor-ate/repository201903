package pe.royalsystems.springerp.model.domain;
// default package
// Generated Sep 23, 2015 5:19:40 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SsHcIndicaciones generated by hbm2java
 */
@Entity
@Table(name = "SS_HC_Indicaciones")
public class SsHcIndicaciones extends Entidad{

	/**
	 * 
	 */
	private static final long serialVersionUID = -785716470908868476L;
	private SsHcIndicacionesId id;
	private String version;
	private SsHcMedicamento ssHcMedicamento;
	private String tipoRegistro;
	private Integer correlativo;
	private Integer idTipoIndicacion;
	private String descripcion;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String accion;

	public SsHcIndicaciones() {
		id = new SsHcIndicacionesId();
	}

	public SsHcIndicaciones(SsHcIndicacionesId id, SsHcMedicamento ssHcMedicamento) {
		this.id = id;
		this.ssHcMedicamento = ssHcMedicamento;
	}

	public SsHcIndicaciones(SsHcIndicacionesId id, SsHcMedicamento ssHcMedicamento, String tipoRegistro,
			Integer correlativo, Integer idTipoIndicacion, String descripcion, Integer estado, String usuarioCreacion,
			Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, String accion) {
		this.id = id;
		this.ssHcMedicamento = ssHcMedicamento;
		this.tipoRegistro = tipoRegistro;
		this.correlativo = correlativo;
		this.idTipoIndicacion = idTipoIndicacion;
		this.descripcion = descripcion;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.accion = accion;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "unidadReplicacion", column = @Column(name = "UnidadReplicacion", nullable = false, length = 4) ),
			@AttributeOverride(name = "idEpisodioAtencion", column = @Column(name = "IdEpisodioAtencion", nullable = false) ),
			@AttributeOverride(name = "idPaciente", column = @Column(name = "IdPaciente", nullable = false) ),
			@AttributeOverride(name = "episodioClinico", column = @Column(name = "EpisodioClinico", nullable = false) ),
			@AttributeOverride(name = "secuenciaMedicamento", column = @Column(name = "SecuenciaMedicamento", nullable = false) ),
			@AttributeOverride(name = "secuencia", column = @Column(name = "Secuencia", nullable = false) ) })
	public SsHcIndicacionesId getId() {
		return this.id;
	}

	public void setId(SsHcIndicacionesId id) {
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
	@JoinColumns({
			@JoinColumn(name = "UnidadReplicacion", referencedColumnName = "UnidadReplicacion", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "IdEpisodioAtencion", referencedColumnName = "IdEpisodioAtencion", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "IdPaciente", referencedColumnName = "IdPaciente", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EpisodioClinico", referencedColumnName = "EpisodioClinico", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SecuenciaMedicamento", referencedColumnName = "Secuencia", nullable = false, insertable = false, updatable = false) })
	public SsHcMedicamento getSsHcMedicamento() {
		return this.ssHcMedicamento;
	}

	public void setSsHcMedicamento(SsHcMedicamento ssHcMedicamento) {
		this.ssHcMedicamento = ssHcMedicamento;
	}

	@Column(name = "TipoRegistro", length = 1)
	public String getTipoRegistro() {
		return this.tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	@Column(name = "Correlativo")
	public Integer getCorrelativo() {
		return this.correlativo;
	}

	public void setCorrelativo(Integer correlativo) {
		this.correlativo = correlativo;
	}

	@Column(name = "IdTipoIndicacion")
	public Integer getIdTipoIndicacion() {
		return this.idTipoIndicacion;
	}

	public void setIdTipoIndicacion(Integer idTipoIndicacion) {
		this.idTipoIndicacion = idTipoIndicacion;
	}

	@Column(name = "Descripcion", length = 150)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
