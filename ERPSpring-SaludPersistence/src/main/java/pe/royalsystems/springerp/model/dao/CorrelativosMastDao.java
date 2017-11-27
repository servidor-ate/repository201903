package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.commons.model.PaginaModel;
import pe.royalsystems.springerp.model.dao.AbstractDao;
import pe.royalsystems.springerp.model.domain.CorrelativosMast;
import pe.royalsystems.springerp.model.domain.CorrelativosMastPK;

public interface CorrelativosMastDao extends AbstractDao<CorrelativosMast, CorrelativosMastPK> {
	
	//Busqueda
	public int obtenerNumCorrelativo(CorrelativosMast objDao);
	//Busqueda
	public CorrelativosMast obtenerRegistro(CorrelativosMast objDao);
	//Paginado
	public PaginaModel<CorrelativosMast> ListarPaginado(CorrelativosMast filtro);
		
	// List
	public List<CorrelativosMast> Listar(CorrelativosMast filtro);
		
	//Transaccional
	public int guardar(CorrelativosMast objDao);
	public int actualizar(CorrelativosMast objDao);
	public int eliminar(CorrelativosMast objDao);

}
