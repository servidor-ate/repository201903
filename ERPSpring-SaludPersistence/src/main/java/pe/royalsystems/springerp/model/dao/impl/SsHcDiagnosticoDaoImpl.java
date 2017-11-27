package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SsHcDiagnosticoDao;
import pe.royalsystems.springerp.model.domain.SsHcDiagnostico;
import pe.royalsystems.springerp.model.domain.SsHcDiagnosticoPK;

import java.util.List;


@Repository
public class SsHcDiagnosticoDaoImpl extends AbstractDaoImpl<SsHcDiagnostico, SsHcDiagnosticoPK> implements SsHcDiagnosticoDao{

	protected SsHcDiagnosticoDaoImpl() {
		super(SsHcDiagnostico.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsHcDiagnostico> listarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcDiagnostico.class);
			if (objSsHcDiagnostico.getEpisodioClinico()!=0) {
				criteria.add(Restrictions.eq("episodioClinico", objSsHcDiagnostico.getEpisodioClinico()));
			}
			if (objSsHcDiagnostico.getIdEpisodioAtencion()!=0) {
				criteria.add(Restrictions.eq("idEpisodioAtencion", objSsHcDiagnostico.getIdEpisodioAtencion()));
			}
			if (objSsHcDiagnostico.getIdPaciente()!=0) {
				criteria.add(Restrictions.eq("idPaciente", objSsHcDiagnostico.getIdPaciente()));
			}
			if (objSsHcDiagnostico.getUnidadReplicacion()!=null) {
				criteria.add(Restrictions.eq("unidadReplicacion", objSsHcDiagnostico.getUnidadReplicacion()));
			}
			
			List<SsHcDiagnostico> listaRetorno = criteria.list();
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int guardarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico) {	
		int secuencia = 0;
		if (objSsHcDiagnostico.getUnidadReplicacion()!=null
				&& objSsHcDiagnostico.getIdPaciente()!=null
				&& objSsHcDiagnostico.getEpisodioClinico()!=null
				&& objSsHcDiagnostico.getIdEpisodioAtencion()!=null
				) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcDiagnostico.class);
			
			criteria.add(Restrictions.eq("unidadReplicacion", objSsHcDiagnostico.getUnidadReplicacion()));
			criteria.add(Restrictions.eq("idPaciente", objSsHcDiagnostico.getIdPaciente()));
			criteria.add(Restrictions.eq("episodioClinico", objSsHcDiagnostico.getEpisodioClinico()));
			criteria.add(Restrictions.eq("idEpisodioAtencion", objSsHcDiagnostico.getIdEpisodioAtencion()));
			criteria.setProjection(Projections.max("secuencia"));
			
			Object object = criteria.uniqueResult();			
			secuencia = (int) (object!=null?object:0);
			secuencia++;
			objSsHcDiagnostico.setSecuencia(secuencia);
			save(objSsHcDiagnostico);
		}
		return secuencia;
	}


	@Override
	public int actualizarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico) {
		update(objSsHcDiagnostico);
		return 1;
	}
	
	@Override
	public int eliminarSsHcDiagnostico(SsHcDiagnostico objSsHcDiagnostico) {
		delete(objSsHcDiagnostico);
		return 1;
	}

	@Override
	public SsHcDiagnostico obtenerSsHcDiagnosticoID(SsHcDiagnostico objSsHcDiagnostico) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcDiagnostico.class);
			if (objSsHcDiagnostico.getEpisodioClinico()!=0) {
				criteria.add(Restrictions.eq("episodioClinico", objSsHcDiagnostico.getEpisodioClinico()));
			}
			if (objSsHcDiagnostico.getIdEpisodioAtencion()!=0) {
				criteria.add(Restrictions.eq("idEpisodioAtencion", objSsHcDiagnostico.getIdEpisodioAtencion()));
			}
			if (objSsHcDiagnostico.getIdPaciente()!=0) {
				criteria.add(Restrictions.eq("idPaciente", objSsHcDiagnostico.getIdPaciente()));
			}
			if (objSsHcDiagnostico.getUnidadReplicacion()!=null) {
				criteria.add(Restrictions.eq("unidadReplicacion", objSsHcDiagnostico.getUnidadReplicacion()));
			}
			if (objSsHcDiagnostico.getSecuencia()!=0) {
				criteria.add(Restrictions.eq("secuencia", objSsHcDiagnostico.getSecuencia()));
			}

			return  (SsHcDiagnostico) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}


}
