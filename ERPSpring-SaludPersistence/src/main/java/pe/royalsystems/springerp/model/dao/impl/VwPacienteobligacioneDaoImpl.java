package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.VwPacienteobligacioneDao;
import pe.royalsystems.springerp.model.domain.vista.VwPacienteobligacione;

import java.util.List;

@Repository
public class VwPacienteobligacioneDaoImpl extends AbstractDaoImpl<VwPacienteobligacione, String> implements VwPacienteobligacioneDao{

	protected VwPacienteobligacioneDaoImpl() {
		super(VwPacienteobligacione.class);
	
	}
	@Override
	public List<VwPacienteobligacione> listar(VwPacienteobligacione objgeDiagnostico,boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(VwPacienteobligacione.class);
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getOblobligacionid())){
			criteria.add(Restrictions.eq("oblobligacionid", objgeDiagnostico.getOblobligacionid()));
		}if(objgeDiagnostico.getPersona()!= null){
			criteria.add(Restrictions.eq("persona", objgeDiagnostico.getPersona()));
		}
			
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getNombreCompleto())){
			criteria.add(Restrictions.like("nombreCompleto", objgeDiagnostico.getNombreCompleto(), MatchMode.ANYWHERE).ignoreCase());
		}
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getCodigoOA())){
			criteria.add(Restrictions.like("codigoOA", objgeDiagnostico.getCodigoOA(),MatchMode.ANYWHERE).ignoreCase());
		}
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getOblestado())){
			criteria.add(Restrictions.eq("oblestado", objgeDiagnostico.getOblestado()));
		}
		if (UtilesCommons.noEsVacio(objgeDiagnostico.getIdCita())) {
			criteria.add(Restrictions.eq("idCita", objgeDiagnostico.getIdCita()));
		}
		if(paginable){
			criteria.setFirstResult(objgeDiagnostico.getInicio());
			criteria.setMaxResults(objgeDiagnostico.getNumeroFilas());
		}
		
		List<VwPacienteobligacione> listaRetorno = criteria.list();
		return listaRetorno;
	}

	@Override
	public VwPacienteobligacione buscar(VwPacienteobligacione objgeDiagnostico) {
		return null;
	}

	@Override
	public int contar(VwPacienteobligacione objgeDiagnostico) {
		Criteria criteria = getCurrentSession().createCriteria(VwPacienteobligacione.class);
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getOblobligacionid())){
			criteria.add(Restrictions.eq("oblobligacionid", objgeDiagnostico.getOblobligacionid()));
		}if(objgeDiagnostico.getPersona()!= null){
			criteria.add(Restrictions.eq("persona", objgeDiagnostico.getPersona()));
		}
			
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getNombreCompleto())){
			criteria.add(Restrictions.like("nombreCompleto", objgeDiagnostico.getNombreCompleto(), MatchMode.ANYWHERE).ignoreCase());
		}
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getCodigoOA())){
			criteria.add(Restrictions.like("codigoOA", objgeDiagnostico.getCodigoOA(),MatchMode.ANYWHERE).ignoreCase());
		}
		if(UtilesCommons.noEsVacio(objgeDiagnostico.getOblestado())){
			criteria.add(Restrictions.eq("oblestado", objgeDiagnostico.getOblestado()));
		}
		if (UtilesCommons.noEsVacio(objgeDiagnostico.getIdCita())) {
			criteria.add(Restrictions.eq("idCita", objgeDiagnostico.getIdCita()));
		}		
		
		Object result = criteria.uniqueResult();
		return Integer.parseInt((result!=null?result.toString():"0"));
	}
}
