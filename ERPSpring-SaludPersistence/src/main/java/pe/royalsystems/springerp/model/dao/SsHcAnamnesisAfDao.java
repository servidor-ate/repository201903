package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAf;

public interface SsHcAnamnesisAfDao extends AbstractDao<SsHcAnamnesisAf, String>{

	public int guardarSsHcAnamnesisAf(SsHcAnamnesisAf objSsHcAnamnesisAf);
	
	public int elimnarSsHcAnamnesisAf(SsHcAnamnesisAf objSsHcAnamnesisAf);
	
	public List<SsHcAnamnesisAf> listarSsHcAnamnesisAf(SsHcAnamnesisAf objSsHcAnamnesisAf);
	
	public SsHcAnamnesisAf obtenerSsHcAnamnesisAf_ID(SsHcAnamnesisAf objSsHcAnamnesisAf);
	
}
