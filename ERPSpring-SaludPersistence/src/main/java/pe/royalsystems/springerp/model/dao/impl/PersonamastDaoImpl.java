package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.PersonamastDao;
import pe.royalsystems.springerp.model.domain.Personamast;

@Repository
public class PersonamastDaoImpl extends AbstractDaoImpl<Personamast, Integer>implements PersonamastDao {

	protected PersonamastDaoImpl() {
		super(Personamast.class);
	}

	@Override
	public List<Personamast> listarPersonamast(Personamast personamast,boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(Personamast.class);
		if (UtilesCommons.noEsVacio(personamast.getPersona())) {
			criteria.add(Restrictions.eq("persona", personamast.getPersona()));
		}
		if (UtilesCommons.noEsVacio(personamast.getTipoDocumento())) {
			criteria.add(Restrictions.eq("tipoDocumento", personamast.getTipoDocumento()));
		}
		if (UtilesCommons.noEsVacio(personamast.getDocumento())) {
			criteria.add(Restrictions.eq("documento", personamast.getDocumento()));
		}
		if (UtilesCommons.noEsVacio(personamast.getBusqueda())) {
			criteria.add(Restrictions.like("busqueda", personamast.getBusqueda(),MatchMode.ANYWHERE).ignoreCase());
		}
		if (UtilesCommons.noEsVacio(personamast.getNombreCompleto())) {
			criteria.add(Restrictions.like("nombreCompleto", personamast.getNombreCompleto(),MatchMode.ANYWHERE).ignoreCase());
		}
		if (UtilesCommons.noEsVacio(personamast.getEstado())) {
			criteria.add(Restrictions.eq("estado", personamast.getEstado()));
		}
		if(paginable){
			criteria.setFirstResult(personamast.getInicio());
			criteria.setMaxResults(personamast.getNumeroFilas());				
		}		
		return criteria.list();
	}

	
	@Override
	public Personamast obtenerPorId(Integer primaryKey) {
		Object result  = findById(primaryKey);
		return result!=null?(Personamast)result:null;
	}

	@Override
	public int contadorDeTotales(Personamast personamast) {
		Criteria criteria = getCurrentSession().createCriteria(Personamast.class);
		criteria.setProjection(Projections.rowCount());
		if (UtilesCommons.noEsVacio(personamast.getPersona())) {
			criteria.add(Restrictions.eq("persona", personamast.getPersona()));
		}
		if (UtilesCommons.noEsVacio(personamast.getDocumento())) {
			criteria.add(Restrictions.eq("documento", personamast.getDocumento()));
		}
		if (UtilesCommons.noEsVacio(personamast.getBusqueda())) {
			criteria.add(Restrictions.like("busqueda", personamast.getBusqueda(),MatchMode.ANYWHERE).ignoreCase());
		}
		if (UtilesCommons.noEsVacio(personamast.getNombreCompleto())) {
			criteria.add(Restrictions.like("nombreCompleto", personamast.getNombreCompleto(),MatchMode.ANYWHERE).ignoreCase());
		}
		if (UtilesCommons.noEsVacio(personamast.getEstado())) {
			criteria.add(Restrictions.eq("estado", personamast.getEstado()));
		}
		Object result = criteria.uniqueResult();
		return Integer.parseInt(result!=null?result.toString():"0");
	}

	@Override
	public int eliminarPersonamast(Personamast personamast) {
		try {
			delete(personamast);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarPersonamast(Personamast personamast) {
		int personaId= 0;
		
			Criteria criteria = getCurrentSession().createCriteria(Personamast.class);
			criteria.setProjection(Projections.max("persona"));
			
			Object result = criteria.uniqueResult();			
			if (result != null)
				personaId = (int)result;
			personaId++;
			personamast.setPersona(personaId);
		
		save(personamast);
		return personaId;
	}

	@Override
	public int actualizar(Personamast personamast) {
		update(personamast);
		return 1;
	}

}
