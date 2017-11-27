package pe.royalsystems.springerp.service.exception;

import org.joda.time.DateTime;

public class CruceReservaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String nombreMedico;
	private DateTime fechaReserva;
	private DateTime horaInicio;
	private DateTime horaFin;
	private Integer idHorario;
	private Integer idCita;
	private Integer idMedico;
	private Integer idPaciente;
	
	public CruceReservaException() {

	}

	public CruceReservaException(String nombreMedico, DateTime fechaReserva,
			DateTime horaInicio, DateTime horaFin) {
		super();
		this.nombreMedico = nombreMedico;
		this.fechaReserva = fechaReserva;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public CruceReservaException(String nombreMedico, DateTime fechaReserva,
			DateTime horaInicio, DateTime horaFin, Integer idHorario,
			Integer idCita, Integer idMedico, Integer idPaciente) {
		super();
		this.nombreMedico = nombreMedico;
		this.fechaReserva = fechaReserva;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.idHorario = idHorario;
		this.idCita = idCita;
		this.idMedico = idMedico;
		this.idPaciente = idPaciente;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public DateTime getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(DateTime fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public DateTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(DateTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public DateTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(DateTime horaFin) {
		this.horaFin = horaFin;
	}

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public Integer getIdCita() {
		return idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	
}
