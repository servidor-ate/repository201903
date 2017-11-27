package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAp;

public interface SsHcAnamnesisApDao extends AbstractDao<SsHcAnamnesisAp, String>{

	public List<SsHcAnamnesisAp> listarSsHcAnamnesisApXPaciente(SsHcAnamnesisAp objSsHcAnamnesisAp);
	
}
