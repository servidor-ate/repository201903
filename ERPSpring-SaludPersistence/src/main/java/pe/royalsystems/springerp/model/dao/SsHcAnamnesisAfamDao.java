package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfam;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfamPK;

import java.util.List;

public interface SsHcAnamnesisAfamDao extends AbstractDao<SsHcAnamnesisAfam, SsHcAnamnesisAfamPK> {
	
	public SsHcAnamnesisAfam obtenerPorId(SsHcAnamnesisAfamPK ssHcAnamnesisEaPk);
	
    public int guardar(SsHcAnamnesisAfam ssHcAnamnesisEa);
    public int actualizar(SsHcAnamnesisAfam ssHcAnamnesisEa);
    public int eliminar(SsHcAnamnesisAfam ssHcAnamnesisEa);
    public SsHcAnamnesisAfam buscar(SsHcAnamnesisAfam ssHcAnamnesisEa);
    public List<SsHcAnamnesisAfam> listar(SsHcAnamnesisAfam ssHcAnamnesisEa);
}
