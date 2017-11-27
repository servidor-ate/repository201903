package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.TipoPago;

public interface TipoPagoDao extends AbstractDao<TipoPago, String>{
	
	public List<TipoPago> listarTipoPago(TipoPago objTipoPago);
	
	public int contadorTotales(TipoPago objTipoPago);
	
	public int guardarTipoPago(TipoPago objTipoPago);
	
	public int eliminarTipoPago(TipoPago objTipoPago);
	
	public TipoPago obtenerTipoPagoID(TipoPago objTipoPago);

}
