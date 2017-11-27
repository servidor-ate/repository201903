package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mamania on 08/05/2017.
 */
@Entity
@Table(name = "SG_AgenteOpcion" )
@IdClass(SgAgenteOpcionPK.class)
public class SgAgenteOpcion extends Entidad {
    private int idAgente;
    private int idOpcion;
    private Timestamp valorFecha;
    private BigDecimal valorNumerico;
    private String valorTexto;
    private Integer indicadorAcceso;
    private Integer indicadorHabilitado;
    private Integer indicadorObligatorio;
    private Integer indicadorVisible;
    private Integer indicadorPrioridad;
    private Integer indicadorNuevo;
    private Integer indicadorModificar;
    private Integer indicadorEliminar;
    private Integer indicadorIngreso;
    private Integer estado;
    private String usuarioCreacion;
    private Timestamp fechaCreacion;
    private String usuarioModificacion;
    private Timestamp fechaModificacion;
    private String accion;
    private String version;

    @Id
    @Column(name = "IdAgente")
    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    @Id
    @Column(name = "IdOpcion")
    public int getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(int idOpcion) {
        this.idOpcion = idOpcion;
    }

    @Basic
    @Column(name = "ValorFecha")
    public Timestamp getValorFecha() {
        return valorFecha;
    }

    public void setValorFecha(Timestamp valorFecha) {
        this.valorFecha = valorFecha;
    }

    @Basic
    @Column(name = "ValorNumerico")
    public BigDecimal getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(BigDecimal valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    @Basic
    @Column(name = "ValorTexto")
    public String getValorTexto() {
        return valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    @Basic
    @Column(name = "IndicadorAcceso")
    public Integer getIndicadorAcceso() {
        return indicadorAcceso;
    }

    public void setIndicadorAcceso(Integer indicadorAcceso) {
        this.indicadorAcceso = indicadorAcceso;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Integer getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Integer indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "IndicadorObligatorio")
    public Integer getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Integer indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
    }

    @Basic
    @Column(name = "IndicadorVisible")
    public Integer getIndicadorVisible() {
        return indicadorVisible;
    }

    public void setIndicadorVisible(Integer indicadorVisible) {
        this.indicadorVisible = indicadorVisible;
    }

    @Basic
    @Column(name = "IndicadorPrioridad")
    public Integer getIndicadorPrioridad() {
        return indicadorPrioridad;
    }

    public void setIndicadorPrioridad(Integer indicadorPrioridad) {
        this.indicadorPrioridad = indicadorPrioridad;
    }

    @Basic
    @Column(name = "IndicadorNuevo")
    public Integer getIndicadorNuevo() {
        return indicadorNuevo;
    }

    public void setIndicadorNuevo(Integer indicadorNuevo) {
        this.indicadorNuevo = indicadorNuevo;
    }

    @Basic
    @Column(name = "IndicadorModificar")
    public Integer getIndicadorModificar() {
        return indicadorModificar;
    }

    public void setIndicadorModificar(Integer indicadorModificar) {
        this.indicadorModificar = indicadorModificar;
    }

    @Basic
    @Column(name = "IndicadorEliminar")
    public Integer getIndicadorEliminar() {
        return indicadorEliminar;
    }

    public void setIndicadorEliminar(Integer indicadorEliminar) {
        this.indicadorEliminar = indicadorEliminar;
    }

    @Basic
    @Column(name = "IndicadorIngreso")
    public Integer getIndicadorIngreso() {
        return indicadorIngreso;
    }

    public void setIndicadorIngreso(Integer indicadorIngreso) {
        this.indicadorIngreso = indicadorIngreso;
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

    @Basic
    @Column(name = "Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgAgenteOpcion that = (SgAgenteOpcion) o;

        if (idAgente != that.idAgente) return false;
        if (idOpcion != that.idOpcion) return false;
        if (valorFecha != null ? !valorFecha.equals(that.valorFecha) : that.valorFecha != null) return false;
        if (valorNumerico != null ? !valorNumerico.equals(that.valorNumerico) : that.valorNumerico != null)
            return false;
        if (valorTexto != null ? !valorTexto.equals(that.valorTexto) : that.valorTexto != null) return false;
        if (indicadorAcceso != null ? !indicadorAcceso.equals(that.indicadorAcceso) : that.indicadorAcceso != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (indicadorObligatorio != null ? !indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio != null)
            return false;
        if (indicadorVisible != null ? !indicadorVisible.equals(that.indicadorVisible) : that.indicadorVisible != null)
            return false;
        if (indicadorPrioridad != null ? !indicadorPrioridad.equals(that.indicadorPrioridad) : that.indicadorPrioridad != null)
            return false;
        if (indicadorNuevo != null ? !indicadorNuevo.equals(that.indicadorNuevo) : that.indicadorNuevo != null)
            return false;
        if (indicadorModificar != null ? !indicadorModificar.equals(that.indicadorModificar) : that.indicadorModificar != null)
            return false;
        if (indicadorEliminar != null ? !indicadorEliminar.equals(that.indicadorEliminar) : that.indicadorEliminar != null)
            return false;
        if (indicadorIngreso != null ? !indicadorIngreso.equals(that.indicadorIngreso) : that.indicadorIngreso != null)
            return false;
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
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAgente;
        result = 31 * result + idOpcion;
        result = 31 * result + (valorFecha != null ? valorFecha.hashCode() : 0);
        result = 31 * result + (valorNumerico != null ? valorNumerico.hashCode() : 0);
        result = 31 * result + (valorTexto != null ? valorTexto.hashCode() : 0);
        result = 31 * result + (indicadorAcceso != null ? indicadorAcceso.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (indicadorVisible != null ? indicadorVisible.hashCode() : 0);
        result = 31 * result + (indicadorPrioridad != null ? indicadorPrioridad.hashCode() : 0);
        result = 31 * result + (indicadorNuevo != null ? indicadorNuevo.hashCode() : 0);
        result = 31 * result + (indicadorModificar != null ? indicadorModificar.hashCode() : 0);
        result = 31 * result + (indicadorEliminar != null ? indicadorEliminar.hashCode() : 0);
        result = 31 * result + (indicadorIngreso != null ? indicadorIngreso.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
