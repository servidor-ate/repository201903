package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsAdOrdenAtencionDetalleDao;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionDetalle;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionDetallePK;

@Repository
public class SsAdOrdenAtencionDetalleDaoImpl  extends AbstractDaoImpl<SsAdOrdenAtencionDetalle, SsAdOrdenAtencionDetallePK> implements SsAdOrdenAtencionDetalleDao {

	protected SsAdOrdenAtencionDetalleDaoImpl() {
		super(SsAdOrdenAtencionDetalle.class);
		
	}

	@Override
	public SsAdOrdenAtencionDetalle obtenerPorId(SsAdOrdenAtencionDetallePK key) {
		Object result  = findById(key);
		return result!=null?(SsAdOrdenAtencionDetalle)result:null;
	}

	@Override
	public List<SsAdOrdenAtencionDetalle> listarElementosPag(SsAdOrdenAtencionDetalle objDao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SsAdOrdenAtencionDetalle> listarElementos(SsAdOrdenAtencionDetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsAdOrdenAtencionDetalle.class);
		
		if ( UtilesCommons.noEsVacio(objDao.getEstado())) {			
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}		
		if (objDao.getIdPaciente() != null &&  objDao.getIdPaciente()!=0 ) {			
			criteria.add(Restrictions.eq("idPaciente", objDao.getIdPaciente()));
		}		
		if (objDao.getId().getIdOrdenAtencion() != null ) {			
			criteria.add(Restrictions.eq("idPaciente", objDao.getIdPaciente()));
		}	
		return criteria.list();
	}

	@Override
	public int contarTotal(SsAdOrdenAtencionDetalle objDao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int guardar(SsAdOrdenAtencionDetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsAdOrdenAtencionDetalle.class);
		int valorMax=0;	
		ProjectionList proj = Projections.projectionList();
		
		criteria.add(Restrictions.eq("id.idOrdenAtencion", objDao.getId().getIdOrdenAtencion()));
		
		proj.add(Projections.max("id.linea"));																
		criteria.setProjection(proj);		
		Object result = criteria.uniqueResult();
		valorMax=0;		
		if(result!=null){			
			valorMax = Integer.parseInt(result.toString());	
		}
		
		valorMax++;
		objDao.getId().setLinea(valorMax);		
		save(objDao);		
		return  (valorMax);	
	}

	@Override
	public int actualizar(SsAdOrdenAtencionDetalle objDao) {
		update(objDao);	
		return 1;
	}

	@Override
	public int eliminar(SsAdOrdenAtencionDetalle objDao) {
		delete(objDao);	
		return 1;
	}

}
