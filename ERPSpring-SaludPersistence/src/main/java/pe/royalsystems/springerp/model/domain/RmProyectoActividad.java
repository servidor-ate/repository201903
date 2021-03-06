package pe.royalsystems.springerp.model.domain;
// default package
// Generated Oct 13, 2015 1:11:12 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RmProyectoActividad generated by hbm2java
 */
@Entity
@Table(name = "RM_ProyectoActividad", schema = "dbo", catalog = "WebCoreManager")
public class RmProyectoActividad extends Entidad implements java.io.Serializable {

	private RmProyectoActividadId id;

	public RmProyectoActividad() {
	}

	public RmProyectoActividad(RmProyectoActividadId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "proyecto", column = @Column(name = "Proyecto", nullable = false, length = 15) ),
			@AttributeOverride(name = "centroCosto", column = @Column(name = "CentroCosto", nullable = false, length = 10) ),
			@AttributeOverride(name = "usuarioSupervisor", column = @Column(name = "UsuarioSupervisor", nullable = false, length = 20) ),
			@AttributeOverride(name = "actividad", column = @Column(name = "Actividad", nullable = false, length = 3) ),
			@AttributeOverride(name = "ultimoUsuario", column = @Column(name = "UltimoUsuario", nullable = false, length = 20) ),
			@AttributeOverride(name = "ultimaFechaModif", column = @Column(name = "UltimaFechaModif", nullable = false, length = 23) ),
			@AttributeOverride(name = "numeroHoras", column = @Column(name = "NumeroHoras") ) })
	public RmProyectoActividadId getId() {
		return this.id;
	}

	public void setId(RmProyectoActividadId id) {
		this.id = id;
	}

}
