package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsCcFavorito;

public interface SsCcFavoritoDao extends AbstractDao<SsCcFavorito, Integer> {
	
	public List<SsCcFavorito> listarElementos(SsCcFavorito filtro, boolean paginable);	
	public int contarElementos(SsCcFavorito filtro);		
		
	public int guardar(SsCcFavorito objDao);
	public int actualizar(SsCcFavorito objDao);
	public int eliminar(SsCcFavorito objDao);
}
