package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.CmCoEstablecimiento;

public interface CmCoEstablecimientoDao extends AbstractDao<CmCoEstablecimiento, Integer>{

	public List<CmCoEstablecimiento> listarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento,boolean paginable);

	public CmCoEstablecimiento buscarCmCoEstablecimientoID(Integer id);

	public int contadorDeTotales(CmCoEstablecimiento cmCoEstablecimiento);

	public int eliminarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento);

	public int guardarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento);
	
	public int actualizarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento);
}
