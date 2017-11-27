package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by mamania on 04/10/2016.
 */
@Entity
@Table(name = "SS_CC_Cita")
public class SsCcCita extends Entidad{

	private static final long serialVersionUID = 1L;
	
	private Integer idCita;
    private Integer idHorario;
    private Date fechaCita;
    private Date fechaLlegada;
    private Integer indicadorExcedente;
    private Integer indicadorHistoriaClinica;
    private Double duracionPromedio;
    private Double duracionReal;
    private Integer tipoCita;
    private String comentario;
    private Integer idPaciente;
    private Integer idInasistencia;
    private Integer indicadorInasistencia;
    private Integer indicadorReemplazo;
    private Integer tipoReemplazo;
    private Integer idMedicoReemplazo;
    private Date fechaReemplazo;
    private Integer motivoReemplazo;
    private String observacionReemplazo;
    private Integer estadoDocumento;
    private Integer estadoDocumentoAnterior;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private Integer idOrdenAtencion;
    private Integer lineaOrdenAtencion;
    private String motivoAnulacion;
    private Integer indicadorRegistroCompartido;
    private Integer idTipoAtencion;
    private Integer idGrupoAtencion;
    private Integer idServicio;
    private Integer idMedico;
    private Integer idPersonaAntUnificacion;
    private Date fechaCitaFecha;
    private Integer motivoCita;
    private Integer indicadorWeb;
//    private Integer tipoPaciente;
//    
//    private Integer estadoDocumentoPrograma;
//    private Integer indicadorReprogramadoWeb;
//    private String unidadReplicacion;
    private Integer idCitaRelacionada;
    private Integer tipoCoberturaAtencion;
    
    // NUEVOS ATRIBUTOS
    private Integer idEspecialidad;
    private String compania;
    private String unidadNegocio;
    private String sucursal;
    private String unidadReplicacion;
    private Integer secuencia;

    @Id
    @Column(name = "IdCita")
    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    @Basic
    @Column(name = "IdHorario")
    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    @Basic
    @Column(name = "FechaCita")
    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    @Basic
    @Column(name = "FechaLlegada")
    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    @Basic
    @Column(name = "IndicadorExcedente")
    public Integer getIndicadorExcedente() {
        return indicadorExcedente;
    }

    public void setIndicadorExcedente(Integer indicadorExcedente) {
        this.indicadorExcedente = indicadorExcedente;
    }

    @Basic
    @Column(name = "IndicadorHistoriaClinica")
    public Integer getIndicadorHistoriaClinica() {
        return indicadorHistoriaClinica;
    }

    public void setIndicadorHistoriaClinica(Integer indicadorHistoriaClinica) {
        this.indicadorHistoriaClinica = indicadorHistoriaClinica;
    }

    @Basic
    @Column(name = "DuracionPromedio")
    public Double getDuracionPromedio() {
        return duracionPromedio;
    }

    public void setDuracionPromedio(Double duracionPromedio) {
        this.duracionPromedio = duracionPromedio;
    }

    @Basic
    @Column(name = "DuracionReal")
    public Double getDuracionReal() {
        return duracionReal;
    }

    public void setDuracionReal(Double duracionReal) {
        this.duracionReal = duracionReal;
    }

    @Basic
    @Column(name = "TipoCita")
    public Integer getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(Integer tipoCita) {
        this.tipoCita = tipoCita;
    }

    @Basic
    @Column(name = "Comentario")
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Basic
    @Column(name = "IdPaciente")
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Basic
    @Column(name = "IdInasistencia")
    public Integer getIdInasistencia() {
        return idInasistencia;
    }

    public void setIdInasistencia(Integer idInasistencia) {
        this.idInasistencia = idInasistencia;
    }

    @Basic
    @Column(name = "IndicadorInasistencia")
    public Integer getIndicadorInasistencia() {
        return indicadorInasistencia;
    }

    public void setIndicadorInasistencia(Integer indicadorInasistencia) {
        this.indicadorInasistencia = indicadorInasistencia;
    }

    @Basic
    @Column(name = "IndicadorReemplazo")
    public Integer getIndicadorReemplazo() {
        return indicadorReemplazo;
    }

    public void setIndicadorReemplazo(Integer indicadorReemplazo) {
        this.indicadorReemplazo = indicadorReemplazo;
    }

