package pe.royalsystems.springerp.service.impl;

import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import pe.royalsystems.springerp.commons.TimeCommons;
import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.commons.model.Email;
import pe.royalsystems.springerp.commons.model.PaginaModel;
import pe.royalsystems.springerp.commons.model.ResultTx;
import pe.royalsystems.springerp.model.dao.*;
import pe.royalsystems.springerp.model.domain.*;
import pe.royalsystems.springerp.model.domain.vista.VwCitaMedica;
import pe.royalsystems.springerp.model.domain.vista.VwEmpleado;
import pe.royalsystems.springerp.model.util.AuditoriaModel;
import pe.royalsystems.springerp.model.util.Constant;

import pe.royalsystems.springerp.service.CitaMedicaService;
import pe.royalsystems.springerp.service.EmailGenericService;

import pe.royalsystems.springerp.service.exception.CitasPermitidasException;
import pe.royalsystems.springerp.service.exception.CruceReservaException;
import pe.royalsystems.springerp.service.utiles.Log;
import pe.royalsystems.springerp.service.utiles.Utiles;


import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.*;

@Service("citaMedicaService")
@Transactional(readOnly = true)
public class CitaMedicaServiceImpl implements CitaMedicaService {

	@Autowired
	private CitaMedicaDao citaMedicaDao;

	@Autowired
	private HorarioMedicoDao horarioMedicoDao;

	@Autowired
	private EmpleadoDao empleadoDao;

	@Autowired
	private PersonamastDao personamastDao;

	@Autowired
	private MaMiscelaneosDetalleDao miscelaneoDetalleDao;

	@Autowired
	private EspecialidadDao especialidadDao;

	@Autowired
	private ConsultorioDao consultorioDao;

	@Autowired
	private SsAdOrdenAtencionDao ssAdOrdenAtencionDao;

	@Autowired
	private SsAdOrdenAtencionDetalleDao ssAdOrdenAtencionDetalleDao;

	@Autowired
	private SsGePacienteDao ssGePacienteDao;


	@Autowired
	private SsHcObligacionDao ssHcObligacionDao;

	@Autowired
	private SsHcObligaciondetalleDao ssHcObligaciondetalleDao;


	@Autowired
	private ParametrosMastDao parametrosMastDao;




	@Autowired
	private EmailGenericService emailGenericService;

	public static final String COD_OPERACION_RESERVA_CITA="RES";


	@Override
	public VwCitaMedica obtenerPorId(Integer idCita){
		try{
			return citaMedicaDao.obtenerPorId(idCita);
		}catch(Exception ex){
			Log.error(ex, "CitaMedicaServiceImpl :: obtenerPorId");
			return null;
		}
	}

	@Override
	public List<VwCitaMedica> listarVwCitasMedicas(VwCitaMedica filtro) {
		try{
			return citaMedicaDao.listarVwCitasMedicas(filtro);
		}catch(Exception ex){
			Log.error(ex, "CitaMedicaServiceImpl :: listarVwCitasMedicas");
			return new ArrayList<VwCitaMedica>();
		}
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE, readOnly = false, rollbackFor = Exception.class)
	public Integer reservarCitaMedica(SsCcCita cita, AuditoriaModel auditoriaModel) {

		SsCcCita citaEntidad = generarCitaMedica(cita, auditoriaModel);

		return citaEntidad!=null?citaEntidad.getIdCita():0;
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE, readOnly = false, rollbackFor = Exception.class)
	public Integer reprogramarCitaMedica(Integer idCitaAnterior, SsCcCita nuevaCita, AuditoriaModel auditoriaModel){
		SsCcCita citaAnterior = citaMedicaDao.findById(idCitaAnterior);

		SsCcHorario horario = horarioMedicoDao.findById(nuevaCita.getIdHorario());
		Date horaInicialCita = TimeCommons.getSoloHora(nuevaCita.getFechaCita()).toDate();
		Date horaFinalCita = TimeCommons.getSoloHora(nuevaCita.getFechaCita()).plusMinutes(horario.getTiempoPromedioAtencion().intValue()).toDate();

		validarCruceReservas(horario, nuevaCita.getFechaCita(), horaInicialCita, horaFinalCita);

		nuevaCita.setIdHorario(horario.getIdHorario());
//		nuevaCita.setUnidadReplicacion(horario.getUnidadReplicacion());
		int nextId = citaMedicaDao.obtenerMaximoEnteroColumna("idCita") + 1;
		nuevaCita.setIdCita(nextId);

		if(auditoriaModel != null){
			citaAnterior.setUsuarioModificacion(auditoriaModel.getUsuarioAuditoria());
			citaAnterior.setFechaModificacion(auditoriaModel.getFechaAuditoria());

			nuevaCita.setUsuarioCreacion(auditoriaModel.getUsuarioAuditoria());
			nuevaCita.setFechaCreacion(auditoriaModel.getFechaAuditoria());
		}

		citaAnterior.setEstadoDocumentoAnterior(citaAnterior.getEstadoDocumento());
		citaAnterior.setEstadoDocumento(Constant.ESTADO_DOCUMENTO_ANULADO);
		citaAnterior.setEstado(Constant.INT_INACTIVO);
		citaAnterior.setIdCitaRelacionada(nuevaCita.getIdCita());

		citaMedicaDao.update(citaAnterior);
		citaMedicaDao.save(nuevaCita);

		return nuevaCita.getIdCita();
	}


