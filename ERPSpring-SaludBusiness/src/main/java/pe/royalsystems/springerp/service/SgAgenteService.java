package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.SgAgente;

import java.util.List;

public interface SgAgenteService {

	public List<SgAgente> listarSsAgente(SgAgente objsgAgente);
	
	public List<SgAgente> listarElementos(SgAgente objsgAgente, boolean paginable);

	public int contadorTotalesRegistrosSsAgente(SgAgente objsgAgente);

	public int guardarSsAgente(SgAgente objsgAgente);
	
	public int actualizarSsAgente(SgAgente objsgAgente);

	public SgAgente obtenerPorId(Integer objsgAgente);
	
	public SgAgente validarLogin(SgAgente objsgAgente);
	

}
