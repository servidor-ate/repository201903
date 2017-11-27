package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.SgOpcion;

public interface SgOpcionService {

	public int guardarSgOpcion(SgOpcion objsgOpcion);
	public int actualizarSgOpcion(SgOpcion objsgOpcion);
	public int eliminarSgOpcion(SgOpcion objSgOpcion);
	
	public SgOpcion obtenerSgOpcionID(Integer id);
	
}
