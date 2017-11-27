package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeDiagnostico;

public interface SsGeDiagnosticoDao extends AbstractDao<SsGeDiagnostico, Integer>{

	public List<SsGeDiagnostico> listarSsGeDiagnostico(SsGeDiagnostico objgeDiagnostico);
	
	public SsGeDiagnostico buscarSsGeDiagnosticoID(Integer id);
	
	public int contadorDeTotales(SsGeDiagnostico objgeDiagnostico);
	
}
