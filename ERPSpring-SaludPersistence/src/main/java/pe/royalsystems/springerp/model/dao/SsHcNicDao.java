package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcNic;

public interface SsHcNicDao extends AbstractDao<SsHcNic, String> {
	public List<SsHcNic> listarSsHcNic(SsHcNic ssHcNic);

	public SsHcNic buscarSsHcNicID(SsHcNic ssHcNic);

	public int contadorDeTotales(SsHcNic ssHcNic);

	public int guardarSsHcNic(SsHcNic ssHcNic);

	public int eliminarSsHcNic(SsHcNic ssHcNic);
}
