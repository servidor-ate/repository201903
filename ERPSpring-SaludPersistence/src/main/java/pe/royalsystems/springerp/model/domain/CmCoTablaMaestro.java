package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mamania on 04/09/2015.
 */
@Entity
@Table(name = "CM_CO_TablaMaestro")
public class CmCoTablaMaestro extends  Entidad {
    private int idTablaMaestro;
    private String codigoTabla;
    private String nombre;
    private String descripcion;
    private String version;
    private Integer estado;
    private String usuarioCreacion;
    private Timestamp fechaCreacion;
    private String usuarioModificacion;
    private Timestamp fechaModificacion;
    private String accion;

    @Id
    @Column(name = "IdTablaMaestro")
    public int getIdTablaMaestro() {
        return idTablaMaestro;
    }

    public void setIdTablaMaestro(int idTablaMaestro) {
        this.idTablaMaestro = idTablaMaestro;
    }

    @Basic
    @Column(name = "CodigoTabla")
    public String getCodigoTabla() {
        return codigoTabla;
    }

    public void setCodigoTabla(String codigoTabla) {
        this.codigoTabla = codigoTabla;
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
    @Column(name = "Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
    @Column(name = "Accion")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmCoTablaMaestro that = (CmCoTablaMaestro) o;

        if (idTablaMaestro != that.idTablaMaestro) return false;
        if (codigoTabla != null ? !codigoTabla.equals(that.codigoTabla) : that.codigoTabla != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(that.usuarioCreacion) : that.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(that.usuarioModificacion) : that.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(that.fechaModificacion) : that.fechaModificacion != null)
            return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTablaMaestro;
        result = 31 * result + (codigoTabla != null ? codigoTabla.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        return result;
    }
}
