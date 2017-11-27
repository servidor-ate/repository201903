package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfamEnfermedad;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfamEnfermedadPK;

import java.util.List;

/**
 * Created by mamania on 23/05/2017.
 */
public interface SsHcAnamnesisAfamEnfermedadDao extends AbstractDao<SsHcAnamnesisAfamEnfermedad, SsHcAnamnesisAfamEnfermedadPK> {
	
	public SsHcAnamnesisAfamEnfermedad obtenerPorId(SsHcAnamnesisAfamEnfermedadPK ssHcAnamnesisEaPK);
	
    public int guardar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa);
    public int actualizar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa);
    public int eliminar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa);
    
    
    public SsHcAnamnesisAfamEnfermedad buscar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa);
    public List<SsHcAnamnesisAfamEnfermedad> listar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa);
}
