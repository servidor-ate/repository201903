package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcFormatoCampo;

public interface SsHcFormatoCampoDao extends AbstractDao<SsHcFormatoCampo, String> {

	public List<SsHcFormatoCampo> listarSsHcFormatoCampo(SsHcFormatoCampo ssHcFormatoCampo);

	public SsHcFormatoCampo buscarSsHcFormatoCampoID(SsHcFormatoCampo ssHcFormatoCampo);

	public int contadorDeTotales(SsHcFormatoCampo ssHcFormatoCampo);

	public int guardarSsHcFormatoCampo(SsHcFormatoCampo ssHcFormatoCampo);

	public int eliminarSsHcFormatoCampo(SsHcFormatoCampo ssHcFormatoCampo);
}
