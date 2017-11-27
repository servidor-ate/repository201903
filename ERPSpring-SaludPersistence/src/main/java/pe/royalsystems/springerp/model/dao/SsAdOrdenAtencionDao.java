package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencion;



public interface SsAdOrdenAtencionDao {
	public SsAdOrdenAtencion obtenerPorId(Integer key);
	public List<SsAdOrdenAtencion> listarElementosPag(SsAdOrdenAtencion objDao);
	public List<SsAdOrdenAtencion> listarElementos(SsAdOrdenAtencion objDao); 			
	public int contarTotal(SsAdOrdenAtencion objDao);
	
	public int guardar(SsAdOrdenAtencion objDao);
	public int actualizar(SsAdOrdenAtencion objDao);
	public int eliminar(SsAdOrdenAtencion objDao);
}
