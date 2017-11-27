package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.GeUnidadMedida;

public interface GeUnidadMedidaDao extends AbstractDao<GeUnidadMedida, String>{
	
	public List<GeUnidadMedida> listarGeUnidadMedidaCombo(GeUnidadMedida objGeUnidadMedida);

}
