package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.MaMiscelaneosDetalleDao;
import pe.royalsystems.springerp.model.domain.MaMiscelaneosDetalle;

@Repository
public class MaMiscelaneosDetalleDaoImpl extends AbstractDaoImpl<MaMiscelaneosDetalle, String> implements MaMiscelaneosDetalleDao{

	protected MaMiscelaneosDetalleDaoImpl() {
		super(MaMiscelaneosDetalle.class);
	}

	@Override
	public MaMiscelaneosDetalle obtenerPorId(MaMiscelaneosDetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(MaMiscelaneosDetalle.class);
		criteria.add(Restrictions.eq("aplicacionCodigo", objDao.getAplicacionCodigo()));
		criteria.add(Restrictions.eq("compania", objDao.getCompania()));
		criteria.add(Restrictions.eq("codigoTabla", objDao.getCodigoTabla()));
		criteria.add(Restrictions.eq("codigoElemento", objDao.getCodigoElemento()));
				
		
		Object obj = criteria.uniqueResult();
		return (obj!=null ? (MaMiscelaneosDetalle)obj:null);
	}

	@Override
	public List<MaMiscelaneosDetalle> listarElementosPag(MaMiscelaneosDetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(MaMiscelaneosDetalle.class);
		if (objDao.getAplicacionCodigo() != null && !objDao.getAplicacionCodigo().isEmpty()) {			
			criteria.add(Restrictions.eq("aplicacionCodigo", objDao.getAplicacionCodigo()));
		}
		if (objDao.getCompania() != null && !objDao.getCompania().isEmpty()) {			
			criteria.add(Restrictions.eq("compania", objDao.getCompania()));
		}		
		if (objDao.getCodigoTabla() != null && !objDao.getCodigoTabla().isEmpty()) {			
			criteria.add(Restrictions.eq("codigoTabla", objDao.getCodigoTabla()));
		}		
		if (objDao.getCodigoElemento() != null && !objDao.getCodigoElemento().isEmpty()) {			
			criteria.add(Restrictions.eq("codigoElemento", objDao.getCodigoElemento()));
		}
		
		if (objDao.getDescripcionLocal() != null && !objDao.getDescripcionLocal().isEmpty()) {
			criteria.add(Restrictions.like("descripcionlocal", objDao.getDescripcionLocal(), MatchMode.ANYWHERE)
					.ignoreCase());
		}		
		if (objDao.getEstado() != null && !objDao.getEstado().isEmpty()) {			
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}	
		setPaginable(objDao, criteria);
		return (List<MaMiscelaneosDetalle>) criteria.list();
	}

