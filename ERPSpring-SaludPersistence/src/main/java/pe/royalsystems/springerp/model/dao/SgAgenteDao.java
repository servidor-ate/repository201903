package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SgAgente;

public interface SgAgenteDao extends AbstractDao<SgAgente, Integer>{
	
	public List<SgAgente> listarSsAgente(SgAgente objsgAgente);
	
	public List<SgAgente> listarElementos(SgAgente objsgAgente,boolean paginable);
	
	public int contadorTotalesRegistrosSsAgente(SgAgente objsgAgente);
	
	public int guardarSsAgente(SgAgente objsgAgente);
	
	public int actualizarSsAgente(SgAgente objsgAgente);
	
	public int eliminarSsAgente(SgAgente objsgAgente);
	
	public SgAgente obtenerPorId(Integer id);
	
	public SgAgente validarLogin(SgAgente objsgAgente);
	
}
