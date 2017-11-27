package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcEpisodioClinico;

import java.util.List;

public interface SsHcEpisodioClinicoDao extends AbstractDao<SsHcEpisodioClinico, String> {
    public void saveUser(SsHcEpisodioClinico user);
    public List<SsHcEpisodioClinico> findUsers(String userName);
    public List<SsHcEpisodioClinico> findUsers(int userName);
    public int eliminarSsHcEpisodioClinico(SsHcEpisodioClinico objSsHcEpisodioClinico);
    public int existeSsHcEpisodioClinicoPorOrdenATencion(SsHcEpisodioClinico objSsHcEpisodioClinico);
    
    public SsHcEpisodioClinico obtenerSsHcEpisodioClinicoPorOrdenATencion(SsHcEpisodioClinico objSsHcEpisodioClinico);
    
    public int guardar(SsHcEpisodioClinico objSsHcEpisodioClinico);
}
