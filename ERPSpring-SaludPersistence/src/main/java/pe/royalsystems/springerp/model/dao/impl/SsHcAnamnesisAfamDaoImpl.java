package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SsHcAnamnesisAfamDao;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfam;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAfamPK;

import java.util.List;

@Repository
public class SsHcAnamnesisAfamDaoImpl extends AbstractDaoImpl<SsHcAnamnesisAfam, SsHcAnamnesisAfamPK> implements SsHcAnamnesisAfamDao {

    protected SsHcAnamnesisAfamDaoImpl() {
        super(SsHcAnamnesisAfam.class);
    }


	@Override
	public SsHcAnamnesisAfam obtenerPorId(SsHcAnamnesisAfamPK ssHcAnamnesisEaPk) {
		Object result = findById(ssHcAnamnesisEaPk);
		return (result!=null?(SsHcAnamnesisAfam)result:null);
	}
	
    @Override
    public SsHcAnamnesisAfam buscar(SsHcAnamnesisAfam ssHcAnamnesisAfam) {    	
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfam.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisAfam.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisAfam.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisAfam.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisAfam.getIdPaciente()));
        return (SsHcAnamnesisAfam) criteria.uniqueResult();
    }
    @Override
    public List<SsHcAnamnesisAfam> listar(SsHcAnamnesisAfam ssHcAnamnesisAfam) {
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfam.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisAfam.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisAfam.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisAfam.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisAfam.getIdPaciente()));
        //criteria.add(Restrictions.eq("secuenciaFamilia", ssHcAnamnesisAfam.getSecuenciaFamilia()));
        return criteria.list();
    }
    
    @Override
    public int guardar(SsHcAnamnesisAfam ssHcAnamnesisAfam) {
		int secuencia = 0;
		if (ssHcAnamnesisAfam.getUnidadReplicacion()!=null
				&& ssHcAnamnesisAfam.getIdPaciente()!=null
				&& ssHcAnamnesisAfam.getEpisodioClinico()!=null
				&& ssHcAnamnesisAfam.getIdEpisodioAtencion()!=null
				) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAfam.class);
			
			criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisAfam.getUnidadReplicacion()));
			criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisAfam.getIdPaciente()));
			criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisAfam.getEpisodioClinico()));
			criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisAfam.getIdEpisodioAtencion()));
			criteria.setProjection(Projections.max("secuenciaFamilia"));
			
			Object object = criteria.uniqueResult();			
			secuencia = (int) (object!=null?object:0);
			secuencia++;
			ssHcAnamnesisAfam.setSecuenciaFamilia(secuencia);
			save(ssHcAnamnesisAfam);
		}
		return secuencia;
    }
    
	@Override
	public int actualizar(SsHcAnamnesisAfam ssHcAnamnesisEa) {
		update(ssHcAnamnesisEa);
		return 1;
	}
	@Override
	public int eliminar(SsHcAnamnesisAfam ssHcAnamnesisEa) {
		delete(ssHcAnamnesisEa);
		return 1;
	}

}
