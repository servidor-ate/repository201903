package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.AcSucursalDao;
import pe.royalsystems.springerp.model.domain.AcSucursal;

@Repository
public class AcSucursalDaoImpl extends AbstractDaoImpl<AcSucursal, String> implements AcSucursalDao {

	protected AcSucursalDaoImpl() {
		super(AcSucursal.class);		
	}

	@Override
	public AcSucursal obtenerPorId(String id) {
		Object result = findById(id);
		return result!=null?(AcSucursal)result:null;
	}

	@Override
	public List<AcSucursal> listarElementos(AcSucursal objDao, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(AcSucursal.class);
		
		if (UtilesCommons.noEsVacio(objDao.getCompania())) {
			criteria.add(Restrictions.eq("compania",objDao.getCompania()));
		}
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado",objDao.getEstado()));
		}
	
		if(paginable){			
			criteria.setFirstResult(objDao.getInicio());
    		criteria.setMaxResults(objDao.getNumeroFilas());
    		criteria.setFetchSize(objDao.getNumeroFilas());
		}
				
		return  criteria.list();
	}

	@Override
	public int contarTotal(AcSucursal objDao) {
		Criteria criteria = getCurrentSession().createCriteria(AcSucursal.class);
		
		if (UtilesCommons.noEsVacio(objDao.getCompania())) {
			criteria.add(Restrictions.eq("compania",objDao.getCompania()));
		}
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado",objDao.getEstado()));
		}
		criteria.setProjection(Projections.rowCount());
		Object result = criteria.uniqueResult();
		return Integer.parseInt((result!=null?result.toString():"0"));
	}

	@Override
	public int guardar(AcSucursal objDao) {
		save(objDao);
		return 1;
	}

	@Override
	public int actualizar(AcSucursal objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(AcSucursal objDao) {
		delete(objDao);
		return 1;
	}

}
