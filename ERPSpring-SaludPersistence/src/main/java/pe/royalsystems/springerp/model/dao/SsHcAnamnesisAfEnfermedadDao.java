package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfEnfermedad;

public interface SsHcAnamnesisAfEnfermedadDao extends AbstractDao<SsHcAnamnesisAfEnfermedad, String>{

	public int guardarSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad);
	
	public int updateSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad);
	
	public int eliminarSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad);
	
	public List<SsHcAnamnesisAfEnfermedad> listarSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad);

	public SsHcAnamnesisAfEnfermedad obtenerSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad);
	
}