	@Override
	public List<SsCcCita> listarCitasMedicas(SsCcCita filtro) {
		try{
			return citaMedicaDao.listarSSccCitasMedicas(filtro);
		}catch(Exception ex){
			Log.error(ex, "CitaMedicaServiceImpl :: mapearCitasPorFecha");
		}
		return null;
	}


	@Override
	public Map<String, List<SsCcCita>> mapearCitasPorFecha(SsCcCita filtro){
		Map<String, List<SsCcCita>> map = new LinkedHashMap<String, List<SsCcCita>>();
		try{
			List<SsCcCita> list = citaMedicaDao.listarSSccCitasMedicas(filtro);
			for(SsCcCita cita : list){
				String key = TimeCommons.imprimirSoloFecha(cita.getFechaCita());
				if(!map.containsKey(key)){
					map.put(key, new ArrayList<SsCcCita>());
				}
				map.get(key).add(cita);
			}
		}catch(Exception ex){
			Log.error(ex, "CitaMedicaServiceImpl :: mapearCitasPorFecha");
		}
		return map;
	}

	@Override
	public Map<String, List<SsCcCita>> mapearCitasPorFecha(List<SsCcCita> listaCitas){
		Map<String, List<SsCcCita>> map = new LinkedHashMap<String, List<SsCcCita>>();
		try{
			if(UtilesCommons.noEsVacio(listaCitas)){
				for(SsCcCita cita : listaCitas){
					String key = TimeCommons.imprimirSoloFecha(cita.getFechaCita());
					if(!map.containsKey(key)){
						map.put(key, new ArrayList<SsCcCita>());
					}
					map.get(key).add(cita);
				}
			}
		}catch(Exception ex){
			Log.error(ex, "CitaMedicaServiceImpl :: mapearCitasPorFecha");
		}
		return map;
	}

	@Override
	public Personamast obtenerPaciente(Integer idCita){
		try{
			SsCcCita cita = citaMedicaDao.findById(idCita);
			return personamastDao.obtenerPorId(cita.getIdPaciente());
		}catch(Exception ex){
			Log.error(ex, "CitaMedicaServiceImpl :: obtenerPaciente");
			return null;
		}
	}

