package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcAuditRoyal;

public interface SsHcAuditRoyalDao extends AbstractDao<SsHcAuditRoyal, String> {
	
	public List<SsHcAuditRoyal> listarSsHcAuditRoyal(SsHcAuditRoyal objssHcAuditRoyal);
	
	public SsHcAuditRoyal buscarSsHcAuditRoyalID(SsHcAuditRoyal objssHcAuditRoyal);
	
	public int contadorTotalesRegistrosSsHcAuditRoyal(SsHcAuditRoyal objssHcAuditRoyal);
	
	
}
