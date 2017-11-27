package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsHcObligaciondetalleDao;
import pe.royalsystems.springerp.model.domain.SsHcObligaciondetalle;
import pe.royalsystems.springerp.model.domain.SsHcObligaciondetallePK;

@Repository
public class SsHcObligaciondetalleDaoImpl extends AbstractDaoImpl<SsHcObligaciondetalle, SsHcObligaciondetallePK> implements SsHcObligaciondetalleDao {

	protected SsHcObligaciondetalleDaoImpl() {
		super(SsHcObligaciondetalle.class);	
	}

	@Override
	public SsHcObligaciondetalle obtenerPorId(SsHcObligaciondetallePK id) {
		Object result = findById(id);
		return result!=null?(SsHcObligaciondetalle)result:null;
	}

	@Override
	public List<SsHcObligaciondetalle> listarElementos(SsHcObligaciondetalle objDao, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcObligaciondetalle.class);
		
		if (UtilesCommons.noEsVacio(objDao.getOblobligacionid())) {
			criteria.add(Restrictions.eq("oblobligacionid", objDao.getOblobligacionid()));
		}
		if (UtilesCommons.noEsVacio(objDao.getItemcodigo())) {
			criteria.add(Restrictions.eq("itemcodigo", objDao.getItemcodigo()));
		}
		
		if (UtilesCommons.noEsVacio(objDao.getOblestado())) {
			criteria.add(Restrictions.eq("oblestado", objDao.getOblestado()));
		}
		if(paginable){
			criteria.setFirstResult(objDao.getInicio());
			criteria.setMaxResults(objDao.getNumeroFilas());				
		}		
		return criteria.list();
	}

	@Override
	public int contarTotal(SsHcObligaciondetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcObligaciondetalle.class);
		
		if (UtilesCommons.noEsVacio(objDao.getOblobligacionid())) {
			criteria.add(Restrictions.eq("oblobligacionid", objDao.getOblobligacionid()));
		}
		if (UtilesCommons.noEsVacio(objDao.getItemcodigo())) {
			criteria.add(Restrictions.eq("itemcodigo", objDao.getItemcodigo()));
		}
		
		if (UtilesCommons.noEsVacio(objDao.getOblestado())) {
			criteria.add(Restrictions.eq("oblestado", objDao.getOblestado()));
		}
		
			
		Object result = criteria.uniqueResult();
		return Integer.parseInt((result!=null?result.toString():"0"));	
	}

	@Override
	public int guardar(SsHcObligaciondetalle objDao) {
		int id= 0;
		if (UtilesCommons.noEsVacio(objDao.getOblobligacionid())) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcObligaciondetalle.class);
			//criteria.add(Restrictions.eq("oblobligacionid", objDao.getOblobligacionid())); //SERA ID SECUENCIA UNICO
			criteria.setProjection(Projections.max("secuencia"));		
			
			Object result = criteria.uniqueResult();			
			if (result != null)
				id = (int)result;
			id++;
			objDao.setSecuencia(id);	
			save(objDao);			
		}

		return id;
	}

	@Override
	public int actualizar(SsHcObligaciondetalle objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsHcObligaciondetalle objDao) {
		delete(objDao);
		return 1;
	}

}
