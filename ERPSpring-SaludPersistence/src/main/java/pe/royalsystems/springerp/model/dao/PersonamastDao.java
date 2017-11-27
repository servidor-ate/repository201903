package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.Personamast;

public interface PersonamastDao extends AbstractDao<Personamast, Integer> {

	public List<Personamast> listarPersonamast(Personamast personamast,boolean paginable);

	public Personamast obtenerPorId(Integer primaryKey);

	public int contadorDeTotales(Personamast personamast);

	public int eliminarPersonamast(Personamast personamast);

	public int guardarPersonamast(Personamast personamast);
	
	public int actualizar(Personamast personamast);
}
