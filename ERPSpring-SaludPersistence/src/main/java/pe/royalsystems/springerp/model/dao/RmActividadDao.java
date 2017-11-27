package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.RmActividad;

public interface RmActividadDao extends AbstractDao<RmActividad, String>{
	
	public List<RmActividad> listarRmActividadPaginacion(RmActividad objRmActividad);
	
	public int contadorTotales(RmActividad objRmActividad);
	
	public int guardarRmActividad(RmActividad objRmActividad);
	
	public int eliminarRmActividad(RmActividad objRmActividad);
	
	public RmActividad obtenerRmActividadID(RmActividad objRmActividad);
	
}