	@Override
	public PaginaModel<VwCitaMedica> listarVwCitasMedicasPaginadas(VwCitaMedica filtro){
		try{
			List<VwCitaMedica> listaElementos = citaMedicaDao.listarVwCitasMedicas(filtro);
			int nroElementos = citaMedicaDao.contarVwCitasMedicas(filtro);
			return PaginaModel.crearPagina(listaElementos, nroElementos);
		}catch(Exception ex){
			Log.error(ex, "CitaMedicaServiceImpl :: obtenerPaciente");
			return PaginaModel.crearPaginaVacia();
		}
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE, readOnly = false, rollbackFor = Exception.class)
	public ResultTx<SsAdOrdenAtencion> reservarCitaMedicaOA(SsCcCita cita, AuditoriaModel auditoriaModel,
															Integer numeroCorrelativoOA){
		Integer resultTx = 0;
		try{
			//ResultTx<T>
			SsCcCita citaEntidad = generarCitaMedica(cita, auditoriaModel);

			if(citaEntidad!=null){

				/**4 - Crear y GUARAR OA (Orden de Atencion)*/
				SsGePaciente objPaciente =  ssGePacienteDao.obtenerPorId(citaEntidad.getIdPaciente());

				SsAdOrdenAtencion objOA = new SsAdOrdenAtencion();
				objOA.setCodigoOa(""+numeroCorrelativoOA);//DESDE CORRELATIVO
				objOA.setIdPaciente(objPaciente.getIdPaciente());
				objOA.setTipoPaciente(objPaciente.getTipoPaciente());
				objOA.setTipoAtencion(citaEntidad.getIdTipoAtencion());
				objOA.setEspecialidad(citaEntidad.getIdEspecialidad());
				objOA.setIdServicio(citaEntidad.getIdServicio());
				objOA.setIdEmpresaAseguradora(null);
				objOA.setIdEstablecimiento(1);//OBS***
				objOA.setTipoOrdenAtencion(1);//OBS***
				objOA.setUsuarioCreacion(auditoriaModel.getUsuarioAuditoria());
				objOA.setUsuarioModificacion(auditoriaModel.getUsuarioAuditoria());
				objOA.setFechaCreacion(new Date());
				objOA.setFechaModificacion(new Date());
				objOA.setIdEmpleado(auditoriaModel.getIdUsuarioAuditoria());
				objOA.setUnidadReplicacion(citaEntidad.getUnidadReplicacion());
				objOA.setEstado(2);//ACTIVO OBS ***


				resultTx = -4;
				int resultOA = ssAdOrdenAtencionDao.guardar(objOA);
				if(resultOA>0){
					objOA.setIdOrdenAtencion(resultOA);
					//objOA.setCodigoOa(UtilesCommons.formatoCerosIzqNum(8,resultOA));
					//ssAdOrdenAtencionDao.actualizar(objOA);

					/**4.1 - Crear y GUARAR OA DETALLEc(Orden de Atencion Detalle)*/
					SsAdOrdenAtencionDetalle objOaDetalle = new SsAdOrdenAtencionDetalle();
					objOaDetalle.getId().setIdOrdenAtencion(resultOA);
					objOaDetalle.setUnidadReplicacionT(citaEntidad.getUnidadReplicacion());
					objOaDetalle.setTipoOrdenAtencion(1);//OBS***
					objOaDetalle.setIdEstablecimiento(1);//OBS***
					objOaDetalle.setEspecialidad(citaEntidad.getIdEspecialidad());
					objOaDetalle.setIdCita(citaEntidad.getIdCita());
					objOaDetalle.setIdPaciente(citaEntidad.getIdPaciente());
					objOaDetalle.setIndicadorPerfil(auditoriaModel.getIdUsuarioAuditoria());
					objOaDetalle.setUsuarioCreacion(auditoriaModel.getUsuarioAuditoria());
					objOaDetalle.setUsuarioModificacion(auditoriaModel.getUsuarioAuditoria());
					objOaDetalle.setFechaCreacion(new Date());
					objOaDetalle.setFechaModificacion(new Date());
					resultTx = -5;
					ssAdOrdenAtencionDetalleDao.guardar(objOaDetalle);
					resultTx = resultOA;

					//VwCitaMedica obj;
					objOA.setInt_1(citaEntidad.getIdCita());//AUX PARA CITA

					/****************INICIO TRACKING*******************/
					boolean trackingValido = true;
					//Obtener nombre especialiad
					SsGeEspecialidad especialidad =  especialidadDao.findById(citaEntidad.getIdEspecialidad());
					Personamast personaMedico =  personamastDao.obtenerPorId(citaEntidad.getIdMedico());
					if(especialidad!=null && personaMedico!=null){

						//OBS****documento.getInt3() AUX para ID DE CITA ver ManagedBean


				 		}

					/****************FIN TRACKING*******************/

					if(trackingValido){
						return ResultTx.ok(objOA);
					}else{
						return ResultTx.error(new SsAdOrdenAtencion(), ""+resultTx, "MSJ_ERROR_RESERVA_OA");
					}

				}
			}
			/**RETORNAR ID*/
			//return citaEntidad.getIdCita();
			//return resultTx;
		}catch(Exception e){
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.logger.error(Log.getStackTrace(e));
			if(e instanceof CruceReservaException){
				resultTx = -1;
				return ResultTx.error(new SsAdOrdenAtencion(), ""+resultTx, "MSJ_ERROR_RESERVA_OA");
			}
			else if(e instanceof CitasPermitidasException){
				resultTx = -2;
				return ResultTx.error(new SsAdOrdenAtencion(), ""+resultTx, "MSJ_ERROR_RESERVA_OA");
			}
		}
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		return ResultTx.error(new SsAdOrdenAtencion(), ""+resultTx, "MSJ_ERROR_RESERVA_OA");
		//return resultTx;
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE, readOnly = false, rollbackFor = Exception.class)
	public ResultTx<SsHcObligacion> reservarCitaMedicaObligaciones(SsCcCita cita, AuditoriaModel auditoriaModel,
																   CoServicioClasificacion servicioPago) {
		Integer resultTx = 0;
		try{
			//ResultTx<T>
			SsCcCita citaEntidad = generarCitaMedica(cita, auditoriaModel);

			if(citaEntidad!=null){
				if(UtilesCommons.noEsVacio(servicioPago.getServicioclasificacion())){
					ResultTx<SsHcObligacion> result =  generarObligacionesDeCita(citaEntidad, auditoriaModel, servicioPago);
					if(!result.isOk()){
						TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
						return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
					}else{

						/****************INICIO TRACKING*******************/
						boolean trackingValido = true;
						//Obtener nombre especialiad
						SsGeEspecialidad especialidad =  especialidadDao.findById(citaEntidad.getIdEspecialidad());
						Personamast personaMedico =  personamastDao.obtenerPorId(citaEntidad.getIdMedico());
						if(especialidad!=null && personaMedico!=null){
 						}

						/****************FIN TRACKING*******************/
						if(trackingValido){
							return result;
						}else{
							TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
							return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
						}

					}
				}else{
					TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
					return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
				}
			}else{
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
			}
		}catch(Exception e){
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.logger.error(Log.getStackTrace(e));
			if(e instanceof CruceReservaException){
				resultTx = -1;
				return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
			}
			else if(e instanceof CitasPermitidasException){
				resultTx = -2;
				return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
			}
		}
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");

	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE, readOnly = false, rollbackFor = Exception.class)
	public ResultTx<SsHcObligacion>  reprogramarCitaMedicaObligaciones(Integer idCitaAnterior, SsCcCita nuevaCita,
																	   AuditoriaModel auditoriaModel,CoServicioClasificacion servicioPago) {
		Integer resultTx = 0;
		try{
			//ELIMINAR
			resultTx = eliminarCitaMedicaObligaciones(idCitaAnterior);
			//RESERVAR NUEVA CITA
			//ResultTx<T>
			SsCcCita citaEntidad = generarCitaMedica(nuevaCita, auditoriaModel);
			//GENERAR  SUS  OBLIGACIONES
			if(citaEntidad!=null){
				if(UtilesCommons.noEsVacio(servicioPago.getServicioclasificacion())){
					ResultTx<SsHcObligacion> result =  generarObligacionesDeCita(citaEntidad, auditoriaModel, servicioPago);
					if(!result.isOk()){
						TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
						return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
					}else{
						return result;
					}
				}else{
					TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
					return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
				}
			}else{
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
			}
		}catch(Exception e){
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.logger.error(Log.getStackTrace(e));
		}
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		return ResultTx.error(new SsHcObligacion(), ""+resultTx, "MSJ_ERROR_RESERVA");
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE, readOnly = false, rollbackFor = Exception.class)
	public Integer anularCitaMedica(Integer idCitaAnterior,
									AuditoriaModel auditoriaModel) {
		Integer resultTx = 0;
		try{
			resultTx = eliminarCitaMedicaObligaciones(idCitaAnterior);
			return resultTx;
		}catch(Exception e){
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			Log.logger.error(Log.getStackTrace(e));
		}
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		return resultTx;
	}

