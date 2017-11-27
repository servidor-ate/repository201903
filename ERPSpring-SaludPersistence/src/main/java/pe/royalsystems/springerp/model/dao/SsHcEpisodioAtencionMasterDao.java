package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionMaster;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionMasterPK;

public interface SsHcEpisodioAtencionMasterDao extends AbstractDao<SsHcEpisodioAtencionMaster, SsHcEpisodioAtencionMasterPK>{

	public long guardar(SsHcEpisodioAtencionMaster objSsHcEpisodioAtencionMaster);
	public int actualizar(SsHcEpisodioAtencionMaster  objssHcEpisodioAtencionMaster);
	public int eliminar(SsHcEpisodioAtencionMaster  objssHcEpisodioAtencionMaster);
	
	
}
