package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.UnidadesMast;

public interface UnidadesMastDao extends AbstractDao<UnidadesMast, String> {
	
	public List<UnidadesMast> listarUnidadesMast(UnidadesMast unidadesMast);

	public UnidadesMast buscarUnidadesMastID(UnidadesMast unidadesMast);

	public int contadorDeTotales(UnidadesMast unidadesMast);

	public int eliminarUnidadesMast(UnidadesMast unidadesMast);

	public int guardarUnidadesMast(UnidadesMast unidadesMast);
}
