package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsGeComponentePrestacionDao;
import pe.royalsystems.springerp.model.domain.SgOpcion;
import pe.royalsystems.springerp.model.domain.SsGeComponentePrestacion;

@Repository
public class SsGeComponentePrestacionDaoImpl extends AbstractDaoImpl<SsGeComponentePrestacion, String>
		implements SsGeComponentePrestacionDao {

	protected SsGeComponentePrestacionDaoImpl() {
		super(SsGeComponentePrestacion.class);
	}

	@Override
	public List<SsGeComponentePrestacion> listarSsGeComponentePrestacion(
			SsGeComponentePrestacion ssGeComponentePrestacion) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsGeComponentePrestacion.class);

			if (ssGeComponentePrestacion.getComponente() != null) {
				criteria.add(Restrictions.eq("componente", ssGeComponentePrestacion.getComponente()));
			}

			if (ssGeComponentePrestacion.getCodigoSegus() != null) {
				criteria.add(Restrictions.eq("codigoSegus", ssGeComponentePrestacion.getCodigoSegus()));
			}

			if (ssGeComponentePrestacion.getCodigoNuevo() != null) {
				criteria.add(
						Restrictions.like("codigoNuevo", ssGeComponentePrestacion.getCodigoNuevo(), MatchMode.ANYWHERE)
								.ignoreCase());
			}

			if (ssGeComponentePrestacion.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssGeComponentePrestacion.getEstado()));
			}

			if (ssGeComponentePrestacion.getValorMedida() != null) {
				criteria.add(Restrictions.eq("valorMedida", ssGeComponentePrestacion.getValorMedida()));
			}

			criteria.setFirstResult(ssGeComponentePrestacion.getInicio());
			criteria.setMaxResults(ssGeComponentePrestacion.getNumeroFilas());

			List<SsGeComponentePrestacion> listaRetorno = criteria.list();

			return listaRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsGeComponentePrestacion buscarSsGeComponentePrestacionID(
			SsGeComponentePrestacion ssGeComponentePrestacion) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsGeComponentePrestacion.class);
			criteria.add(Restrictions.eq("persona", ssGeComponentePrestacion.getComponente()));
			return (SsGeComponentePrestacion) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsGeComponentePrestacion ssGeComponentePrestacion) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsGeComponentePrestacion.class);
			criteria.setProjection(Projections.rowCount());

			if (ssGeComponentePrestacion.getComponente() != null) {
				criteria.add(Restrictions.eq("componente", ssGeComponentePrestacion.getComponente()));
			}

			if (ssGeComponentePrestacion.getCodigoSegus() != null) {
				criteria.add(Restrictions.eq("codigoSegus", ssGeComponentePrestacion.getCodigoSegus()));
			}

			if (ssGeComponentePrestacion.getCodigoNuevo() != null) {
				criteria.add(
						Restrictions.like("codigoNuevo", ssGeComponentePrestacion.getCodigoNuevo(), MatchMode.ANYWHERE)
								.ignoreCase());
			}

			if (ssGeComponentePrestacion.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssGeComponentePrestacion.getEstado()));
			}

			if (ssGeComponentePrestacion.getValorMedida() != null) {
				criteria.add(Restrictions.eq("valorMedida", ssGeComponentePrestacion.getValorMedida()));
			}

			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsGeComponentePrestacion(SsGeComponentePrestacion ssGeComponentePrestacion) {
		try {
			int ePisodio = 0;
			if (ssGeComponentePrestacion.getComponente() == "0") {
				Criteria criteria = getCurrentSession().createCriteria(SgOpcion.class);
				criteria.setProjection(Projections.max("componente"));
				if (criteria.uniqueResult() != null)
					ePisodio = (int) criteria.uniqueResult();
				ePisodio = ePisodio + 1;
				ssGeComponentePrestacion.setComponente("" + ePisodio);
			}
			saveOrUpdate(ssGeComponentePrestacion);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsGeComponentePrestacion(SsGeComponentePrestacion ssGeComponentePrestacion) {
		try {
			delete(ssGeComponentePrestacion);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
