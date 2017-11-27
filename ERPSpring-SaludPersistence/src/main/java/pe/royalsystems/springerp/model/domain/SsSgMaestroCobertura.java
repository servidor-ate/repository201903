package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by mamania on 03/09/2015.
 */
@Entity
@javax.persistence.Table(name = "SS_SG_MaestroCobertura")
public class SsSgMaestroCobertura extends Entidad implements Serializable {
    private int idCobertura;

    @Id
    @javax.persistence.Column(name = "IdCobertura")
    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
    }

    private String codigoCobertura;

    @Basic
    @javax.persistence.Column(name = "CodigoCobertura")
    public String getCodigoCobertura() {
        return codigoCobertura;
    }

    public void setCodigoCobertura(String codigoCobertura) {
        this.codigoCobertura = codigoCobertura;
    }

    private String nombre;

    @Basic
    @javax.persistence.Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String descripcion;

    @Basic
    @javax.persistence.Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private Integer indicadorAmbulatorio;

    @Basic
    @javax.persistence.Column(name = "IndicadorAmbulatorio")
    public Integer getIndicadorAmbulatorio() {
        return indicadorAmbulatorio;
    }

    public void setIndicadorAmbulatorio(Integer indicadorAmbulatorio) {
        this.indicadorAmbulatorio = indicadorAmbulatorio;
    }

    private Integer indicadorEmergencia;

    @Basic
    @javax.persistence.Column(name = "IndicadorEmergencia")
    public Integer getIndicadorEmergencia() {
        return indicadorEmergencia;
    }

    public void setIndicadorEmergencia(Integer indicadorEmergencia) {
        this.indicadorEmergencia = indicadorEmergencia;
    }

    private Integer indicadorHospitalario;

    @Basic
    @javax.persistence.Column(name = "IndicadorHospitalario")
    public Integer getIndicadorHospitalario() {
        return indicadorHospitalario;
    }

    public void setIndicadorHospitalario(Integer indicadorHospitalario) {
        this.indicadorHospitalario = indicadorHospitalario;
    }

    private Integer estado;

    @Basic
    @javax.persistence.Column(name = "Estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    private String usuarioCreacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioCreacion")
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    private Timestamp fechaCreacion;

    @Basic
    @javax.persistence.Column(name = "FechaCreacion")
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    private String usuarioModificacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioModificacion")
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    private Timestamp fechaModificacion;

    @Basic
    @javax.persistence.Column(name = "FechaModificacion")
    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    private String coderam;

    @Basic
    @javax.persistence.Column(name = "Coderam")
    public String getCoderam() {
        return coderam;
    }

    public void setCoderam(String coderam) {
        this.coderam = coderam;
    }

    private Integer tipoTabla;

    @Basic
    @javax.persistence.Column(name = "TipoTabla")
    public Integer getTipoTabla() {
        return tipoTabla;
    }

    public void setTipoTabla(Integer tipoTabla) {
        this.tipoTabla = tipoTabla;
    }

    private String accion;

    @Basic
    @javax.persistence.Column(name = "ACCION")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    private String version;

    @Basic
    @javax.persistence.Column(name = "VERSION")
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

        SsSgMaestroCobertura that = (SsSgMaestroCobertura) o;

        if (idCobertura != that.idCobertura) return false;
        if (codigoCobertura != null ? !codigoCobertura.equals(that.codigoCobertura) : that.codigoCobertura != null)
            return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (indicadorAmbulatorio != null ? !indicadorAmbulatorio.equals(that.indicadorAmbulatorio) : that.indicadorAmbulatorio != null)
            return false;
        if (indicadorEmergencia != null ? !indicadorEmergencia.equals(that.indicadorEmergencia) : that.indicadorEmergencia != null)
            return false;
        if (indicadorHospitalario != null ? !indicadorHospitalario.equals(that.indicadorHospitalario) : that.indicadorHospitalario != null)
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
        if (coderam != null ? !coderam.equals(that.coderam) : that.coderam != null) return false;
        if (tipoTabla != null ? !tipoTabla.equals(that.tipoTabla) : that.tipoTabla != null) return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;
        return !(version != null ? !version.equals(that.version) : that.version != null);

    }

    @Override
    public int hashCode() {
        int result = idCobertura;
        result = 31 * result + (codigoCobertura != null ? codigoCobertura.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorAmbulatorio != null ? indicadorAmbulatorio.hashCode() : 0);
        result = 31 * result + (indicadorEmergencia != null ? indicadorEmergencia.hashCode() : 0);
        result = 31 * result + (indicadorHospitalario != null ? indicadorHospitalario.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (coderam != null ? coderam.hashCode() : 0);
        result = 31 * result + (tipoTabla != null ? tipoTabla.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
