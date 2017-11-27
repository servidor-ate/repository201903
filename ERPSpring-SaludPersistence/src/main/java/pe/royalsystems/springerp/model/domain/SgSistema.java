package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mamania on 08/05/2017.
 */
@Entity
@Table(name = "SG_Sistema" )
public class SgSistema extends Entidad {
    private String sistema;
    private String nombre;
    private String descripcion;
    private Integer plataforma;
    private String urlSistema;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;

    @Id
    @Column(name = "Sistema")
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
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
    @Column(name = "Plataforma")
    public Integer getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Integer plataforma) {
        this.plataforma = plataforma;
    }

    @Basic
    @Column(name = "UrlSistema")
    public String getUrlSistema() {
        return urlSistema;
    }

    public void setUrlSistema(String urlSistema) {
        this.urlSistema = urlSistema;
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
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
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
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgSistema sgSistema = (SgSistema) o;

        if (sistema != null ? !sistema.equals(sgSistema.sistema) : sgSistema.sistema != null) return false;
        if (nombre != null ? !nombre.equals(sgSistema.nombre) : sgSistema.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(sgSistema.descripcion) : sgSistema.descripcion != null)
            return false;
        if (plataforma != null ? !plataforma.equals(sgSistema.plataforma) : sgSistema.plataforma != null) return false;
        if (urlSistema != null ? !urlSistema.equals(sgSistema.urlSistema) : sgSistema.urlSistema != null) return false;
        if (estado != null ? !estado.equals(sgSistema.estado) : sgSistema.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(sgSistema.usuarioCreacion) : sgSistema.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(sgSistema.fechaCreacion) : sgSistema.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(sgSistema.usuarioModificacion) : sgSistema.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(sgSistema.fechaModificacion) : sgSistema.fechaModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sistema != null ? sistema.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (plataforma != null ? plataforma.hashCode() : 0);
        result = 31 * result + (urlSistema != null ? urlSistema.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        return result;
    }
}
