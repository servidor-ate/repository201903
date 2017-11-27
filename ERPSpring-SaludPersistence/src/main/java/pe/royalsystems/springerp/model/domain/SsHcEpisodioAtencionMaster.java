package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.*;


/**
 * Created by mamania on 03/09/2015.
 */
@Entity
@Table(name = "SS_HC_EpisodioAtencionMaster")
@IdClass(SsHcEpisodioAtencionMasterPK.class)
public class SsHcEpisodioAtencionMaster  extends Entidad {
    private String unidadReplicacion;
    private Integer idPaciente;
    private Integer episodioClinico;
    private Long episodioAtencion;
    private String episodioAtencionCodigo;
    private Date fechaRegistro;
    private Date fechaAtencion;
    private Integer tipoAtencion;
    private Integer idOrdenAtencion;
    private String codigoOa;
    private Integer tipoOrdenAtencion;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private String proximaAtencionFlag;
    private Integer idTipoInterConsulta;
    private Integer idTipoReferencia;
    private String observacionProxima;
    private Integer flagFirma;
    private Date fechaFirma;
    private Integer idMedicoFirma;
    private String observacionFirma;
    private String keyPrivada;
    private String keyPublica;
    private String accion;
    private String version;

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

    @Id
    @Column(name = "EpisodioAtencion", nullable = false, insertable = true, updatable = true)
    public Long getEpisodioAtencion() {
        return episodioAtencion;
    }

    public void setEpisodioAtencion(Long episodioAtencion) {
        this.episodioAtencion = episodioAtencion;
    }

    @Basic
    @Column(name = "EpisodioAtencionCodigo", nullable = true, insertable = true, updatable = true, length = 100)
    public String getEpisodioAtencionCodigo() {
        return episodioAtencionCodigo;
    }

    public void setEpisodioAtencionCodigo(String episodioAtencionCodigo) {
        this.episodioAtencionCodigo = episodioAtencionCodigo;
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
    @Column(name = "FechaAtencion", nullable = true, insertable = true, updatable = true)
    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    @Basic
    @Column(name = "TipoAtencion", nullable = true, insertable = true, updatable = true)
    public Integer getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(Integer tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    @Basic
    @Column(name = "IdOrdenAtencion", nullable = true, insertable = true, updatable = true)
    public Integer getIdOrdenAtencion() {
        return idOrdenAtencion;
    }

    public void setIdOrdenAtencion(Integer idOrdenAtencion) {
        this.idOrdenAtencion = idOrdenAtencion;
    }

    @Basic
    @Column(name = "CodigoOA", nullable = true, insertable = true, updatable = true, length = 15)
    public String getCodigoOa() {
        return codigoOa;
    }

    public void setCodigoOa(String codigoOa) {
        this.codigoOa = codigoOa;
    }

    @Basic
    @Column(name = "TipoOrdenAtencion", nullable = true, insertable = true, updatable = true)
    public Integer getTipoOrdenAtencion() {
        return tipoOrdenAtencion;
    }

    public void setTipoOrdenAtencion(Integer tipoOrdenAtencion) {
        this.tipoOrdenAtencion = tipoOrdenAtencion;
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
    @Column(name = "ProximaAtencionFlag", nullable = true, insertable = true, updatable = true, length = 1)
    public String getProximaAtencionFlag() {
        return proximaAtencionFlag;
    }

    public void setProximaAtencionFlag(String proximaAtencionFlag) {
        this.proximaAtencionFlag = proximaAtencionFlag;
    }

    @Basic
    @Column(name = "IdTipoInterConsulta", nullable = true, insertable = true, updatable = true)
    public Integer getIdTipoInterConsulta() {
        return idTipoInterConsulta;
    }

    public void setIdTipoInterConsulta(Integer idTipoInterConsulta) {
        this.idTipoInterConsulta = idTipoInterConsulta;
    }

    @Basic
    @Column(name = "IdTipoReferencia", nullable = true, insertable = true, updatable = true)
    public Integer getIdTipoReferencia() {
        return idTipoReferencia;
    }

    public void setIdTipoReferencia(Integer idTipoReferencia) {
        this.idTipoReferencia = idTipoReferencia;
    }

    @Basic
    @Column(name = "ObservacionProxima", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getObservacionProxima() {
        return observacionProxima;
    }

    public void setObservacionProxima(String observacionProxima) {
        this.observacionProxima = observacionProxima;
    }

    @Basic
    @Column(name = "FlagFirma", nullable = true, insertable = true, updatable = true)
    public Integer getFlagFirma() {
        return flagFirma;
    }

    public void setFlagFirma(Integer flagFirma) {
        this.flagFirma = flagFirma;
    }

    @Basic
    @Column(name = "FechaFirma", nullable = true, insertable = true, updatable = true)
    public Date getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(Date fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    @Basic
    @Column(name = "idMedicoFirma", nullable = true, insertable = true, updatable = true)
    public Integer getIdMedicoFirma() {
        return idMedicoFirma;
    }

    public void setIdMedicoFirma(Integer idMedicoFirma) {
        this.idMedicoFirma = idMedicoFirma;
    }

    @Basic
    @Column(name = "ObservacionFirma", nullable = true, insertable = true, updatable = true, length = 300)
    public String getObservacionFirma() {
        return observacionFirma;
    }

    public void setObservacionFirma(String observacionFirma) {
        this.observacionFirma = observacionFirma;
    }

    @Basic
    @Column(name = "KeyPrivada", nullable = true, insertable = true, updatable = true)
    public String getKeyPrivada() {
        return keyPrivada;
    }

    public void setKeyPrivada(String keyPrivada) {
        this.keyPrivada = keyPrivada;
    }

    @Basic
    @Column(name = "KeyPublica", nullable = true, insertable = true, updatable = true)
    public String getKeyPublica() {
        return keyPublica;
    }

    public void setKeyPublica(String keyPublica) {
        this.keyPublica = keyPublica;
    }

    @Basic
    @Column(name = "Accion", nullable = true, insertable = true, updatable = true, length = 25)
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "Version", nullable = true, insertable = true, updatable = true, length = 25)
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

   
}