	/*********** SERVICES AUXILIARES***********/

	public int eliminarCitaMedicaObligaciones(Integer idCita) {
		int result  = 0;
		/**1.- buscar cita Medica actual*/
		SsCcCita citaAnterior = citaMedicaDao.findById(idCita);
		if(citaAnterior!=null){
			/**2.- eliminar obligaciones si las hubiere*/
			SsHcObligacion objObl = new SsHcObligacion();
			objObl.setIdCita(citaAnterior.getIdCita());
			List<SsHcObligacion> listaObl =  ssHcObligacionDao.listarElementos(objObl, false);
			if(UtilesCommons.noEsVacio(listaObl)){
				/**2.1.- eliminar el detalle de la obligaciones si las hubiere y la Obligaci�n*/
				for(SsHcObligacion resultDelete : listaObl ){ // NO SER�N MUCHOS ELEMENTOS
					SsHcObligaciondetalle objOblDetalle = new SsHcObligaciondetalle();
					objOblDetalle.setOblobligacionid(resultDelete.getOblobligacionid());
					List<SsHcObligaciondetalle> listaOblDetalle =  ssHcObligaciondetalleDao.listarElementos(objOblDetalle,false);
					if(UtilesCommons.noEsVacio(listaOblDetalle)){
						for(SsHcObligaciondetalle resultDetalleDelete : listaOblDetalle ){
							ssHcObligaciondetalleDao.eliminar(resultDetalleDelete);
						}
					}
					ssHcObligacionDao.eliminar(resultDelete);
				}
			}
			/**3.- eliminar CITA*/
			citaMedicaDao.delete(citaAnterior);
			result =1;
		}
		return result;
	}

