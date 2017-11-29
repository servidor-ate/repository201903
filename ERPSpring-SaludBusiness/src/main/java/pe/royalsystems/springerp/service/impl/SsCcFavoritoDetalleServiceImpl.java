package pe.royalsystems.springerp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.commons.model.ResultTx;
import pe.royalsystems.springerp.model.dao.PersonamastDao;
import pe.royalsystems.springerp.model.dao.SgAgenteDao;
import pe.royalsystems.springerp.model.dao.SsCcFavoritoDao;
import pe.royalsystems.springerp.model.dao.SsCcFavoritoDetalleDao;
import pe.royalsystems.springerp.model.dao.SsGeEspecialidadDao;
import pe.royalsystems.springerp.model.domain.Personamast;
import pe.royalsystems.springerp.model.domain.SgAgente;
import pe.royalsystems.springerp.model.domain.SsCcFavorito;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetalle;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetallePK;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.SsCcFavoritoDetalleService;
import pe.royalsystems.springerp.service.util.Log;

@Service("ssCcFavoritoDetalleService")
@Transactional(readOnly = true)
public class SsCcFavoritoDetalleServiceImpl implements SsCcFavoritoDetalleService {

	@Autowired
	SsCcFavoritoDetalleDao ssCcFavoritoDetalleDao;
	
	@Autowired
	SsCcFavoritoDao ssCcFavoritoDao;

	@Autowired
	SgAgenteDao sgAgenteDao;

	@Autowired
	SsGeEspecialidadDao ssGeEspecialidadDao;

	@Autowired
	PersonamastDao personamastDao;
	
	@Override
	public SsCcFavoritoDetalle obtenerPorId(SsCcFavoritoDetallePK id) {		
		return ssCcFavoritoDetalleDao.findById(id);
	}

	@Override
	public List<SsCcFavoritoDetalle> listarElementos(SsCcFavoritoDetalle filtro, boolean paginable) {		
		return ssCcFavoritoDetalleDao.listarElementos(filtro, paginable);
	}

