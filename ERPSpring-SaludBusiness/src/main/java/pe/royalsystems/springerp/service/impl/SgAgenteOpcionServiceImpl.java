package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.SgAgenteOpcionDao;
import pe.royalsystems.springerp.model.domain.SgAgenteOpcion;
import pe.royalsystems.springerp.service.SgAgenteOpcionService;

@Service("sgAgenteOpcionService")
@Transactional(readOnly = true)
public class SgAgenteOpcionServiceImpl implements SgAgenteOpcionService{

	@Autowired
	private SgAgenteOpcionDao sgAgenteOpcionDao;
	
	@Override
	@Transactional
	public int guardarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion) {
		// TODO Auto-generated method stub
		try {
			
			sgAgenteOpcionDao.guardarSgAgenteOpcion(objSgAgenteOpcion);
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional
	public int eliminarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion) {
		// TODO Auto-generated method stub
		try {
			
			sgAgenteOpcionDao.delete(objSgAgenteOpcion);
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public SgAgenteOpcion buscarSgAgenteOpcionID(SgAgenteOpcion objSgAgenteOpcion) {
		// TODO Auto-generated method stub
		try {
			return sgAgenteOpcionDao.buscarSgAgenteOpcionID(objSgAgenteOpcion);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