	public ResultTx<SsHcObligacion> generarObligacionesDeCita(SsCcCita citaEntidad, AuditoriaModel auditoriaModel,
															  CoServicioClasificacion servicioPago) {
		Integer resultTx = 0;
	  return null;
	}

	public SsCcCita generarCitaMedica(SsCcCita cita, AuditoriaModel auditoriaModel) {
		//ResultTx<T>
		/**1.- buscar horario*/
		SsCcHorario horario = horarioMedicoDao.findById(cita.getIdHorario());

		/**2.- buscar Consultorio*/
		SsGeConsultorio consultorio = consultorioDao.findById(horario.getIdConsultorio());


		/**3.- Crrear y guardar la CITA*/
		SsCcCita citaEntidad = null;

		Date horaInicialCita = TimeCommons.getSoloHora(cita.getFechaCita()).toDate();
		Date horaFinalCita = TimeCommons.getSoloHora(cita.getFechaCita()).plusMinutes(horario.getTiempoPromedioAtencion().intValue()).toDate();

		/**3.1. - Validar CRUCES RESERVAS*/
		validarCruceReservas(horario, cita.getFechaCita(), horaInicialCita, horaFinalCita); // VALIDAMOS LOS CRUCES DE HORARIOS
		/**3.2. - Validar CITAS PERMITIDAS*/
		validarCitasPermitidas(horario, cita.getIdPaciente(), auditoriaModel); // VALIAMOS EL NUMERO MAXIMO DE CITAS QUE SE PUEDEN REALIZAR POR DIA, PARA EL MISMO M�DICO Y LA MISMA ESPECIALIDAD



		citaEntidad = new SsCcCita();
		BeanUtils.copyProperties(cita, citaEntidad, "idHorario");
		citaEntidad.setIdHorario(horario.getIdHorario());

		citaEntidad.setIdEspecialidad(horario.getIdEspecialidad());
		if(UtilesCommons.esVacio(cita.getCompania())){
			citaEntidad.setCompania(cita.getCompania());
		}
		if(UtilesCommons.esVacio(cita.getUnidadNegocio())){
			citaEntidad.setUnidadNegocio(cita.getUnidadNegocio());
		}
		if(UtilesCommons.esVacio(cita.getSucursal())){
			citaEntidad.setSucursal(cita.getSucursal());
		}
		if(UtilesCommons.esVacio(cita.getUnidadReplicacion())){
			citaEntidad.setUnidadReplicacion(cita.getUnidadReplicacion());
		}

		int nextId = citaMedicaDao.obtenerMaximoEnteroColumna("idCita") + 1;


		citaEntidad.setIdCita(nextId);

		if(auditoriaModel != null){
			citaEntidad.setUsuarioCreacion(auditoriaModel.getUsuarioAuditoria());
			citaEntidad.setFechaCreacion(auditoriaModel.getFechaAuditoria());
		}

		citaMedicaDao.save(citaEntidad);
		//
		return citaEntidad;
	}


