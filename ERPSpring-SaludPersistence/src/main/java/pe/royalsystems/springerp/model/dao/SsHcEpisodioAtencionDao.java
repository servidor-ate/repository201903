package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencion;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionId;

import java.util.List;

public interface SsHcEpisodioAtencionDao extends AbstractDao<SsHcEpisodioAtencion, SsHcEpisodioAtencionId> {

	
	public SsHcEpisodioAtencion obtenerPorId(SsHcEpisodioAtencionId id);
	public List<SsHcEpisodioAtencion> listarElementosPag(SsHcEpisodioAtencion objDao);
	public List<SsHcEpisodioAtencion> listarElementos(SsHcEpisodioAtencion objDao); 			
	public int contarTotal(SsHcEpisodioAtencion objDao);
	
	public long actualizar(SsHcEpisodioAtencion objDao);
	public long guardar(SsHcEpisodioAtencion objDao);	
	public long eliminar(SsHcEpisodioAtencion objDao);
	
	
	

}
