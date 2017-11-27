package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcFavorito;

public interface SsHcFavoritoDao extends AbstractDao<SsHcFavorito, String>{
	
	public int guardarSsHcFavorito(SsHcFavorito objssHcFavorito);
	
	public int eliminarSsHcFavoritoDeAgente(SsHcFavorito objssHcFavorito);
	
	public SsHcFavorito buscarSsHcFavoritoID(SsHcFavorito objssHcFavorito);

}
