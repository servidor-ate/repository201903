package pe.royalsystems.springerp.service.impl;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.PersonamastDao;
import pe.royalsystems.springerp.model.dao.SgAgenteDao;
import pe.royalsystems.springerp.model.dao.SgPerfilUsuarioDao;
import pe.royalsystems.springerp.model.dao.SsGePacienteDao;
import pe.royalsystems.springerp.model.dao.UsuarioDao;
import pe.royalsystems.springerp.model.domain.Personamast;
import pe.royalsystems.springerp.model.domain.SgAgente;
import pe.royalsystems.springerp.model.domain.SgPerfilUsuario;
import pe.royalsystems.springerp.model.domain.SgPerfilUsuarioId;
import pe.royalsystems.springerp.model.domain.SsGePaciente;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.EmailGenericService;
import pe.royalsystems.springerp.service.EncriptaKeyService;
import pe.royalsystems.springerp.service.PersonamastService;
import pe.royalsystems.springerp.service.utiles.Log;
import pe.royalsystems.springerp.service.utiles.Utiles;

@Service("personamastService")
@Transactional(readOnly = true)
public class PersonamastServiceImpl implements PersonamastService {

	@Autowired
	private PersonamastDao personamastDao;
	

//	@Autowired
//	private SeguridadPerfilUsuarioDao seguridadPerfilUsuarioDao;
	
	@Autowired
	private EncriptaKeyService encriptaKeyService;
	
	@Autowired
	private SsGePacienteDao ssGePacienteDao;	
	
	@Autowired
	private UsuarioDao usuarioDao;	 	

	@Autowired
	private SgAgenteDao sgAgenteDao;
	
	@Autowired
	private SgPerfilUsuarioDao sgPerfilUsuarioDao;
	
	@Autowired
	private EmailGenericService emailGenericService;
	
