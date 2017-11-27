package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcCuerpoHumanoDao;
import pe.royalsystems.springerp.model.domain.SsHcCuerpoHumano;

@Repository
public class SsHcCuerpoHumanoDaoimpl extends AbstractDaoImpl<SsHcCuerpoHumano, String>implements SsHcCuerpoHumanoDao {

	protected SsHcCuerpoHumanoDaoimpl() {
		super(SsHcCuerpoHumano.class);
	}

	@Override
	public List<SsHcCuerpoHumano> listaSsHcCuerpoHumano(SsHcCuerpoHumano objSsHcCuerpoHumano) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcCuerpoHumano.class);

			if (objSsHcCuerpoHumano.getIdCuerpoHumano() != 0) {
				criteria.add(Restrictions.eq("idCuerpoHumano", objSsHcCuerpoHumano.getIdCuerpoHumano()));
			}
			if (objSsHcCuerpoHumano.getCodigoPadre() != null) {
				criteria.add(Restrictions.eq("codigoPadre", objSsHcCuerpoHumano.getCodigoPadre()));
			}
			if (objSsHcCuerpoHumano.getCodigo() != null) {
				criteria.add(Restrictions.like("codigo", objSsHcCuerpoHumano.getCodigo()));
			}
			if (objSsHcCuerpoHumano.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", objSsHcCuerpoHumano.getDescripcion()));
			}
			if (objSsHcCuerpoHumano.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", objSsHcCuerpoHumano.getEstado()));
			}

			criteria.setFirstResult(objSsHcCuerpoHumano.getInicio());
			criteria.setMaxResults(objSsHcCuerpoHumano.getNumeroFilas());
			List<SsHcCuerpoHumano> listaRetorno = criteria.list();
			System.out.println(":=)"+listaRetorno.get(0).getDescripcion());
			return listaRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcCuerpoHumano buscarSsHcCuerpoHumanoID(SsHcCuerpoHumano objSsHcCuerpoHumano) {
		try {
			SsHcCuerpoHumano ssHcCuerpoHumanoRetorno;
			Criteria criteria = getCurrentSession().createCriteria(SsHcCuerpoHumano.class);
			criteria.add(Restrictions.eq("idCuerpoHumano", objSsHcCuerpoHumano.getIdCuerpoHumano()));
			ssHcCuerpoHumanoRetorno = (SsHcCuerpoHumano) criteria.uniqueResult();
			return ssHcCuerpoHumanoRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsHcCuerpoHumano objSsHcCuerpoHumano) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcCuerpoHumano.class);
			criteria.setProjection(Projections.rowCount());

			if (objSsHcCuerpoHumano.getIdCuerpoHumano() != 0) {
				criteria.add(Restrictions.eq("idCuerpoHumano", objSsHcCuerpoHumano.getIdCuerpoHumano()));
			}
			if (objSsHcCuerpoHumano.getCodigoPadre() != null) {
				criteria.add(Restrictions.eq("codigoPadre", objSsHcCuerpoHumano.getCodigoPadre()));
			}
			if (objSsHcCuerpoHumano.getCodigo() != null) {
				criteria.add(
						Restrictions.like("codigo", objSsHcCuerpoHumano.getCodigo(), MatchMode.ANYWHERE).ignoreCase());
			}
			if (objSsHcCuerpoHumano.getDescripcion() != null) {
				criteria.add(Restrictions.like("descripcion", objSsHcCuerpoHumano.getDescripcion(), MatchMode.ANYWHERE)
						.ignoreCase());
			}
			if (objSsHcCuerpoHumano.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", objSsHcCuerpoHumano.getEstado()));
			}

			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsHcCuerpoHumano(SsHcCuerpoHumano objSsHcCuerpoHumano) {
		try {
			int ePisodio = 0;
			if (objSsHcCuerpoHumano.getIdCuerpoHumano() == 0) {
				Criteria criteria = getCurrentSession().createCriteria(SsHcCuerpoHumano.class);
				criteria.setProjection(Projections.max("idCuerpoHumano"));
				if (criteria.uniqueResult() != null)
					ePisodio = (int) criteria.uniqueResult();
				objSsHcCuerpoHumano.setIdCuerpoHumano(ePisodio + 1);
			}
			saveOrUpdate(objSsHcCuerpoHumano);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsHcCuerpoHumano(SsHcCuerpoHumano objSsHcCuerpoHumano) {
		try {
			delete(objSsHcCuerpoHumano);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
