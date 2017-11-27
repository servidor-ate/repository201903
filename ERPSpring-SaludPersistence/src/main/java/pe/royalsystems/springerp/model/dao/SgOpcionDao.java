package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SgOpcion;

public interface SgOpcionDao extends AbstractDao<SgOpcion, Integer>{
	
	public int guardarSgOpcion(SgOpcion objsgOpcion);
	public int actualizarSgOpcion(SgOpcion objsgOpcion);
	public int eliminarSgOpcion(SgOpcion objSgOpcion);
	
	public SgOpcion obtenerSgOpcionID(Integer objSgOpcion);

}
