package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.GeVarios;

import java.util.List;

public interface GeVariosDao extends AbstractDao<GeVarios, String>{
	
	public List<GeVarios> listarGeVariosCombo(GeVarios objGeVarios);
	public GeVarios buscar(GeVarios objGeVarios);
	
}
