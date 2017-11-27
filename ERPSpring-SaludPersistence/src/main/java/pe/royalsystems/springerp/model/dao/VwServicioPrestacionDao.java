package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.VwServicioPrestacion;

public interface VwServicioPrestacionDao extends AbstractDao<VwServicioPrestacion, String> {

	public List<VwServicioPrestacion> listarVwServicioPrestacion(VwServicioPrestacion vwServicioPrestacion);

	public VwServicioPrestacion buscarVwServicioPrestacionID(VwServicioPrestacion vwServicioPrestacion);

	public int contadorDeTotales(VwServicioPrestacion vwServicioPrestacion);

	public int eliminarVwServicioPrestacion(VwServicioPrestacion vwServicioPrestacion);

	public int guardarVwServicioPrestacion(VwServicioPrestacion vwServicioPrestacion);
}
