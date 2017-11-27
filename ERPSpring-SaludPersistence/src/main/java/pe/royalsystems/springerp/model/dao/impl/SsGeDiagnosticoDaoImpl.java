package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsGeDiagnosticoDao;
import pe.royalsystems.springerp.model.domain.SsGeDiagnostico;

@Repository
public class SsGeDiagnosticoDaoImpl extends AbstractDaoImpl<SsGeDiagnostico, Integer> implements SsGeDiagnosticoDao{

	protected SsGeDiagnosticoDaoImpl() {
		super(SsGeDiagnostico.class);
	
	}

	@Override
	public List<SsGeDiagnostico> listarSsGeDiagnostico(SsGeDiagnostico objgeDiagnostico) {
	try {
		Criteria criteria = getCurrentSession().createCriteria(SsGeDiagnostico.class);
		
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getIdDiagnostico())){
			criteria.add(Restrictions.eq("idDiagnostico", objgeDiagnostico.getIdDiagnostico()));
		}if(objgeDiagnostico.getIdDiagnosticoPadre()!= null){
			criteria.add(Restrictions.eq("idDiagnosticoPadre", objgeDiagnostico.getIdDiagnosticoPadre()));		
		}if(objgeDiagnostico.getCodigoDiagnostico()!= null){
			criteria.add(Restrictions.like("codigoDiagnostico", objgeDiagnostico.getCodigoDiagnostico(),MatchMode.ANYWHERE).ignoreCase());
		}if(objgeDiagnostico.getNombre()!= null){
			criteria.add(Restrictions.like("nombre", objgeDiagnostico.getNombre(),MatchMode.ANYWHERE).ignoreCase());
		}
		if (objgeDiagnostico.getEstado()!=null) {
			criteria.add(Restrictions.eq("estado", objgeDiagnostico.getEstado()));
		}
		
			criteria.setFirstResult(objgeDiagnostico.getInicio());
			criteria.setMaxResults(objgeDiagnostico.getNumeroFilas());
			
			List<SsGeDiagnostico> listaRetorno = criteria.list();
		
			return listaRetorno;
		} catch (Exception e) {
		e.printStackTrace();
		return null;
		}
	}

	@Override
	public SsGeDiagnostico buscarSsGeDiagnosticoID(Integer id) {
		Object result = findById(id);
		return result!=null?(SsGeDiagnostico)result:null;
		/*
		try {								
			SsGeDiagnostico ssGeDiagnosticoRetorno;			
			Criteria criteria = getCurrentSession().createCriteria(SsGeDiagnostico.class);
			criteria.add(Restrictions.eq("idDiagnostico", objgeDiagnostico.getIdDiagnostico()));			
			ssGeDiagnosticoRetorno = (SsGeDiagnostico) criteria.uniqueResult();			
			return ssGeDiagnosticoRetorno;			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}*/
	}

	@Override
	public int contadorDeTotales(SsGeDiagnostico objgeDiagnostico) {
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(SsGeDiagnostico.class);
			criteria.setProjection(Projections.rowCount());
			
			if(UtilesCommons.noEsVacio(objgeDiagnostico.getIdDiagnostico())){
				criteria.add(Restrictions.eq("idDiagnostico", objgeDiagnostico.getIdDiagnostico()));
			}if(objgeDiagnostico.getIdDiagnosticoPadre()!= null){
				criteria.add(Restrictions.eq("idDiagnosticoPadre", objgeDiagnostico.getIdDiagnosticoPadre()));		
			}if(objgeDiagnostico.getCodigoDiagnostico()!= null){
				criteria.add(Restrictions.like("codigoDiagnostico", objgeDiagnostico.getCodigoDiagnostico(),MatchMode.ANYWHERE).ignoreCase());
			}if(objgeDiagnostico.getNombre()!= null){
				criteria.add(Restrictions.like("nombre", objgeDiagnostico.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objgeDiagnostico.getEstado()!=null) {
				criteria.add(Restrictions.eq("estado", objgeDiagnostico.getEstado()));
			}
			
			return Integer.parseInt(criteria.uniqueResult().toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}


}
