package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.Afemst;


import java.util.List;

public interface AfemstDao extends AbstractDao<Afemst, String>{
	public List<Afemst> listarAfemstPaginacion(Afemst objAfemst);
	public List<Afemst>  AfemstListar(Afemst objAfemst);
	public int contadorTotales(Afemst objAfemst);
	public int guardarAfemst(Afemst objAfemst);
	public int eliminarAfemst(Afemst objAfemst);
	public Afemst obtenerAfemstID(Afemst objAfemst);
}
