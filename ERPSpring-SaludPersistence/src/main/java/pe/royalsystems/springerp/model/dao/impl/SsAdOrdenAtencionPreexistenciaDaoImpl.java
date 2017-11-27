package pe.royalsystems.springerp.model.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsAdOrdenAtencionPreexistenciaDao;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionPreexistencia;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionPreexistenciaId;
import pe.royalsystems.springerp.model.domain.VwAtencionpacienteGeneral;

@Repository
public class SsAdOrdenAtencionPreexistenciaDaoImpl extends AbstractDaoImpl<SsAdOrdenAtencionPreexistencia, String>
		implements SsAdOrdenAtencionPreexistenciaDao {

	protected SsAdOrdenAtencionPreexistenciaDaoImpl() {
		super(SsAdOrdenAtencionPreexistencia.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsAdOrdenAtencionPreexistencia> listarTratamientosActivos(
			SsAdOrdenAtencionPreexistencia objSsAdOrdenAtencionPreexistencia) {
		// TODO Auto-generated method stub
		try {

			String queryLogica = "from SsAdOrdenAtencionPreexistencia d inner join d.ssAdOrdenAtencion where ";
			
			if (objSsAdOrdenAtencionPreexistencia.getSsAdOrdenAtencion()!=null) {
	
				queryLogica = queryLogica + "  d.ssAdOrdenAtencion.idPaciente = "+objSsAdOrdenAtencionPreexistencia.getSsAdOrdenAtencion().getIdPaciente();
			}
			
			Query query = getCurrentSession().createQuery(queryLogica);
			List<Object> result =  query.list();
			Iterator itr = result.iterator();
			List<SsAdOrdenAtencionPreexistencia> listaRetorno = new ArrayList<SsAdOrdenAtencionPreexistencia>();
			
			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				SsAdOrdenAtencionPreexistencia adOrdenAtencionPreexistencia = new SsAdOrdenAtencionPreexistencia();
				
				if (obj[0] !=null) {
					adOrdenAtencionPreexistencia = (SsAdOrdenAtencionPreexistencia) obj[0];
					
				}
				
				listaRetorno.add(adOrdenAtencionPreexistencia);
				
			}
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
