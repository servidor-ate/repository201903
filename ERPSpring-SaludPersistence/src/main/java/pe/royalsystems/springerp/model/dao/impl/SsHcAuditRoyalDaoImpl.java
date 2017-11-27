package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcAuditRoyalDao;
import pe.royalsystems.springerp.model.domain.SsHcAuditRoyal;

@Repository
public class SsHcAuditRoyalDaoImpl extends AbstractDaoImpl<SsHcAuditRoyal, String> implements SsHcAuditRoyalDao{

	protected SsHcAuditRoyalDaoImpl() {
		super(SsHcAuditRoyal.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsHcAuditRoyal> listarSsHcAuditRoyal(SsHcAuditRoyal objssHcAuditRoyal) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcAuditRoyal.class);
			
			if(objssHcAuditRoyal.getAuditId() != 0){
				criteria.add(Restrictions.eq("auditId", objssHcAuditRoyal.getAuditId()));
			}
			if(objssHcAuditRoyal.getHostName() != null){
				criteria.add(Restrictions.like("hostName", objssHcAuditRoyal.getHostName(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objssHcAuditRoyal.getAplicacion() != null){
				criteria.add(Restrictions.eq("aplicacion", objssHcAuditRoyal.getAplicacion()));
			}
			if(objssHcAuditRoyal.getModulo() != null){
				criteria.add(Restrictions.eq("modulo", objssHcAuditRoyal.getModulo()));
			}
			if(objssHcAuditRoyal.getUsuario() != null){
				criteria.add(Restrictions.like("usuario", objssHcAuditRoyal.getUsuario(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objssHcAuditRoyal.getType() != null){
				criteria.add(Restrictions.eq("type", objssHcAuditRoyal.getType()));
				
			}
			if(objssHcAuditRoyal.getTableName() != null){
				criteria.add(Restrictions.eq("tableName", objssHcAuditRoyal.getTableName()));
				
			}
			if(objssHcAuditRoyal.getTableIdValue() != null){
				criteria.add(Restrictions.eq("tableIdValue", objssHcAuditRoyal.getTableIdValue()));
				
			}
			if(objssHcAuditRoyal.getPrimaryKeyData() != null){
				criteria.add(Restrictions.eq("primaryKeyData", objssHcAuditRoyal.getPrimaryKeyData()));
				
			}
			if(objssHcAuditRoyal.getOldData() != null){
				criteria.add(Restrictions.eq("oldData", objssHcAuditRoyal.getOldData()));
				
			}
			if(objssHcAuditRoyal.getNewData() != null){
				criteria.add(Restrictions.eq("newData", objssHcAuditRoyal.getNewData()));
				
			}
			if(objssHcAuditRoyal.getUpdateDate() != null){
				criteria.add(Restrictions.eq("updateDate", objssHcAuditRoyal.getUpdateDate()));
				
			}
			if(objssHcAuditRoyal.getVistaData() != null){
				criteria.add(Restrictions.eq("vistaData", objssHcAuditRoyal.getVistaData()));
				
			}
			
			criteria.setFirstResult(objssHcAuditRoyal.getInicio());
			criteria.setMaxResults(objssHcAuditRoyal.getNumeroFilas());
			
			List<SsHcAuditRoyal> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcAuditRoyal buscarSsHcAuditRoyalID(SsHcAuditRoyal objssHcAuditRoyal) {
		// TODO Auto-generated method stub
		try {
			System.out.println("objssHcAuditRoyal.getAuditId() DAO = " + objssHcAuditRoyal.getAuditId());
			SsHcAuditRoyal ssHcAuditRoyalRetorno;
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcAuditRoyal.class);
			criteria.add(Restrictions.eq("auditId", objssHcAuditRoyal.getAuditId()));
			
			ssHcAuditRoyalRetorno = (SsHcAuditRoyal) criteria.uniqueResult();
			return ssHcAuditRoyalRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesRegistrosSsHcAuditRoyal(SsHcAuditRoyal objssHcAuditRoyal) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcAuditRoyal.class);
			criteria.setProjection(Projections.rowCount());
			
			if(objssHcAuditRoyal.getAuditId() != 0){
				criteria.add(Restrictions.eq("auditId", objssHcAuditRoyal.getAuditId()));
			}
			if(objssHcAuditRoyal.getHostName() != null){
				criteria.add(Restrictions.like("hostName", objssHcAuditRoyal.getHostName(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objssHcAuditRoyal.getAplicacion() != null){
				criteria.add(Restrictions.eq("aplicacion", objssHcAuditRoyal.getAplicacion()));
			}
			if(objssHcAuditRoyal.getModulo() != null){
				criteria.add(Restrictions.eq("modulo", objssHcAuditRoyal.getModulo()));
			}
			if(objssHcAuditRoyal.getUsuario() != null){
				criteria.add(Restrictions.like("usuario", objssHcAuditRoyal.getUsuario(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objssHcAuditRoyal.getType() != null){
				criteria.add(Restrictions.eq("type", objssHcAuditRoyal.getType()));
				
			}
			if(objssHcAuditRoyal.getTableName() != null){
				criteria.add(Restrictions.eq("tableName", objssHcAuditRoyal.getTableName()));
				
			}
			if(objssHcAuditRoyal.getTableIdValue() != null){
				criteria.add(Restrictions.eq("tableIdValue", objssHcAuditRoyal.getTableIdValue()));
				
			}
			if(objssHcAuditRoyal.getPrimaryKeyData() != null){
				criteria.add(Restrictions.eq("primaryKeyData", objssHcAuditRoyal.getPrimaryKeyData()));
				
			}
			if(objssHcAuditRoyal.getOldData() != null){
				criteria.add(Restrictions.eq("oldData", objssHcAuditRoyal.getOldData()));
				
			}
			if(objssHcAuditRoyal.getNewData() != null){
				criteria.add(Restrictions.eq("newData", objssHcAuditRoyal.getNewData()));
				
			}
			if(objssHcAuditRoyal.getUpdateDate() != null){
				criteria.add(Restrictions.eq("updateDate", objssHcAuditRoyal.getUpdateDate()));
				
			}
			if(objssHcAuditRoyal.getVistaData() != null){
				criteria.add(Restrictions.eq("vistaData", objssHcAuditRoyal.getVistaData()));
				
			}
			
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
