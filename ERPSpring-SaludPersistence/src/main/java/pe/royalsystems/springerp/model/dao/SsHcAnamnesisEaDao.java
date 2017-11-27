package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcAnamnesisEa;

import java.util.List;

public interface SsHcAnamnesisEaDao extends AbstractDao<SsHcAnamnesisEa, String> {
    void saveSsHcAnamnesisEa(SsHcAnamnesisEa ssHcAnamnesisEa);
    SsHcAnamnesisEa findSsHcAnamnesisEaPorId(SsHcAnamnesisEa ssHcAnamnesisEa);
    List<SsHcAnamnesisEa> listSsHcAnamnesisEa(SsHcAnamnesisEa ssHcAnamnesisEa);
}
