package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcCuidadoPreventivoDao;
import pe.royalsystems.springerp.model.domain.SsHcCuidadoPreventivo;

@Repository
public class SsHcCuidadoPreventivoDaoImpl extends AbstractDaoImpl<SsHcCuidadoPreventivo, String>
		implements SsHcCuidadoPreventivoDao {

	protected SsHcCuidadoPreventivoDaoImpl() {
		super(SsHcCuidadoPreventivo.class);
	}

	@Override
	public List<SsHcCuidadoPreventivo> listarSsHcCuidadoPreventivo(SsHcCuidadoPreventivo ssHcCuidadoPreventivo) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcCuidadoPreventivo.class);

			if (ssHcCuidadoPreventivo.getIdCuidadoPreventivo() != 0) {
				criteria.add(Restrictions.eq("idCuidadoPreventivo", ssHcCuidadoPreventivo.getIdCuidadoPreventivo()));
			}
			if (ssHcCuidadoPreventivo.getCodigoCuidadoPreventivo() != null) {
				criteria.add(
						Restrictions.eq("codigoCuidadoPreventivo", ssHcCuidadoPreventivo.getCodigoCuidadoPreventivo()));
			}
			if (ssHcCuidadoPreventivo.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", ssHcCuidadoPreventivo.getDescripcion()));
			}
			if (ssHcCuidadoPreventivo.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssHcCuidadoPreventivo.getEstado()));
			}
			criteria.setFirstResult(ssHcCuidadoPreventivo.getInicio());
			criteria.setMaxResults(ssHcCuidadoPreventivo.getNumeroFilas());
			List<SsHcCuidadoPreventivo> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public SsHcCuidadoPreventivo buscarSsHcCuidadoPreventivoID(SsHcCuidadoPreventivo ssHcCuidadoPreventivo) {
		try {
			SsHcCuidadoPreventivo ssHcCuidadoPreventivoRetorno;
			Criteria criteria = getCurrentSession().createCriteria(SsHcCuidadoPreventivo.class);
			criteria.add(Restrictions.eq("idCuidadoPreventivo", ssHcCuidadoPreventivo.getIdCuidadoPreventivo()));
			ssHcCuidadoPreventivoRetorno = (SsHcCuidadoPreventivo) criteria.uniqueResult();
			return ssHcCuidadoPreventivoRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsHcCuidadoPreventivo ssHcCuidadoPreventivo) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcCuidadoPreventivo.class);
			criteria.setProjection(Projections.rowCount());

			if (ssHcCuidadoPreventivo.getIdCuidadoPreventivo() != 0) {
				criteria.add(Restrictions.eq("idCuidadoPreventivo", ssHcCuidadoPreventivo.getIdCuidadoPreventivo()));
			}
			if (ssHcCuidadoPreventivo.getCodigoCuidadoPreventivo() != null) {
				criteria.add(
						Restrictions.eq("codigoCuidadoPreventivo", ssHcCuidadoPreventivo.getCodigoCuidadoPreventivo()));
			}
			if (ssHcCuidadoPreventivo.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", ssHcCuidadoPreventivo.getDescripcion()));
			}
			if (ssHcCuidadoPreventivo.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssHcCuidadoPreventivo.getEstado()));
			}
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsHcCuidadoPreventivo(SsHcCuidadoPreventivo ssHcCuidadoPreventivo) {
		try {
			delete(ssHcCuidadoPreventivo);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsHcCuidadoPreventivo(SsHcCuidadoPreventivo ssHcCuidadoPreventivo) {
		int ePisodio = 0;
		if (ssHcCuidadoPreventivo.getIdCuidadoPreventivo() == 0) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcCuidadoPreventivo.class);
			criteria.setProjection(Projections.max("idCuidadoPreventivo"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			ssHcCuidadoPreventivo.setIdCuidadoPreventivo(ePisodio + 1);
		}
		saveOrUpdate(ssHcCuidadoPreventivo);
		return ePisodio;
	}

}
