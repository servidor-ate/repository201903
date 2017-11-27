package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SS_HC_Formato",   uniqueConstraints = @UniqueConstraint(columnNames = "CodigoFormato") )
public class SsHcFormato extends Entidad implements java.io.Serializable {

	private int idFormato;
	private String version;
	private Integer idFormatoPadre;
	private String codigoFormato;
	private String codigoFormatoPadre;
	private String cadenaRecursividad;
	private Integer nivel;
	private String descripcion;
	private String descripcionExtranjera;
	private Integer tipoFormato;
	private String versionFormatoFijo;
	private Integer idFormatoDinamico;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String accion;
	private String modulo;
	private Set<SsHcFormatoCampo> ssHcFormatoCampos = new HashSet<SsHcFormatoCampo>(0);

	public SsHcFormato() {
	}

	public SsHcFormato(int idFormato, String codigoFormato) {
		this.idFormato = idFormato;
		this.codigoFormato = codigoFormato;
	}

	public SsHcFormato(int idFormato, Integer idFormatoPadre, String codigoFormato, String codigoFormatoPadre,
			String cadenaRecursividad, Integer nivel, String descripcion, String descripcionExtranjera,
			Integer tipoFormato, String versionFormatoFijo, Integer idFormatoDinamico, Integer estado,
			String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion,
			String accion, String modulo, Set<SsHcFormatoCampo> ssHcFormatoCampos) {
		this.idFormato = idFormato;
		this.idFormatoPadre = idFormatoPadre;
		this.codigoFormato = codigoFormato;
		this.codigoFormatoPadre = codigoFormatoPadre;
		this.cadenaRecursividad = cadenaRecursividad;
		this.nivel = nivel;
		this.descripcion = descripcion;
		this.descripcionExtranjera = descripcionExtranjera;
		this.tipoFormato = tipoFormato;
		this.versionFormatoFijo = versionFormatoFijo;
		this.idFormatoDinamico = idFormatoDinamico;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.accion = accion;
		this.modulo = modulo;
		this.ssHcFormatoCampos = ssHcFormatoCampos;
	}

	@Id

	@Column(name = "IdFormato", unique = true, nullable = false)
	public int getIdFormato() {
		return this.idFormato;
	}

	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}

	@Column(name = "Version", length = 50)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
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

	@Column(name = "CadenaRecursividad", length = 150)
	public String getCadenaRecursividad() {
		return this.cadenaRecursividad;
	}

	public void setCadenaRecursividad(String cadenaRecursividad) {
		this.cadenaRecursividad = cadenaRecursividad;
	}

	@Column(name = "Nivel")
	public Integer getNivel() {
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Column(name = "Descripcion", length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "DescripcionExtranjera", length = 100)
	public String getDescripcionExtranjera() {
		return this.descripcionExtranjera;
	}

	public void setDescripcionExtranjera(String descripcionExtranjera) {
		this.descripcionExtranjera = descripcionExtranjera;
	}

	@Column(name = "TipoFormato")
	public Integer getTipoFormato() {
		return this.tipoFormato;
	}

	public void setTipoFormato(Integer tipoFormato) {
		this.tipoFormato = tipoFormato;
	}

	@Column(name = "VersionFormatoFijo", length = 250)
	public String getVersionFormatoFijo() {
		return this.versionFormatoFijo;
	}

	public void setVersionFormatoFijo(String versionFormatoFijo) {
		this.versionFormatoFijo = versionFormatoFijo;
	}

	@Column(name = "IdFormatoDinamico")
	public Integer getIdFormatoDinamico() {
		return this.idFormatoDinamico;
	}

	public void setIdFormatoDinamico(Integer idFormatoDinamico) {
		this.idFormatoDinamico = idFormatoDinamico;
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

	@Column(name = "Accion", length = 50)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Column(name = "Modulo", length = 2)
	public String getModulo() {
		return this.modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ssHcFormato")
	public Set<SsHcFormatoCampo> getSsHcFormatoCampos() {
		return this.ssHcFormatoCampos;
	}

	public void setSsHcFormatoCampos(Set<SsHcFormatoCampo> ssHcFormatoCampos) {
		this.ssHcFormatoCampos = ssHcFormatoCampos;
	}


}
