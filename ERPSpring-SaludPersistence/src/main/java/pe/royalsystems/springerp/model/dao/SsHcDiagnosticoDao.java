package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcDiagnostico;
import pe.royalsystems.springerp.model.domain.SsHcDiagnosticoPK;

public interface SsHcDiagnosticoDao extends AbstractDao<SsHcDiagnostico, SsHcDiagnosticoPK>{

	public List<SsHcDiagnostico> listarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico);
	
	public int guardarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico);
	public int actualizarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico);
	public int eliminarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico);
	
	public SsHcDiagnostico obtenerSsHcDiagnosticoID(SsHcDiagnostico objSsHcDiagnostico);
	
	
}
