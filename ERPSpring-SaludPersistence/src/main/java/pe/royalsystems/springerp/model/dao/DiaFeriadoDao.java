package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.GE_DiaFeriado;

public interface DiaFeriadoDao extends AbstractDao<GE_DiaFeriado, Integer> {

	public List<GE_DiaFeriado> listarGeDiaFeriado(GE_DiaFeriado filtro);
}
