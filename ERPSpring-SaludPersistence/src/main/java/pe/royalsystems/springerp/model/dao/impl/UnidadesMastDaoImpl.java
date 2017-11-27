package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.UnidadesMastDao;
import pe.royalsystems.springerp.model.domain.UnidadesMast;

@Repository
public class UnidadesMastDaoImpl extends AbstractDaoImpl<UnidadesMast, String> implements UnidadesMastDao{

	protected UnidadesMastDaoImpl() {
		super(UnidadesMast.class);
	}

	@Override
	public List<UnidadesMast> listarUnidadesMast(UnidadesMast unidadesMast) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(UnidadesMast.class);

			if (unidadesMast.getUnidadCodigo() != null) {
				
				criteria.add(Restrictions.eq("unidadCodigo", unidadesMast.getUnidadCodigo()));
			}
			if (unidadesMast.getUnidadTipo() != null) {
				criteria.add(
						Restrictions.eq("unidadTipo", unidadesMast.getUnidadTipo()));
			}
			if (unidadesMast.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", unidadesMast.getDescripcion()));
			}
			if (unidadesMast.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", unidadesMast.getEstado()));
			}
			criteria.setFirstResult(unidadesMast.getInicio());
			criteria.setMaxResults(unidadesMast.getNumeroFilas());
			List<UnidadesMast> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public UnidadesMast buscarUnidadesMastID(UnidadesMast unidadesMast) {
		try {
			UnidadesMast unidadesMastRetorno;
			Criteria criteria = getCurrentSession().createCriteria(UnidadesMast.class);
			criteria.add(Restrictions.eq("unidadCodigo", unidadesMast.getUnidadCodigo()));
			unidadesMastRetorno = (UnidadesMast) criteria.uniqueResult();
			return unidadesMastRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(UnidadesMast unidadesMast) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(UnidadesMast.class);
			criteria.setProjection(Projections.rowCount());

			if (unidadesMast.getUnidadCodigo() != null) {
				criteria.add(Restrictions.eq("unidadCodigo", unidadesMast.getUnidadCodigo()));
			}
			if (unidadesMast.getUnidadTipo() != null) {
				criteria.add(
						Restrictions.eq("unidadTipo", unidadesMast.getUnidadTipo()));
			}
			if (unidadesMast.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", unidadesMast.getDescripcion()));
			}
			if (unidadesMast.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", unidadesMast.getEstado()));
			}
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarUnidadesMast(UnidadesMast unidadesMast) {
		try {
			delete(unidadesMast);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarUnidadesMast(UnidadesMast unidadesMast) {		
		int ePisodio = 0;
		/*
		if (unidadesMast.getUnidadCodigo() == "") {
			Criteria criteria = getCurrentSession().createCriteria(UnidadesMast.class);
			criteria.setProjection(Projections.max("unidadCodigo"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			unidadesMast.setUnidadCodigo(""+ePisodio + 1);
		}
		*/
		saveOrUpdate(unidadesMast);
		return ePisodio;
	}

}
