package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.SsGeEspecialidadDao;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;
import pe.royalsystems.springerp.service.SsGeEspecialidadService;

import java.util.List;

@Service("ssGeEspecialidadService")
@Transactional(readOnly = true)
public class SsGeEspecialidadServiceImpl implements SsGeEspecialidadService {

	@Autowired
	private SsGeEspecialidadDao ssGeEspecialidadDao;

	@Override
	@Transactional(readOnly = true)
	public List<SsGeEspecialidad> listarTablaSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad) {
		try {
			return ssGeEspecialidadDao.listarSsGeEspecialidad(ssGeEspecialidad);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public SsGeEspecialidad buscarSsGeEspecialidadID(SsGeEspecialidad ssGeEspecialidad) {
		try {
			return ssGeEspecialidadDao.buscarSsGeEspecialidadID(ssGeEspecialidad);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public int contadorDeTotales(SsGeEspecialidad ssGeEspecialidad) {
		try {
			return ssGeEspecialidadDao.contadorDeTotales(ssGeEspecialidad);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional
	public int eliminarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad) {
		try {
			return ssGeEspecialidadDao.eliminarSsGeEspecialidad(ssGeEspecialidad);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional
	public int guardarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad) {
		try {
			return ssGeEspecialidadDao.guardarSsGeEspecialidad(ssGeEspecialidad);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
