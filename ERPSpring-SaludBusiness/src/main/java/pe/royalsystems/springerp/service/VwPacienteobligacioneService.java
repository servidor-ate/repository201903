package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.vista.VwPacienteobligacione;

import java.util.List;

public interface VwPacienteobligacioneService  {

	public List<VwPacienteobligacione> listar(VwPacienteobligacione objgeDiagnostico, boolean paginable);
	
	public VwPacienteobligacione buscar(VwPacienteobligacione objgeDiagnostico);
	
	public int contar(VwPacienteobligacione objgeDiagnostico);
	
}