	@Override
	public int contarElementos(SsCcFavoritoDetalle filtro) {
		try{
			return ssCcFavoritoDetalleDao.contarElementos(filtro);
		}catch(Exception e){
			Log.error(e, "contarElementos");
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = false)
	public int guardar(SsCcFavoritoDetalle objDao) {
		return ssCcFavoritoDetalleDao.guardar(objDao);
	}

	@Override
	@Transactional(readOnly = false)
	public int actualizar(SsCcFavoritoDetalle objDao) {
		return ssCcFavoritoDetalleDao.actualizar(objDao);
	}

	@Override
	@Transactional(readOnly = false)
	public int eliminar(SsCcFavoritoDetalle objDao) {
		return ssCcFavoritoDetalleDao.eliminar(objDao);
	}

	@Override
	@Transactional(readOnly = false)
	public ResultTx<SsCcFavoritoDetalle> guardarDefaultFavoritoMedico(Integer idAgente, Integer idMedico) {
		SsCcFavoritoDetalle objSave =  new SsCcFavoritoDetalle();
		try{
			if(idAgente!=null && idMedico!=null){
				/**1._ obtener agente para recupera datos...*/
				SgAgente agente =  sgAgenteDao.obtenerPorId(idAgente);							
				Personamast personaMedico =  personamastDao.obtenerPorId(idMedico);
				if(agente!=null && personaMedico!=null){
					/**2._ guardar favorito header si no existiese...*/
					SsCcFavorito objFavorito = generarObtenerFavorito(agente.getCodigoAgente(), idAgente, Constant.FAVORITO_TABLA_MEDICO);
					/**3._ Si todo va bien crear y guardar favorito detgalle...*/
					if(objFavorito!=null){						
						SsCcFavoritoDetalle objFavDetSave = crearFavoritoDetalle(objFavorito.getIdFavorito(),
								agente.getCodigoAgente(),Constant.TIPOIDENT_FAVORITO_ID,idMedico,null,personaMedico.getNombreCompleto());				
						if(objFavDetSave!=null){
							//Si no se hallo un elemento FAVORITO DETALLE para el mismo ID o CODIGO, guardar
							if(UtilesCommons.esVacio(objFavDetSave.getId().getSecuencia())){
								//guardar
								ssCcFavoritoDetalleDao.guardar(objFavDetSave);
								//set final
								objFavDetSave.setSsCcFavorito(objFavorito);
							}
							return ResultTx.ok(objFavDetSave);
						}
					}									
				}
			}	
		}catch(Exception e){
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.error(e, "guardarDefaultFavoritoMedico");
		}		
		return ResultTx.error(objSave, "0");
	}

	@Override
	@Transactional(readOnly = false)
	public ResultTx<SsCcFavoritoDetalle> guardarDefaultFavoritoEspecialidad(Integer idAgente, Integer idEspecialidad) {
		SsCcFavoritoDetalle objSave =  new SsCcFavoritoDetalle();
		try{
			if(idAgente!=null && idEspecialidad!=null){
				/**1._ obtener agente para recupera datos...*/
				SgAgente agente =  sgAgenteDao.obtenerPorId(idAgente);							
				SsGeEspecialidad especialidad =  ssGeEspecialidadDao.findById(idEspecialidad);
				if(agente!=null && especialidad!=null){
					/**2._ guardar favorito header si no existiese...*/
					SsCcFavorito objFavorito = generarObtenerFavorito(agente.getCodigoAgente(), idAgente, Constant.FAVORITO_TABLA_ESPECIALIDAD);
					/**3._ Si todo va bien crear y guardar favorito detgalle...*/
					if(objFavorito!=null){						
						SsCcFavoritoDetalle objFavDetSave = crearFavoritoDetalle(objFavorito.getIdFavorito(),
								agente.getCodigoAgente(),Constant.TIPOIDENT_FAVORITO_ID,idEspecialidad,null,especialidad.getNombre());				
						if(objFavDetSave!=null){
							//Si no se hallo un elemento FAVORITO DETALLE para el mismo ID o CODIGO, guardar
							if(UtilesCommons.esVacio(objFavDetSave.getId().getSecuencia())){
								ssCcFavoritoDetalleDao.guardar(objFavDetSave);
								//set final
								objFavDetSave.setSsCcFavorito(objFavorito);								
							}
							return ResultTx.ok(objFavDetSave);
						}
					}									
				}
			}	
		}catch(Exception e){
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.error(e, "guardarDefaultFavoritoMedico");
		}		
		return ResultTx.error(objSave, "0");
	}
	
	/**Utiles*/
	
	public SsCcFavorito generarObtenerFavorito(String usuario, Integer idAgente, String CodigoTabla){
		SsCcFavorito objFavSave = null;
		
		SsCcFavorito objFavFiltro = new SsCcFavorito();		
		objFavFiltro.setIdAgente(idAgente);
		objFavFiltro.setCodigoTablaFavorito(CodigoTabla);
		List<SsCcFavorito>  listaFav =  ssCcFavoritoDao.listarElementos(objFavFiltro, false);
		if(UtilesCommons.esVacio(listaFav)){
			/**2._ guardar favorito header si no existiese...*/
			objFavSave = new SsCcFavorito();
			objFavSave.setCodigoTablaFavorito(CodigoTabla);
			objFavSave.setTipoFavorito(Constant.TIPOFAVORITO_GENERAL);
			objFavSave.setIdAgente(idAgente);
			objFavSave.setEstado(Constant.ACTIVO);
			objFavSave.setUsuarioCreacion(usuario);
			objFavSave.setFechaCreacion(new Date());
			objFavSave.setDescripcion("FAVORITO"+" "+CodigoTabla);
			ssCcFavoritoDao.guardar(objFavSave);
		}else{
			//por defecto debera haber solo un elemento
			if(listaFav.size()>0){
				objFavSave = listaFav.get(0);
			}
		}					
		return objFavSave;
	}

	public SsCcFavoritoDetalle crearFavoritoDetalle(Integer idFavorito, String usuario, 
			String tipoIdentifica, Integer valorId, String valorCodigo,
			String valorTexto1){
		SsCcFavoritoDetalle objFavDetSave = null;
		SsCcFavoritoDetalle objFavDetFiltro =new SsCcFavoritoDetalle();
		if(idFavorito!=null){
			objFavDetFiltro.getId().setIdFavorito(idFavorito);
			objFavDetFiltro.setTipoIdentificador(tipoIdentifica);
			objFavDetFiltro.setValorId(valorId);
			objFavDetFiltro.setValorCodigo(valorCodigo);
			List<SsCcFavoritoDetalle> listaFavDetValid = ssCcFavoritoDetalleDao.listarElementos(objFavDetFiltro,false);
			if(UtilesCommons.noEsVacio(listaFavDetValid)){
				//Hallado
				objFavDetSave = listaFavDetValid.get(0);
			}else{
				//nuevo
				objFavDetSave = new SsCcFavoritoDetalle();
				objFavDetSave.getId().setIdFavorito(idFavorito);					
				objFavDetSave.getId().setSecuencia(null);
				objFavDetSave.setTipoIdentificador(tipoIdentifica);
				objFavDetSave.setValorCodigo(valorCodigo);
				objFavDetSave.setValorId(valorId);
				objFavDetSave.setValorTexto1(valorTexto1);
				objFavDetSave.setEstado(Constant.ACTIVO);
				objFavDetSave.setUsuarioCreacion(usuario);
				objFavDetSave.setFechaCreacion(new Date());
			}
		}
		return objFavDetSave;
	}
	
	
}