    @Basic
    @Column(name = "TipoReemplazo")
    public Integer getTipoReemplazo() {
        return tipoReemplazo;
    }

    public void setTipoReemplazo(Integer tipoReemplazo) {
        this.tipoReemplazo = tipoReemplazo;
    }

    @Basic
    @Column(name = "IdMedicoReemplazo")
    public Integer getIdMedicoReemplazo() {
        return idMedicoReemplazo;
    }

    public void setIdMedicoReemplazo(Integer idMedicoReemplazo) {
        this.idMedicoReemplazo = idMedicoReemplazo;
    }

    @Basic
    @Column(name = "FechaReemplazo")
    public Date getFechaReemplazo() {
        return fechaReemplazo;
    }

    public void setFechaReemplazo(Date fechaReemplazo) {
        this.fechaReemplazo = fechaReemplazo;
    }

    @Basic
    @Column(name = "MotivoReemplazo")
    public Integer getMotivoReemplazo() {
        return motivoReemplazo;
    }

    public void setMotivoReemplazo(Integer motivoReemplazo) {
        this.motivoReemplazo = motivoReemplazo;
    }

    @Basic
    @Column(name = "ObservacionReemplazo")
    public String getObservacionReemplazo() {
        return observacionReemplazo;
    }

    public void setObservacionReemplazo(String observacionReemplazo) {
        this.observacionReemplazo = observacionReemplazo;
    }

