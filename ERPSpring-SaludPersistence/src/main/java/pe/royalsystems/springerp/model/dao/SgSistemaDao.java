package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SgSistema;

public interface SgSistemaDao extends AbstractDao<SgSistema, String>{

	public List<SgSistema> listaSgSistemaCombo(SgSistema objSgSistema);
	
}
