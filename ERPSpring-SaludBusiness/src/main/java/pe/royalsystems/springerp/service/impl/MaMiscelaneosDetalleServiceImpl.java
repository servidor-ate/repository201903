package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import pe.royalsystems.springerp.model.dao.MaMiscelaneosDetalleDao;
import pe.royalsystems.springerp.model.domain.MaMiscelaneosDetalle;
import pe.royalsystems.springerp.service.MaMiscelaneosDetalleService;
import pe.royalsystems.springerp.service.utiles.Log;

import java.util.List;

@Service("maMiscelaneosDetalleService")
@Transactional(readOnly = true)
public class MaMiscelaneosDetalleServiceImpl implements MaMiscelaneosDetalleService{



	@Autowired
    MaMiscelaneosDetalleDao maMiscelaneosDetalleDao;
	
	
	
	@Override
	public MaMiscelaneosDetalle obtenerPorId(MaMiscelaneosDetalle objDao) {
		try {
			return maMiscelaneosDetalleDao.obtenerPorId(objDao);
		} catch (Exception e) {			
			Log.logger.error(Log.getStackTrace(e));
		}
		return null;
	}

	@Override
	public List<MaMiscelaneosDetalle> listarElementosPag(MaMiscelaneosDetalle objDao) {
		try {
			List<MaMiscelaneosDetalle> listaResult = maMiscelaneosDetalleDao.listarElementosPag(objDao);
			return listaResult;
		} catch (Exception e) {			
			Log.logger.error(Log.getStackTrace(e));
		}
		return null;
	}

	@Override
	public List<MaMiscelaneosDetalle> listarElementos(MaMiscelaneosDetalle objDao) {
		try {
			return maMiscelaneosDetalleDao.listarElementos(objDao);
		} catch (Exception e) {			
			Log.logger.error(Log.getStackTrace(e));
		}
		return null;
	}
	public List<MaMiscelaneosDetalle> listarMaMiscelaneosDetalle(MaMiscelaneosDetalle objDao) {
		try {
			return maMiscelaneosDetalleDao.listarElementos(objDao);
		} catch (Exception e) {
			Log.logger.error(Log.getStackTrace(e));
		}
		return null;
	}

	@Override
	public int contarTotal(MaMiscelaneosDetalle objDao) {
		try {
			return maMiscelaneosDetalleDao.contarTotal(objDao);
		} catch (Exception e) {			
			Log.logger.error(Log.getStackTrace(e));
		}
		return 0;
	}

	@Override
	@Transactional(readOnly = false)
	public int guardar(MaMiscelaneosDetalle objDao) {
		try {
			return maMiscelaneosDetalleDao.guardar(objDao);
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.logger.error(Log.getStackTrace(e));
			
		}
		return 0;
	}

	@Override
	@Transactional(readOnly = false)
	public int actualizar(MaMiscelaneosDetalle objDao) {
		try {
			return maMiscelaneosDetalleDao.actualizar(objDao);
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.logger.error(Log.getStackTrace(e));
		}
		return 0;
	}

	@Override
	@Transactional(readOnly = false )
	public int eliminar(MaMiscelaneosDetalle objDao) {
		try {
			return maMiscelaneosDetalleDao.eliminar(objDao);
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.logger.error(Log.getStackTrace(e));
		}
		return 0;
	}

	
	@Override
	public List<MaMiscelaneosDetalle> listarMaMiscelanesoDetalleStore(MaMiscelaneosDetalle maMiscelaneosDetalle) {
		// TODO Auto-generated method stub
		try {
			List<MaMiscelaneosDetalle> lista = maMiscelaneosDetalleDao.listarMaMiscelanesoDetalleStore(maMiscelaneosDetalle);
			System.out.println("mirando lista Servicio "+lista.size());
			return lista;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