	@Override
	public List<MaMiscelaneosDetalle> listarElementos(MaMiscelaneosDetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(MaMiscelaneosDetalle.class);

		if (objDao.getAplicacionCodigo() != null && !objDao.getAplicacionCodigo().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("aplicacionCodigo", objDao.getAplicacionCodigo()));
		}
		if (objDao.getCompania() != null && !objDao.getCompania().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("compania", objDao.getCompania()));
		}		
		if (objDao.getCodigoTabla() != null && !objDao.getCodigoTabla().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("codigoTabla", objDao.getCodigoTabla()));
		}		
		if (objDao.getCodigoElemento() != null && !objDao.getCodigoElemento().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("codigoElemento", objDao.getCodigoElemento()));
		}
		if (objDao.getValorCodigo1() != null && !objDao.getValorCodigo1().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("valorCodigo1", objDao.getValorCodigo1()));
		}
		if (objDao.getDescripcionLocal() != null && !objDao.getDescripcionLocal().isEmpty()) {
			criteria.add(Restrictions.like("descripcionLocal", objDao.getDescripcionLocal(), MatchMode.ANYWHERE)
					.ignoreCase());
		}
		
		if (objDao.getEstado() != null && !objDao.getEstado().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}
	
		return (List<MaMiscelaneosDetalle>) criteria.list();
	}

	@Override
	public int contarTotal(MaMiscelaneosDetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(MaMiscelaneosDetalle.class);
		if (objDao.getAplicacionCodigo() != null && !objDao.getAplicacionCodigo().isEmpty()) {			
			criteria.add(Restrictions.eq("aplicacionCodigo", objDao.getAplicacionCodigo()));
		}
		if (objDao.getCompania() != null && !objDao.getCompania().isEmpty()) {			
			criteria.add(Restrictions.eq("compania", objDao.getCompania()));
		}		
		if (objDao.getCodigoTabla() != null && !objDao.getCodigoTabla().isEmpty()) {			
			criteria.add(Restrictions.eq("codigoTabla", objDao.getCodigoTabla()));
		}		
		if (objDao.getCodigoElemento() != null && !objDao.getCodigoElemento().isEmpty()) {			
			criteria.add(Restrictions.eq("codigoElemento", objDao.getCodigoElemento()));
		}
		
		if (objDao.getDescripcionLocal() != null && !objDao.getDescripcionLocal().isEmpty()) {
			criteria.add(Restrictions.like("descripcionLocal", objDao.getDescripcionLocal(), MatchMode.ANYWHERE)
					.ignoreCase());
		}		
		if (objDao.getEstado() != null && !objDao.getEstado().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}	
		criteria.setProjection(Projections.rowCount());
		String obj = criteria.uniqueResult() != null ? criteria.uniqueResult().toString() : "0";		
		return Integer.parseInt(obj);
	}

	@Override
	public int guardar(MaMiscelaneosDetalle objDao) {
		save(objDao);
		return 1;
	}

	@Override
	public int actualizar(MaMiscelaneosDetalle objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(MaMiscelaneosDetalle objDao) {
		delete(objDao);
		return 1;
	}


	@Override
	public List<MaMiscelaneosDetalle> listarMaMiscelanesoDetalleStore(MaMiscelaneosDetalle maMiscelaneosDetalle) {
		try {
			Double f;
			Query query = getCurrentSession()
					.createSQLQuery("{ SP_SS_HC_MA_MiscelaneosDetalle_LISTAR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");

			System.out.println("mirando accion " + maMiscelaneosDetalle.getAccion());

			query.setParameter(0, maMiscelaneosDetalle.getAplicacionCodigo());
			query.setParameter(1, maMiscelaneosDetalle.getCodigoTabla());
			query.setParameter(2, maMiscelaneosDetalle.getCompania());
			query.setParameter(3, maMiscelaneosDetalle.getCodigoElemento());
			query.setParameter(4, maMiscelaneosDetalle.getDescripcionLocal());
			query.setParameter(5, maMiscelaneosDetalle.getDescripcionExtranjera());
			if (maMiscelaneosDetalle.getValorNumerico() == null) {
				f = Double.MIN_VALUE;
				maMiscelaneosDetalle.setValorNumerico(f);
			}
			query.setParameter(6, maMiscelaneosDetalle.getValorNumerico());
			query.setParameter(7, maMiscelaneosDetalle.getValorCodigo1());
			query.setParameter(8, maMiscelaneosDetalle.getValorCodigo2());
			query.setParameter(9, maMiscelaneosDetalle.getValorCodigo3());
			query.setParameter(10, maMiscelaneosDetalle.getValorCodigo4());
			query.setParameter(11, maMiscelaneosDetalle.getValorCodigo5());
			query.setParameter(12, maMiscelaneosDetalle.getValorFecha());
			query.setParameter(13, maMiscelaneosDetalle.getEstado());
			query.setParameter(14, maMiscelaneosDetalle.getUltimoUsuario());
			query.setParameter(15, maMiscelaneosDetalle.getInicio());
			query.setParameter(16, maMiscelaneosDetalle.getNumeroFilas());
			query.setParameter(17, maMiscelaneosDetalle.getAccion());
			

			List<MaMiscelaneosDetalle> listaRetorno = query.list();

			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}


}
