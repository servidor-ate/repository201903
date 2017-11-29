package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetalle;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetallePK;

public interface SsCcFavoritoDetalleDao extends AbstractDao<SsCcFavoritoDetalle, SsCcFavoritoDetallePK> {
	
	public List<SsCcFavoritoDetalle> listarElementos(SsCcFavoritoDetalle filtro, boolean paginable);	
	public int contarElementos(SsCcFavoritoDetalle filtro);		
		
	public int guardar(SsCcFavoritoDetalle objDao);
	public int actualizar(SsCcFavoritoDetalle objDao);
	public int eliminar(SsCcFavoritoDetalle objDao);
}
