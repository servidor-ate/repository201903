package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.VwPersonapaciente;

import java.util.List;

public interface VwPersonapacienteService {

	public VwPersonapaciente obtenerPorId(Integer objDao);
	public List<VwPersonapaciente> listarElementosPag(VwPersonapaciente objDao);
	public List<VwPersonapaciente> listarElementos(VwPersonapaciente objDao);
	public int contarTotal(VwPersonapaciente objDao);
	
	public int guardarPersonaPaciente(VwPersonapaciente objDao);
	public int eliminar(VwPersonapaciente objDao);
	
	public VwPersonapaciente buscarVwPersonapacienteID(VwPersonapaciente paciente);
	
	
	/*
	public List<VwPersonapaciente> listarVwPersonapaciente(VwPersonapaciente objVwPersonapaciente);

	public VwPersonapaciente buscarVwPersonapacienteID(VwPersonapaciente objvwPersonapaciente);

	public VwPersonapaciente buscarVwPersonapacienteID2(VwPersonapaciente vwPersonapaciente);

	public int contadorTotalesVwPersonapaciente(VwPersonapaciente objVwPersonapaciente);

	public int eliminarVwPersonapaciente(VwPersonapaciente vwPersonapaciente);

	public int guardarVwPersonapaciente(VwPersonapaciente vwPersonapaciente);
	*/
}
