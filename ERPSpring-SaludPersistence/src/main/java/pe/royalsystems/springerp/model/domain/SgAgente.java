package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.*;


/**
 * Created by mamania on 08/05/2017.
 */
@Entity
@Table(name = "SG_Agente" )
public class SgAgente extends Entidad {
    private int idAgente;
    private Integer idGrupo;
    private Integer idOrganizacion;
    private Integer tipoAgente;
    private String codigoAgente;
    private Integer idEmpleado;
    private Integer indicadorMultiple;
    private String clave;
    private Integer expiraClave;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaExpiracion;
    private String nombre;
    private String descripcion;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private Integer idGrupoTransaccion;
    private Integer tipoTransaccion;
    private Integer idOpcionDefecto;
    private String accion;
    private String plataforma;
    private String tipotrabajador;
    private Integer idCodigo;

    @Id
    @Column(name = "IdAgente")
    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    @Basic
    @Column(name = "IdGrupo")
    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Basic
    @Column(name = "IdOrganizacion")
    public Integer getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Integer idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    @Basic
    @Column(name = "TipoAgente")
    public Integer getTipoAgente() {
        return tipoAgente;
    }

    public void setTipoAgente(Integer tipoAgente) {
        this.tipoAgente = tipoAgente;
    }

    @Basic
    @Column(name = "CodigoAgente")
    public String getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(String codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    @Basic
    @Column(name = "IdEmpleado")
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Basic
    @Column(name = "IndicadorMultiple")
    public Integer getIndicadorMultiple() {
        return indicadorMultiple;
    }

    public void setIndicadorMultiple(Integer indicadorMultiple) {
        this.indicadorMultiple = indicadorMultiple;
    }

    @Basic
    @Column(name = "Clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Basic
    @Column(name = "ExpiraClave")
    public Integer getExpiraClave() {
        return expiraClave;
    }

    public void setExpiraClave(Integer expiraClave) {
        this.expiraClave = expiraClave;
    }

    @Basic
    @Column(name = "FechaInicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "FechaExpiracion")
    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
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
    @Column(name = "IdGrupoTransaccion")
    public Integer getIdGrupoTransaccion() {
        return idGrupoTransaccion;
    }

    public void setIdGrupoTransaccion(Integer idGrupoTransaccion) {
        this.idGrupoTransaccion = idGrupoTransaccion;
    }

    @Basic
    @Column(name = "TipoTransaccion")
    public Integer getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(Integer tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @Basic
    @Column(name = "IdOpcionDefecto")
    public Integer getIdOpcionDefecto() {
        return idOpcionDefecto;
    }

    public void setIdOpcionDefecto(Integer idOpcionDefecto) {
        this.idOpcionDefecto = idOpcionDefecto;
    }

    @Basic
    @Column(name = "ACCION")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "Plataforma")
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Basic
    @Column(name = "tipotrabajador")
    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    @Basic
    @Column(name = "IdCodigo")
    public Integer getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(Integer idCodigo) {
        this.idCodigo = idCodigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgAgente sgAgente = (SgAgente) o;

        if (idAgente != sgAgente.idAgente) return false;
        if (idGrupo != null ? !idGrupo.equals(sgAgente.idGrupo) : sgAgente.idGrupo != null) return false;
        if (idOrganizacion != null ? !idOrganizacion.equals(sgAgente.idOrganizacion) : sgAgente.idOrganizacion != null)
            return false;
        if (tipoAgente != null ? !tipoAgente.equals(sgAgente.tipoAgente) : sgAgente.tipoAgente != null) return false;
        if (codigoAgente != null ? !codigoAgente.equals(sgAgente.codigoAgente) : sgAgente.codigoAgente != null)
            return false;
        if (idEmpleado != null ? !idEmpleado.equals(sgAgente.idEmpleado) : sgAgente.idEmpleado != null) return false;
        if (indicadorMultiple != null ? !indicadorMultiple.equals(sgAgente.indicadorMultiple) : sgAgente.indicadorMultiple != null)
            return false;
        if (clave != null ? !clave.equals(sgAgente.clave) : sgAgente.clave != null) return false;
        if (expiraClave != null ? !expiraClave.equals(sgAgente.expiraClave) : sgAgente.expiraClave != null)
            return false;
        if (fechaInicio != null ? !fechaInicio.equals(sgAgente.fechaInicio) : sgAgente.fechaInicio != null)
            return false;
        if (fechaFin != null ? !fechaFin.equals(sgAgente.fechaFin) : sgAgente.fechaFin != null) return false;
        if (fechaExpiracion != null ? !fechaExpiracion.equals(sgAgente.fechaExpiracion) : sgAgente.fechaExpiracion != null)
            return false;
        if (nombre != null ? !nombre.equals(sgAgente.nombre) : sgAgente.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(sgAgente.descripcion) : sgAgente.descripcion != null)
            return false;
        if (estado != null ? !estado.equals(sgAgente.estado) : sgAgente.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(sgAgente.usuarioCreacion) : sgAgente.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(sgAgente.fechaCreacion) : sgAgente.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(sgAgente.usuarioModificacion) : sgAgente.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(sgAgente.fechaModificacion) : sgAgente.fechaModificacion != null)
            return false;
        if (idGrupoTransaccion != null ? !idGrupoTransaccion.equals(sgAgente.idGrupoTransaccion) : sgAgente.idGrupoTransaccion != null)
            return false;
        if (tipoTransaccion != null ? !tipoTransaccion.equals(sgAgente.tipoTransaccion) : sgAgente.tipoTransaccion != null)
            return false;
        if (idOpcionDefecto != null ? !idOpcionDefecto.equals(sgAgente.idOpcionDefecto) : sgAgente.idOpcionDefecto != null)
            return false;
        if (accion != null ? !accion.equals(sgAgente.accion) : sgAgente.accion != null) return false;
        if (plataforma != null ? !plataforma.equals(sgAgente.plataforma) : sgAgente.plataforma != null) return false;
        if (tipotrabajador != null ? !tipotrabajador.equals(sgAgente.tipotrabajador) : sgAgente.tipotrabajador != null)
            return false;
        if (idCodigo != null ? !idCodigo.equals(sgAgente.idCodigo) : sgAgente.idCodigo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAgente;
        result = 31 * result + (idGrupo != null ? idGrupo.hashCode() : 0);
        result = 31 * result + (idOrganizacion != null ? idOrganizacion.hashCode() : 0);
        result = 31 * result + (tipoAgente != null ? tipoAgente.hashCode() : 0);
        result = 31 * result + (codigoAgente != null ? codigoAgente.hashCode() : 0);
        result = 31 * result + (idEmpleado != null ? idEmpleado.hashCode() : 0);
        result = 31 * result + (indicadorMultiple != null ? indicadorMultiple.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (expiraClave != null ? expiraClave.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (fechaExpiracion != null ? fechaExpiracion.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (idGrupoTransaccion != null ? idGrupoTransaccion.hashCode() : 0);
        result = 31 * result + (tipoTransaccion != null ? tipoTransaccion.hashCode() : 0);
        result = 31 * result + (idOpcionDefecto != null ? idOpcionDefecto.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (plataforma != null ? plataforma.hashCode() : 0);
        result = 31 * result + (tipotrabajador != null ? tipotrabajador.hashCode() : 0);
        result = 31 * result + (idCodigo != null ? idCodigo.hashCode() : 0);
        return result;
    }
}
