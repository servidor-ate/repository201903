package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcAnamnesisAfEnfermedadDao;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfEnfermedad;

@Repository
public class SsHcAnamnesisAfEnfermedadDaoImpl extends AbstractDaoImpl<SsHcAnamnesisAfEnfermedad, String>
		implements SsHcAnamnesisAfEnfermedadDao {

	protected SsHcAnamnesisAfEnfermedadDaoImpl() {
		super(SsHcAnamnesisAfEnfermedad.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int guardarSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad) {
		// TODO Auto-generated method stub
		try {

			String sql = "insert into dbo.SS_HC_Anamnesis_AF_Enfermedad"
						 + "(Accion, Observaciones, Version, EpisodioClinico, IdDiagnostico, IdEpisodioAtencion, IdPaciente,UnidadReplicacion)"
					     + " values ('"+ssHcAnamnesisAfEnfermedad.getAccion()+"','"						 			  
						 			   +ssHcAnamnesisAfEnfermedad.getObservaciones()+"','"
						 			   +ssHcAnamnesisAfEnfermedad.getVersion()+"',"
						 			   +ssHcAnamnesisAfEnfermedad.getId().getEpisodioClinico()+","
						 			   +ssHcAnamnesisAfEnfermedad.getId().getIdDiagnostico()+","
						 			   +ssHcAnamnesisAfEnfermedad.getId().getIdEpisodioAtencion()+","
						 			   +ssHcAnamnesisAfEnfermedad.getId().getIdPaciente()+",'"
						 			   +ssHcAnamnesisAfEnfermedad.getId().getUnidadReplicacion()+"')";
			Query query = getCurrentSession().createSQLQuery(sql);
			query.executeUpdate();
			
			
					
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad) {
		// TODO Auto-generated method stub
		try {

			delete(ssHcAnamnesisAfEnfermedad);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<SsHcAnamnesisAfEnfermedad> listarSsHcAnamnesisAfEnfermedad(
			SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad) {
		// TODO Auto-generated method stub
		try {

			Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfEnfermedad.class);

			if (ssHcAnamnesisAfEnfermedad.getId().getEpisodioClinico() != 0) {
				criteria.add(
						Restrictions.eq("id.episodioClinico", ssHcAnamnesisAfEnfermedad.getId().getEpisodioClinico()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getIdDiagnostico() != 0) {
				criteria.add(Restrictions.eq("id.idDiagnostico", ssHcAnamnesisAfEnfermedad.getId().getIdDiagnostico()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getIdEpisodioAtencion() != 0) {
				criteria.add(Restrictions.eq("id.idEpisodioAtencion",
						ssHcAnamnesisAfEnfermedad.getId().getIdEpisodioAtencion()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getIdPaciente() != 0) {
				criteria.add(Restrictions.eq("id.idPaciente", ssHcAnamnesisAfEnfermedad.getId().getIdPaciente()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getUnidadReplicacion() != null) {
				criteria.add(Restrictions.eq("id.unidadReplicacion",
						ssHcAnamnesisAfEnfermedad.getId().getUnidadReplicacion()));
			}
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcAnamnesisAfEnfermedad obtenerSsHcAnamnesisAfEnfermedad(
			SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad) {
		// TODO Auto-generated method stub
		try {

			Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfEnfermedad.class);

			if (ssHcAnamnesisAfEnfermedad.getId().getEpisodioClinico() != 0) {
				criteria.add(
						Restrictions.eq("id.episodioClinico", ssHcAnamnesisAfEnfermedad.getId().getEpisodioClinico()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getIdDiagnostico() != 0) {
				criteria.add(Restrictions.eq("id.idDiagnostico", ssHcAnamnesisAfEnfermedad.getId().getIdDiagnostico()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getIdEpisodioAtencion() != 0) {
				criteria.add(Restrictions.eq("id.idEpisodioAtencion",
						ssHcAnamnesisAfEnfermedad.getId().getIdEpisodioAtencion()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getIdPaciente() != 0) {
				criteria.add(Restrictions.eq("id.idPaciente", ssHcAnamnesisAfEnfermedad.getId().getIdPaciente()));
			}
			if (ssHcAnamnesisAfEnfermedad.getId().getUnidadReplicacion() != null) {
				criteria.add(Restrictions.eq("id.unidadReplicacion",
						ssHcAnamnesisAfEnfermedad.getId().getUnidadReplicacion()));
			}
			
			if (ssHcAnamnesisAfEnfermedad.getId().getSecuencia()!=0) {
				criteria.add(Restrictions.eq("id.secuencia",
						ssHcAnamnesisAfEnfermedad.getId().getSecuencia()));
			}
			
			return (SsHcAnamnesisAfEnfermedad) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int updateSsHcAnamnesisAfEnfermedad(SsHcAnamnesisAfEnfermedad ssHcAnamnesisAfEnfermedad) {
		// TODO Auto-generated method stub
		try {
			
			String sql = "update SS_HC_Anamnesis_AF_Enfermedad set Accion = '"
			        +ssHcAnamnesisAfEnfermedad.getAccion()
					+"',version = '"+ssHcAnamnesisAfEnfermedad.getVersion()
					+"',Observaciones = '"+ssHcAnamnesisAfEnfermedad.getObservaciones()+"'"
					+" where UnidadReplicacion = '"+ssHcAnamnesisAfEnfermedad.getId().getUnidadReplicacion()+"'"
					+" and IdPaciente = "+ssHcAnamnesisAfEnfermedad.getId().getIdPaciente()
					+" and EpisodioClinico = "+ssHcAnamnesisAfEnfermedad.getId().getEpisodioClinico()
					+" and Secuencia = "+ssHcAnamnesisAfEnfermedad.getId().getSecuencia()
					+" and IdDiagnostico = "+ssHcAnamnesisAfEnfermedad.getId().getIdDiagnostico();
			
			Query query = getCurrentSession().createSQLQuery(sql);
			query.executeUpdate();

			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
