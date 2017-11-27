package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.ParametrosMast;
import pe.royalsystems.springerp.model.domain.ParametrosMastId;


public interface ParametrosMastDao {
	public ParametrosMast obtenerPorId(ParametrosMastId id);	
	public List<ParametrosMast> listarElementos(ParametrosMast objDao,boolean paginable); 			
	public int contarTotal(ParametrosMast objDao);
	
	public int guardar(ParametrosMast objDao);
	public int actualizar(ParametrosMast objDao);
	public int eliminar(ParametrosMast objDao);
}
