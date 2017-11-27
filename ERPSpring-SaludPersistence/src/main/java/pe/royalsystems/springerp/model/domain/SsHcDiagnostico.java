package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mamania on 10/05/2017.
 */
@Entity
@Table(name = "SS_HC_Diagnostico")
@IdClass(SsHcDiagnosticoPK.class)
public class SsHcDiagnostico extends  Entidad{
    private String unidadReplicacion;
    private Long idEpisodioAtencion;
    private Integer idPaciente;
    private Integer episodioClinico;
    private Integer secuencia;
    private Date fechaRegistro;
    private Integer idDiagnostico;
    private Integer idDiagnosticoValoracion;
    private String determinacionDiagnostica;
    private Integer idDiagnosticoPrincipal;
    private String gradoAfeccion;
    private String observacion;
    private Integer indicadorAntecedente;
    private String tipoAntecedente;
    private Integer indicadorPreExistencia;
    private Integer indicadorCronico;
    private Integer indicadorNuevo;
    private String detalleDiagnostico;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private String accion;
    private String version;

    @Id
    @Column(name = "UnidadReplicacion")
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    @Id
    @Column(name = "IdEpisodioAtencion")
    public Long getIdEpisodioAtencion() {
        return idEpisodioAtencion;
    }

    public void setIdEpisodioAtencion(Long idEpisodioAtencion) {
        this.idEpisodioAtencion = idEpisodioAtencion;
    }

