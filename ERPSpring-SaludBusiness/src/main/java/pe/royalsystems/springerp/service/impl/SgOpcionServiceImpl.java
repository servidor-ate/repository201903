package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.SgAgenteOpcionDao;
import pe.royalsystems.springerp.model.dao.SgOpcionDao;
import pe.royalsystems.springerp.model.domain.SgAgenteOpcion;
import pe.royalsystems.springerp.model.domain.SgOpcion;
import pe.royalsystems.springerp.service.SgOpcionService;

@Service("sgOpcionService")
@Transactional(readOnly = true)
public class SgOpcionServiceImpl implements SgOpcionService{

	@Autowired
	private SgOpcionDao sgOpcionDao;

	@Autowired
	private SgAgenteOpcionDao sgAgenteOpcionDao;

	@Override
	@Transactional(readOnly = false)
	public int guardarSgOpcion(SgOpcion objsgOpcion) {
		SgAgenteOpcion obj = new SgAgenteOpcion();
		int anterior = objsgOpcion.getIdOpcion();
		int retorno = 0;
		try {
			retorno = sgOpcionDao.guardarSgOpcion(objsgOpcion);
			obj.setIdAgente(objsgOpcion.getInt_1());
			obj.setIdOpcion(retorno);
			obj.setEstado(objsgOpcion.getEstado());
			if (anterior==0) sgAgenteOpcionDao.guardarSgAgenteOpcion(obj);
			return retorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = false)
	public int eliminarSgOpcion(SgOpcion objSgOpcion) {
		return sgOpcionDao.eliminarSgOpcion(objSgOpcion);
	}

	@Override
	public SgOpcion obtenerSgOpcionID(Integer id) {
		try {
			return sgOpcionDao.obtenerSgOpcionID(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(readOnly = false)
	public int actualizarSgOpcion(SgOpcion objsgOpcion) {
		return sgOpcionDao.actualizarSgOpcion(objsgOpcion);
	}

}
