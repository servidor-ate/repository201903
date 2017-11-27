package pe.royalsystems.springerp.model.dao;

import java.util.List;


import pe.royalsystems.springerp.model.domain.RmProyectoUsuario;

public interface RmProyectoUsuarioDao extends AbstractDao<RmProyectoUsuario, String>{
	
	public List<RmProyectoUsuario> listarRmProyectoUsuarioPaginacion(RmProyectoUsuario objRmProyectoUsuario);
	
	public int contadorTotales(RmProyectoUsuario objRmProyectoUsuario);
	
	public int guardarRmProyectoUsuario(RmProyectoUsuario objRmProyectoUsuario);
	
	public int eliminarRmProyectoUsuario(RmProyectoUsuario objRmProyectoUsuario);
	
	public RmProyectoUsuario obtenerRmProyectoUsuarioID(RmProyectoUsuario objRmProyectoUsuario);
	

}
