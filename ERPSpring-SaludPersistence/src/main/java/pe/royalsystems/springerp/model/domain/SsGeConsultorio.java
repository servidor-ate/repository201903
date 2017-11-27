package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

/**
 * Created by mamania on 04/10/2016.
 */
@Entity
@Table(name = "SS_GE_Consultorio")
public class SsGeConsultorio extends Entidad{

	private static final long serialVersionUID = 1L;
	private Integer idConsultorio;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Integer idUbicacion;
    private String anexo;
    private Integer tipoUso;
    private Integer estado;
    private String usuarioCreacion;
    private Timestamp fechaCreacion;
    private String usuarioModificacion;
    private Timestamp fechaModificacion;
    private Integer tipolocal;
    private Integer pool;
    private String nombreCompleto;
    
    private String compania;
    private String unidadNegocio;
    private String sucursal;
    private String unidadReplicacion;
    private Integer tipoHabitacion;

    @Id
    @Basic
    @Column(name = "IdConsultorio")
    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    @Basic
    @Column(name = "Codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IdUbicacion")
    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    @Basic
    @Column(name = "Anexo")
    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    @Basic
    @Column(name = "TipoUso")
    public Integer getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(Integer tipoUso) {
        this.tipoUso = tipoUso;
    }

    @Basic
    @Column(name = "Estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "UsuarioCreacion")
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Basic
    @Column(name = "FechaCreacion")
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "UsuarioModificacion")
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Basic
    @Column(name = "FechaModificacion")
    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Basic
    @Column(name = "Tipolocal")
    public Integer getTipolocal() {
        return tipolocal;
    }

    public void setTipolocal(Integer tipolocal) {
        this.tipolocal = tipolocal;
    }

    @Basic
    @Column(name = "Pool")
    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    @Basic
    @Column(name = "NombreCompleto")
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Basic
    @Column(name = "UnidadReplicacion")
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }
    
    @Basic
    @Column(name = "Compania")
    public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

    @Basic
    @Column(name = "UnidadNegocio")
	public String getUnidadNegocio() {
		return unidadNegocio;
	}

	public void setUnidadNegocio(String unidadNegocio) {
		this.unidadNegocio = unidadNegocio;
	}

    @Basic
    @Column(name = "Sucursal")
	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

    @Basic
    @Column(name = "TipoHabitacion")
	public Integer getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(Integer tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsGeConsultorio that = (SsGeConsultorio) o;

        if (idConsultorio != that.idConsultorio) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (idUbicacion != null ? !idUbicacion.equals(that.idUbicacion) : that.idUbicacion != null) return false;
        if (anexo != null ? !anexo.equals(that.anexo) : that.anexo != null) return false;
        if (tipoUso != null ? !tipoUso.equals(that.tipoUso) : that.tipoUso != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(that.usuarioCreacion) : that.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(that.usuarioModificacion) : that.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(that.fechaModificacion) : that.fechaModificacion != null)
            return false;
        if (tipolocal != null ? !tipolocal.equals(that.tipolocal) : that.tipolocal != null) return false;
        if (pool != null ? !pool.equals(that.pool) : that.pool != null) return false;
        if (nombreCompleto != null ? !nombreCompleto.equals(that.nombreCompleto) : that.nombreCompleto != null)
            return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idConsultorio;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (idUbicacion != null ? idUbicacion.hashCode() : 0);
        result = 31 * result + (anexo != null ? anexo.hashCode() : 0);
        result = 31 * result + (tipoUso != null ? tipoUso.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (tipolocal != null ? tipolocal.hashCode() : 0);
        result = 31 * result + (pool != null ? pool.hashCode() : 0);
        result = 31 * result + (nombreCompleto != null ? nombreCompleto.hashCode() : 0);
        result = 31 * result + (unidadReplicacion != null ? unidadReplicacion.hashCode() : 0);
        return result;
    }
}
