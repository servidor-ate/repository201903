package pe.royalsystems.springerp.service;

import java.util.Map;

import pe.royalsystems.springerp.model.domain.GE_DiaFeriado;

public interface DiaFeriadoService {

	public Map<String, GE_DiaFeriado> obtenerMapeadoPorFechaFeriados(GE_DiaFeriado filtro);
}