	@Override
	public List<Personamast> listarPersonamast(Personamast personamast,boolean paginable) {
		try {
			return personamastDao.listarPersonamast(personamast,paginable);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Personamast obtenerPorId(Integer key) {
		try {
			return personamastDao.obtenerPorId(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public int contadorDeTotales(Personamast personamast) {
		try {
			return personamastDao.contadorDeTotales(personamast);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public int eliminarPersonamast(Personamast personamast) {
		try {
			return personamastDao.eliminarPersonamast(personamast);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional
	public int guardarPersonamast(Personamast personamast) {
		try {
			return personamastDao.guardarPersonamast(personamast);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = false)
	public int actualizar(Personamast personamast) {
		try {
			return personamastDao.actualizar(personamast);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	

	@Override
	@Transactional(readOnly = false)
	public int guardarUsuarioPersona(Personamast objDao) {
		int result =0;
		try{
			result =0;
			int IdPersonaAux =0;
			Personamast objSave = new Personamast();
			
			boolean hallado = false;
			Personamast filtro = new Personamast();
			filtro.setDocumento(objDao.getDocumento());
			filtro.setTipoDocumento(objDao.getTipoDocumento());
			List<Personamast> listaObj = personamastDao.listarPersonamast(filtro,false);
			if(listaObj!=null){
				if(listaObj.size() == 1){
					objSave = listaObj.get(0);
					hallado = true;
				}else{
					result = -1;
				}
			}		
			if(hallado){
				//SOLO UPDATE
				objSave.setCorreoElectronico(objDao.getCorreoElectronico());
				objSave.setUltimoUsuario(objDao.getUltimoUsuario());
				objSave.setUltimaFechaModif(objDao.getUltimaFechaModif());				
				IdPersonaAux = personamastDao.actualizar(objSave);				
			}else{
				//NUEVO
				result =-3;
				IdPersonaAux = personamastDao.guardarPersonamast(objDao);				
			}
			
			if(IdPersonaAux>0){
				/** insertar usuario **/					
//				Usuario  objUser =  usuarioDao.obtenerPorId(objDao.getDocumento().trim());
//				boolean usuarioHallado = false;
//				if(objUser!=null){
//					usuarioHallado=true;
//				}
//				Usuario usuario = null;
//				if(!usuarioHallado){
//					usuario = new Usuario();				
//					usuario.setUsuario(objDao.getDocumento().trim());
//					usuario.setUsuarioPerfil(Constant.USUARIO_USUARIO);
//					usuario.setNombre(objDao.getNombrecompleto());									
//					usuario.setClave(encriptaKeyService.getCifrado(Constant.USUARIO_CLAVE_DEF));//ES 1 por def
//					usuario.setExpirarPasswordFlag(Constant.NO_db);
//					//usuario.setClave("1");				
//					usuario.setEstado(Constant.ACTIVO);				
//					usuario.setPersona(IdPersonaAux);
//					usuario.setUltimaFechaModif(new Date());
//					usuario.setUltimoUsuario(objDao.getUltimoUsuario());
//					result =-4;//ERROR EN EL GUARDADO DE USUARIO
//					int resultUser  = usuarioDao.guardar(usuario);						
//					result = 1;
//				}else{
//					usuario = objUser;		
//					usuario.setUsuario(objDao.getDocumento().trim());					
//					usuario.setNombre(objDao.getNombrecompleto());									
//					usuario.setClave(encriptaKeyService.getCifrado(Constant.USUARIO_CLAVE_DEF));//ES 1 por def					
//					//usuario.setClave("1");				
//					usuario.setEstado(Constant.ACTIVO);				
//					usuario.setPersona(IdPersonaAux);
//					usuario.setUltimaFechaModif(new Date());
//					usuario.setUltimoUsuario(objDao.getUltimoUsuario());
//					result =-5;//ERROR EN EL GUARDADO DE USUARIO
//					int resultUser  = usuarioDao.actualizar(usuario);
//					result = 2;
//				}
//				
//				//CREAR PERFIL USUARIO POR DEFECTO
//				if(usuario != null){						
//					SeguridadPerfilUsuarioPK objPk = new SeguridadPerfilUsuarioPK();
//					objPk.setUsuario(usuario.getUsuario());
//					objPk.setPerfil(Constant.PERFIL_PACIENTE_DEF);
//					SeguridadPerfilUsuario objResult  = seguridadPerfilUsuarioDao.obtenerPorId(objPk);
//					if(objResult==null){
//						//AGREGAR PERFIL
//						SeguridadPerfilUsuario obj = new SeguridadPerfilUsuario();
//						obj.setId(objPk);
//						obj.setEstado(Constant.ACTIVO);
//						obj.setUltimaFechaModif(new Date());
//						obj.setUltimoUsuario(objDao.getUltimoUsuario());
//						int resultTemp =result;//ERROR EN EL GUARDADO DE USUARIO
//						result =-6;//ERROR EN EL GUARDADO DE USUARIO
//						int resultPerfil = seguridadPerfilUsuarioDao.guardar(obj);
//						result = resultTemp;
//					}						
//				}					
			}						
			return result;
		}catch(Exception e){			
			e.printStackTrace();					
			Log.error(e, "guardarUsuarioPaciente");
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			//DEVOLVER ID de error (para mensaje)
			return result;
		}		
	}

	@Override
	@Transactional(readOnly = false)
	public int guardarUsuarioPaciente(Personamast objDao) {
		int result =0;
		try{
			result =0;
			int IdPersonaAux =0;
			/**Primero verificar si existe el paciente de la persona enviada***/	
			Personamast objSave = new Personamast();
			boolean halladoPersona = false;
			boolean hallado = false;
			Personamast filtro = new Personamast();
			filtro.setDocumento(objDao.getDocumento());
			filtro.setTipoDocumento(objDao.getTipoDocumento());
			List<Personamast> listaObj = personamastDao.listarPersonamast(filtro,false);
			if(listaObj!=null){
				if(listaObj.size() == 1){
					halladoPersona = true;
					objSave = listaObj.get(0);
					
					//BUSCAR PACIENTE
					SsGePaciente objPac =   ssGePacienteDao.obtenerPorId(objSave.getPersona());
					if(objPac!=null){
						hallado = true;	
					}					
				}else{
					result = -1;
				}
			}		
			if(hallado){
				//SOLO UPDATE						
				objSave.setCelular(objDao.getCelular());
				objSave.setTelefono(objDao.getTelefono());
				objSave.setCorreoElectronico(objDao.getCorreoElectronico());
				objSave.setUltimoUsuario(objDao.getUltimoUsuario());
				objSave.setUltimaFechaModif(objDao.getUltimaFechaModif());				
				IdPersonaAux = personamastDao.actualizar(objSave);				
									
			}else{
				if(halladoPersona){
					objDao.setNombreCompleto(objSave.getNombreCompleto());			
					objSave.setCelular(objDao.getCelular());
					objSave.setTelefono(objDao.getTelefono());
					objSave.setCorreoElectronico(objDao.getCorreoElectronico());
					objSave.setUltimoUsuario(objDao.getUltimoUsuario());
					objSave.setUltimaFechaModif(objDao.getUltimaFechaModif());
											
					IdPersonaAux = personamastDao.actualizar(objSave);													
				}else{
					//NUEVA PERSONA
					result =-3;
					IdPersonaAux = personamastDao.guardarPersonamast(objSave);											
				}
				//NUEVO PACIENTE OBS:  DATOS M@NIMOS
				if(IdPersonaAux>0){
					SsGePaciente objPacienteSave = new SsGePaciente (); 
					objPacienteSave.setIdPaciente(IdPersonaAux);
					objPacienteSave.setCantidadAsistencia(0);
					objPacienteSave.setEstado(Constant.INT_ACTIVO);
					objPacienteSave.setFechaCreacion(new Date());
					objPacienteSave.setFechaModificacion(new Date());
					objPacienteSave.setUsuarioCreacion(objDao.getUltimoUsuario());
					objPacienteSave.setUsuarioModificacion(objDao.getUltimoUsuario());
					String tipoPac = Utiles.getPropertyService("PAR_PAC_TIPOPACIENTE");
					String indiNuevo = Utiles.getPropertyService("PAR_PAC_INDICA_NUEVO");
					
					objPacienteSave.setTipoPaciente(Integer.parseInt(tipoPac));//OBS
					objPacienteSave.setIndicadorNuevo(Integer.parseInt(indiNuevo));//OBS
					objPacienteSave.setOcupacion(Utiles.getPropertyService("PAR_PAC_OCUPACION"));//OBS
					objPacienteSave.setTipoAlmacenamiento(Utiles.getPropertyService("PAR_PAC_TIPO_ALM"));//OBS
					
					ssGePacienteDao.guardar(objPacienteSave);
				}
			}
			/**Segundo Continuar con el usuario y seguridad si existe el paciente***/
			if(IdPersonaAux>0){
				/** insertar AGENTE **/
				boolean usuarioHallado = false;
				SgAgente objAgente = new SgAgente();
				objAgente.setCodigoAgente(objDao.getDocumento().trim());
				objAgente.setNombreConsulta("BUSCAR_POR_CODIGO");
				List<SgAgente> listaAgente = sgAgenteDao.listarElementos(objAgente,false) ;
				if(UtilesCommons.noEsVacio(listaAgente)){
					objAgente = listaAgente.get(0);
					usuarioHallado = true;
				}
				SgAgente agente = null;
				if(!usuarioHallado){
					agente = new SgAgente();				
					agente.setCodigoAgente(objDao.getDocumento().trim());
					agente.setTipoAgente(Constant.AGENTE_USUARIO);
					agente.setNombre(objDao.getNombreCompleto());
					//ENCRIPTAR ?
					//agente.setClave(encriptaKeyService.getCifrado(Constant.USUARIO_CLAVE_DEF));//ES 1 por def
					agente.setClave(Constant.USUARIO_CLAVE_DEF);//ES 1 por def
					agente.setExpiraClave(Constant.INT_NO);
						
					agente.setEstado(Constant.INT_ACTIVO);				
					agente.setIdEmpleado(IdPersonaAux);
					agente.setFechaModificacion(new Date());
					agente.setUsuarioModificacion(objDao.getUltimoUsuario());
					agente.setPlataforma(Constant.PLATAF_WEB);
					result =-4;//ERROR EN EL GUARDADO DE USUARIO
					int resultUser  = sgAgenteDao.guardarSsAgente(agente);						
					result = 1;
				}else{
					agente = objAgente;		
					agente.setCodigoAgente(objDao.getDocumento().trim());					
					agente.setNombre(objDao.getNombreCompleto());									
					//agente.setClave(encriptaKeyService.getCifrado(Constant.USUARIO_CLAVE_DEF));//ES 1 por def					
					agente.setClave(Constant.USUARIO_CLAVE_DEF);//ES 1 por def				
					agente.setEstado(Constant.INT_ACTIVO);				
					agente.setIdEmpleado(IdPersonaAux);
					agente.setFechaModificacion(new Date());
					agente.setUsuarioModificacion(objDao.getUltimoUsuario());
					agente.setPlataforma(Constant.APP_CODIGO);
					result =-5;//ERROR EN EL GUARDADO DE USUARIO
					int resultUser  = sgAgenteDao.actualizarSsAgente(agente);
					result = 2;
				}
				
//				/** insertar usuario **/
//				Usuario  objUser =  usuarioDao.obtenerPorId(objDao.getDocumento().trim());				
//				if(objUser!=null){
//					usuarioHallado=true;
//				}
//				Usuario usuario = null;
//				if(!usuarioHallado){
//					usuario = new Usuario();				
//					usuario.setUsuario(objDao.getDocumento().trim());
//					usuario.setUsuarioPerfil(Constant.USUARIO_USUARIO);
//					usuario.setNombre(objDao.getNombrecompleto());									
//					usuario.setClave(encriptaKeyService.getCifrado(Constant.USUARIO_CLAVE_DEF));//ES 1 por def
//					usuario.setExpirarPasswordFlag(Constant.NO_db);
//					//usuario.setClave("1");				
//					usuario.setEstado(Constant.ACTIVO);				
//					usuario.setPersona(IdPersonaAux);
//					usuario.setUltimaFechaModif(new Date());
//					usuario.setUltimoUsuario(objDao.getUltimoUsuario());
//					usuario.setSQLLogin(Constant.APP_CODIGO);
//					result =-4;//ERROR EN EL GUARDADO DE USUARIO
//					int resultUser  = usuarioDao.guardar(usuario);						
//					result = 1;
//				}else{
//					usuario = objUser;		
//					usuario.setUsuario(objDao.getDocumento().trim());					
//					usuario.setNombre(objDao.getNombreCompleto());									
//					usuario.setClave(encriptaKeyService.getCifrado(Constant.USUARIO_CLAVE_DEF));//ES 1 por def					
//					//usuario.setClave("1");				
//					usuario.setEstado(Constant.ACTIVO);				
//					usuario.setPersona(IdPersonaAux);
//					usuario.setUltimaFechaModif(new Date());
//					usuario.setUltimoUsuario(objDao.getUltimoUsuario());
//					usuario.setSQLLogin(Constant.APP_CODIGO);
//					result =-5;//ERROR EN EL GUARDADO DE USUARIO
//					int resultUser  = usuarioDao.actualizar(usuario);
//					result = 2;
//				}
				/** CREAR PERFIL AGENTE POR DEFECTO **/
				
				if(agente != null){		
					//Obtener ID de AGENTE PERFIL:
					SgAgente objAgentePerf = new SgAgente();
					objAgentePerf.setCodigoAgente(Constant.PERFIL_PACIENTE_DEF);					
					objAgentePerf.setNombreConsulta("BUSCAR_POR_CODIGO");
					List<SgAgente> listaAgentePerf = sgAgenteDao.listarElementos(objAgente,false) ;
					
					SgAgente agentePerf = null;
					if(UtilesCommons.noEsVacio(listaAgentePerf)){
						agentePerf = listaAgente.get(0);						
					}else{
						//de preferencia crear AGENTE EPRFIL
						agentePerf= crearAgentePerfilDefault(Constant.PERFIL_PACIENTE_DEF, objDao.getUltimoUsuario());
					}
					
					//guardar si no existe PERFIL USUARIO para el USUARIO CREADO
					if(agentePerf!=null){
						SgPerfilUsuarioId objPk = new SgPerfilUsuarioId();
						objPk.setIdUsuario(agente.getIdAgente());
						objPk.setIdPerfil(agentePerf.getIdAgente());
						SgPerfilUsuario objResult  = sgPerfilUsuarioDao.findById(objPk);
						if(objResult==null){
							//AGREGAR PERFIL
							SgPerfilUsuario obj = new SgPerfilUsuario();
							obj.setId(objPk);
							obj.setEstado(Constant.INT_ACTIVO);
							obj.setFechaCreacion(new Date());
							obj.setUsuarioCreacion(objDao.getUltimoUsuario());
							int resultTemp =result;//ERROR EN EL GUARDADO DE USUARIO
							result =-6;//ERROR EN EL GUARDADO DE USUARIO
							int resultPerfil = sgPerfilUsuarioDao.guardarSgPerfilUsuario(obj);
							result = resultTemp;
						}	
					}
					
				}
												
//				/**  CREAR PERFIL USUARIO POR DEFECTO **/
//				if(usuario != null){						
//					SeguridadPerfilUsuarioPK objPk = new SeguridadPerfilUsuarioPK();
//					objPk.setUsuario(usuario.getUsuario());
//					objPk.setPerfil(Constant.PERFIL_PACIENTE_DEF);
//					SeguridadPerfilUsuario objResult  = seguridadPerfilUsuarioDao.obtenerPorId(objPk);
//					if(objResult==null){
//						//AGREGAR PERFIL
//						SeguridadPerfilUsuario obj = new SeguridadPerfilUsuario();
//						obj.setId(objPk);
//						obj.setEstado(Constant.ACTIVO);
//						obj.setUltimaFechaModif(new Date());
//						obj.setUltimoUsuario(objDao.getUltimoUsuario());
//						int resultTemp =result;//ERROR EN EL GUARDADO DE USUARIO
//						result =-6;//ERROR EN EL GUARDADO DE USUARIO
//						int resultPerfil = seguridadPerfilUsuarioDao.guardar(obj);
//						result = resultTemp;
//					}						
//				}					
			}						
			return result;
		}catch(Exception e){			
			e.printStackTrace();					
			Log.error(e, "guardarUsuarioPaciente");
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			//DEVOLVER ID de error (para mensaje)
			return result;
		}	
	}
	
	/**Enviar correo al usuario Exteno creado*/
	@Override
	public int enviarCorreoRegistroPersonaUsuario(Personamast objSave) {
		int reusltMsg = 0;
		try{
			/**Buscar de AGENTE o USUARIO, para asegurar su respectiva creacion (regla: codigo sera el documento**)*/
			//Obtener DOC DE PERSONA
			if(objSave!=null && objSave.getDocumento()!=null){
				boolean continuar = false;
				String claveUsuario = "";
				SgAgente objAgente = new SgAgente();
				objAgente.setCodigoAgente(objSave.getDocumento().trim());
				objAgente.setNombreConsulta("BUSCAR_POR_CODIGO");
				List<SgAgente> listaAgentePerf = sgAgenteDao.listarElementos(objAgente,false);				
				if(UtilesCommons.noEsVacio(listaAgentePerf)){
					claveUsuario = listaAgentePerf.get(0).getClave();
					continuar = true;
				}
				
				if(continuar){
					/**1: CORREOS DESTINOS */					
					List<String> correosTemp = new ArrayList<String>(); 
					if(objSave.getCorreoElectronico()!=null){	
						correosTemp.add(objSave.getCorreoElectronico());
					}									
					/**2: set PARAMETROS VARIABLES EN UN MAP, PARA EL BODY, Y SUBJETC*/				
					//VARIABLES
					
					Map<String,String> mapVariables = new HashMap<String,String>(); 
					mapVariables.put(Utiles.getPropertyService("PAR_NOMBRE_DESTINO"), objSave.getNombreCompleto());
					mapVariables.put(Utiles.getPropertyService("PAR_USUARIO"), objSave.getDocumento());
					mapVariables.put(Utiles.getPropertyService("PAR_VALOR_CLAVE_AUTOGEN"),claveUsuario!=null?claveUsuario:"");
					mapVariables.put(Utiles.getPropertyService("PAR_NOMBRE_SYS"),"SISTEMA DE CITAS WEB");
					mapVariables.put(Utiles.getPropertyService("PAR_FECHA_ACTUAL"), 
							UtilesCommons.printDate("dd/MM/yyyy", UtilesCommons.getFechaHoy()));
					//SUBJECT
					String subject = Utiles.getPropertyMsg("MSJ_USUARIO_CORREOREGISTRO_SUBJECT");
					//BODY AUX
					String info = Utiles.getPropertyMsg("MSJ_USUARIO_CORREOREGISTRO_BODY");
					String formattedInfo = MessageFormat.format(info,objSave.getNombreCompleto(),
							"SISTEMA DE CITAS WEB",objSave.getDocumento(),
							claveUsuario);								
					String body = formattedInfo;
					
					
					/**3: ENVIO CORREOS */				
					reusltMsg = emailGenericService.enviarCorreo(
									//ARMAR OBJETO GEN@RICO PARA CORREO: EMAIL e INDICAR SI POSEE O NO PLANTILLA DE CORREOS
										emailGenericService.getObjetoMail(
												correosTemp, subject, body, 
												null, UtilesCommons.getFechaHoy()
												,mapVariables	
										),
									//ENVIAR EL C@DIGO DEL PORCESO
										Utiles.getPropertyService("PROC_REG_USERPERSONA")
							);				
					
					/**4: MOSTRAR MENSAJES */
				}	
			}
							
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return reusltMsg;
	}
	
	
	/**UTILES***/
	/**
	 * @param codigoAgente
	 * @param usuarioCreacion
	 * @return
	 */
	public SgAgente crearAgentePerfilDefault(String codigoAgente,String usuarioCreacion){
		SgAgente agente = new SgAgente();				
		agente.setCodigoAgente(codigoAgente);
		agente.setTipoAgente(Constant.AGENTE_PERFIL);
		agente.setNombre("Perfil"+":"+codigoAgente);
		//ENCRIPTAR ?
		//agente.setClave(encriptaKeyService.getCifrado(Constant.USUARIO_CLAVE_DEF));//ES 1 por def
		agente.setClave(Constant.USUARIO_CLAVE_DEF);//ES 1 por def
		agente.setExpiraClave(Constant.INT_NO);			
		agente.setEstado(Constant.INT_ACTIVO);				
		agente.setIdEmpleado(null);
		
		agente.setUsuarioCreacion(usuarioCreacion);
		agente.setFechaCreacion(new Date());
		agente.setUsuarioModificacion(usuarioCreacion);
		agente.setFechaModificacion(new Date());
		agente.setPlataforma(Constant.PLATAF_WEB);	
		sgAgenteDao.guardarSsAgente(agente);
		return agente;
	}
	
	
}
