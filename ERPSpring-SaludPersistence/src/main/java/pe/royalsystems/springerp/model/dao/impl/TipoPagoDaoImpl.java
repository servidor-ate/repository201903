package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.TipoPagoDao;
import pe.royalsystems.springerp.model.domain.SgAgente;
import pe.royalsystems.springerp.model.domain.TipoPago;

@Repository
public class TipoPagoDaoImpl extends AbstractDaoImpl<TipoPago, String>  implements TipoPagoDao{

	protected TipoPagoDaoImpl() {
		super(TipoPago.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TipoPago> listarTipoPago(TipoPago objTipoPago) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(TipoPago.class);
			
			if (objTipoPago.getTipoPago()!=null) {
				criteria.add(Restrictions.eq("tipoPago", objTipoPago.getTipoPago()));
			}
			if (objTipoPago.getDescripcion()!=null) {
				criteria.add(Restrictions.like("descripcion", objTipoPago.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			criteria.setFirstResult(objTipoPago.getInicio());
			criteria.setMaxResults(objTipoPago.getNumeroFilas());
			
			List<TipoPago> listaRetorno = criteria.list();
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int guardarTipoPago(TipoPago objTipoPago) {
		// TODO Auto-generated method stub
		try {
			saveOrUpdate(objTipoPago);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarTipoPago(TipoPago objTipoPago) {
		// TODO Auto-generated method stub
		try {
			delete(objTipoPago);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int contadorTotales(TipoPago objTipoPago) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession()
					.createCriteria(TipoPago.class);
			criteria.setProjection(Projections.rowCount());
			
			if (objTipoPago.getTipoPago()!=null) {
				criteria.add(Restrictions.eq("tipoPago", objTipoPago.getTipoPago()));
			}
			if (objTipoPago.getDescripcion()!=null) {
				criteria.add(Restrictions.like("descripcion", objTipoPago.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			
		 return Integer.parseInt(criteria.uniqueResult().toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public TipoPago obtenerTipoPagoID(TipoPago objTipoPago) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(TipoPago.class);
			
			if (objTipoPago.getTipoPago()!=null) {
				criteria.add(Restrictions.eq("tipoPago", objTipoPago.getTipoPago()));
			}
			
			
			criteria.setFirstResult(objTipoPago.getInicio());
			criteria.setMaxResults(objTipoPago.getNumeroFilas());
			
			return (TipoPago) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
