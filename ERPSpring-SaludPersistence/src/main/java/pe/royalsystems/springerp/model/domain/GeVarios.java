package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mamania on 18/09/2015.
 */
@Entity
@javax.persistence.Table(name = "GE_Varios")
public class GeVarios extends Entidad implements Serializable{

    private String codigoTabla;

    @Id
    @javax.persistence.Column(name = "CodigoTabla", nullable = false, insertable = true, updatable = true, length = 15)
    public String getCodigoTabla() {
        return codigoTabla;
    }

    public void setCodigoTabla(String codigoTabla) {
        this.codigoTabla = codigoTabla;
    }

    private int secuencial;

    @Id
    @javax.persistence.Column(name = "Secuencial", nullable = false, insertable = true, updatable = true)
    public int getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(int secuencial) {
        this.secuencial = secuencial;
    }

    private String nemonico;

    @Basic
    @javax.persistence.Column(name = "Nemonico", nullable = true, insertable = true, updatable = true, length = 7)
    public String getNemonico() {
        return nemonico;
    }

    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    private String descripcion;

    @Basic
    @javax.persistence.Column(name = "Descripcion", nullable = true, insertable = true, updatable = true, length = 80)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private Timestamp valorFecha;

    @Basic
    @javax.persistence.Column(name = "ValorFecha", nullable = true, insertable = true, updatable = true)
    public Timestamp getValorFecha() {
        return valorFecha;
    }

    public void setValorFecha(Timestamp valorFecha) {
        this.valorFecha = valorFecha;
    }

    private BigDecimal valorNumerico;

    @Basic
    @javax.persistence.Column(name = "ValorNumerico", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(BigDecimal valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    private String valorTexto;

    @Basic
    @javax.persistence.Column(name = "ValorTexto", nullable = true, insertable = true, updatable = true, length = 30)
    public String getValorTexto() {
        return valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    private Integer indicadorUso;

    @Basic
    @javax.persistence.Column(name = "IndicadorUso", nullable = true, insertable = true, updatable = true)
    public Integer getIndicadorUso() {
        return indicadorUso;
    }

    public void setIndicadorUso(Integer indicadorUso) {
        this.indicadorUso = indicadorUso;
    }

    private Integer indicadorAgregarHijo;

    @Basic
    @javax.persistence.Column(name = "IndicadorAgregarHijo", nullable = true, insertable = true, updatable = true)
    public Integer getIndicadorAgregarHijo() {
        return indicadorAgregarHijo;
    }

    public void setIndicadorAgregarHijo(Integer indicadorAgregarHijo) {
        this.indicadorAgregarHijo = indicadorAgregarHijo;
    }

    private Integer estado;

    @Basic
    @javax.persistence.Column(name = "Estado", nullable = true, insertable = true, updatable = true)
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    private String usuarioCreacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioCreacion", nullable = true, insertable = true, updatable = true, length = 25)
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    private Timestamp fechaCreacion;

    @Basic
    @javax.persistence.Column(name = "FechaCreacion", nullable = true, insertable = true, updatable = true)
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    private String usuarioModificacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioModificacion", nullable = true, insertable = true, updatable = true, length = 25)
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    private Timestamp fechaModificacion;

    @Basic
    @javax.persistence.Column(name = "FechaModificacion", nullable = true, insertable = true, updatable = true)
    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    private Integer ordenEstablecido;

    @Basic
    @javax.persistence.Column(name = "OrdenEstablecido", nullable = true, insertable = true, updatable = true)
    public Integer getOrdenEstablecido() {
        return ordenEstablecido;
    }

    public void setOrdenEstablecido(Integer ordenEstablecido) {
        this.ordenEstablecido = ordenEstablecido;
    }

    private String accion;

    @Basic
    @javax.persistence.Column(name = "Accion", nullable = true, insertable = true, updatable = true, length = 25)
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

        GeVarios geVarios = (GeVarios) o;

        if (secuencial != geVarios.secuencial) return false;
        if (codigoTabla != null ? !codigoTabla.equals(geVarios.codigoTabla) : geVarios.codigoTabla != null)
            return false;
        if (nemonico != null ? !nemonico.equals(geVarios.nemonico) : geVarios.nemonico != null) return false;
        if (descripcion != null ? !descripcion.equals(geVarios.descripcion) : geVarios.descripcion != null)
            return false;
        if (valorFecha != null ? !valorFecha.equals(geVarios.valorFecha) : geVarios.valorFecha != null) return false;
        if (valorNumerico != null ? !valorNumerico.equals(geVarios.valorNumerico) : geVarios.valorNumerico != null)
            return false;
        if (valorTexto != null ? !valorTexto.equals(geVarios.valorTexto) : geVarios.valorTexto != null) return false;
        if (indicadorUso != null ? !indicadorUso.equals(geVarios.indicadorUso) : geVarios.indicadorUso != null)
            return false;
        if (indicadorAgregarHijo != null ? !indicadorAgregarHijo.equals(geVarios.indicadorAgregarHijo) : geVarios.indicadorAgregarHijo != null)
            return false;
        if (estado != null ? !estado.equals(geVarios.estado) : geVarios.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(geVarios.usuarioCreacion) : geVarios.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(geVarios.fechaCreacion) : geVarios.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(geVarios.usuarioModificacion) : geVarios.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(geVarios.fechaModificacion) : geVarios.fechaModificacion != null)
            return false;
        if (ordenEstablecido != null ? !ordenEstablecido.equals(geVarios.ordenEstablecido) : geVarios.ordenEstablecido != null)
            return false;
        if (accion != null ? !accion.equals(geVarios.accion) : geVarios.accion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigoTabla != null ? codigoTabla.hashCode() : 0;
        result = 31 * result + secuencial;
        result = 31 * result + (nemonico != null ? nemonico.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (valorFecha != null ? valorFecha.hashCode() : 0);
        result = 31 * result + (valorNumerico != null ? valorNumerico.hashCode() : 0);
        result = 31 * result + (valorTexto != null ? valorTexto.hashCode() : 0);
        result = 31 * result + (indicadorUso != null ? indicadorUso.hashCode() : 0);
        result = 31 * result + (indicadorAgregarHijo != null ? indicadorAgregarHijo.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (ordenEstablecido != null ? ordenEstablecido.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        return result;
    }
}
