package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcProcedimientoDao;
import pe.royalsystems.springerp.model.domain.SsHcProcedimiento;

@Repository
public class SsHcProcedimientoDaoImpl extends AbstractDaoImpl<SsHcProcedimiento, String>
		implements SsHcProcedimientoDao {

	protected SsHcProcedimientoDaoImpl() {
		super(SsHcProcedimiento.class);
	}

	@Override
	public List<SsHcProcedimiento> listarSsHcProcedimiento(SsHcProcedimiento ssHcProcedimiento) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcProcedimiento.class);

			if (ssHcProcedimiento.getIdProcedimiento() != 0) {
				criteria.add(Restrictions.eq("idProcedimiento", ssHcProcedimiento.getIdProcedimiento()));
			}
			if (ssHcProcedimiento.getIdProcedimientoPadre() != null) {
				criteria.add(Restrictions.eq("idProcedimientoPadre", ssHcProcedimiento.getIdProcedimientoPadre()));
			}
			if (ssHcProcedimiento.getCodigoProcedimiento() != null) {
				criteria.add(Restrictions.eq("codigoProcedimiento", ssHcProcedimiento.getCodigoProcedimiento()));
			}
			if (ssHcProcedimiento.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", ssHcProcedimiento.getDescripcion()));
			}
			if (ssHcProcedimiento.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssHcProcedimiento.getEstado()));
			}

			criteria.setFirstResult(ssHcProcedimiento.getInicio());
			criteria.setMaxResults(ssHcProcedimiento.getNumeroFilas());

			List<SsHcProcedimiento> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public SsHcProcedimiento buscarSsHcProcedimientoID(SsHcProcedimiento ssHcProcedimiento) {
		try {
			SsHcProcedimiento ssHcProcedimientoRetorno;

			Criteria criteria = getCurrentSession().createCriteria(SsHcProcedimiento.class);
			criteria.add(Restrictions.eq("idProcedimiento", ssHcProcedimiento.getIdProcedimiento()));

			ssHcProcedimientoRetorno = (SsHcProcedimiento) criteria.uniqueResult();

			return ssHcProcedimientoRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsHcProcedimiento ssHcProcedimiento) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcProcedimiento.class);
			criteria.setProjection(Projections.rowCount());

			if (ssHcProcedimiento.getIdProcedimiento() != 0) {
				criteria.add(Restrictions.eq("idProcedimiento", ssHcProcedimiento.getIdProcedimiento()));
			}
			if (ssHcProcedimiento.getIdProcedimientoPadre() != null) {
				criteria.add(Restrictions.eq("idProcedimientoPadre", ssHcProcedimiento.getIdProcedimientoPadre()));
			}
			if (ssHcProcedimiento.getCodigoProcedimiento() != null) {
				criteria.add(Restrictions.eq("codigoProcedimiento", ssHcProcedimiento.getCodigoProcedimiento()));
			}
			if (ssHcProcedimiento.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", ssHcProcedimiento.getDescripcion()));
			}
			if (ssHcProcedimiento.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssHcProcedimiento.getEstado()));
			}

			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsHcProcedimiento(SsHcProcedimiento ssHcProcedimiento) {
		int ePisodio = 0;
		if (ssHcProcedimiento.getIdProcedimiento() == 0) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcProcedimiento.class);
			criteria.setProjection(Projections.max("idProcedimiento"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			ssHcProcedimiento.setIdProcedimiento(ePisodio + 1);
		}
		saveOrUpdate(ssHcProcedimiento);
		return ePisodio;
	}

	@Override
	public int eliminarSsHcProcedimiento(SsHcProcedimiento ssHcProcedimiento) {
		try {
			delete(ssHcProcedimiento);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
