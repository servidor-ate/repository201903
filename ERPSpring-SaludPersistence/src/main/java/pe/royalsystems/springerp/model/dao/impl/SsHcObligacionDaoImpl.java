package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsHcObligacionDao;
import pe.royalsystems.springerp.model.domain.SsHcObligacion;

@Repository
public class SsHcObligacionDaoImpl  extends AbstractDaoImpl<SsHcObligacion, Integer> implements SsHcObligacionDao{

	protected SsHcObligacionDaoImpl() {
		super(SsHcObligacion.class);		
	}

	@Override
	public SsHcObligacion obtenerPorId(Integer id) {
		Object result = findById(id);
		return result!=null?(SsHcObligacion)result:null;
	}



	@Override
	public List<SsHcObligacion> listarElementos(SsHcObligacion objDao,boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcObligacion.class);
		if (objDao.getPersona() !=null && objDao.getPersona() != 0) {
			criteria.add(Restrictions.eq("persona", objDao.getPersona()));
		}
		if (UtilesCommons.noEsVacio(objDao.getCompania())) {
			criteria.add(Restrictions.eq("compania", objDao.getCompania()));
		}
		if (UtilesCommons.noEsVacio(objDao.getSucursal())) {
			criteria.add(Restrictions.eq("sucursal", objDao.getSucursal()));
		}
		if (UtilesCommons.noEsVacio(objDao.getIdCita())) {
			criteria.add(Restrictions.eq("idCita", objDao.getIdCita()));
		}
		if (UtilesCommons.noEsVacio(objDao.getIdOrdenAtencion())) {
			criteria.add(Restrictions.eq("idOrdenAtencion", objDao.getIdOrdenAtencion()));
		}
		if (UtilesCommons.noEsVacio(objDao.getLineaOrdenAtencion())) {
			criteria.add(Restrictions.eq("lineaOrdenAtencion", objDao.getLineaOrdenAtencion()));
		}
		if (UtilesCommons.noEsVacio(objDao.getCodigoOA())) {
			criteria.add(Restrictions.eq("codigoOA", objDao.getCodigoOA()));
		}
		if (UtilesCommons.noEsVacio(objDao.getOblcestado())) {
			criteria.add(Restrictions.eq("oblcestado", objDao.getOblcestado()));
		}
		if(paginable){
			criteria.setFirstResult(objDao.getInicio());
			criteria.setMaxResults(objDao.getNumeroFilas());				
		}		
		return criteria.list();
	}

	@Override
	public int contarTotal(SsHcObligacion objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcObligacion.class);
		if (objDao.getPersona() !=null && objDao.getPersona() != 0) {
			criteria.add(Restrictions.eq("persona", objDao.getPersona()));
		}
		if (UtilesCommons.noEsVacio(objDao.getCompania())) {
			criteria.add(Restrictions.eq("compania", objDao.getCompania()));
		}
		if (UtilesCommons.noEsVacio(objDao.getSucursal())) {
			criteria.add(Restrictions.eq("sucursal", objDao.getSucursal()));
		}
		
		if (UtilesCommons.noEsVacio(objDao.getOblcestado())) {
			criteria.add(Restrictions.eq("oblcestado", objDao.getOblcestado()));
		}
		if (UtilesCommons.noEsVacio(objDao.getIdCita())) {
			criteria.add(Restrictions.eq("idCita", objDao.getIdCita()));
		}
		if (UtilesCommons.noEsVacio(objDao.getIdOrdenAtencion())) {
			criteria.add(Restrictions.eq("idOrdenAtencion", objDao.getIdOrdenAtencion()));
		}
		if (UtilesCommons.noEsVacio(objDao.getLineaOrdenAtencion())) {
			criteria.add(Restrictions.eq("lineaOrdenAtencion", objDao.getLineaOrdenAtencion()));
		}
		if (UtilesCommons.noEsVacio(objDao.getCodigoOA())) {
			criteria.add(Restrictions.eq("codigoOA", objDao.getCodigoOA()));
		}
		Object result = criteria.uniqueResult();
		return Integer.parseInt((result!=null?result.toString():"0"));
	}

	@Override
	public int guardar(SsHcObligacion objDao) {
		int id= 0;
		
		Criteria criteria = getCurrentSession().createCriteria(SsHcObligacion.class);
		criteria.setProjection(Projections.max("oblobligacionid"));		
		Object result = criteria.uniqueResult();			
		if (result != null)
			id = (int)result;
		id++;
		objDao.setOblobligacionid(id);	
		save(objDao);
		return id;
	}

	@Override
	public int actualizar(SsHcObligacion objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsHcObligacion objDao) {
		delete(objDao);
		return 1;
	}

}
