package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by MAMANIA on 30/08/2015.
 */
@Entity
@javax.persistence.Table(name = "SS_HC_Anamnesis_EA")
public class SsHcAnamnesisEa extends Entidad  implements Serializable {
    private String unidadReplicacion;

    @Id
    @javax.persistence.Column(name = "UnidadReplicacion")
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    private long idEpisodioAtencion;

    @Id
    @javax.persistence.Column(name = "IdEpisodioAtencion")
    public long getIdEpisodioAtencion() {
        return idEpisodioAtencion;
    }

    public void setIdEpisodioAtencion(long idEpisodioAtencion) {
        this.idEpisodioAtencion = idEpisodioAtencion;
    }

    private int idPaciente;

    @Id
    @javax.persistence.Column(name = "IdPaciente")
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    private int episodioClinico;

    @Id
    @javax.persistence.Column(name = "EpisodioClinico")
    public int getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(int episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    private Integer idFormaInicio;

    @Basic
    @javax.persistence.Column(name = "IdFormaInicio")
    public Integer getIdFormaInicio() {
        return idFormaInicio;
    }

    public void setIdFormaInicio(Integer idFormaInicio) {
        this.idFormaInicio = idFormaInicio;
    }

    private Integer idCursoEnfermedad;

    @Basic
    @javax.persistence.Column(name = "IdCursoEnfermedad")
    public Integer getIdCursoEnfermedad() {
        return idCursoEnfermedad;
    }

    public void setIdCursoEnfermedad(Integer idCursoEnfermedad) {
        this.idCursoEnfermedad = idCursoEnfermedad;
    }

    private String tiempoEnfermedad;

    @Basic
    @javax.persistence.Column(name = "TiempoEnfermedad")
    public String getTiempoEnfermedad() {
        return tiempoEnfermedad;
    }

    public void setTiempoEnfermedad(String tiempoEnfermedad) {
        this.tiempoEnfermedad = tiempoEnfermedad;
    }

    private String relatoCronologico;

    @Basic
    @javax.persistence.Column(name = "RelatoCronologico")
    public String getRelatoCronologico() {
        return relatoCronologico;
    }

    public void setRelatoCronologico(String relatoCronologico) {
        this.relatoCronologico = relatoCronologico;
    }

    private String apetito;

    @Basic
    @javax.persistence.Column(name = "Apetito")
    public String getApetito() {
        return apetito;
    }

    public void setApetito(String apetito) {
        this.apetito = apetito;
    }

    private String sed;

    @Basic
    @javax.persistence.Column(name = "Sed")
    public String getSed() {
        return sed;
    }

    public void setSed(String sed) {
        this.sed = sed;
    }

    private String orina;

    @Basic
    @javax.persistence.Column(name = "Orina")
    public String getOrina() {
        return orina;
    }

    public void setOrina(String orina) {
        this.orina = orina;
    }

    private String deposiciones;

    @Basic
    @javax.persistence.Column(name = "Deposiciones")
    public String getDeposiciones() {
        return deposiciones;
    }

    public void setDeposiciones(String deposiciones) {
        this.deposiciones = deposiciones;
    }

    private String sueno;

    @Basic
    @javax.persistence.Column(name = "Sueno")
    public String getSueno() {
        return sueno;
    }

    public void setSueno(String sueno) {
        this.sueno = sueno;
    }

    private BigDecimal pesoAnterior;

    @Basic
    @javax.persistence.Column(name = "PesoAnterior")
    public BigDecimal getPesoAnterior() {
        return pesoAnterior;
    }

    public void setPesoAnterior(BigDecimal pesoAnterior) {
        this.pesoAnterior = pesoAnterior;
    }

    private String infancia;

    @Basic
    @javax.persistence.Column(name = "Infancia")
    public String getInfancia() {
        return infancia;
    }

    public void setInfancia(String infancia) {
        this.infancia = infancia;
    }

    private String evaluacionAlimentacionActual;

    @Basic
    @javax.persistence.Column(name = "EvaluacionAlimentacionActual")
    public String getEvaluacionAlimentacionActual() {
        return evaluacionAlimentacionActual;
    }

    public void setEvaluacionAlimentacionActual(String evaluacionAlimentacionActual) {
        this.evaluacionAlimentacionActual = evaluacionAlimentacionActual;
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

    private String accion;

    @Basic
    @javax.persistence.Column(name = "Accion")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    private String version;

    @Basic
    @javax.persistence.Column(name = "Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private String motivoConsulta;

    @Basic
    @javax.persistence.Column(name = "MotivoConsulta")
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsHcAnamnesisEa that = (SsHcAnamnesisEa) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;
        if (idFormaInicio != null ? !idFormaInicio.equals(that.idFormaInicio) : that.idFormaInicio != null)
            return false;
        if (idCursoEnfermedad != null ? !idCursoEnfermedad.equals(that.idCursoEnfermedad) : that.idCursoEnfermedad != null)
            return false;
        if (tiempoEnfermedad != null ? !tiempoEnfermedad.equals(that.tiempoEnfermedad) : that.tiempoEnfermedad != null)
            return false;
        if (relatoCronologico != null ? !relatoCronologico.equals(that.relatoCronologico) : that.relatoCronologico != null)
            return false;
        if (apetito != null ? !apetito.equals(that.apetito) : that.apetito != null) return false;
        if (sed != null ? !sed.equals(that.sed) : that.sed != null) return false;
        if (orina != null ? !orina.equals(that.orina) : that.orina != null) return false;
        if (deposiciones != null ? !deposiciones.equals(that.deposiciones) : that.deposiciones != null) return false;
        if (sueno != null ? !sueno.equals(that.sueno) : that.sueno != null) return false;
        if (pesoAnterior != null ? !pesoAnterior.equals(that.pesoAnterior) : that.pesoAnterior != null) return false;
        if (infancia != null ? !infancia.equals(that.infancia) : that.infancia != null) return false;
        if (evaluacionAlimentacionActual != null ? !evaluacionAlimentacionActual.equals(that.evaluacionAlimentacionActual) : that.evaluacionAlimentacionActual != null)
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
        return !(motivoConsulta != null ? !motivoConsulta.equals(that.motivoConsulta) : that.motivoConsulta != null);

    }

    @Override
    public int hashCode() {
        int result = unidadReplicacion != null ? unidadReplicacion.hashCode() : 0;
        result = 31 * result + (int) (idEpisodioAtencion ^ (idEpisodioAtencion >>> 32));
        result = 31 * result + idPaciente;
        result = 31 * result + episodioClinico;
        result = 31 * result + (idFormaInicio != null ? idFormaInicio.hashCode() : 0);
        result = 31 * result + (idCursoEnfermedad != null ? idCursoEnfermedad.hashCode() : 0);
        result = 31 * result + (tiempoEnfermedad != null ? tiempoEnfermedad.hashCode() : 0);
        result = 31 * result + (relatoCronologico != null ? relatoCronologico.hashCode() : 0);
        result = 31 * result + (apetito != null ? apetito.hashCode() : 0);
        result = 31 * result + (sed != null ? sed.hashCode() : 0);
        result = 31 * result + (orina != null ? orina.hashCode() : 0);
        result = 31 * result + (deposiciones != null ? deposiciones.hashCode() : 0);
        result = 31 * result + (sueno != null ? sueno.hashCode() : 0);
        result = 31 * result + (pesoAnterior != null ? pesoAnterior.hashCode() : 0);
        result = 31 * result + (infancia != null ? infancia.hashCode() : 0);
        result = 31 * result + (evaluacionAlimentacionActual != null ? evaluacionAlimentacionActual.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (motivoConsulta != null ? motivoConsulta.hashCode() : 0);
        return result;
    }
}
