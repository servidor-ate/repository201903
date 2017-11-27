package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.WhClaseSubFamilia;

public interface WhClaseSubFamiliaDao extends AbstractDao<WhClaseSubFamilia, String>{

	public List<WhClaseSubFamilia> listarWhClaseSubFamiliaPaginacion(int inicio, int numeroFilas, WhClaseSubFamilia objWhClaseSubFamilia);
	
	public int contadorDeTotales(WhClaseSubFamilia objWhClaseSubFamilia);
	
	public WhClaseSubFamilia obterenerWhClaseSubFamiliaID(WhClaseSubFamilia objWhClaseSubFamilia);
	
}
