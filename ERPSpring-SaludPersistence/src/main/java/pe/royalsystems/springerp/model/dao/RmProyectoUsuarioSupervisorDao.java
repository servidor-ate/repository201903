package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.RmProyectoUsuarioSupervisor;

public interface RmProyectoUsuarioSupervisorDao extends AbstractDao<RmProyectoUsuarioSupervisor, String>{

	public List<RmProyectoUsuarioSupervisor> listarRmProyectoUsuarioSupervisorPaginacion(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor);
	
	public int contadorTotales(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor);
	
	public int guardarRmProyectoUsuarioSupervisor(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor);
	
	public int eliminarRmProyectoUsuarioSupervisor(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor);
	
	public RmProyectoUsuarioSupervisor obtenerRmProyectoUsuarioSupervisorID(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor);
	
}
