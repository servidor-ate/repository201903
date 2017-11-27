package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcNocDao;
import pe.royalsystems.springerp.model.domain.SsHcNoc;

@Repository
public class SsHcNocDaoImpl extends AbstractDaoImpl<SsHcNoc, String> implements SsHcNocDao{

	protected SsHcNocDaoImpl() {
		super(SsHcNoc.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsHcNoc> listarSsHcNoc(SsHcNoc objssHcNoc) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcNoc.class);
			
			
			if(objssHcNoc.getIdNoc() != 0){
				criteria.add(Restrictions.eq("idNoc", objssHcNoc.getIdNoc()));
			}
			if(objssHcNoc.getCodigo() != null){
				criteria.add(Restrictions.like("codigo", objssHcNoc.getCodigo(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objssHcNoc.getDescripcion() != null){
				criteria.add(Restrictions.like("descripcion", objssHcNoc.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
				}
			if(objssHcNoc.getNivel() != null){
				criteria.add(Restrictions.eq("nivel", objssHcNoc.getNivel()));
				}
			if(objssHcNoc.getEstado() != null){
				criteria.add(Restrictions.eq("estado", objssHcNoc.getEstado()));
				}
			
			criteria.setFirstResult(objssHcNoc.getInicio());
			criteria.setMaxResults(objssHcNoc.getNumeroFilas());	
			
			List<SsHcNoc> listaRetorno = criteria.list();
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcNoc buscarSsHcNocID(SsHcNoc objssHcNoc) {
		// TODO Auto-generated method stub
		try {
			System.out.println("objssHcNoc.getIdNoc() DAO = "+objssHcNoc.getIdNoc());
			SsHcNoc ssHcNocRetorno;
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcNoc.class);
			criteria.add(Restrictions.eq("idNoc", objssHcNoc.getIdNoc()));
			
			ssHcNocRetorno = (SsHcNoc) criteria.uniqueResult();
			return ssHcNocRetorno;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesRegistrosSsHcNoc(SsHcNoc objssHcNoc) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcNoc.class);
			criteria.setProjection(Projections.rowCount());
			
			if(objssHcNoc.getIdNoc() != 0){
				criteria.add(Restrictions.eq("idNoc", objssHcNoc.getIdNoc()));
			}
			if(objssHcNoc.getCodigo() != null){
				criteria.add(Restrictions.like("codigo", objssHcNoc.getCodigo(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objssHcNoc.getDescripcion() != null){
				criteria.add(Restrictions.like("descripcion", objssHcNoc.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
				}
			if(objssHcNoc.getNivel() != null){
				criteria.add(Restrictions.eq("nivel", objssHcNoc.getNivel()));
				}
			if(objssHcNoc.getEstado() != null){
				criteria.add(Restrictions.eq("estado", objssHcNoc.getEstado()));
				}
			
			return Integer.parseInt(criteria.uniqueResult().toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsHcNoc(SsHcNoc objssHcNoc) {
		// TODO Auto-generated method stub
		try {
			
			int ePisodio=0;
			if(objssHcNoc.getIdNoc()==0){
				Criteria criteria = getCurrentSession().createCriteria(SsHcNoc.class);
				criteria.setProjection(Projections.max("idNoc"));
				if(criteria.uniqueResult()!=null) ePisodio = (int) criteria.uniqueResult();
				objssHcNoc.setIdNoc(ePisodio + 1);
						
			}
			saveOrUpdate(objssHcNoc);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsHcNoc(SsHcNoc objssHcNoc) {
		// TODO Auto-generated method stub
		try {
			System.out.println("eliminar DAO = " +objssHcNoc.getIdNoc());
			delete(objssHcNoc);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
