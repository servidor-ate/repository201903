package pe.royalsystems.springerp.service.exception;

import java.util.Date;

public class CitasPermitidasException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int numeroCitas;
	private int numeroMaximoCitas;
	private Date fecha;
	private String fechaStr;
	private int idEspecialidad;
	private String especialidadNombre;
	private int idMedico;
	private String medicoNombre;
	
	public CitasPermitidasException() {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroCitas() {
		return numeroCitas;
	}

	public void setNumeroCitas(int numeroCitas) {
		this.numeroCitas = numeroCitas;
	}

	public int getNumeroMaximoCitas() {
		return numeroMaximoCitas;
	}

	public void setNumeroMaximoCitas(int numeroMaximoCitas) {
		this.numeroMaximoCitas = numeroMaximoCitas;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFechaStr() {
		return fechaStr;
	}

	public void setFechaStr(String fechaStr) {
		this.fechaStr = fechaStr;
	}

	public String getEspecialidadNombre() {
		return especialidadNombre;
	}

	public void setEspecialidadNombre(String especialidadNombre) {
		this.especialidadNombre = especialidadNombre;
	}

	public String getMedicoNombre() {
		return medicoNombre;
	}

	public void setMedicoNombre(String medicoNombre) {
		this.medicoNombre = medicoNombre;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	
	
}
