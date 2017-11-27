package pe.royalsystems.springerp.model.dao;

import java.util.List;


import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionDetalle;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionDetallePK;

public interface SsAdOrdenAtencionDetalleDao {
	public SsAdOrdenAtencionDetalle obtenerPorId(SsAdOrdenAtencionDetallePK key);
	public List<SsAdOrdenAtencionDetalle> listarElementosPag(SsAdOrdenAtencionDetalle objDao);
	public List<SsAdOrdenAtencionDetalle> listarElementos(SsAdOrdenAtencionDetalle objDao); 			
	public int contarTotal(SsAdOrdenAtencionDetalle objDao);
	
	public int guardar(SsAdOrdenAtencionDetalle objDao);
	public int actualizar(SsAdOrdenAtencionDetalle objDao);
	public int eliminar(SsAdOrdenAtencionDetalle objDao);
}
