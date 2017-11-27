package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mamania on 08/05/2017.
 */
@Entity
@Table(name = "SG_Opcion" )
public class SgOpcion extends Entidad{
    private Integer idOpcion;
    private String codigoOpcion;
    private String cadenaRecursividad;
    private Integer nivelOpcion;
    private String nombre;
    private String descripcion;
    private String subModulo;
    private Integer orden;
    private String tipoOpcion;
    private Integer tipoIcono;
    private Integer indicadorPrioridad;
    private Integer indicadorObjeto;
    private String tipoDato;
    private String valorTexto;
    private BigDecimal valorNumerico;
    private Date valorFecha;
    private String urlOpcion;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private String compania;
    private Integer indicadorCompania;
    private Integer indicadorFormato;
    private Integer idFormato;
    private Integer indicadorAsignacion;
    private Integer tipoProceso;
    private String accion;
    private String version;
    private Integer estado;
    private Integer idOpcionPadre;
    private String sistema;
    private String modulo;
    private Integer idObjetoAsociado;
    private Integer idTipoAtencion;
    private String tipoTrabajador;

    @Id
    @Column(name = "IdOpcion")
    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    @Basic
    @Column(name = "CodigoOpcion")
    public String getCodigoOpcion() {
        return codigoOpcion;
    }

    public void setCodigoOpcion(String codigoOpcion) {
        this.codigoOpcion = codigoOpcion;
    }

    @Basic
    @Column(name = "CadenaRecursividad")
    public String getCadenaRecursividad() {
        return cadenaRecursividad;
    }

    public void setCadenaRecursividad(String cadenaRecursividad) {
        this.cadenaRecursividad = cadenaRecursividad;
    }

    @Basic
    @Column(name = "NivelOpcion")
    public Integer getNivelOpcion() {
        return nivelOpcion;
    }

