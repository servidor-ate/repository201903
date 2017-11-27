package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.VwServicioPrestacionDao;
import pe.royalsystems.springerp.model.domain.VwServicioPrestacion;

@Repository
public class VwServicioPrestacionDaoImpl extends AbstractDaoImpl<VwServicioPrestacion, String>
		implements VwServicioPrestacionDao {

	protected VwServicioPrestacionDaoImpl() {
		super(VwServicioPrestacion.class);
	}

	@Override
	public List<VwServicioPrestacion> listarVwServicioPrestacion(VwServicioPrestacion vwServicioPrestacion) {
		try {

			Criteria criteria = getCurrentSession().createCriteria(VwServicioPrestacion.class);
			if (vwServicioPrestacion.getId() != null) {
				if (vwServicioPrestacion.getId().getComponente() != null) {
					criteria.add(Restrictions.eq("componente", vwServicioPrestacion.getId().getComponente()));
				}

				if (vwServicioPrestacion.getDescripcion() != null) {
					criteria.add(Restrictions.eq("descripcion", vwServicioPrestacion.getDescripcion()));
				}

				if (vwServicioPrestacion.getId().getEstado() != null) {
					criteria.add(Restrictions.eq("estado", vwServicioPrestacion.getId().getEstado()));
				}
			}
			criteria.setFirstResult(vwServicioPrestacion.getInicio());
			criteria.setMaxResults(vwServicioPrestacion.getNumeroFilas());
			List<VwServicioPrestacion> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public VwServicioPrestacion buscarVwServicioPrestacionID(VwServicioPrestacion vwServicioPrestacion) {
		try {
			VwServicioPrestacion vwServicioPrestacionRetorno;
			Criteria criteria = getCurrentSession().createCriteria(VwServicioPrestacion.class);
			criteria.add(Restrictions.eq("componente", vwServicioPrestacion.getId().getComponente()));
			vwServicioPrestacionRetorno = (VwServicioPrestacion) criteria.uniqueResult();
			return vwServicioPrestacionRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(VwServicioPrestacion vwServicioPrestacion) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(VwServicioPrestacion.class);
			criteria.setProjection(Projections.rowCount());
			if (vwServicioPrestacion.getId() != null) {
				if (vwServicioPrestacion.getId().getComponente() != null) {
					criteria.add(Restrictions.eq("componente", vwServicioPrestacion.getId().getComponente()));
				}

				if (vwServicioPrestacion.getDescripcion() != null) {
					criteria.add(
							Restrictions.like("descripcion", vwServicioPrestacion.getDescripcion(), MatchMode.ANYWHERE)
									.ignoreCase());
				}

				if (vwServicioPrestacion.getId().getEstado() != null) {
					criteria.add(Restrictions.eq("estado", vwServicioPrestacion.getId().getEstado()));
				}
			}
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarVwServicioPrestacion(VwServicioPrestacion vwServicioPrestacion) {
		try {
			delete(vwServicioPrestacion);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarVwServicioPrestacion(VwServicioPrestacion vwServicioPrestacion) {
		try {
			String sql = "insert into dbo.SS_GE_ComponentePrestacion"
					+ "(Componente, CodigoSegus, CodigoNuevo, ValorMedida, CantidadAsistentes, Instrumentistas,DiasHospitalizacion)"
					+ " values ('" + vwServicioPrestacion.getId().getComponente() + "','"
					+ vwServicioPrestacion.getId().getCodigoSegus() + "','"
					+ vwServicioPrestacion.getId().getCodigoNuevo() + "',"
					+ vwServicioPrestacion.getId().getValorMedida() + ","
					+ vwServicioPrestacion.getId().getCantidadAsistentes() + ","
					+ vwServicioPrestacion.getId().getInstrumentistas() + ","
					+ vwServicioPrestacion.getId().getDiasHospitalizacion() + ",'";
			Query query = getCurrentSession().createSQLQuery(sql);
			query.executeUpdate();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
