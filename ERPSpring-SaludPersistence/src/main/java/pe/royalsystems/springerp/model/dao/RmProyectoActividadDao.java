package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.RmProyectoActividad;

public interface RmProyectoActividadDao extends AbstractDao<RmProyectoActividad, String>{

	public List<RmProyectoActividad> listarRmProyectoActividadPaginacion(RmProyectoActividad objRmProyectoActividad);
	
	public int contadorTotales(RmProyectoActividad objRmProyectoActividad);
	
	public int guardarRmProyectoActividad(RmProyectoActividad objRmProyectoActividad);
	
	public int eliminarRmProyectoActividad(RmProyectoActividad objRmProyectoActividad);
	
	public RmProyectoActividad obtenerRmProyectoActividadID(RmProyectoActividad objRmProyectoActividad);
	
}
