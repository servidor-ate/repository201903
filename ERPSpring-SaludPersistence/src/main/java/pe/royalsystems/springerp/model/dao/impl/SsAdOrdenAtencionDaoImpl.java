package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsAdOrdenAtencionDao;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencion;

@Repository
public class SsAdOrdenAtencionDaoImpl  extends AbstractDaoImpl<SsAdOrdenAtencion, Integer> implements SsAdOrdenAtencionDao {

	protected SsAdOrdenAtencionDaoImpl() {
		super(SsAdOrdenAtencion.class);
	
	}

	@Override
	public SsAdOrdenAtencion obtenerPorId(Integer key) {
		Object result  = findById(key);
		return result!=null?(SsAdOrdenAtencion)result:null;
	}

	@Override
	public List<SsAdOrdenAtencion> listarElementosPag(SsAdOrdenAtencion objDao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SsAdOrdenAtencion> listarElementos(SsAdOrdenAtencion objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsAdOrdenAtencion.class);
		
		if ( UtilesCommons.noEsVacio(objDao.getEstado())) {			
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}		
		if (objDao.getIdPaciente() != null &&  objDao.getIdPaciente()!=0 ) {			
			criteria.add(Restrictions.eq("idPaciente", objDao.getIdPaciente()));
		}		
			
		return criteria.list();
	}

	@Override
	public int contarTotal(SsAdOrdenAtencion objDao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int guardar(SsAdOrdenAtencion objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsAdOrdenAtencion.class);
		int valorMax=0;	
		ProjectionList proj = Projections.projectionList();
		proj.add(Projections.max("idOrdenAtencion"));																
		criteria.setProjection(proj);		
		Object result = criteria.uniqueResult();
		valorMax=0;		
		if(result!=null){		
			valorMax = Integer.parseInt(result.toString());	
		}				
		objDao.setIdOrdenAtencion(valorMax+1);		
		save(objDao);		
		return  (valorMax+1);	
	}

	@Override
	public int actualizar(SsAdOrdenAtencion objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsAdOrdenAtencion objDao) {
		delete(objDao);
		return 1;
	}

}
