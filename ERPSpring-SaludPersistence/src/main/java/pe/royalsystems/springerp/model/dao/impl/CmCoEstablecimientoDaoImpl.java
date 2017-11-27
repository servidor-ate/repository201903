package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.CmCoEstablecimientoDao;
import pe.royalsystems.springerp.model.domain.CmCoEstablecimiento;

@Repository
public class CmCoEstablecimientoDaoImpl extends AbstractDaoImpl<CmCoEstablecimiento, Integer>
		implements CmCoEstablecimientoDao {

	protected CmCoEstablecimientoDaoImpl() {
		super(CmCoEstablecimiento.class);
	}

	@Override
	public List<CmCoEstablecimiento> listarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento,boolean paginable) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(CmCoEstablecimiento.class);

			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getIdEstablecimiento())) {
				criteria.add(Restrictions.eq("idEstablecimiento", cmCoEstablecimiento.getIdEstablecimiento()));
			}
			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getSucursal())) {
				criteria.add(Restrictions.eq("sucursal", cmCoEstablecimiento.getSucursal()));
			}
			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getDescripcion())) {
				criteria.add(Restrictions.like("descripcion", cmCoEstablecimiento.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getEstado())) {
				criteria.add(Restrictions.eq("estado", cmCoEstablecimiento.getEstado()));
			}
			if(paginable){
				criteria.setFirstResult(cmCoEstablecimiento.getInicio());
				criteria.setMaxResults(cmCoEstablecimiento.getNumeroFilas());				
			}

			List<CmCoEstablecimiento> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public CmCoEstablecimiento buscarCmCoEstablecimientoID(Integer id) {
		Object result = findById(id);
		return result!=null?(CmCoEstablecimiento)result:null;
	}

	@Override
	public int contadorDeTotales(CmCoEstablecimiento cmCoEstablecimiento) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(CmCoEstablecimiento.class);
			criteria.setProjection(Projections.rowCount());

			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getIdEstablecimiento())) {
				criteria.add(Restrictions.eq("idEstablecimiento", cmCoEstablecimiento.getIdEstablecimiento()));
			}
			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getSucursal())) {
				criteria.add(Restrictions.eq("sucursal", cmCoEstablecimiento.getSucursal()));
			}
			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getDescripcion())) {
				criteria.add(Restrictions.like("descripcion", cmCoEstablecimiento.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (UtilesCommons.noEsVacio(cmCoEstablecimiento.getEstado())) {
				criteria.add(Restrictions.eq("estado", cmCoEstablecimiento.getEstado()));
			}
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento) {
		delete(cmCoEstablecimiento);
		return 1;
	}

	@Override
	public int guardarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento) {
		int result = 0;
		Criteria criteria = getCurrentSession().createCriteria(CmCoEstablecimiento.class);
		criteria.setProjection(Projections.max("idEstablecimiento"));
		if (criteria.uniqueResult() != null)
			result = (int) criteria.uniqueResult();
		result++;
		cmCoEstablecimiento.setIdEstablecimiento(result);
		save(cmCoEstablecimiento);
		return result;
	}

	@Override
	public int actualizarCmCoEstablecimiento(CmCoEstablecimiento cmCoEstablecimiento) {
		update(cmCoEstablecimiento);
		return 1;
	}

}
