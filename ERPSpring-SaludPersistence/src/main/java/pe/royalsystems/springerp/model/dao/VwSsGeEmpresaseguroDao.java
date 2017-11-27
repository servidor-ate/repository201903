package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.VwSsGeEmpresaseguro;

public interface VwSsGeEmpresaseguroDao extends AbstractDao<VwSsGeEmpresaseguro, String> {
	
	public List<VwSsGeEmpresaseguro> listarVwSsGeEmpresaseguro(VwSsGeEmpresaseguro vwSsGeEmpresaseguro);

	public VwSsGeEmpresaseguro buscarVwSsGeEmpresaseguroID(VwSsGeEmpresaseguro vwSsGeEmpresaseguro);

	public int contadorDeTotales(VwSsGeEmpresaseguro vwSsGeEmpresaseguro);

	public int eliminarVwSsGeEmpresaseguro(VwSsGeEmpresaseguro vwSsGeEmpresaseguro);

	public int guardarVwSsGeEmpresaseguro(VwSsGeEmpresaseguro vwSsGeEmpresaseguro);
}
