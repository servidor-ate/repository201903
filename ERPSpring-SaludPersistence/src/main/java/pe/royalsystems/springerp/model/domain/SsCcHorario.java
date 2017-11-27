package pe.royalsystems.springerp.model.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by mamania on 04/10/2016.
 */
@Entity
@Table(name = "SS_CC_Horario")
public class SsCcHorario extends Entidad{

	private static final long serialVersionUID = 1L;
	private Integer idHorario;
    private Integer idServicio;
    private Integer medico;
    private Integer idEspecialidad;
    private Integer idConsultorio;
    private Integer periodo;
    private Integer idTurno;
    private Date fechaInicio;
    private Date fechaFin;
    private Date horaInicio;
    private Date horaFin;
    private Date fechaInicioHorario;
    private Date fechaFinHorario;
    private Integer tipoUso;
    private Integer indicadorLunes;
    private Integer indicadorMartes;
    private Integer indicadorMiercoles;
    private Integer indicadorJueves;
    private Integer indicadorViernes;
    private Integer indicadorSabado;
    private Integer indicadorDomingo;
    private Integer tipoGeneracionCita;
    private BigDecimal tiempoPromedioAtencion;
    private Integer estado;
    private String usuarioCreacion;
    private Timestamp fechaCreacion;
    private String usuarioModificacion;
    private Timestamp fechaModificacion;
    private Integer tipoRegistroHorario;
    private Integer indicadorCompartido;
    private Integer idGrupoAtencionCompartido;
    private Integer idInasistencia;
    private Integer indicadorCitaMultiple;
//    private Integer indicadorAplicaAdicional;
//    private Integer cantidadCitasAdicional;
    private String unidadReplicacion;

    @Id
    @Basic
    @Column(name = "IdHorario")
    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
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
    @Column(name = "Medico")
    public Integer getMedico() {
        return medico;
    }

    public void setMedico(Integer medico) {
        this.medico = medico;
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
    @Column(name = "IdConsultorio")
    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    @Basic
    @Column(name = "Periodo")
    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    @Basic
    @Column(name = "IdTurno")
    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
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
    @Column(name = "HoraInicio")
    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Basic
    @Column(name = "HoraFin")
    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    @Basic
    @Column(name = "FechaInicioHorario")
    public Date getFechaInicioHorario() {
        return fechaInicioHorario;
    }

    public void setFechaInicioHorario(Date fechaInicioHorario) {
        this.fechaInicioHorario = fechaInicioHorario;
    }

    @Basic
    @Column(name = "FechaFinHorario")
    public Date getFechaFinHorario() {
        return fechaFinHorario;
    }

    public void setFechaFinHorario(Date fechaFinHorario) {
        this.fechaFinHorario = fechaFinHorario;
    }

    @Basic
    @Column(name = "TipoUso")
    public Integer getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(Integer tipoUso) {
        this.tipoUso = tipoUso;
    }

    @Basic
    @Column(name = "IndicadorLunes")
    public Integer getIndicadorLunes() {
        return indicadorLunes;
    }

    public void setIndicadorLunes(Integer indicadorLunes) {
        this.indicadorLunes = indicadorLunes;
    }

    @Basic
    @Column(name = "IndicadorMartes")
    public Integer getIndicadorMartes() {
        return indicadorMartes;
    }

    public void setIndicadorMartes(Integer indicadorMartes) {
        this.indicadorMartes = indicadorMartes;
    }

    @Basic
    @Column(name = "IndicadorMiercoles")
    public Integer getIndicadorMiercoles() {
        return indicadorMiercoles;
    }

    public void setIndicadorMiercoles(Integer indicadorMiercoles) {
        this.indicadorMiercoles = indicadorMiercoles;
    }

    @Basic
    @Column(name = "IndicadorJueves")
    public Integer getIndicadorJueves() {
        return indicadorJueves;
    }

    public void setIndicadorJueves(Integer indicadorJueves) {
        this.indicadorJueves = indicadorJueves;
    }

    @Basic
    @Column(name = "IndicadorViernes")
    public Integer getIndicadorViernes() {
        return indicadorViernes;
    }

    public void setIndicadorViernes(Integer indicadorViernes) {
        this.indicadorViernes = indicadorViernes;
    }

    @Basic
    @Column(name = "IndicadorSabado")
    public Integer getIndicadorSabado() {
        return indicadorSabado;
    }

    public void setIndicadorSabado(Integer indicadorSabado) {
        this.indicadorSabado = indicadorSabado;
    }

    @Basic
    @Column(name = "IndicadorDomingo")
    public Integer getIndicadorDomingo() {
        return indicadorDomingo;
    }

    public void setIndicadorDomingo(Integer indicadorDomingo) {
        this.indicadorDomingo = indicadorDomingo;
    }

    @Basic
    @Column(name = "TipoGeneracionCita")
    public Integer getTipoGeneracionCita() {
        return tipoGeneracionCita;
    }

    public void setTipoGeneracionCita(Integer tipoGeneracionCita) {
        this.tipoGeneracionCita = tipoGeneracionCita;
    }

    @Basic
    @Column(name = "TiempoPromedioAtencion")
    public BigDecimal getTiempoPromedioAtencion() {
        return tiempoPromedioAtencion;
    }

    public void setTiempoPromedioAtencion(BigDecimal tiempoPromedioAtencion) {
        this.tiempoPromedioAtencion = tiempoPromedioAtencion;
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
    @Column(name = "TipoRegistroHorario")
    public Integer getTipoRegistroHorario() {
        return tipoRegistroHorario;
    }

    public void setTipoRegistroHorario(Integer tipoRegistroHorario) {
        this.tipoRegistroHorario = tipoRegistroHorario;
    }

    @Basic
    @Column(name = "IndicadorCompartido")
    public Integer getIndicadorCompartido() {
        return indicadorCompartido;
    }

    public void setIndicadorCompartido(Integer indicadorCompartido) {
        this.indicadorCompartido = indicadorCompartido;
    }

    @Basic
    @Column(name = "IdGrupoAtencionCompartido")
    public Integer getIdGrupoAtencionCompartido() {
        return idGrupoAtencionCompartido;
    }

    public void setIdGrupoAtencionCompartido(Integer idGrupoAtencionCompartido) {
        this.idGrupoAtencionCompartido = idGrupoAtencionCompartido;
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
    @Column(name = "IndicadorCitaMultiple")
    public Integer getIndicadorCitaMultiple() {
        return indicadorCitaMultiple;
    }

    public void setIndicadorCitaMultiple(Integer indicadorCitaMultiple) {
        this.indicadorCitaMultiple = indicadorCitaMultiple;
    }

//    @Basic
//    @Column(name = "IndicadorAplicaAdicional")
//    public Integer getIndicadorAplicaAdicional() {
//        return indicadorAplicaAdicional;
//    }
//
//    public void setIndicadorAplicaAdicional(Integer indicadorAplicaAdicional) {
//        this.indicadorAplicaAdicional = indicadorAplicaAdicional;
//    }

//    @Basic
//    @Column(name = "CantidadCitasAdicional")
//    public Integer getCantidadCitasAdicional() {
//        return cantidadCitasAdicional;
//    }
//
//    public void setCantidadCitasAdicional(Integer cantidadCitasAdicional) {
//        this.cantidadCitasAdicional = cantidadCitasAdicional;
//    }

    @Basic
    @Column(name = "UnidadReplicacion")
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

  
}
