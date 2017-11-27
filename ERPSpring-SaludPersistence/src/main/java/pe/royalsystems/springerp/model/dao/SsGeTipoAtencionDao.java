package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeTipoAtencion;

public interface SsGeTipoAtencionDao extends AbstractDao<SsGeTipoAtencion, String> {

	public List<SsGeTipoAtencion> listarSsGeTipoAtencion(SsGeTipoAtencion ssGeTipoAtencion);

	public SsGeTipoAtencion buscarSsGeTipoAtencionID(SsGeTipoAtencion ssGeTipoAtencion);

	public int contadorDeTotales(SsGeTipoAtencion ssGeTipoAtencion);

	public int guardarSsGeTipoAtencion(SsGeTipoAtencion ssGeTipoAtencion);

	public int eliminarSsGeTipoAtencion(SsGeTipoAtencion ssGeTipoAtencion);
}
