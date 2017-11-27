package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcNoc;

public interface SsHcNocDao extends AbstractDao<SsHcNoc, String> {

	
	public List<SsHcNoc> listarSsHcNoc(SsHcNoc objssHcNoc);

	public SsHcNoc buscarSsHcNocID(SsHcNoc objssHcNoc);
	
	public int contadorTotalesRegistrosSsHcNoc(SsHcNoc objssHcNoc);
	
	public int guardarSsHcNoc(SsHcNoc objssHcNoc);
	
	public int eliminarSsHcNoc(SsHcNoc objssHcNoc);
}
