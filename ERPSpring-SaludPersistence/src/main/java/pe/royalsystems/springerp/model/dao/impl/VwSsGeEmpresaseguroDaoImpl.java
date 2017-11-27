package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.VwSsGeEmpresaseguroDao;
import pe.royalsystems.springerp.model.domain.VwSsGeEmpresaseguro;

@Repository
public class VwSsGeEmpresaseguroDaoImpl extends AbstractDaoImpl<VwSsGeEmpresaseguro, String>
		implements VwSsGeEmpresaseguroDao {

	protected VwSsGeEmpresaseguroDaoImpl() {
		super(VwSsGeEmpresaseguro.class);
	}

	@Override
	public List<VwSsGeEmpresaseguro> listarVwSsGeEmpresaseguro(VwSsGeEmpresaseguro vwSsGeEmpresaseguro) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(VwSsGeEmpresaseguro.class);
			if (vwSsGeEmpresaseguro.getId() != null) {
				if (vwSsGeEmpresaseguro.getId().getIdempresa() != 0) {
					criteria.add(Restrictions.eq("id.idempresa", vwSsGeEmpresaseguro.getId().getIdempresa()));
				}
				if (vwSsGeEmpresaseguro.getId().getTipoempresa() != null) {
					criteria.add(Restrictions.eq("id.tipoempresa", vwSsGeEmpresaseguro.getId().getTipoempresa()));
				}
				if (vwSsGeEmpresaseguro.getId().getTiposeguro() != null) {
					criteria.add(Restrictions.like("id.tiposeguro", vwSsGeEmpresaseguro.getId().getTiposeguro()));
				}
				if (vwSsGeEmpresaseguro.getId().getEstado() != null) {
					criteria.add(Restrictions.eq("id.estado", vwSsGeEmpresaseguro.getId().getEstado()));
				}
			}
			criteria.setFirstResult(vwSsGeEmpresaseguro.getInicio());
			criteria.setMaxResults(vwSsGeEmpresaseguro.getNumeroFilas());
			List<VwSsGeEmpresaseguro> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public VwSsGeEmpresaseguro buscarVwSsGeEmpresaseguroID(VwSsGeEmpresaseguro vwSsGeEmpresaseguro) {
		try {
			VwSsGeEmpresaseguro vwSsGeEmpresaseguroRetorno;
			Criteria criteria = getCurrentSession().createCriteria(VwSsGeEmpresaseguro.class);
			criteria.add(Restrictions.eq("id.idempresa", vwSsGeEmpresaseguro.getId().getIdempresa()));
			vwSsGeEmpresaseguroRetorno = (VwSsGeEmpresaseguro) criteria.uniqueResult();
			return vwSsGeEmpresaseguroRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(VwSsGeEmpresaseguro vwSsGeEmpresaseguro) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(VwSsGeEmpresaseguro.class);
			criteria.setProjection(Projections.rowCount());
			if (vwSsGeEmpresaseguro.getId() != null) {
				if (vwSsGeEmpresaseguro.getId().getIdempresa() != 0) {
					criteria.add(Restrictions.eq("id.idempresa", vwSsGeEmpresaseguro.getId().getIdempresa()));
				}
				if (vwSsGeEmpresaseguro.getId().getTipoempresa() != null) {
					criteria.add(Restrictions.eq("id.tipoempresa", vwSsGeEmpresaseguro.getId().getTipoempresa()));
				}
				if (vwSsGeEmpresaseguro.getId().getTiposeguro() != null) {
					criteria.add(Restrictions.like("id.tiposeguro", vwSsGeEmpresaseguro.getId().getTiposeguro()));
				}
				if (vwSsGeEmpresaseguro.getId().getEstado() != null) {
					criteria.add(Restrictions.eq("id.estado", vwSsGeEmpresaseguro.getId().getEstado()));
				}
			}
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarVwSsGeEmpresaseguro(VwSsGeEmpresaseguro vwSsGeEmpresaseguro) {
		try {
			delete(vwSsGeEmpresaseguro);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarVwSsGeEmpresaseguro(VwSsGeEmpresaseguro vwSsGeEmpresaseguro) {
		int ePisodio = 0;
		if (vwSsGeEmpresaseguro.getId().getIdempresa() == 0) {
			Criteria criteria = getCurrentSession().createCriteria(VwSsGeEmpresaseguro.class);
			criteria.setProjection(Projections.max("id.idempresa"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			vwSsGeEmpresaseguro.getId().setIdempresa(ePisodio + 1);
		}
		saveOrUpdate(vwSsGeEmpresaseguro);
		return ePisodio;
	}

}
