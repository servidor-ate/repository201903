package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.VEpisodioAtenciones;

public interface VEpisodioAtencionesDao extends AbstractDao<VEpisodioAtenciones, String>{

   public List<VEpisodioAtenciones> listarVEpisodioAtenciones(VEpisodioAtenciones objVEpisodioAtenciones);
   
   public int contadorTotalesVEpisodioAtenciones(VEpisodioAtenciones objVEpisodioAtenciones);
	
}
