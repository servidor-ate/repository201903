package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SgModulo;

public interface SgModuloDao extends AbstractDao<SgModulo, String> {

	public List<SgModulo> listarSgModulo(SgModulo objsgModulo);

	public int contadorTotales(SgModulo objsgModulo);
	
	public int guardarSgModulo(SgModulo objsgModulo);
	
	public int eliminarSgModulo(SgModulo objsgModulo);
	
	public SgModulo buscarSgModuloID(SgModulo objsgModulo);
	
}
