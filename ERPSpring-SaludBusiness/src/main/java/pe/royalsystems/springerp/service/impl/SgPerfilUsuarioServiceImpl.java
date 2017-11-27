package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.SgPerfilUsuarioDao;
import pe.royalsystems.springerp.model.domain.SgPerfilUsuario;
import pe.royalsystems.springerp.service.SgPerfilUsuarioService;

import java.util.List;

@Service("sgPerfilUsuarioService")
@Transactional(readOnly = true)
public class SgPerfilUsuarioServiceImpl implements SgPerfilUsuarioService {
	
	@Autowired
	private SgPerfilUsuarioDao sgPerfilUsuarioDao;

	@Override
	@Transactional
	public int guardarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			sgPerfilUsuarioDao.guardarSgPerfilUsuario(objSgPerfilUsuario);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional
	public int eliminarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			sgPerfilUsuarioDao.eliminarSgPerfilUsuario(objSgPerfilUsuario);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public SgPerfilUsuario buscarSgPerfilUsuarioID(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			return sgPerfilUsuarioDao.buscarSgPerfilUsuarioID(objSgPerfilUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public int eliminarSgPerfilUsuarioDeAgente(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			sgPerfilUsuarioDao.eliminarSgPerfilUsuarioDeAgente(objSgPerfilUsuario);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<SgPerfilUsuario> listar(SgPerfilUsuario objSgPerfilUsuario) {
		try {
			return sgPerfilUsuarioDao.listar(objSgPerfilUsuario);			
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

}
