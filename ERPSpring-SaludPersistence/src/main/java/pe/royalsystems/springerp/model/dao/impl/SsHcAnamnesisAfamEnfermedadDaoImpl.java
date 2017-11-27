package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SsHcAnamnesisAfamEnfermedadDao;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfamEnfermedad;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfamEnfermedadPK;

import java.util.List;

@Repository
public class SsHcAnamnesisAfamEnfermedadDaoImpl extends AbstractDaoImpl<SsHcAnamnesisAfamEnfermedad, SsHcAnamnesisAfamEnfermedadPK> implements SsHcAnamnesisAfamEnfermedadDao {

    protected SsHcAnamnesisAfamEnfermedadDaoImpl() {
        super(SsHcAnamnesisAfamEnfermedad.class);
    }
	@Override
	public SsHcAnamnesisAfamEnfermedad obtenerPorId(SsHcAnamnesisAfamEnfermedadPK ssHcAnamnesisEaPK) {
		Object result = findById(ssHcAnamnesisEaPK);
		return (result!=null?(SsHcAnamnesisAfamEnfermedad)result:null);
	}



    @Override
    public SsHcAnamnesisAfamEnfermedad buscar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisAfam) {
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfamEnfermedad.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisAfam.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisAfam.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisAfam.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisAfam.getIdPaciente()));
        criteria.add(Restrictions.eq("secuenciaFamilia", ssHcAnamnesisAfam.getSecuenciaFamilia()));
        return (SsHcAnamnesisAfamEnfermedad) criteria.uniqueResult();
    }

    @Override
    public List<SsHcAnamnesisAfamEnfermedad> listar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisAfam) {
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfamEnfermedad.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisAfam.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisAfam.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisAfam.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisAfam.getIdPaciente()));
        criteria.add(Restrictions.eq("secuenciaFamilia", ssHcAnamnesisAfam.getSecuenciaFamilia()));
        return criteria.list();
    }


    @Override
    public int guardar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa) {
		int secuencia = 0;
		if (ssHcAnamnesisEa.getUnidadReplicacion()!=null
				&& ssHcAnamnesisEa.getIdPaciente()!=null
				&& ssHcAnamnesisEa.getEpisodioClinico()!=null
				&& ssHcAnamnesisEa.getIdEpisodioAtencion()!=null
				&& ssHcAnamnesisEa.getSecuenciaFamilia()!=null
				) {
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfamEnfermedad.class);
			
			criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion()));
			criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisEa.getIdPaciente()));
			criteria.add(Restrictions.eq("episodioClinico",ssHcAnamnesisEa.getEpisodioClinico()));
			criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion()));
			criteria.add(Restrictions.eq("secuenciaFamilia", ssHcAnamnesisEa.getSecuenciaFamilia()));
			criteria.setProjection(Projections.max("secuencia"));
			
			Object object = criteria.uniqueResult();			
			secuencia = (int) (object!=null?object:0);
			secuencia++;
			ssHcAnamnesisEa.setSecuencia(secuencia );
			save(ssHcAnamnesisEa);
			
			
			//****OBS is SET TO ON
			//
			/*ssHcAnamnesisEa.setSecuencia(null );
			Object result = getCurrentSession().save(ssHcAnamnesisEa);
			SsHcAnamnesisAfamEnfermedadPK resultPk = (result!=null?(SsHcAnamnesisAfamEnfermedadPK)result:null);
			if(resultPk!=null){
				secuencia++;
				//secuencia = resultPk.getSecuencia();
			}*/
			
		}
		return secuencia;
    }
    
	@Override
	public int actualizar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa) {
		update(ssHcAnamnesisEa);
		return 1;
	}

	@Override
	public int eliminar(SsHcAnamnesisAfamEnfermedad ssHcAnamnesisEa) {
		delete(ssHcAnamnesisEa);
		return 1;
	}
}
