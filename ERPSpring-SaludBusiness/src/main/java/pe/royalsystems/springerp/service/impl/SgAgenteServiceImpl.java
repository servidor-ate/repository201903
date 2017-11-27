package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.SgAgenteDao;
import pe.royalsystems.springerp.model.domain.*;
import pe.royalsystems.springerp.service.SgAgenteOpcionService;
import pe.royalsystems.springerp.service.SgAgenteService;
import pe.royalsystems.springerp.service.SgPerfilUsuarioService;
import pe.royalsystems.springerp.service.SsHcFavoritoService;

import java.util.List;

@Service("sgAgenteService")
@Transactional(readOnly = true)
public class SgAgenteServiceImpl implements SgAgenteService {

	@Autowired
	private SgAgenteDao sgAgenteDao;



	@Override	
	public List<SgAgente> listarSsAgente(SgAgente objsgAgente) {
		// TODO Auto-generated method stub
		try {
			return sgAgenteDao.listarSsAgente(objsgAgente);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override	
	public int contadorTotalesRegistrosSsAgente(SgAgente objsgAgente) {
		// TODO Auto-generated method stub
		try {
			return sgAgenteDao.contadorTotalesRegistrosSsAgente(objsgAgente);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = false)
	public int guardarSsAgente(SgAgente objsgAgente) {
		// TODO Auto-generated method stub
		return sgAgenteDao.guardarSsAgente(objsgAgente);
	}


	@Override	
	public SgAgente obtenerPorId(Integer objsgAgente) {
		// TODO Auto-generated method stub
		return sgAgenteDao.obtenerPorId(objsgAgente);
	}

	@Override
	public SgAgente validarLogin(SgAgente objsgAgente) {
		// TODO Auto-generated method stub
			try {
				 return sgAgenteDao.validarLogin(objsgAgente);
				} catch (Exception e) {
				// TODO: handle exception
					e.printStackTrace();
					return null;
			}
	}

	@Override
	@Transactional(readOnly = false)
	public int actualizarSsAgente(SgAgente objsgAgente) {
		return sgAgenteDao.actualizarSsAgente(objsgAgente);
	}

	@Override
	public List<SgAgente> listarElementos(SgAgente objsgAgente, boolean paginable) {
		try {
			return sgAgenteDao.listarElementos(objsgAgente,paginable);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
