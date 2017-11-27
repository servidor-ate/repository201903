package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by mamania on 24/05/2017.
 */
@Entity
@Table(name = "SS_HC_Anamnesis_AFAM" )
@IdClass(SsHcAnamnesisAfamPK.class)
public class SsHcAnamnesisAfam extends Entidad {
    private String unidadReplicacion;
    private Long idEpisodioAtencion;
    private Integer idPaciente;
    private Integer episodioClinico;
    private Integer secuenciaFamilia;
    private Integer idTipoParentesco;
    private Integer edad;
    private Integer idVivo;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private String accion;
    private String version;
    private List<SsHcAnamnesisAfamEnfermedad> ssHcAnamnesisAfamEnfermedad;
    //private List<SsHcAnamnesisAfamEnfermedad> afamEnfermedad;

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
    @Column(name = "SecuenciaFamilia")
    public Integer getSecuenciaFamilia() {
        return secuenciaFamilia;
    }

    public void setSecuenciaFamilia(Integer secuenciaFamilia) {
        this.secuenciaFamilia = secuenciaFamilia;
    }

    @Basic
    @Column(name = "IdTipoParentesco")
    public Integer getIdTipoParentesco() {
        return idTipoParentesco;
    }

    public void setIdTipoParentesco(Integer idTipoParentesco) {
        this.idTipoParentesco = idTipoParentesco;
    }

    @Basic
    @Column(name = "Edad")
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "IdVivo")
    public Integer getIdVivo() {
        return idVivo;
    }

    public void setIdVivo(Integer idVivo) {
        this.idVivo = idVivo;
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

        SsHcAnamnesisAfam that = (SsHcAnamnesisAfam) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (secuenciaFamilia != that.secuenciaFamilia) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;
        if (idTipoParentesco != null ? !idTipoParentesco.equals(that.idTipoParentesco) : that.idTipoParentesco != null)
            return false;
        if (edad != null ? !edad.equals(that.edad) : that.edad != null) return false;
        if (idVivo != null ? !idVivo.equals(that.idVivo) : that.idVivo != null) return false;
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
        result = 31 * result + secuenciaFamilia;
        result = 31 * result + (idTipoParentesco != null ? idTipoParentesco.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (idVivo != null ? idVivo.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

    //@OneToMany(mappedBy = "ssHcAnamnesisAfam" , fetch = FetchType.EAGER,cascade = CascadeType.ALL )
    //@JoinColumn(name)
    @Transient
    public List<SsHcAnamnesisAfamEnfermedad> getSsHcAnamnesisAfamEnfermedad() {
        return ssHcAnamnesisAfamEnfermedad;
    }

    public void setSsHcAnamnesisAfamEnfermedad(List<SsHcAnamnesisAfamEnfermedad> ssHcAnamnesisAfamEnfermedad) {
        this.ssHcAnamnesisAfamEnfermedad = ssHcAnamnesisAfamEnfermedad;
    }
   /* public List<SsHcAnamnesisAfamEnfermedad> getAfamEnfermedad() {
        return afamEnfermedad;
    }

    public void setAfamEnfermedad(List<SsHcAnamnesisAfamEnfermedad> afamEnfermedad) {
        this.afamEnfermedad = afamEnfermedad;
    }*/


}
