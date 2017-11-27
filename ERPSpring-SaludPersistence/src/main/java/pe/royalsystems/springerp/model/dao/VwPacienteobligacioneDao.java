package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.vista.VwPacienteobligacione;

import java.util.List;

public interface VwPacienteobligacioneDao extends AbstractDao<VwPacienteobligacione, String>{

	public List<VwPacienteobligacione> listar(VwPacienteobligacione objgeDiagnostico,boolean paginable);
	
	public VwPacienteobligacione buscar(VwPacienteobligacione objgeDiagnostico);
	
	public int contar(VwPacienteobligacione objgeDiagnostico);
	
}
