package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcIndicaciones;
import pe.royalsystems.springerp.model.domain.SsHcIndicacionesId;

public interface SsHcIndicacionesDao extends AbstractDao<SsHcIndicaciones, SsHcIndicacionesId>{

	public List<SsHcIndicaciones> listaSsHcIndicaciones(SsHcIndicaciones objSsHcIndicaciones);
	
	public int guardar(SsHcIndicaciones objSsHcIndicaciones);
	public int actualizar(SsHcIndicaciones objSsHcIndicaciones);
	public int eliminar(SsHcIndicaciones objsHcIndicaciones);

}