	public void validarCruceReservas(SsCcHorario horario, Date fecha, Date horaInicio, Date horaFin){
		SsCcCita filtro = new SsCcCita();
		filtro.setEstado(Constant.INT_ACTIVO);
		filtro.setIdHorario(horario.getIdHorario());
		DateTime fechaInicio = TimeCommons.getSoloFechaInicial(fecha);
		DateTime fechaFin = TimeCommons.getSoloFechaFinal(fecha);
		filtro.setFechaInicioBusqueda(fechaInicio.toDate());
		filtro.setFechaFinBusqueda(fechaFin.toDate());

		List<SsCcCita> list = citaMedicaDao.listarSSccCitasMedicas(filtro);

		for(SsCcCita cita : list){
			Date horaInicial = TimeCommons.getSoloHora(cita.getFechaCita()).toDate();
			Date horaFinal = TimeCommons.getSoloHora(cita.getFechaCita()).plusMinutes(horario.getTiempoPromedioAtencion().intValue()).toDate();
			if(TimeCommons.sonHorasIguales(horaInicio, horaInicial) && TimeCommons.sonHorasIguales(horaFin, horaFinal)){
				CruceReservaException cruce = new CruceReservaException();
				VwEmpleado medico = empleadoDao.obtenerPorId(horario.getMedico());
				if(medico != null){
					cruce.setNombreMedico(medico.getNombreCompleto());
				}
				cruce.setFechaReserva(fechaInicio);
				cruce.setHoraInicio(TimeCommons.getSoloHora(horaInicio));
				cruce.setHoraFin(TimeCommons.getSoloHora(horaFin));
				throw cruce;
			}
		}
	}

	public void validarCitasPermitidas(SsCcHorario horario, Integer idPaciente, AuditoriaModel auditoria){
		MaMiscelaneosDetalle filtroMiscelaneo = new MaMiscelaneosDetalle();
		filtroMiscelaneo.setAplicacionCodigo(Constant.APP_CODIGO);
		filtroMiscelaneo.setCompania(Constant.APP_COMPANIA);
		filtroMiscelaneo.setCodigoTabla(Constant.MISCELANEO_HEADER_VALIDACION_CITAS_WEB);
		filtroMiscelaneo.setCodigoElemento(Constant.MISCELANEO_DETALLE_VALIDACION_CITAS_POR_DIA);

		MaMiscelaneosDetalle objValidacion = miscelaneoDetalleDao.obtenerPorId(filtroMiscelaneo);
		if(objValidacion == null || UtilesCommons.esVacio(objValidacion.getEstado()) || objValidacion.getEstado().equalsIgnoreCase(Constant.INACTIVO)){
			return;
		}else{
			if(UtilesCommons.esPositivo(objValidacion.getValorNumerico())){
				Date fecha = auditoria.getFechaAuditoria();
				DateTime fechaInicio = TimeCommons.getSoloFechaInicial(fecha);
				DateTime fechaFin = TimeCommons.getSoloFechaFinal(fecha);

				SsCcCita filtroCita = new SsCcCita();
				filtroCita.setIdPaciente(idPaciente);
				filtroCita.setUsuarioCreacion(auditoria.getUsuarioAuditoria());
				filtroCita.setIdMedico(horario.getMedico());
				filtroCita.setEstado(Constant.INT_ACTIVO);
				filtroCita.setIdEspecialidad(horario.getIdEspecialidad());
				filtroCita.setIndicadorWeb(Constant.INT_ACTIVO);
				filtroCita.setFechaInicioBusqueda(fechaInicio.toDate());
				filtroCita.setFechaFinBusqueda(fechaFin.toDate());


				int numeroCitasPermitido = objValidacion.getValorNumerico().intValue();
				int numeroCitas = citaMedicaDao.contarNumeroCitasPorDia(filtroCita) + 1;

				if(numeroCitas > numeroCitasPermitido){
					CitasPermitidasException exp = new CitasPermitidasException();
					exp.setFecha(fecha);
					exp.setFechaStr(TimeCommons.imprimirSoloFecha(fecha));
					exp.setNumeroCitas(numeroCitas);
					exp.setNumeroMaximoCitas(numeroCitasPermitido);
					exp.setEspecialidadNombre("");
					exp.setMedicoNombre("");

					SsGeEspecialidad especialidad = especialidadDao.findById(horario.getIdEspecialidad());
					if(especialidad != null){
						exp.setIdEspecialidad(especialidad.getIdEspecialidad());
						exp.setEspecialidadNombre(especialidad.getNombre());
					}

					VwEmpleado medico = empleadoDao.obtenerPorId(horario.getMedico());
					if(medico != null){
						exp.setIdMedico(medico.getEmpleado());
						exp.setMedicoNombre(medico.getNombreCompleto());
					}
					//throw exp;
				}
			}else{
				return;
			}
		}

	}

