package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcProcedimiento;

public interface SsHcProcedimientoDao extends AbstractDao<SsHcProcedimiento, String> {

	public List<SsHcProcedimiento> listarSsHcProcedimiento(SsHcProcedimiento ssHcProcedimiento);

	public SsHcProcedimiento buscarSsHcProcedimientoID(SsHcProcedimiento ssHcProcedimiento);

	public int contadorDeTotales(SsHcProcedimiento ssHcProcedimiento);

	public int guardarSsHcProcedimiento(SsHcProcedimiento ssHcProcedimiento);

	public int eliminarSsHcProcedimiento(SsHcProcedimiento ssHcProcedimiento);
}
