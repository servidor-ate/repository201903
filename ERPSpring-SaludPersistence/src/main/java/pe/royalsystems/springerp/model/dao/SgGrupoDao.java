package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SgGrupo;

public interface SgGrupoDao extends AbstractDao<SgGrupo, String>{

	public List<SgGrupo> listarSgGrupo(SgGrupo objSgGrupo);
	
	public int contadorTotalesRegistrosSgGrupo(SgGrupo objSgGrupo);
	
}