    public void setNivelOpcion(Integer nivelOpcion) {
        this.nivelOpcion = nivelOpcion;
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
    @Column(name = "SubModulo")
    public String getSubModulo() {
        return subModulo;
    }

    public void setSubModulo(String subModulo) {
        this.subModulo = subModulo;
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
    @Column(name = "TipoOpcion")
    public String getTipoOpcion() {
        return tipoOpcion;
    }

    public void setTipoOpcion(String tipoOpcion) {
        this.tipoOpcion = tipoOpcion;
    }

    @Basic
    @Column(name = "TipoIcono")
    public Integer getTipoIcono() {
        return tipoIcono;
    }

    public void setTipoIcono(Integer tipoIcono) {
        this.tipoIcono = tipoIcono;
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
    @Column(name = "IndicadorObjeto")
    public Integer getIndicadorObjeto() {
        return indicadorObjeto;
    }

    public void setIndicadorObjeto(Integer indicadorObjeto) {
        this.indicadorObjeto = indicadorObjeto;
    }

    @Basic
    @Column(name = "TipoDato")
    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
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
    @Column(name = "ValorNumerico")
    public BigDecimal getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(BigDecimal valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    @Basic
    @Column(name = "ValorFecha")
    public Date getValorFecha() {
        return valorFecha;
    }

    public void setValorFecha(Date valorFecha) {
        this.valorFecha = valorFecha;
    }

    @Basic
    @Column(name = "UrlOpcion")
    public String getUrlOpcion() {
        return urlOpcion;
    }

    public void setUrlOpcion(String urlOpcion) {
        this.urlOpcion = urlOpcion;
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
    @Column(name = "Compania")
    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Basic
    @Column(name = "IndicadorCompania")
    public Integer getIndicadorCompania() {
        return indicadorCompania;
    }

    public void setIndicadorCompania(Integer indicadorCompania) {
        this.indicadorCompania = indicadorCompania;
    }

    @Basic
    @Column(name = "IndicadorFormato")
    public Integer getIndicadorFormato() {
        return indicadorFormato;
    }

    public void setIndicadorFormato(Integer indicadorFormato) {
        this.indicadorFormato = indicadorFormato;
    }

    @Basic
    @Column(name = "IdFormato")
    public Integer getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(Integer idFormato) {
        this.idFormato = idFormato;
    }

    @Basic
    @Column(name = "IndicadorAsignacion")
    public Integer getIndicadorAsignacion() {
        return indicadorAsignacion;
    }

    public void setIndicadorAsignacion(Integer indicadorAsignacion) {
        this.indicadorAsignacion = indicadorAsignacion;
    }

    @Basic
    @Column(name = "TipoProceso")
    public Integer getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(Integer tipoProceso) {
        this.tipoProceso = tipoProceso;
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

    @Basic
    @Column(name = "Estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgOpcion sgOpcion = (SgOpcion) o;

        if (idOpcion != sgOpcion.idOpcion) return false;
        if (codigoOpcion != null ? !codigoOpcion.equals(sgOpcion.codigoOpcion) : sgOpcion.codigoOpcion != null)
            return false;
        if (cadenaRecursividad != null ? !cadenaRecursividad.equals(sgOpcion.cadenaRecursividad) : sgOpcion.cadenaRecursividad != null)
            return false;
        if (nivelOpcion != null ? !nivelOpcion.equals(sgOpcion.nivelOpcion) : sgOpcion.nivelOpcion != null)
            return false;
        if (nombre != null ? !nombre.equals(sgOpcion.nombre) : sgOpcion.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(sgOpcion.descripcion) : sgOpcion.descripcion != null)
            return false;
        if (subModulo != null ? !subModulo.equals(sgOpcion.subModulo) : sgOpcion.subModulo != null) return false;
        if (orden != null ? !orden.equals(sgOpcion.orden) : sgOpcion.orden != null) return false;
        if (tipoOpcion != null ? !tipoOpcion.equals(sgOpcion.tipoOpcion) : sgOpcion.tipoOpcion != null) return false;
        if (tipoIcono != null ? !tipoIcono.equals(sgOpcion.tipoIcono) : sgOpcion.tipoIcono != null) return false;
        if (indicadorPrioridad != null ? !indicadorPrioridad.equals(sgOpcion.indicadorPrioridad) : sgOpcion.indicadorPrioridad != null)
            return false;
        if (indicadorObjeto != null ? !indicadorObjeto.equals(sgOpcion.indicadorObjeto) : sgOpcion.indicadorObjeto != null)
            return false;
        if (tipoDato != null ? !tipoDato.equals(sgOpcion.tipoDato) : sgOpcion.tipoDato != null) return false;
        if (valorTexto != null ? !valorTexto.equals(sgOpcion.valorTexto) : sgOpcion.valorTexto != null) return false;
        if (valorNumerico != null ? !valorNumerico.equals(sgOpcion.valorNumerico) : sgOpcion.valorNumerico != null)
            return false;
        if (valorFecha != null ? !valorFecha.equals(sgOpcion.valorFecha) : sgOpcion.valorFecha != null) return false;
        if (urlOpcion != null ? !urlOpcion.equals(sgOpcion.urlOpcion) : sgOpcion.urlOpcion != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(sgOpcion.usuarioCreacion) : sgOpcion.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(sgOpcion.fechaCreacion) : sgOpcion.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(sgOpcion.usuarioModificacion) : sgOpcion.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(sgOpcion.fechaModificacion) : sgOpcion.fechaModificacion != null)
            return false;
        if (compania != null ? !compania.equals(sgOpcion.compania) : sgOpcion.compania != null) return false;
        if (indicadorCompania != null ? !indicadorCompania.equals(sgOpcion.indicadorCompania) : sgOpcion.indicadorCompania != null)
            return false;
        if (indicadorFormato != null ? !indicadorFormato.equals(sgOpcion.indicadorFormato) : sgOpcion.indicadorFormato != null)
            return false;
        if (idFormato != null ? !idFormato.equals(sgOpcion.idFormato) : sgOpcion.idFormato != null) return false;
        if (indicadorAsignacion != null ? !indicadorAsignacion.equals(sgOpcion.indicadorAsignacion) : sgOpcion.indicadorAsignacion != null)
            return false;
        if (tipoProceso != null ? !tipoProceso.equals(sgOpcion.tipoProceso) : sgOpcion.tipoProceso != null)
            return false;
        if (accion != null ? !accion.equals(sgOpcion.accion) : sgOpcion.accion != null) return false;
        if (version != null ? !version.equals(sgOpcion.version) : sgOpcion.version != null) return false;
        if (estado != null ? !estado.equals(sgOpcion.estado) : sgOpcion.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOpcion;
        result = 31 * result + (codigoOpcion != null ? codigoOpcion.hashCode() : 0);
        result = 31 * result + (cadenaRecursividad != null ? cadenaRecursividad.hashCode() : 0);
        result = 31 * result + (nivelOpcion != null ? nivelOpcion.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (subModulo != null ? subModulo.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (tipoOpcion != null ? tipoOpcion.hashCode() : 0);
        result = 31 * result + (tipoIcono != null ? tipoIcono.hashCode() : 0);
        result = 31 * result + (indicadorPrioridad != null ? indicadorPrioridad.hashCode() : 0);
        result = 31 * result + (indicadorObjeto != null ? indicadorObjeto.hashCode() : 0);
        result = 31 * result + (tipoDato != null ? tipoDato.hashCode() : 0);
        result = 31 * result + (valorTexto != null ? valorTexto.hashCode() : 0);
        result = 31 * result + (valorNumerico != null ? valorNumerico.hashCode() : 0);
        result = 31 * result + (valorFecha != null ? valorFecha.hashCode() : 0);
        result = 31 * result + (urlOpcion != null ? urlOpcion.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (compania != null ? compania.hashCode() : 0);
        result = 31 * result + (indicadorCompania != null ? indicadorCompania.hashCode() : 0);
        result = 31 * result + (indicadorFormato != null ? indicadorFormato.hashCode() : 0);
        result = 31 * result + (idFormato != null ? idFormato.hashCode() : 0);
        result = 31 * result + (indicadorAsignacion != null ? indicadorAsignacion.hashCode() : 0);
        result = 31 * result + (tipoProceso != null ? tipoProceso.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "IdOpcionPadre")
    public Integer getIdOpcionPadre() {
        return idOpcionPadre;
    }

    public void setIdOpcionPadre(Integer idOpcionPadre) {
        this.idOpcionPadre = idOpcionPadre;
    }

    @Basic
    @Column(name = "Sistema")
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Basic
    @Column(name = "Modulo")
    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Basic
    @Column(name = "IdObjetoAsociado")
    public Integer getIdObjetoAsociado() {
        return idObjetoAsociado;
    }

    public void setIdObjetoAsociado(Integer idObjetoAsociado) {
        this.idObjetoAsociado = idObjetoAsociado;
    }

    @Basic
    @Column(name = "idTipoAtencion")
    public Integer getIdTipoAtencion() {
        return idTipoAtencion;
    }

    public void setIdTipoAtencion(Integer idTipoAtencion) {
        this.idTipoAtencion = idTipoAtencion;
    }

    @Basic
    @Column(name = "TipoTrabajador")
    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }
}
