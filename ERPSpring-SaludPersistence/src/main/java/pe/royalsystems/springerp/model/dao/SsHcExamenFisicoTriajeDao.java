package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcExamenFisicoTriaje;
import pe.royalsystems.springerp.model.domain.SsHcExamenFisicoTriajeId;

public interface SsHcExamenFisicoTriajeDao extends AbstractDao<SsHcExamenFisicoTriaje, SsHcExamenFisicoTriajeId>{

	public int guardar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje);
	public int actualizar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje);
	public int eliminar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje);
	
	public List<SsHcExamenFisicoTriaje> listar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje);
	
	public SsHcExamenFisicoTriaje obtenerPorID(SsHcExamenFisicoTriajeId id);
	
	
}
