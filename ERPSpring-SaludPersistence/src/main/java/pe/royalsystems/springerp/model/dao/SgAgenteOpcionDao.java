package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SgAgenteOpcion;

public interface SgAgenteOpcionDao extends AbstractDao<SgAgenteOpcion, String>{
	
	public int guardarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion);
	
	public int eliminarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion);
	
	public SgAgenteOpcion buscarSgAgenteOpcionID(SgAgenteOpcion objSgAgenteOpcion);

}