    @Basic
    @Column(name = "EstadoDocumento")
    public Integer getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(Integer estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    @Basic
    @Column(name = "EstadoDocumentoAnterior")
    public Integer getEstadoDocumentoAnterior() {
        return estadoDocumentoAnterior;
    }

    public void setEstadoDocumentoAnterior(Integer estadoDocumentoAnterior) {
        this.estadoDocumentoAnterior = estadoDocumentoAnterior;
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
    @Column(name = "IdOrdenAtencion")
    public Integer getIdOrdenAtencion() {
        return idOrdenAtencion;
    }

    public void setIdOrdenAtencion(Integer idOrdenAtencion) {
        this.idOrdenAtencion = idOrdenAtencion;
    }

    @Basic
    @Column(name = "LineaOrdenAtencion")
    public Integer getLineaOrdenAtencion() {
        return lineaOrdenAtencion;
    }

    public void setLineaOrdenAtencion(Integer lineaOrdenAtencion) {
        this.lineaOrdenAtencion = lineaOrdenAtencion;
    }

    @Basic
    @Column(name = "MotivoAnulacion")
    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    @Basic
    @Column(name = "IndicadorRegistroCompartido")
    public Integer getIndicadorRegistroCompartido() {
        return indicadorRegistroCompartido;
    }

    public void setIndicadorRegistroCompartido(Integer indicadorRegistroCompartido) {
        this.indicadorRegistroCompartido = indicadorRegistroCompartido;
    }

    @Basic
    @Column(name = "IdTipoAtencion")
    public Integer getIdTipoAtencion() {
        return idTipoAtencion;
    }

    public void setIdTipoAtencion(Integer idTipoAtencion) {
        this.idTipoAtencion = idTipoAtencion;
    }

    @Basic
    @Column(name = "IdGrupoAtencion")
    public Integer getIdGrupoAtencion() {
        return idGrupoAtencion;
    }

    public void setIdGrupoAtencion(Integer idGrupoAtencion) {
        this.idGrupoAtencion = idGrupoAtencion;
    }

    @Basic
    @Column(name = "IdServicio")
    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    @Basic
    @Column(name = "IdMedico")
    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    @Basic
    @Column(name = "IdPersonaAntUnificacion")
    public Integer getIdPersonaAntUnificacion() {
        return idPersonaAntUnificacion;
    }

    public void setIdPersonaAntUnificacion(Integer idPersonaAntUnificacion) {
        this.idPersonaAntUnificacion = idPersonaAntUnificacion;
    }

    @Basic
    @Column(name = "FechaCitaFecha")
    public Date getFechaCitaFecha() {
        return fechaCitaFecha;
    }

    public void setFechaCitaFecha(Date fechaCitaFecha) {
        this.fechaCitaFecha = fechaCitaFecha;
    }

    @Basic
    @Column(name = "MotivoCita")
    public Integer getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(Integer motivoCita) {
        this.motivoCita = motivoCita;
    }

    @Basic
    @Column(name = "IndicadorWeb")
    public Integer getIndicadorWeb() {
        return indicadorWeb;
    }

    public void setIndicadorWeb(Integer indicadorWeb) {
        this.indicadorWeb = indicadorWeb;
    }

//    @Basic
//    @Column(name = "TipoPaciente")
//    public Integer getTipoPaciente() {
//        return tipoPaciente;
//    }
//
//    public void setTipoPaciente(Integer tipoPaciente) {
//        this.tipoPaciente = tipoPaciente;
//    }

//    @Basic
//    @Column(name = "TipoCoberturaAtencion")
//    public Integer getTipoCoberturaAtencion() {
//        return tipoCoberturaAtencion;
//    }
//
//    public void setTipoCoberturaAtencion(Integer tipoCoberturaAtencion) {
//        this.tipoCoberturaAtencion = tipoCoberturaAtencion;
//    }

//    @Basic
//    @Column(name = "EstadoDocumentoPrograma")
//    @Transient
//    public Integer getEstadoDocumentoPrograma() {
//        return estadoDocumentoPrograma;
//    }
//
//    public void setEstadoDocumentoPrograma(Integer estadoDocumentoPrograma) {
//        this.estadoDocumentoPrograma = estadoDocumentoPrograma;
//    }

//    @Basic
//    @Column(name = "IndicadorReprogramadoWeb")
//    public Integer getIndicadorReprogramadoWeb() {
//        return indicadorReprogramadoWeb;
//    }
//
//    public void setIndicadorReprogramadoWeb(Integer indicadorReprogramadoWeb) {
//        this.indicadorReprogramadoWeb = indicadorReprogramadoWeb;
//    }

//    @Basic
//    @Column(name = "UnidadReplicacion")
//    public String getUnidadReplicacion() {
//        return unidadReplicacion;
//    }
//
//    public void setUnidadReplicacion(String unidadReplicacion) {
//        this.unidadReplicacion = unidadReplicacion;
//    }
    
    @Basic
    @Column(name = "IdCitaRelacionada")
    public Integer getIdCitaRelacionada() {
		return idCitaRelacionada;
	}
    
    public void setIdCitaRelacionada(Integer idCitaRelacionada) {
		this.idCitaRelacionada = idCitaRelacionada;
	}
    
    @Basic
    @Column(name = "IdEspecialidad")
    public Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
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
	@Column(name = "UnidadNegocio")
	public String getUnidadNegocio() {
		return unidadNegocio;
	}

	public void setUnidadNegocio(String unidadNegocio) {
		this.unidadNegocio = unidadNegocio;
	}

	@Basic
	@Column(name = "Sucursal")
	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	@Basic
	@Column(name = "UnidadReplicacion")
	public String getUnidadReplicacion() {
		return unidadReplicacion;
	}

	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}

	@Basic
	@Column(name = "Secuencia")
	public Integer getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	
	@Column(name = "TipoCoberturaAtencion")
    public Integer getTipoCoberturaAtencion() {
		return tipoCoberturaAtencion;
	}

	public void setTipoCoberturaAtencion(Integer tipoCoberturaAtencion) {
		this.tipoCoberturaAtencion = tipoCoberturaAtencion;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsCcCita ssCcCita = (SsCcCita) o;

        if (idCita != ssCcCita.idCita) return false;
        if (idHorario != null ? !idHorario.equals(ssCcCita.idHorario) : ssCcCita.idHorario != null) return false;
        if (fechaCita != null ? !fechaCita.equals(ssCcCita.fechaCita) : ssCcCita.fechaCita != null) return false;
        if (fechaLlegada != null ? !fechaLlegada.equals(ssCcCita.fechaLlegada) : ssCcCita.fechaLlegada != null)
            return false;
        if (indicadorExcedente != null ? !indicadorExcedente.equals(ssCcCita.indicadorExcedente) : ssCcCita.indicadorExcedente != null)
            return false;
        if (indicadorHistoriaClinica != null ? !indicadorHistoriaClinica.equals(ssCcCita.indicadorHistoriaClinica) : ssCcCita.indicadorHistoriaClinica != null)
            return false;
        if (duracionPromedio != null ? !duracionPromedio.equals(ssCcCita.duracionPromedio) : ssCcCita.duracionPromedio != null)
            return false;
        if (duracionReal != null ? !duracionReal.equals(ssCcCita.duracionReal) : ssCcCita.duracionReal != null)
            return false;
        if (tipoCita != null ? !tipoCita.equals(ssCcCita.tipoCita) : ssCcCita.tipoCita != null) return false;
        if (comentario != null ? !comentario.equals(ssCcCita.comentario) : ssCcCita.comentario != null) return false;
        if (idPaciente != null ? !idPaciente.equals(ssCcCita.idPaciente) : ssCcCita.idPaciente != null) return false;
        if (idInasistencia != null ? !idInasistencia.equals(ssCcCita.idInasistencia) : ssCcCita.idInasistencia != null)
            return false;
        if (indicadorInasistencia != null ? !indicadorInasistencia.equals(ssCcCita.indicadorInasistencia) : ssCcCita.indicadorInasistencia != null)
            return false;
        if (indicadorReemplazo != null ? !indicadorReemplazo.equals(ssCcCita.indicadorReemplazo) : ssCcCita.indicadorReemplazo != null)
            return false;
        if (tipoReemplazo != null ? !tipoReemplazo.equals(ssCcCita.tipoReemplazo) : ssCcCita.tipoReemplazo != null)
            return false;
        if (idMedicoReemplazo != null ? !idMedicoReemplazo.equals(ssCcCita.idMedicoReemplazo) : ssCcCita.idMedicoReemplazo != null)
            return false;
        if (fechaReemplazo != null ? !fechaReemplazo.equals(ssCcCita.fechaReemplazo) : ssCcCita.fechaReemplazo != null)
            return false;
        if (motivoReemplazo != null ? !motivoReemplazo.equals(ssCcCita.motivoReemplazo) : ssCcCita.motivoReemplazo != null)
            return false;
        if (observacionReemplazo != null ? !observacionReemplazo.equals(ssCcCita.observacionReemplazo) : ssCcCita.observacionReemplazo != null)
            return false;
        if (estadoDocumento != null ? !estadoDocumento.equals(ssCcCita.estadoDocumento) : ssCcCita.estadoDocumento != null)
            return false;
        if (estadoDocumentoAnterior != null ? !estadoDocumentoAnterior.equals(ssCcCita.estadoDocumentoAnterior) : ssCcCita.estadoDocumentoAnterior != null)
            return false;
        if (estado != null ? !estado.equals(ssCcCita.estado) : ssCcCita.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(ssCcCita.usuarioCreacion) : ssCcCita.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(ssCcCita.fechaCreacion) : ssCcCita.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(ssCcCita.usuarioModificacion) : ssCcCita.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(ssCcCita.fechaModificacion) : ssCcCita.fechaModificacion != null)
            return false;
        if (idOrdenAtencion != null ? !idOrdenAtencion.equals(ssCcCita.idOrdenAtencion) : ssCcCita.idOrdenAtencion != null)
            return false;
        if (lineaOrdenAtencion != null ? !lineaOrdenAtencion.equals(ssCcCita.lineaOrdenAtencion) : ssCcCita.lineaOrdenAtencion != null)
            return false;
        if (motivoAnulacion != null ? !motivoAnulacion.equals(ssCcCita.motivoAnulacion) : ssCcCita.motivoAnulacion != null)
            return false;
        if (indicadorRegistroCompartido != null ? !indicadorRegistroCompartido.equals(ssCcCita.indicadorRegistroCompartido) : ssCcCita.indicadorRegistroCompartido != null)
            return false;
        if (idTipoAtencion != null ? !idTipoAtencion.equals(ssCcCita.idTipoAtencion) : ssCcCita.idTipoAtencion != null)
            return false;
        if (idGrupoAtencion != null ? !idGrupoAtencion.equals(ssCcCita.idGrupoAtencion) : ssCcCita.idGrupoAtencion != null)
            return false;
        if (idServicio != null ? !idServicio.equals(ssCcCita.idServicio) : ssCcCita.idServicio != null) return false;
        if (idMedico != null ? !idMedico.equals(ssCcCita.idMedico) : ssCcCita.idMedico != null) return false;
        if (idPersonaAntUnificacion != null ? !idPersonaAntUnificacion.equals(ssCcCita.idPersonaAntUnificacion) : ssCcCita.idPersonaAntUnificacion != null)
            return false;
        if (fechaCitaFecha != null ? !fechaCitaFecha.equals(ssCcCita.fechaCitaFecha) : ssCcCita.fechaCitaFecha != null)
            return false;
        if (motivoCita != null ? !motivoCita.equals(ssCcCita.motivoCita) : ssCcCita.motivoCita != null) return false;
        if (indicadorWeb != null ? !indicadorWeb.equals(ssCcCita.indicadorWeb) : ssCcCita.indicadorWeb != null)
            return false;
        if (idCitaRelacionada != null ? !idCitaRelacionada.equals(ssCcCita.idCitaRelacionada) : ssCcCita.idCitaRelacionada != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = idCita;
        result = 31 * result + (idHorario != null ? idHorario.hashCode() : 0);
        result = 31 * result + (fechaCita != null ? fechaCita.hashCode() : 0);
        result = 31 * result + (fechaLlegada != null ? fechaLlegada.hashCode() : 0);
        result = 31 * result + (indicadorExcedente != null ? indicadorExcedente.hashCode() : 0);
        result = 31 * result + (indicadorHistoriaClinica != null ? indicadorHistoriaClinica.hashCode() : 0);
        result = 31 * result + (duracionPromedio != null ? duracionPromedio.hashCode() : 0);
        result = 31 * result + (duracionReal != null ? duracionReal.hashCode() : 0);
        result = 31 * result + (tipoCita != null ? tipoCita.hashCode() : 0);
        result = 31 * result + (comentario != null ? comentario.hashCode() : 0);
        result = 31 * result + (idPaciente != null ? idPaciente.hashCode() : 0);
        result = 31 * result + (idInasistencia != null ? idInasistencia.hashCode() : 0);
        result = 31 * result + (indicadorInasistencia != null ? indicadorInasistencia.hashCode() : 0);
        result = 31 * result + (indicadorReemplazo != null ? indicadorReemplazo.hashCode() : 0);
        result = 31 * result + (tipoReemplazo != null ? tipoReemplazo.hashCode() : 0);
        result = 31 * result + (idMedicoReemplazo != null ? idMedicoReemplazo.hashCode() : 0);
        result = 31 * result + (fechaReemplazo != null ? fechaReemplazo.hashCode() : 0);
        result = 31 * result + (motivoReemplazo != null ? motivoReemplazo.hashCode() : 0);
        result = 31 * result + (observacionReemplazo != null ? observacionReemplazo.hashCode() : 0);
        result = 31 * result + (estadoDocumento != null ? estadoDocumento.hashCode() : 0);
        result = 31 * result + (estadoDocumentoAnterior != null ? estadoDocumentoAnterior.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (idOrdenAtencion != null ? idOrdenAtencion.hashCode() : 0);
        result = 31 * result + (lineaOrdenAtencion != null ? lineaOrdenAtencion.hashCode() : 0);
        result = 31 * result + (motivoAnulacion != null ? motivoAnulacion.hashCode() : 0);
        result = 31 * result + (indicadorRegistroCompartido != null ? indicadorRegistroCompartido.hashCode() : 0);
        result = 31 * result + (idTipoAtencion != null ? idTipoAtencion.hashCode() : 0);
        result = 31 * result + (idGrupoAtencion != null ? idGrupoAtencion.hashCode() : 0);
        result = 31 * result + (idServicio != null ? idServicio.hashCode() : 0);
        result = 31 * result + (idMedico != null ? idMedico.hashCode() : 0);
        result = 31 * result + (idPersonaAntUnificacion != null ? idPersonaAntUnificacion.hashCode() : 0);
        result = 31 * result + (fechaCitaFecha != null ? fechaCitaFecha.hashCode() : 0);
        result = 31 * result + (motivoCita != null ? motivoCita.hashCode() : 0);
        result = 31 * result + (indicadorWeb != null ? indicadorWeb.hashCode() : 0);
        result = 31 * result + (idCitaRelacionada != null ? idCitaRelacionada.hashCode() : 0);
        return result;
    }
}
