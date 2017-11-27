package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.Companyowner;

public interface CompanyownerDao extends AbstractDao<Companyowner, String> {

	public List<Companyowner> listarCompanyownerPaginacion(Companyowner objcompanyowner,boolean paginable );

	public Companyowner buscarCompanyownerID(Companyowner objcompanyowner);

	public int contadorTotalesRegistrosCompanyowner(Companyowner objcompanyowner);

	public int eliminarCompanyowner(Companyowner companyowner);

	public int guardarCompanyowner(Companyowner companyowner);
}
