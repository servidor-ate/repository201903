package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.vista.VwAtencionpacienteTsalud;

public interface VwAtencionpacienteTsaludDao {

	public List<VwAtencionpacienteTsalud> listar(VwAtencionpacienteTsalud objFiltro, boolean paginado);	
	public int contarListado(VwAtencionpacienteTsalud objFiltro);
	
}
