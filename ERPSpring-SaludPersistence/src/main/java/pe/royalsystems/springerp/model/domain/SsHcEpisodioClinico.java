package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.*;

/**
 * Created by mamania on 03/09/2015.
 */
@Entity
@Table(name = "SS_HC_EpisodioClinico")
@IdClass(SsHcEpisodioClinicoPK.class)
public class SsHcEpisodioClinico extends Entidad {
    private String unidadReplicacion;
    private Integer idPaciente;
    private Integer episodioClinico;
    private Date fechaRegistro;
    private Date fechaCierre;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private Integer codigoEpisodioClinico;
    private Integer flagMedico;
    private Integer flagEnfermera;
    private String accion;
    private Integer idOrdenAtencion;

    @Id
    @Column(name = "UnidadReplicacion", nullable = false, insertable = true, updatable = true, length = 4)
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    @Id
    @Column(name = "IdPaciente", nullable = false, insertable = true, updatable = true)
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Id
    @Column(name = "EpisodioClinico", nullable = false, insertable = true, updatable = true)
    public Integer getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(Integer episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Basic
    @Column(name = "FechaRegistro", nullable = true, insertable = true, updatable = true)
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Basic
    @Column(name = "FechaCierre", nullable = true, insertable = true, updatable = true)
    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    @Basic
    @Column(name = "Estado", nullable = true, insertable = true, updatable = true)
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "UsuarioCreacion", nullable = true, insertable = true, updatable = true, length = 25)
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Basic
    @Column(name = "FechaCreacion", nullable = true, insertable = true, updatable = true)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "UsuarioModificacion", nullable = true, insertable = true, updatable = true, length = 25)
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Basic
    @Column(name = "FechaModificacion", nullable = true, insertable = true, updatable = true)
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }



    @Basic
    @Column(name = "CodigoEpisodioClinico", nullable = true, insertable = true, updatable = true)
    public Integer getCodigoEpisodioClinico() {
        return codigoEpisodioClinico;
    }

    public void setCodigoEpisodioClinico(Integer codigoEpisodioClinico) {
        this.codigoEpisodioClinico = codigoEpisodioClinico;
    }

    @Basic
    @Column(name = "FlagMedico", nullable = true, insertable = true, updatable = true)
    public Integer getFlagMedico() {
        return flagMedico;
    }

    public void setFlagMedico(Integer flagMedico) {
        this.flagMedico = flagMedico;
    }

    @Basic
    @Column(name = "FlagEnfermera", nullable = true, insertable = true, updatable = true)
    public Integer getFlagEnfermera() {
        return flagEnfermera;
    }

    public void setFlagEnfermera(Integer flagEnfermera) {
        this.flagEnfermera = flagEnfermera;
    }

    @Basic
    @Column(name = "ACCION", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "IdOrdenAtencion", nullable = true, insertable = true, updatable = true)
    public Integer getIdOrdenAtencion() {
        return idOrdenAtencion;
    }

    public void setIdOrdenAtencion(Integer idOrdenAtencion) {
        this.idOrdenAtencion = idOrdenAtencion;
    }
}
