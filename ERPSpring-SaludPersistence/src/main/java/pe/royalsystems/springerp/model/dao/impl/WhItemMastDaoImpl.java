package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.WhItemMastDao;
import pe.royalsystems.springerp.model.domain.WhItemMast;
import pe.royalsystems.springerp.model.domain.vista.VwItemMedicamento;

@Repository
public class WhItemMastDaoImpl extends AbstractDaoImpl<WhItemMast, String>implements WhItemMastDao {

	protected WhItemMastDaoImpl() {
		super(WhItemMast.class);
	}

	@Override
	public List<WhItemMast> listarWhItemMast(WhItemMast whItemMast) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(WhItemMast.class);

			if (whItemMast.getItem() != null) {
				criteria.add(Restrictions.eq("item", whItemMast.getItem()));
			}
			if (whItemMast.getDescripcion() != null) {
				criteria.add(Restrictions.eq("descripcion", whItemMast.getDescripcion()));
			}
			if (whItemMast.getLinea() != null) {
				criteria.add(Restrictions.eq("linea", whItemMast.getLinea()));
			}
			if (whItemMast.getFamilia() != null) {
				criteria.add(Restrictions.like("familia", whItemMast.getFamilia()));
			}
			if (whItemMast.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", whItemMast.getEstado()));
			}
			criteria.setFirstResult(whItemMast.getInicio());
			criteria.setMaxResults(whItemMast.getNumeroFilas());
			List<WhItemMast> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public WhItemMast buscarWhItemMastID(WhItemMast whItemMast) {
		try {
			WhItemMast whItemMastRetorno;
			Criteria criteria = getCurrentSession().createCriteria(WhItemMast.class);
			criteria.add(Restrictions.eq("item", whItemMast.getItem()));
			whItemMastRetorno = (WhItemMast) criteria.uniqueResult();
			return whItemMastRetorno;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int contadorDeTotales(WhItemMast whItemMast) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(WhItemMast.class);
			criteria.setProjection(Projections.rowCount());
			if (whItemMast.getItem() != null) {
				criteria.add(Restrictions.eq("item", whItemMast.getItem()));
			}
			if (whItemMast.getDescripcion() != null) {
				criteria.add(Restrictions.eq("descripcion", whItemMast.getDescripcion()));
			}
			if (whItemMast.getLinea() != null) {
				criteria.add(Restrictions.eq("linea", whItemMast.getLinea()));
			}
			if (whItemMast.getFamilia() != null) {
				criteria.add(Restrictions.like("familia", whItemMast.getFamilia()));
			}
			if (whItemMast.getEstado() != null) {
				criteria.add(Restrictions.eq("estado", whItemMast.getEstado()));
			}
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int eliminarWhItemMast(WhItemMast whItemMast) {
		try {
			delete(whItemMast);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarWhItemMast(WhItemMast whItemMast) {
		int ePisodio = 0;
		if (whItemMast.getItem() == "0") {
			Criteria criteria = getCurrentSession().createCriteria(WhItemMast.class);
			criteria.setProjection(Projections.max("item"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			whItemMast.setItem(""+ePisodio + 1);
		}
		saveOrUpdate(whItemMast);
		return ePisodio;
	}

	@Override
	public List<VwItemMedicamento> listarElementosVw(VwItemMedicamento objDao, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(VwItemMedicamento.class);

		if (UtilesCommons.noEsVacio(objDao.getTipo())) {
			criteria.add(Restrictions.eq("tipo", objDao.getTipo()));
		}
		
		if (UtilesCommons.noEsVacio(objDao.getLinea())) {
			criteria.add(Restrictions.eq("linea", objDao.getLinea()));
		}
		if (UtilesCommons.noEsVacio(objDao.getFamilia())) {
			criteria.add(Restrictions.eq("familia", objDao.getFamilia()));
		}
		if (UtilesCommons.noEsVacio(objDao.getSubFamilia())) {
			criteria.add(Restrictions.eq("subFamilia", objDao.getSubFamilia()));
		}
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}
		if (UtilesCommons.noEsVacio(objDao.getDciMed())) {
			criteria.add(Restrictions.eq("dciMed", objDao.getDciMed()));
		}
		if (UtilesCommons.noEsVacio(objDao.getNombreDciMed())) {
			criteria.add(Restrictions.like("nombreDciMed", objDao.getNombreDciMed(),MatchMode.ANYWHERE).ignoreCase());
		}
		
		if(paginable){
			criteria.setFirstResult(objDao.getInicio());
			criteria.setMaxResults(objDao.getNumeroFilas());	
		}
		
		
		return criteria.list();
	}

	@Override
	public int contarTotalVw(VwItemMedicamento objDao) {
		Criteria criteria = getCurrentSession().createCriteria(VwItemMedicamento.class);

		if (UtilesCommons.noEsVacio(objDao.getTipo())) {
			criteria.add(Restrictions.eq("tipo", objDao.getTipo()));
		}
		
		if (UtilesCommons.noEsVacio(objDao.getLinea())) {
			criteria.add(Restrictions.eq("linea", objDao.getLinea()));
		}
		if (UtilesCommons.noEsVacio(objDao.getFamilia())) {
			criteria.add(Restrictions.eq("familia", objDao.getFamilia()));
		}
		if (UtilesCommons.noEsVacio(objDao.getSubFamilia())) {
			criteria.add(Restrictions.eq("subFamilia", objDao.getSubFamilia()));
		}
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}
		if (UtilesCommons.noEsVacio(objDao.getDciMed())) {
			criteria.add(Restrictions.eq("dciMed", objDao.getDciMed()));
		}
		if (UtilesCommons.noEsVacio(objDao.getNombreDciMed())) {
			criteria.add(Restrictions.like("nombreDciMed", objDao.getNombreDciMed(),MatchMode.ANYWHERE).ignoreCase());
		}
		
		criteria.setProjection(Projections.rowCount());
		String obj = criteria.uniqueResult() != null ? criteria.uniqueResult().toString() : "0";		
		return Integer.parseInt(obj);
	}

}
