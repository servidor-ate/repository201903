package pe.royalsystems.springerp.service;

import java.util.List;

import pe.royalsystems.springerp.commons.model.ResultTx;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetalle;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetallePK;

public interface SsCcFavoritoDetalleService {
	
	public SsCcFavoritoDetalle obtenerPorId(SsCcFavoritoDetallePK id);
	public List<SsCcFavoritoDetalle> listarElementos(SsCcFavoritoDetalle filtro, boolean paginable);	
	public int contarElementos(SsCcFavoritoDetalle filtro);		
		
	public ResultTx<SsCcFavoritoDetalle> guardarDefaultFavoritoMedico(Integer idAgente, Integer idMedico);
	public ResultTx<SsCcFavoritoDetalle> guardarDefaultFavoritoEspecialidad(Integer idAgente, Integer idEspecialidad);
	
	public int guardar(SsCcFavoritoDetalle objDao);
	public int actualizar(SsCcFavoritoDetalle objDao);
	public int eliminar(SsCcFavoritoDetalle objDao);
}
