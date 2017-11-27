package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeComponentePrestacion;

public interface SsGeComponentePrestacionDao extends AbstractDao<SsGeComponentePrestacion, String> {

	public List<SsGeComponentePrestacion> listarSsGeComponentePrestacion(
			SsGeComponentePrestacion ssGeComponentePrestacion);

	public SsGeComponentePrestacion buscarSsGeComponentePrestacionID(SsGeComponentePrestacion ssGeComponentePrestacion);

	public int contadorDeTotales(SsGeComponentePrestacion ssGeComponentePrestacion);

	public int guardarSsGeComponentePrestacion(SsGeComponentePrestacion ssGeComponentePrestacion);

	public int eliminarSsGeComponentePrestacion(SsGeComponentePrestacion ssGeComponentePrestacion);
}
