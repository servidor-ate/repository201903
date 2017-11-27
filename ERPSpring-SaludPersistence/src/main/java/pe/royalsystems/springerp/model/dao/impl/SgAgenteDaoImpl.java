package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SgAgenteDao;
import pe.royalsystems.springerp.model.domain.SgAgente;
import pe.royalsystems.springerp.model.domain.Usuario;

@Repository
public class SgAgenteDaoImpl extends AbstractDaoImpl<SgAgente, Integer> implements SgAgenteDao{

	protected SgAgenteDaoImpl() {
		super(SgAgente.class);
		// TODO Auto-generated constructor stub
	}
  
	@Override
	public List<SgAgente> listarSsAgente(SgAgente objsgAgente) {
		try {	
			Criteria criteria = getCurrentSession().createCriteria(SgAgente.class);
			
			if (objsgAgente.getIdAgente() != 0) {
				criteria.add(Restrictions.eq("idAgente", objsgAgente.getIdAgente()));
			}
			
			if (objsgAgente.getIdGrupo()!=null) {
				criteria.add(Restrictions.eq("idGrupo",objsgAgente.getIdGrupo()));
			}
			if (objsgAgente.getNombre()!=null) {
				criteria.add(Restrictions.like("nombre", objsgAgente.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objsgAgente.getCodigoAgente()!=null) {
				criteria.add(Restrictions.like("codigoAgente", objsgAgente.getCodigoAgente(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objsgAgente.getIdEmpleado()!=null && objsgAgente.getIdEmpleado() !=0) {
				criteria.add(Restrictions.eq("idEmpleado", objsgAgente.getIdEmpleado()));
			}
			if (objsgAgente.getEstado()!=null) {
				criteria.add(Restrictions.eq("estado", objsgAgente.getEstado()));
			}
			if (objsgAgente.getTipoAgente()!=null) {
				criteria.add(Restrictions.eq("tipoAgente", objsgAgente.getTipoAgente()));
			}
			if (objsgAgente.getPlataforma()!=null) {
				criteria.add(Restrictions.eq("plataforma", objsgAgente.getPlataforma()));
			}
			
			criteria.setFirstResult(objsgAgente.getInicio());
			criteria.setMaxResults(objsgAgente.getNumeroFilas());
			
			List<SgAgente> listaRetorno = criteria.list();
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesRegistrosSsAgente(SgAgente objsgAgente) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession()
					.createCriteria(SgAgente.class);
			criteria.setProjection(Projections.rowCount());
			
			if (objsgAgente.getIdAgente() != 0) {
				criteria.add(Restrictions.eq("idAgente", objsgAgente.getIdAgente()));
			}
			
			if (objsgAgente.getIdGrupo()!=null) {
				criteria.add(Restrictions.eq("idGrupo",objsgAgente.getIdGrupo()));
			}
			if (objsgAgente.getNombre()!=null) {
				criteria.add(Restrictions.like("nombre", objsgAgente.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (UtilesCommons.noEsVacio(objsgAgente.getCodigoAgente())) {			
				criteria.add(Restrictions.like("codigoAgente", objsgAgente.getCodigoAgente(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objsgAgente.getIdEmpleado()!=null && objsgAgente.getIdEmpleado() !=0) {
				criteria.add(Restrictions.eq("idEmpleado", objsgAgente.getIdEmpleado()));
			}
			if (objsgAgente.getEstado()!=null) {
				criteria.add(Restrictions.eq("estado", objsgAgente.getEstado()));
			}
			if (objsgAgente.getTipoAgente()!=null) {
				criteria.add(Restrictions.eq("tipoAgente", objsgAgente.getTipoAgente()));
			}
			if (objsgAgente.getPlataforma()!=null) {
				criteria.add(Restrictions.eq("plataforma", objsgAgente.getPlataforma()));
			}
			
			if ("BUSCAR_POR_CODIGO".equals(objsgAgente.getNombreConsulta())) {
				if (UtilesCommons.noEsVacio(objsgAgente.getCodigoAgente())) {
					criteria.add(Restrictions.eq("codigoAgente", objsgAgente.getCodigoAgente()));				
				}
			}
			
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsAgente(SgAgente objsgAgente) {		
		int id=0;
		Criteria criteria = getCurrentSession().createCriteria(SgAgente.class);
		criteria.setProjection(Projections.max("idAgente"));
		Object result = criteria.uniqueResult(); 
		if (result!=null) id = (int) result;
		id++;
		objsgAgente.setIdAgente(id);
		save(objsgAgente);
		return id;
	}

	@Override
	public int eliminarSsAgente(SgAgente objsgAgente) {
		delete(objsgAgente);
		return 1;
	}

	@Override
	public SgAgente obtenerPorId(Integer id) {	
		Object obj = findById(id);		
		return (obj!=null ? (SgAgente)obj:null);
	}

	@Override
	public SgAgente validarLogin(SgAgente objsgAgente) {		
		try {							
			Criteria criteria = getCurrentSession().createCriteria(SgAgente.class);
			criteria.add(Restrictions.eq("codigoAgente", objsgAgente.getCodigoAgente()).ignoreCase());
			if (objsgAgente.getClave()==null) {
				criteria.add(Restrictions.isNull("clave"));
			}else if (objsgAgente.getClave()!=null && objsgAgente.getClave().equals("")) {
				criteria.add(Restrictions.isNull("clave"));
			}else {
				criteria.add(Restrictions.eq("clave", objsgAgente.getClave()));
			}								
			SgAgente listaRetorno = (SgAgente)criteria.uniqueResult();							
			return listaRetorno;					
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int actualizarSsAgente(SgAgente objsgAgente) {
		update(objsgAgente);
		return 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SgAgente> listarElementos(SgAgente objsgAgente, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SgAgente.class);
		
		if (objsgAgente.getIdAgente() != 0) {
			criteria.add(Restrictions.eq("idAgente", objsgAgente.getIdAgente()));
		}
		
		if (objsgAgente.getIdGrupo()!=null) {
			criteria.add(Restrictions.eq("idGrupo",objsgAgente.getIdGrupo()));
		}
		if (objsgAgente.getNombre()!=null) {
			criteria.add(Restrictions.like("nombre", objsgAgente.getNombre(),MatchMode.ANYWHERE).ignoreCase());
		}
		if (UtilesCommons.noEsVacio(objsgAgente.getCodigoAgente())) {			
			criteria.add(Restrictions.like("codigoAgente", objsgAgente.getCodigoAgente(),MatchMode.ANYWHERE).ignoreCase());
		}
		if (objsgAgente.getIdEmpleado()!=null && objsgAgente.getIdEmpleado() !=0) {
			criteria.add(Restrictions.eq("idEmpleado", objsgAgente.getIdEmpleado()));
		}
		if (objsgAgente.getEstado()!=null) {
			criteria.add(Restrictions.eq("estado", objsgAgente.getEstado()));
		}
		if (objsgAgente.getTipoAgente()!=null) {
			criteria.add(Restrictions.eq("tipoAgente", objsgAgente.getTipoAgente()));
		}
		if (objsgAgente.getPlataforma()!=null) {
			criteria.add(Restrictions.eq("plataforma", objsgAgente.getPlataforma()));
		}
		
		if ("BUSCAR_POR_CODIGO".equals(objsgAgente.getNombreConsulta())) {
			if (UtilesCommons.noEsVacio(objsgAgente.getCodigoAgente())) {
				criteria.add(Restrictions.eq("codigoAgente", objsgAgente.getCodigoAgente()));				
			}
		}
		if(paginable){
			criteria.setFirstResult(objsgAgente.getInicio());
			criteria.setMaxResults(objsgAgente.getNumeroFilas());			
		}				
		List<SgAgente> listaRetorno = criteria.list();
		return listaRetorno;
	}

}
