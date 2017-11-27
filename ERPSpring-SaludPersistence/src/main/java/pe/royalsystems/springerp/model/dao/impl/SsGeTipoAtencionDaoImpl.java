package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsGeTipoAtencionDao;
import pe.royalsystems.springerp.model.domain.SsGeTipoAtencion;

@Repository
public class SsGeTipoAtencionDaoImpl extends AbstractDaoImpl<SsGeTipoAtencion, String>implements SsGeTipoAtencionDao {

	protected SsGeTipoAtencionDaoImpl() {
		super(SsGeTipoAtencion.class);
	}

	@Override
	public List<SsGeTipoAtencion> listarSsGeTipoAtencion(SsGeTipoAtencion ssGeTipoAtencion) {
		try {

			Criteria crit = getCurrentSession().createCriteria(SsGeTipoAtencion.class);
			if (ssGeTipoAtencion.getIdTipoAtencion() != 0) {
				crit.add(Restrictions.eq("idTipoAtencion", ssGeTipoAtencion.getIdTipoAtencion()));
			}
			if (ssGeTipoAtencion.getEstado() != 0) {
				crit.add(Restrictions.eq("estado", ssGeTipoAtencion.getEstado()));
			}
			if (ssGeTipoAtencion.getDescripcion() != null) {
				crit.add(Restrictions.like("descripcion", ssGeTipoAtencion.getDescripcion(), MatchMode.ANYWHERE)
						.ignoreCase());
			}
			if (ssGeTipoAtencion.getNombre() != null) {
				crit.add(Restrictions.like("nombre", ssGeTipoAtencion.getNombre(), MatchMode.ANYWHERE).ignoreCase());
			}

			crit.setFirstResult(ssGeTipoAtencion.getInicio());
			crit.setMaxResults(ssGeTipoAtencion.getNumeroFilas());
			List<SsGeTipoAtencion> listaRetorno = crit.list();

			return listaRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsGeTipoAtencion buscarSsGeTipoAtencionID(SsGeTipoAtencion ssGeTipoAtencion) {
		try {
			return (SsGeTipoAtencion) getCurrentSession().get(SsGeTipoAtencion.class,
					ssGeTipoAtencion.getIdTipoAtencion());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsGeTipoAtencion ssGeTipoAtencion) {
		try {
			Criteria crit = getCurrentSession().createCriteria(SsGeTipoAtencion.class);
			crit.setProjection(Projections.rowCount());

			if (ssGeTipoAtencion.getIdTipoAtencion() != 0) {
				crit.add(Restrictions.eq("idTipoAtencion", ssGeTipoAtencion.getIdTipoAtencion()));
			}
			if (ssGeTipoAtencion.getEstado() != 0) {
				crit.add(Restrictions.eq("estado", ssGeTipoAtencion.getEstado()));
			}
			if (ssGeTipoAtencion.getDescripcion() != null) {
				crit.add(Restrictions.like("descripcion", ssGeTipoAtencion.getDescripcion(), MatchMode.ANYWHERE)
						.ignoreCase());
			}
			if (ssGeTipoAtencion.getNombre() != null) {
				crit.add(Restrictions.like("nombre", ssGeTipoAtencion.getNombre(), MatchMode.ANYWHERE).ignoreCase());
			}

			return Integer.parseInt(crit.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsGeTipoAtencion(SsGeTipoAtencion ssGeTipoAtencion) {
		int ePisodio = 0;
		if (ssGeTipoAtencion.getIdTipoAtencion() == 0) {

			Criteria criteria = getCurrentSession().createCriteria(SsGeTipoAtencion.class);
			criteria.setProjection(Projections.max("idTipoAtencion"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			ssGeTipoAtencion.setIdTipoAtencion(ePisodio + 1);
		}
		saveOrUpdate(ssGeTipoAtencion);
		return ePisodio;
	}

	@Override
	public int eliminarSsGeTipoAtencion(SsGeTipoAtencion ssGeTipoAtencion) {
		try {
			delete(ssGeTipoAtencion);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
