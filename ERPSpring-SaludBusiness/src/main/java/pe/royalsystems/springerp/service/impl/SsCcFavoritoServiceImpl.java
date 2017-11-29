package pe.royalsystems.springerp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.royalsystems.springerp.model.dao.SsCcFavoritoDao;
import pe.royalsystems.springerp.model.domain.SsCcFavorito;
import pe.royalsystems.springerp.service.SsCcFavoritoService;
import pe.royalsystems.springerp.service.utiles.Log;

@Service("ssCcFavoritoService")
@Transactional(readOnly = true)
public class SsCcFavoritoServiceImpl implements SsCcFavoritoService {
	
	@Autowired
	SsCcFavoritoDao ssCcFavoritoDao;

	@Override
	public SsCcFavorito obtenerPorId(Integer id) {		
		return ssCcFavoritoDao.findById(id);
	}

	@Override
	public List<SsCcFavorito> listarElementos(SsCcFavorito filtro, boolean paginable) {
		return ssCcFavoritoDao.listarElementos(filtro,paginable);
	}

	@Override
	public int contarElementos(SsCcFavorito filtro) {
		try{
			return ssCcFavoritoDao.contarElementos(filtro);	
		}catch(Exception e){
			Log.error(e, "contarElementos");
			return 0;
		}
		
	}

	@Override
	@Transactional(readOnly = false)
	public int guardar(SsCcFavorito objDao) {
		return ssCcFavoritoDao.guardar(objDao);	
	}

	@Override
	@Transactional(readOnly = false)
	public int actualizar(SsCcFavorito objDao) {
		return ssCcFavoritoDao.actualizar(objDao);
	}

	@Override
	@Transactional(readOnly = false)
	public int eliminar(SsCcFavorito objDao) {
		return ssCcFavoritoDao.eliminar(objDao);
	}

}
