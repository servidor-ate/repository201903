package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.WhItemMast;
import pe.royalsystems.springerp.model.domain.vista.VwItemMedicamento;

public interface WhItemMastDao extends AbstractDao<WhItemMast, String> {
	public List<WhItemMast> listarWhItemMast(WhItemMast whItemMast);

	public WhItemMast buscarWhItemMastID(WhItemMast whItemMast);

	public int contadorDeTotales(WhItemMast whItemMast);

	public int eliminarWhItemMast(WhItemMast whItemMast);

	public int guardarWhItemMast(WhItemMast whItemMast);
		
	public List<VwItemMedicamento> listarElementosVw(VwItemMedicamento objDao,boolean paginable); 			
	public int contarTotalVw(VwItemMedicamento objDao);
	
}
