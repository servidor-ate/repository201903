package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsGeEspecialidadDao;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;

@Repository
public class SsGeEspecialidadDaoImpl extends AbstractDaoImpl<SsGeEspecialidad, String>implements SsGeEspecialidadDao {

	protected SsGeEspecialidadDaoImpl() {
		super(SsGeEspecialidad.class);
	}

	@Override
	public List<SsGeEspecialidad> listarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsGeEspecialidad.class);
			if (ssGeEspecialidad.getIdEspecialidad() != 0) {
				criteria.add(Restrictions.eq("idEspecialidad", ssGeEspecialidad.getIdEspecialidad()));
			}
			if (ssGeEspecialidad.getCodigo() != null) {
				criteria.add(Restrictions.eq("codigo", ssGeEspecialidad.getCodigo()));
			}
			if (ssGeEspecialidad.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", ssGeEspecialidad.getDescripcion()));
			}
			if (ssGeEspecialidad.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssGeEspecialidad.getEstado()));
			}
			criteria.setFirstResult(ssGeEspecialidad.getInicio());
			criteria.setMaxResults(ssGeEspecialidad.getNumeroFilas());
			List<SsGeEspecialidad> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsGeEspecialidad buscarSsGeEspecialidadID(SsGeEspecialidad ssGeEspecialidad) {
		try {
			SsGeEspecialidad ssGeEspecialidadRetorno;
			Criteria criteria = getCurrentSession().createCriteria(SsGeEspecialidad.class);
			criteria.add(Restrictions.eq("idEspecialidad", ssGeEspecialidad.getIdEspecialidad()));
			ssGeEspecialidadRetorno = (SsGeEspecialidad) criteria.uniqueResult();
			return ssGeEspecialidadRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsGeEspecialidad ssGeEspecialidad) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsGeEspecialidad.class);
			criteria.setProjection(Projections.rowCount());

			if (ssGeEspecialidad.getIdEspecialidad() != 0) {
				criteria.add(Restrictions.eq("idEspecialidad", ssGeEspecialidad.getIdEspecialidad()));
			}
			if (ssGeEspecialidad.getCodigo() != null) {
				criteria.add(Restrictions.eq("codigo", ssGeEspecialidad.getCodigo()));
			}
			if (ssGeEspecialidad.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", ssGeEspecialidad.getDescripcion()));
			}
			if (ssGeEspecialidad.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", ssGeEspecialidad.getEstado()));
			}
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad) {
		try {
			delete(ssGeEspecialidad);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad) {
		int ePisodio = 0;
		if (ssGeEspecialidad.getIdEspecialidad() == 0) {
			Criteria criteria = getCurrentSession().createCriteria(SsGeEspecialidad.class);
			criteria.setProjection(Projections.max("idEspecialidad"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			ssGeEspecialidad.setIdEspecialidad(ePisodio + 1);
		}
		saveOrUpdate(ssGeEspecialidad);
		return ePisodio;
	}

}
