package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.WhClaseFamilia;

public interface WhClaseFamiliaDao extends AbstractDao<WhClaseFamilia, String>{

	public List<WhClaseFamilia> listaWhClaseFamiliaCombo(WhClaseFamilia objWhClaseFamilia);
	 
	public WhClaseFamilia obtenerwhClaseFamiliaID(WhClaseFamilia objWhClaseFamilia);
	
}
