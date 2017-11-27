package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mamania on 08/05/2017.
 */
@Entity
@Table(name = "SG_Modulo" )
@IdClass(SgModuloPK.class)
public class SgModulo extends Entidad{
    private String sistema;
    private String modulo;
    private Integer orden;
    private String nombre;
    private String descripcion;
    private Integer plataforma;
    private String urlModulo;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private String accion;

    @Id
    @Column(name = "Sistema")
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Id
    @Column(name = "Modulo")
    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Basic
    @Column(name = "Orden")
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
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
    @Column(name = "UrlModulo")
    public String getUrlModulo() {
        return urlModulo;
    }

    public void setUrlModulo(String urlModulo) {
        this.urlModulo = urlModulo;
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

        SgModulo sgModulo = (SgModulo) o;

        if (sistema != null ? !sistema.equals(sgModulo.sistema) : sgModulo.sistema != null) return false;
        if (modulo != null ? !modulo.equals(sgModulo.modulo) : sgModulo.modulo != null) return false;
        if (orden != null ? !orden.equals(sgModulo.orden) : sgModulo.orden != null) return false;
        if (nombre != null ? !nombre.equals(sgModulo.nombre) : sgModulo.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(sgModulo.descripcion) : sgModulo.descripcion != null)
            return false;
        if (plataforma != null ? !plataforma.equals(sgModulo.plataforma) : sgModulo.plataforma != null) return false;
        if (urlModulo != null ? !urlModulo.equals(sgModulo.urlModulo) : sgModulo.urlModulo != null) return false;
        if (estado != null ? !estado.equals(sgModulo.estado) : sgModulo.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(sgModulo.usuarioCreacion) : sgModulo.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(sgModulo.fechaCreacion) : sgModulo.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(sgModulo.usuarioModificacion) : sgModulo.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(sgModulo.fechaModificacion) : sgModulo.fechaModificacion != null)
            return false;
        if (accion != null ? !accion.equals(sgModulo.accion) : sgModulo.accion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sistema != null ? sistema.hashCode() : 0;
        result = 31 * result + (modulo != null ? modulo.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (plataforma != null ? plataforma.hashCode() : 0);
        result = 31 * result + (urlModulo != null ? urlModulo.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        return result;
    }
}
