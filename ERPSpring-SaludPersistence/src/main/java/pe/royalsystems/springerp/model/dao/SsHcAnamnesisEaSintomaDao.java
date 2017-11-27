package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcAnamnesisEaSintoma;

import java.util.List;

public interface SsHcAnamnesisEaSintomaDao extends AbstractDao<SsHcAnamnesisEaSintoma, String> {
    int GuardarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa)  ;
    int UpdateSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa)  ;
    int EliminarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa)  ;
    SsHcAnamnesisEaSintoma BuscarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa) ;
    int MaxSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa)  ;
    List<SsHcAnamnesisEaSintoma> ListarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa)  ;
}
