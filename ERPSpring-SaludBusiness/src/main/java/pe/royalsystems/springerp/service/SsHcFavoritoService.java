package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.SsHcFavorito;

public interface SsHcFavoritoService {

	public int guardarSsHcFavorito(SsHcFavorito objssHcFavorito);
	
	public int eliminarSsHcFavoritoDeAgente(SsHcFavorito objssHcFavorito);
	
	public SsHcFavorito buscarSsHcFavoritoID(SsHcFavorito objssHcFavorito);
	
}
