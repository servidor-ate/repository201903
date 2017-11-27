package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcCuidadoPreventivo;

public interface SsHcCuidadoPreventivoDao extends AbstractDao<SsHcCuidadoPreventivo, String> {

	public List<SsHcCuidadoPreventivo> listarSsHcCuidadoPreventivo(SsHcCuidadoPreventivo ssHcCuidadoPreventivo);

	public SsHcCuidadoPreventivo buscarSsHcCuidadoPreventivoID(SsHcCuidadoPreventivo ssHcCuidadoPreventivo);

	public int contadorDeTotales(SsHcCuidadoPreventivo ssHcCuidadoPreventivo);

	public int eliminarSsHcCuidadoPreventivo(SsHcCuidadoPreventivo ssHcCuidadoPreventivo);

	public int guardarSsHcCuidadoPreventivo(SsHcCuidadoPreventivo ssHcCuidadoPreventivo);
}
