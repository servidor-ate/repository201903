package pe.royalsystems.springerp.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import pe.royalsystems.springerp.commons.TimeCommons;
import pe.royalsystems.springerp.model.dao.DiaFeriadoDao;
import pe.royalsystems.springerp.model.domain.GE_DiaFeriado;
import pe.royalsystems.springerp.service.DiaFeriadoService;
import pe.royalsystems.springerp.service.utiles.Log;

@Service("diaFeriadoService")
@Transactional(readOnly = true)
public class DiaFeriadoServiceImpl implements DiaFeriadoService {

	@Autowired
	private DiaFeriadoDao feriadoDao;
	
	@Override
	public Map<String, GE_DiaFeriado> obtenerMapeadoPorFechaFeriados(GE_DiaFeriado filtro) {
		try{
			Map<String, GE_DiaFeriado> map_feriados = new LinkedHashMap<String, GE_DiaFeriado>();
			List<GE_DiaFeriado> list = feriadoDao.listarGeDiaFeriado(filtro);
			for(GE_DiaFeriado feriado : list){
				String key = TimeCommons.imprimirSoloFecha(feriado.getFecha());
				map_feriados.put(key, feriado);
			}
			return map_feriados;
		}catch(Exception ex){
			Log.error(ex, "DiaFeriadoServiceImpl :: obtenerMapeadoPorFechaFeriados");
			return null;
		}
	}

}
