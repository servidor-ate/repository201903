package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.AcCostCenterMst;

public interface AcCostCenterMstDao extends AbstractDao<AcCostCenterMst, String>{

	public List<AcCostCenterMst> listaComboAcCostCenterMst(AcCostCenterMst objAcCostCenterMst);
	
	public AcCostCenterMst obtenerAcCostCenterMstID(AcCostCenterMst objAcCostCenterMst);
	
	public List<AcCostCenterMst> listaPaginacionAcCostCenterMst(AcCostCenterMst objAcCostCenterMst);
	
	public int contadorTotalesAcCostCenterMst(AcCostCenterMst objAcCostCenterMst);
	
}