	@Override
	public int enviarCorreoReservaCita(Integer idCita, String indica) {
		try{
			Personamast paciente = obtenerPaciente(idCita);
			VwCitaMedica cita = obtenerPorId(idCita);
			return enviarCorreo(cita, paciente);
		}catch(Exception e){
			Log.error(e, "enviarCorreoReservaCita");
		}
		return 0;
	}

	private static final String PATTERN_HORARIO_CITA = TimeCommons.PATTERN_FECHA+" "+TimeCommons.PATTERN_12_HORA_AM_PM;

	/**
	 * @param cita
	 * @param paciente
	 * @param otros
	 * @return
	 */
	public int enviarCorreo(VwCitaMedica cita, Personamast paciente, Personamast ... otros){
		int resultMsg = 0;
		try{
			List<String> listCorreos = new ArrayList<String>();
			listCorreos.add(paciente.getCorreoElectronico());
			if(otros != null && otros.length > 0){
				for(int i = 0; i < otros.length; i++){
					listCorreos.add(otros[i].getCorreoElectronico());
				}
			}
			cita.setDescripcionEstadoCita(Utiles.getPropertyMsg("MSJ_ESTADO_PROGRAMADO_CITA"));
			//cita.setDescripcionEstadoCita("Programado");

			String citaHorario = TimeCommons.convertirEnDateTime(cita.getFechaCita()).toString(PATTERN_HORARIO_CITA);
			if(cita.getDuracionPromedio() != null && cita.getDuracionPromedio() > 0){
				citaHorario = citaHorario+" - "+TimeCommons.convertirEnDateTime(cita.getFechaCita()).plusMinutes(cita.getDuracionPromedio().intValue()).toString(TimeCommons.PATTERN_12_HORA_AM_PM);
			}
			String info = Utiles.getPropertyMsg("MSJ_RESERVA_CITA_CORREO_BODY_HTML");
			String formattedInfo = MessageFormat.format(info, cita.getIdCita(), convertirEnMayusculas(cita.getPacienteNombreCompleto()), cita.getPacienteDocumento(), convertirEnMayusculas(cita.getEspecialidadNombre()), convertirEnMayusculas(cita.getMedicoNombreCompleto()), citaHorario, convertirEnMayusculas(cita.getDescripcionEstadoCita()),
					convertirEnMayusculas(cita.getConsultorioNombre()), cita.getConsultorioPool());
			String body = formattedInfo;
			String subject = Utiles.getPropertyMsg("MSJ_RESERVA_CITA_CORREO_SUBJECT");


			Map<String, String> variables = new LinkedHashMap<String, String>();
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_NRO_ORDEN"), String.valueOf(cita.getIdCita()));
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_NOMBRE_PACIENTE"), convertirEnMayusculas(cita.getPacienteNombreCompleto()));
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_DOCUMENTO"), cita.getPacienteDocumento());
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_ESPECIALIDAD"), convertirEnMayusculas(cita.getEspecialidadNombre()));
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_NOMBRE_MEDICO"), convertirEnMayusculas(cita.getMedicoNombreCompleto()));
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_FECHA_CITA"), citaHorario);
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_ESTADO"), convertirEnMayusculas(cita.getDescripcionEstadoCita()));
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_CONSULTORIO"), convertirEnMayusculas(cita.getConsultorioNombre()));
			variables = adicionarVariable(variables, Utiles.getPropertyService("PAR_POOL"), String.valueOf(cita.getConsultorioPool()));

			Email email = emailGenericService.getObjetoMail(listCorreos, subject, body, null, TimeCommons.obtenerFechaHoraActual(), variables);

			resultMsg = emailGenericService.enviarCorreo(email, Utiles.getPropertyService("PROC_REG_CITAS"));
		}catch(Exception e){
			Log.error(e, "enviarCorreo");
		}
		return resultMsg;
	}

	public Map<String, String> adicionarVariable(Map<String, String> map, String key, String value){
		if(key != null && !key.trim().equals("")){
			map.put(key, value);
		}
		return map;
	}
	public String convertirEnMayusculas(String str){
		if(str == null || str.trim().equals("")){
			return "";
		}else{
			return str.toUpperCase();
		}
	}

}
