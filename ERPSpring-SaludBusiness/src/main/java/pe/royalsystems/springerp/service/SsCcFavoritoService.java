package pe.royalsystems.springerp.service;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsCcFavorito;

public interface SsCcFavoritoService {
	
	public SsCcFavorito obtenerPorId(Integer id);
	public List<SsCcFavorito> listarElementos(SsCcFavorito filtro, boolean paginable);	
	public int contarElementos(SsCcFavorito filtro);		
		
	public int guardar(SsCcFavorito objDao);
	public int actualizar(SsCcFavorito objDao);
	public int eliminar(SsCcFavorito objDao);
}