    @Id
    @Column(name = "IdPaciente")
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Id
    @Column(name = "EpisodioClinico")
    public Integer getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(Integer episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Id
    @Column(name = "Secuencia")
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    @Basic
    @Column(name = "FechaRegistro")
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Basic
    @Column(name = "IdDiagnostico")
    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    @Basic
    @Column(name = "IdDiagnosticoValoracion")
    public Integer getIdDiagnosticoValoracion() {
        return idDiagnosticoValoracion;
    }

    public void setIdDiagnosticoValoracion(Integer idDiagnosticoValoracion) {
        this.idDiagnosticoValoracion = idDiagnosticoValoracion;
    }

    @Basic
    @Column(name = "DeterminacionDiagnostica")
    public String getDeterminacionDiagnostica() {
        return determinacionDiagnostica;
    }

    public void setDeterminacionDiagnostica(String determinacionDiagnostica) {
        this.determinacionDiagnostica = determinacionDiagnostica;
    }

    @Basic
    @Column(name = "IdDiagnosticoPrincipal")
    public Integer getIdDiagnosticoPrincipal() {
        return idDiagnosticoPrincipal;
    }

    public void setIdDiagnosticoPrincipal(Integer idDiagnosticoPrincipal) {
        this.idDiagnosticoPrincipal = idDiagnosticoPrincipal;
    }

    @Basic
    @Column(name = "GradoAfeccion")
    public String getGradoAfeccion() {
        return gradoAfeccion;
    }

    public void setGradoAfeccion(String gradoAfeccion) {
        this.gradoAfeccion = gradoAfeccion;
    }

    @Basic
    @Column(name = "Observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "IndicadorAntecedente")
    public Integer getIndicadorAntecedente() {
        return indicadorAntecedente;
    }

    public void setIndicadorAntecedente(Integer indicadorAntecedente) {
        this.indicadorAntecedente = indicadorAntecedente;
    }

    @Basic
    @Column(name = "TipoAntecedente")
    public String getTipoAntecedente() {
        return tipoAntecedente;
    }

    public void setTipoAntecedente(String tipoAntecedente) {
        this.tipoAntecedente = tipoAntecedente;
    }

    @Basic
    @Column(name = "IndicadorPreExistencia")
    public Integer getIndicadorPreExistencia() {
        return indicadorPreExistencia;
    }

    public void setIndicadorPreExistencia(Integer indicadorPreExistencia) {
        this.indicadorPreExistencia = indicadorPreExistencia;
    }

    @Basic
    @Column(name = "IndicadorCronico")
    public Integer getIndicadorCronico() {
        return indicadorCronico;
    }

    public void setIndicadorCronico(Integer indicadorCronico) {
        this.indicadorCronico = indicadorCronico;
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
    @Column(name = "DetalleDiagnostico")
    public String getDetalleDiagnostico() {
        return detalleDiagnostico;
    }

    public void setDetalleDiagnostico(String detalleDiagnostico) {
        this.detalleDiagnostico = detalleDiagnostico;
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

        SsHcDiagnostico that = (SsHcDiagnostico) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (secuencia != that.secuencia) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;
        if (idDiagnostico != null ? !idDiagnostico.equals(that.idDiagnostico) : that.idDiagnostico != null)
            return false;
        if (idDiagnosticoValoracion != null ? !idDiagnosticoValoracion.equals(that.idDiagnosticoValoracion) : that.idDiagnosticoValoracion != null)
            return false;
        if (determinacionDiagnostica != null ? !determinacionDiagnostica.equals(that.determinacionDiagnostica) : that.determinacionDiagnostica != null)
            return false;
        if (idDiagnosticoPrincipal != null ? !idDiagnosticoPrincipal.equals(that.idDiagnosticoPrincipal) : that.idDiagnosticoPrincipal != null)
            return false;
        if (gradoAfeccion != null ? !gradoAfeccion.equals(that.gradoAfeccion) : that.gradoAfeccion != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (indicadorAntecedente != null ? !indicadorAntecedente.equals(that.indicadorAntecedente) : that.indicadorAntecedente != null)
            return false;
        if (tipoAntecedente != null ? !tipoAntecedente.equals(that.tipoAntecedente) : that.tipoAntecedente != null)
            return false;
        if (indicadorPreExistencia != null ? !indicadorPreExistencia.equals(that.indicadorPreExistencia) : that.indicadorPreExistencia != null)
            return false;
        if (indicadorCronico != null ? !indicadorCronico.equals(that.indicadorCronico) : that.indicadorCronico != null)
            return false;
        if (indicadorNuevo != null ? !indicadorNuevo.equals(that.indicadorNuevo) : that.indicadorNuevo != null)
            return false;
        if (detalleDiagnostico != null ? !detalleDiagnostico.equals(that.detalleDiagnostico) : that.detalleDiagnostico != null)
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
    	int result = unidadReplicacion != null ? unidadReplicacion.hashCode() : 0;
        result = 31 * result + (int) (idEpisodioAtencion ^ (idEpisodioAtencion >>> 32));
        result = 31 * result + idPaciente;
        result = 31 * result + episodioClinico;
        result = 31 * result + secuencia;
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (idDiagnostico != null ? idDiagnostico.hashCode() : 0);
        result = 31 * result + (idDiagnosticoValoracion != null ? idDiagnosticoValoracion.hashCode() : 0);
        result = 31 * result + (determinacionDiagnostica != null ? determinacionDiagnostica.hashCode() : 0);
        result = 31 * result + (idDiagnosticoPrincipal != null ? idDiagnosticoPrincipal.hashCode() : 0);
        result = 31 * result + (gradoAfeccion != null ? gradoAfeccion.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (indicadorAntecedente != null ? indicadorAntecedente.hashCode() : 0);
        result = 31 * result + (tipoAntecedente != null ? tipoAntecedente.hashCode() : 0);
        result = 31 * result + (indicadorPreExistencia != null ? indicadorPreExistencia.hashCode() : 0);
        result = 31 * result + (indicadorCronico != null ? indicadorCronico.hashCode() : 0);
        result = 31 * result + (indicadorNuevo != null ? indicadorNuevo.hashCode() : 0);
        result = 31 * result + (detalleDiagnostico != null ? detalleDiagnostico.hashCode() : 0);
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
