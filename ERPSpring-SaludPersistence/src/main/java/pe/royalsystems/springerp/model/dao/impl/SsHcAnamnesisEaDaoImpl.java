package pe.royalsystems.springerp.model.dao.impl;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SsHcAnamnesisEaDao;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisEa;

import java.util.List;

@Repository
public class SsHcAnamnesisEaDaoImpl extends AbstractDaoImpl<SsHcAnamnesisEa, String> implements SsHcAnamnesisEaDao {

    protected SsHcAnamnesisEaDaoImpl() {
        super(SsHcAnamnesisEa.class);
    }

    @Override
    public void saveSsHcAnamnesisEa(SsHcAnamnesisEa user) {
        saveOrUpdate(user);
    }

    @Override
    public SsHcAnamnesisEa findSsHcAnamnesisEaPorId(SsHcAnamnesisEa ssHcAnamnesisEa) {
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisEa.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisEa.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisEa.getIdPaciente()));
        return (SsHcAnamnesisEa) criteria.uniqueResult();
    }

    public List<SsHcAnamnesisEa> listSsHcAnamnesisEa(SsHcAnamnesisEa ssHcAnamnesisEa) {
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisEa.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisEa.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisEa.getIdPaciente()));
        return criteria.list();
    }
}
