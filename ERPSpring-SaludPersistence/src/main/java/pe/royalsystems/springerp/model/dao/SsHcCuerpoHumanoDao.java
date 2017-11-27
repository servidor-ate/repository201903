package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcCuerpoHumano;

public interface SsHcCuerpoHumanoDao extends AbstractDao<SsHcCuerpoHumano, String> {

	public List<SsHcCuerpoHumano> listaSsHcCuerpoHumano(SsHcCuerpoHumano objSsHcCuerpoHumano);

	public SsHcCuerpoHumano buscarSsHcCuerpoHumanoID(SsHcCuerpoHumano objSsHcCuerpoHumano);

	public int contadorDeTotales(SsHcCuerpoHumano objSsHcCuerpoHumano);

	public int guardarSsHcCuerpoHumano(SsHcCuerpoHumano objSsHcCuerpoHumano);

	public int eliminarSsHcCuerpoHumano(SsHcCuerpoHumano objSsHcCuerpoHumano);
}
