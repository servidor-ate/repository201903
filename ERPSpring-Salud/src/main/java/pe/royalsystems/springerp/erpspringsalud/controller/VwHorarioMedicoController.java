package pe.royalsystems.springerp.erpspringsalud.controller;

import static pe.royalsystems.springerp.model.util.Constant.HCE_PAGO_CUBIERTO;
import static pe.royalsystems.springerp.model.util.Constant.INT_ACTIVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.royalsystems.springerp.erpspringsalud.model.HorarioBloqueJson;
import pe.royalsystems.springerp.erpspringsalud.model.JsonViewInterfaces;
import pe.royalsystems.springerp.erpspringsalud.model.VwHorarioMedicoJson;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewAssembler;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;
import pe.royalsystems.springerp.commons.TimeCommons;
import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.domain.GE_DiaFeriado;
import pe.royalsystems.springerp.model.domain.SsCcCita;
import pe.royalsystems.springerp.model.domain.VwPersonapaciente;
import pe.royalsystems.springerp.model.domain.vista.VwHorarioMedico;
import pe.royalsystems.springerp.model.domain.vista.VwPacienteobligacione;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.HorarioMedicoService;
import pe.royalsystems.springerp.service.VwPacienteobligacioneService;
import pe.royalsystems.springerp.service.VwPersonapacienteService;
import pe.royalsystems.springerp.service.util.Log;



@RestController
@RequestMapping("/api/salud/horariomedico") 
public class VwHorarioMedicoController {
	
	private static final String HORARIO_DISPONIBLE = "DISPONIBLE";
	private static final String HORARIO_OCUPADO = "OCUPADO";
	private static final String HORARIO_MI_CITA = "MI_CITA";
	private static final String HORARIO_OCUPADO_PEND_PAGO = "OCUPADO_POR_PAGAR";
	
	
	@Autowired
	HorarioMedicoService horarioMedicoService ; 
	
	//@Autowired
	//CitaMedicaService citaMedicaService;

	@Autowired
	VwPersonapacienteService vwPersonapacienteService;

	@Autowired
	VwPacienteobligacioneService vwPacienteobligacioneService;
	
	 private JsonViewAssembler<VwHorarioMedico, VwHorarioMedicoJson> jsonAssemb = 
			 new JsonViewAssembler<VwHorarioMedico, VwHorarioMedicoJson>(VwHorarioMedicoJson.class);

	 private JsonViewAssembler<VwHorarioMedicoJson, VwHorarioMedico> jsonAssembInverso = 
			 new JsonViewAssembler<VwHorarioMedicoJson, VwHorarioMedico>(VwHorarioMedico.class);


	     
	    /** listar todos los elementos ...
	     * @return
	     */
	    @RequestMapping(value = "/all/", method = RequestMethod.GET)	   
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)	    
	    public ResponseEntity<List<VwHorarioMedicoJson>> listAllElementos() {
	        List<VwHorarioMedico> users = horarioMedicoService.
	        		listarVwHorarioMedico(new VwHorarioMedico());	        	        	       	        
	        
	        if(users.isEmpty()){
	            return new ResponseEntity<List<VwHorarioMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwHorarioMedicoJson> usersJson = jsonAssemb.getJsonListDozer(users);		    
		        
		        return new ResponseEntity<List<VwHorarioMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	 
	 
	   
	     
	    /** Retornar un Objeto por Id
	     * @param id
	     * @return
	     */
	    @RequestMapping(value = "/horario/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<VwHorarioMedicoJson> getElementoId(@PathVariable("id") Integer id) {	       
	    	VwHorarioMedico filtro = new  VwHorarioMedico();
	    	filtro.setIdHorario(id);	    	
	    	List<VwHorarioMedico> listResult = horarioMedicoService.listarVwHorarioMedico(filtro);
	        if (listResult == null || listResult.isEmpty()) {	            
	            return new ResponseEntity<VwHorarioMedicoJson>(HttpStatus.NOT_FOUND);
	        }else{	        	
	        	VwHorarioMedico objResult = listResult.get(0);//debera haber solo un elemento
	        	return new ResponseEntity<VwHorarioMedicoJson>(jsonAssemb.getJsonObject(objResult), HttpStatus.OK);	
	        }
	    }
	 

	    
	
	    /**
	     * @param idmedico
	     * @param idespecialidad
	     * @return
	     */
	    @RequestMapping(value = "/horario/{idmedico}/{idespecialidad}/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<VwHorarioMedicoJson>> listElementosMedicoEspecialidad(
	    		@PathVariable("idmedico") Integer idmedico,@PathVariable("idespecialidad") Integer idespecialidad) {

	    	VwHorarioMedico  filtro = getFiltroHorarioDefault(idmedico,idespecialidad);
	    	List<VwHorarioMedico> listResult = horarioMedicoService.listarVwHorarioMedico(filtro);
	        if(listResult.isEmpty()){
	            return new ResponseEntity<List<VwHorarioMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwHorarioMedicoJson> usersJson = jsonAssemb.getJsonListDozer(listResult);		    
		        
		        return new ResponseEntity<List<VwHorarioMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	        	     
	    }
	    
	    
	    /** listar BLOQUES DE HORARIO (DIA ACTUAL), de acuerdo al medico y especialidad
	     * @param idmedico
	     * @param idespecialidad
	     * @return
	     */
	    @RequestMapping(value = "/bloquehorario/diario/{idmedico}/{idespecialidad}/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<HorarioBloqueJson>> listBloquesDiaActualMedicoEspecialidad(
	    		@PathVariable("idmedico") Integer idmedico,@PathVariable("idespecialidad") Integer idespecialidad) {
	    	try{
				//Se debe encontrar en el formato correcto
		    	Date fechaFiltro = new Date();										
				return listBloquesFecha(fechaFiltro,idmedico,idespecialidad);		
	    	}catch(Exception e){
	    		Log.error(e, "listBloquesFechaMedicoEspecialidad");
	    		return new ResponseEntity<List<HorarioBloqueJson>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    	}        	     
	    }
	    
	    /** listar BLOQUES DE HORARIO (FECHA POR PARAMETRO), de acuerdo al medico y especialidad
	     * @param idmedico
	     * @param idespecialidad
	     * @return
	     */
	    @RequestMapping(value = "/bloquehorario/fecha/{idmedico}/{idespecialidad}/{yyyyMMdd}/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<HorarioBloqueJson>> listBloquesFechaMedicoEspecialidad(
	    		@PathVariable("idmedico") Integer idmedico,@PathVariable("idespecialidad") Integer idespecialidad,
	    		@PathVariable("yyyyMMdd") String fechaformato
	    		) {
	    	try{
				//Se debe encontrar en el formato correcto
		    	Date fechaFiltro = new Date();
				if(UtilesCommons.noEsVacio(fechaformato)){
					fechaFiltro = UtilesCommons.getDateFormat("yyyyMMdd", fechaformato);
				}						
				return listBloquesFecha(fechaFiltro,idmedico,idespecialidad);		
	    	}catch(Exception e){
	    		Log.error(e, "listBloquesFechaMedicoEspecialidad");
	    		return new ResponseEntity<List<HorarioBloqueJson>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    	}
		    		    	        	
	    }	    
	    
	    
	    public ResponseEntity<List<HorarioBloqueJson>> listBloquesFecha(Date fechaFiltro,
	    		Integer idmedico,Integer idespecialidad){
	    	
	    	if( idmedico  == 0){
	    		idmedico = null; //*** it means all medics
	    	}
	    	
	    	VwHorarioMedico  filtro = getFiltroHorarioDefault(idmedico,idespecialidad);
			DateTime inicio = TimeCommons.convertirEnDateTime(fechaFiltro); 
			DateTime fin = TimeCommons.convertirEnDateTime(fechaFiltro);			
			inicio = inicio.minusMonths(1);
			fin = fin.plusMonths(1);				
			int primerDiaMes = TimeCommons.getPrimerDiaDelMes(inicio);
			int ultimoDiaMes = TimeCommons.getUltimoDiaDelMes(fin);			
			inicio = inicio.withDayOfMonth(primerDiaMes);
			fin = fin.withDayOfMonth(ultimoDiaMes);
			filtro.setFechaInicio(inicio.toDate());
			filtro.setFechaFin(fin.toDate());
					
	    	List<VwHorarioMedico> listResult = horarioMedicoService.listarVwHorarioMedico(filtro);	    		    	
	        if(listResult == null || listResult.isEmpty()){	        	
	            return new ResponseEntity<List<HorarioBloqueJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
				/**Rango horas*/
				String fechaIniStr = UtilesCommons.printDate("yyyyMMdd",fechaFiltro);
				//String fechaIniStr = UtilesCommons.printDate("yyyyMMdd",UtilesCommons.fechaMasNumeroDias(fechaFiltro,1)); 
				//String fechaFinStr = UtilesCommons.printDate("yyyyMMdd",UtilesCommons.fechaMasNumeroDias(fechaFiltro,1));
				Date fechaHoraIni = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaIniStr+"00:00:00");					
				Date fechaHoraFin = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaIniStr+"23:59:59");			
				/********/	
				
	        	//Generar bloques ... obtener feriados
	        	List<HorarioBloqueJson> listaHorarioBloque = generarHorariosBloque(
	        			listResult, TimeCommons.convertirEnDateTime(fechaHoraIni),
	        			TimeCommons.convertirEnDateTime(fechaHoraFin), null);
	        			   		        
		        return new ResponseEntity<List<HorarioBloqueJson>>(listaHorarioBloque, HttpStatus.OK);	        	
	        }	
	    }
	    
	    
	    /**********************************************************************/
	    /***************************UTILES HORARIO - CALENDARIO****************/

	    		
	    
	    
	    public VwHorarioMedico getFiltroHorarioDefault( Integer idmedico,Integer idespecialidad){
	    	VwHorarioMedico filtro = new  VwHorarioMedico();

	    	filtro.setIndicadorCompartido(Constant.HORARIO_INDICADOR_COMPARTIDO_DEFAULT);
	    	filtro.setIdGrupoAtencionCompartido(Constant.HORARIO_ID_GRUPO_ATENCION_COMPARTIDO_DEFAULT);
	    	filtro.setEstado(Constant.INT_ACTIVO);
	    	filtro.setIdEspecialidad(idespecialidad);
	    	filtro.setIdServicio(Constant.TIPO_SERVICIO_DEFAULT);
	    	filtro.setIdTurno(Constant.TIPO_TURNO_DEFAULT);
	    	filtro.setMedico(idmedico);
	    	filtro.setEstadoConsultorio(Constant.INT_ACTIVO);
	    	filtro.setIdGrupoAtencion(Constant.ID_GRUPO_ATENCION_EXTERNO);
	    	filtro.setIdTipoAtencion(Constant.ID_TIPO_ATENCION_EXTERNO);
	    	filtro.setListTipoRegistroHorario(Arrays.asList(Constant.TIPO_REGISTRO_HORARIO_DEFAULT_1, Constant.TIPO_REGISTRO_HORARIO_DEFAULT_2));
	    	filtro.setIdCita(null);
	    	//filtro.setEjecutarCargaHorarios(true);

			
			return filtro;
	    }
	    
	    
	    
	    
	    
		/**
		 * @param vistas
		 * @param inicio
		 * @param fin
		 * @param feriados
		 * @return
		 */
		public List<HorarioBloqueJson> generarHorariosBloque(List<VwHorarioMedico> vistas, 
				DateTime inicio, DateTime fin, Map<String, GE_DiaFeriado> feriados){
			
			LocalDate fechaFinGeneracion; LocalDate fechaInicioGeneracion;
			SsCcCita filtro = new SsCcCita();
			//Lista que contendra los bloques de horarios ...
			List<HorarioBloqueJson> listaHorarioBloque = new ArrayList<HorarioBloqueJson>(); 
			filtro.setEstado(Constant.INT_ACTIVO);
			VwHorarioMedico filtroHorario = null;;
			
			for(VwHorarioMedico vista : vistas){
				filtroHorario = vista;
				filtro.setIdHorario(vista.getIdHorario());
				Map<String, List<SsCcCita>> mapCitas;
				//= citaMedicaService.mapearCitasPorFecha(filtro);
				
				fechaInicioGeneracion = LocalDate.fromDateFields(TimeCommons.getSoloFecha(vista.getFechaInicio()).toDate());
				fechaFinGeneracion = LocalDate.fromDateFields(TimeCommons.getSoloFecha(vista.getFechaFin()).toDate());
				
				if(vista.getIndicadorLunes().compareTo(INT_ACTIVO) == 0){
					//obtenerHorarioBloquesPorDia(filtroHorario,listaHorarioBloque,fechaInicioGeneracion, fechaFinGeneracion, TimeCommons.DIA_LUNES_JODA, inicio, fin, vista, mapCitas, feriados);
				}
				if(vista.getIndicadorMartes().compareTo(INT_ACTIVO) == 0){
					//obtenerHorarioBloquesPorDia(filtroHorario,listaHorarioBloque,fechaInicioGeneracion, fechaFinGeneracion, TimeCommons.DIA_MARTES_JODA, inicio, fin, vista, mapCitas, feriados);
				}
				if(vista.getIndicadorMiercoles().compareTo(INT_ACTIVO) == 0){
					
					//obtenerHorarioBloquesPorDia(filtroHorario,listaHorarioBloque,fechaInicioGeneracion, fechaFinGeneracion, TimeCommons.DIA_MIERCOLES_JODA, inicio, fin, vista, mapCitas, feriados);
				}
				if(vista.getIndicadorJueves().compareTo(INT_ACTIVO) == 0){
					//obtenerHorarioBloquesPorDia(filtroHorario,listaHorarioBloque,fechaInicioGeneracion, fechaFinGeneracion, TimeCommons.DIA_JUEVES_JODA, inicio, fin, vista, mapCitas, feriados);
				}
				if(vista.getIndicadorViernes().compareTo(INT_ACTIVO) == 0){
					//obtenerHorarioBloquesPorDia(filtroHorario,listaHorarioBloque,fechaInicioGeneracion, fechaFinGeneracion, TimeCommons.DIA_VIERNES_JODA, inicio, fin, vista, mapCitas, feriados);
				}
				if(vista.getIndicadorSabado().compareTo(INT_ACTIVO) == 0){
					//obtenerHorarioBloquesPorDia(filtroHorario,listaHorarioBloque,fechaInicioGeneracion, fechaFinGeneracion, TimeCommons.DIA_SABADO_JODA, inicio, fin, vista, mapCitas, feriados);
				}
				if(vista.getIndicadorDomingo().compareTo(INT_ACTIVO) == 0){
					//obtenerHorarioBloquesPorDia(filtroHorario,listaHorarioBloque,fechaInicioGeneracion, fechaFinGeneracion, TimeCommons.DIA_DOMINGO_JODA, inicio, fin, vista, mapCitas, feriados);
				}
			}
			
			return listaHorarioBloque;
		}
		
		/**
		 * @param filtroHorario
		 * @param listaHorarioBloque
		 * @param fechaInicial
		 * @param fechaFinal
		 * @param diaSemana
		 * @param fechaInicialTope
		 * @param fechaFinalTope
		 * @param vista
		 * @param citasMap
		 * @param feriados
		 */
		public void obtenerHorarioBloquesPorDia(VwHorarioMedico filtroHorario, List<HorarioBloqueJson> listaHorarioBloque ,
				LocalDate fechaInicial, LocalDate fechaFinal, 
				int diaSemana, DateTime fechaInicialTope, DateTime fechaFinalTope, VwHorarioMedico vista, Map<String, List<SsCcCita>> citasMap, Map<String, GE_DiaFeriado> feriados){
			DateTime hrInicio = TimeCommons.getSoloHora(vista.getHoraInicio());
			DateTime hrFin = TimeCommons.getSoloHora(vista.getHoraFin());
			
			DateTime index = TimeCommons.convertirEnDateTime(fechaInicial.toDate());
			LocalDate fechaSgte = fechaInicial.withDayOfWeek(diaSemana);
			DateTime ahora = DateTime.now().withSecondOfMinute(0).withMillisOfSecond(0);
			while(fechaSgte.isBefore(fechaFinal) || fechaSgte.isEqual(fechaFinal)){
				if(TimeCommons.fechaContenidaEnRango(fechaInicialTope, fechaFinalTope, index)){
					LocalDate localDate = fechaSgte; //fechaSgte.withDayOfWeek(diaSemana);
					if((localDate.isAfter(fechaInicial) || localDate.isEqual(fechaInicial)) && (localDate.isBefore(fechaFinal) || localDate.isEqual(fechaFinal))){
						if(feriados == null || feriados.isEmpty() || !feriados.containsKey(localDate.toString(TimeCommons.PATTERN_FECHA))){
							DateTime hrIndex = hrInicio;
							DateTime hrAnterior = hrIndex;
							while(hrIndex.isBefore(hrFin)){
								
								hrAnterior = hrIndex;
								hrIndex = hrIndex.plusMinutes(vista.getTiempoPromedioAtencion().intValue());
								
								DateTime inicio = new DateTime(localDate.toDate()).withHourOfDay(hrAnterior.getHourOfDay()).withMinuteOfHour(hrAnterior.getMinuteOfHour()).withSecondOfMinute(hrAnterior.getSecondOfMinute()).withMillisOfSecond(hrAnterior.getMillisOfSecond());
								DateTime fin = new DateTime(localDate.toDate()).withHourOfDay(hrIndex.getHourOfDay()).withMinuteOfHour(hrIndex.getMinuteOfHour()).withSecondOfMinute(hrIndex.getSecondOfMinute()).withMillisOfSecond(hrIndex.getMillisOfSecond());
								
								HorarioBloqueJson event = getHorarioMedicoBloque(vista, inicio, fin);
								establecerEstadoHorario(filtroHorario,event, inicio, fin, citasMap);
								
								if(fin.isEqual(ahora) || fin.isBefore(ahora)){
									if(event.getEtiquetaBloque().equalsIgnoreCase(HORARIO_MI_CITA)){										
										listaHorarioBloque.add(event);
									}
								}else{
									listaHorarioBloque.add(event);
								}
							}
						}
					}
				}
				fechaSgte = fechaSgte.plusWeeks(1);				
				index = TimeCommons.convertirEnDateTime(fechaSgte.toDate());
			}
		}

		/**
		 * @param vista
		 * @param startDate
		 * @param endDate
		 * @return
		 */
		public HorarioBloqueJson getHorarioMedicoBloque(VwHorarioMedico vista, DateTime startDate, DateTime endDate){
			HorarioBloqueJson event = new HorarioBloqueJson();
			VwHorarioMedico horario = new VwHorarioMedico();
			BeanUtils.copyProperties(vista, horario);
			event.setPatterFecha("dd/MM/yyyy");
			event.setFechaInicio(startDate.toDate());
			event.setFechaInicioFormat(UtilesCommons.printDate("dd/MM/yyyy", event.getFechaInicio()));
			event.setFechaFin(endDate.toDate());
			event.setFechaFinFormat(UtilesCommons.printDate("dd/MM/yyyy", event.getFechaFin()));
			
			event.setIdTurno(vista.getIdTurno());
			event.setDescripcionTurno(vista.getDescripcionTurno());
			event.setPoolConsultorio(vista.getPoolConsultorio());
			event.setCodigoConsultorio(vista.getCodigoConsultorio());
			event.setNombreConsultorio(vista.getNombreConsultorio());
			
			event.setTituloBloque(generarTitulo(startDate, endDate));
			event.setDescripcionBloque(generarDescripcion(event, startDate, endDate));
					
			event.setTiempoPromedioAtencion(vista.getTiempoPromedioAtencion());
			
			event.setHoraInicio(startDate.toDate());
			event.setHoraFin(endDate.toDate());
			event.setPatterHora("HH:mm");
			event.setHoraInicioFormat(UtilesCommons.printDate("HH:mm",startDate.toDate()));
			event.setHoraFinFormat(UtilesCommons.printDate("HH:mm",endDate.toDate()));
	
			//ADD INFO
			event.setIdEspecialidad(vista.getIdEspecialidad());
			event.setIdConsultorio(vista.getIdConsultorio());
			event.setIdGrupoAtencionCompartido(vista.getIdGrupoAtencionCompartido());
			event.setIdHorario(vista.getIdHorario());
			event.setIdInasistencia(vista.getIdInasistencia());
			event.setIdServicio(vista.getIdServicio());			
			event.setPeriodo(vista.getPeriodo());
			event.setMedico(vista.getMedico());
			event.setMedicoNombreCompleto(vista.getNombreCompleto());
			event.setCodigoEspecialidad(vista.getCodigoEspecialidad());
			event.setNombreEspecialidad(vista.getNombreEspecialidad());
			//paciente...
			
			return event;
		}
		
		public void establecerEstadoHorario(VwHorarioMedico filtro, HorarioBloqueJson eventBloque,DateTime inicio, DateTime fin, Map<String, List<SsCcCita>> cita){
			//VwHorarioMedico vista = (VwHorarioMedico) event.getData();
			eventBloque.setCitaAsignada(false);
			String titulo = eventBloque.getTituloBloque();
			String etqHorario = HORARIO_DISPONIBLE;
			//VwHorarioMedico filtro = filtroHorario;
			if(cita == null || cita.isEmpty()){
				
			}else{
				List<SsCcCita> list = cita.get(TimeCommons.imprimirSoloFecha(inicio));
				if(list == null || list.isEmpty()){
					
				}else{
					for(SsCcCita item : list){
						DateTime horaInicio = TimeCommons.getSoloHora(item.getFechaCita());
						DateTime horaFin = horaInicio.plusMinutes(eventBloque.getTiempoPromedioAtencion().intValue());
						
						if(TimeCommons.imprimirSoloHora(inicio).equalsIgnoreCase(TimeCommons.imprimirSoloHora(horaInicio)) 
								&& TimeCommons.imprimirSoloHora(fin).equalsIgnoreCase(TimeCommons.imprimirSoloHora(horaFin))){
							if(eventBloque.getIdHorario().compareTo(item.getIdHorario()) == 0){
								if(filtro.getIdCita() == null){
									eventBloque.setTituloBloque(titulo+HORARIO_OCUPADO);
									etqHorario = HORARIO_OCUPADO;
								}else{
									if(filtro.getIdCita().compareTo(item.getIdCita()) == 0){
										eventBloque.setTituloBloque(titulo+HORARIO_MI_CITA);
										etqHorario = HORARIO_MI_CITA;
									}else{
										eventBloque.setTituloBloque(titulo+HORARIO_OCUPADO);
										etqHorario = HORARIO_OCUPADO;
									}
								}
								//cargar datos paciente
								setDatosPacienteAtencion(eventBloque, item,filtro);
								
								eventBloque.setCitaAsignada(true);
								eventBloque.setIdCita(item.getIdCita());
								break;
							}
						}
					}
				}
			}
			
			//final....
			eventBloque.setEtiquetaBloque(etqHorario);
		}
		
		/**Cargar Datos Cita*/
		public void setDatosPacienteAtencion(HorarioBloqueJson eventBloque,SsCcCita cita,VwHorarioMedico filtroCita){
			String titulo = eventBloque.getTituloBloque();			
			if((""+Constant.HCE_PAGO_PAGAR).equals(""+ cita.getTipoCoberturaAtencion())){	
				//CITAS ReLACIONADAS A PAGOS
				/**Obener los datos DESDE  Obligación PAGOS*/
				VwPacienteobligacione objVwObligaPac = new VwPacienteobligacione();
				objVwObligaPac.setIdCita(cita.getIdCita());
				objVwObligaPac.setPaginable(false);
				Integer estadoObligacionActual =null;
				String nombrePaciente ="";				
				if(UtilesCommons.noEsVacio(eventBloque.getIdHorario())){
					List<VwPacienteobligacione> listaVwObligaPac =  vwPacienteobligacioneService.listar(objVwObligaPac,false);
					if(listaVwObligaPac!=null){
						if(listaVwObligaPac.size()>0){
							estadoObligacionActual = listaVwObligaPac.get(0).getOblcestado();
							nombrePaciente = listaVwObligaPac.get(0).getNombreCompleto();
							//PACIENTE							
							eventBloque.setPacienteNombreCompleto(""+nombrePaciente);
							eventBloque.setFlagPago(cita.getTipoCoberturaAtencion()!=null?cita.getTipoCoberturaAtencion():HCE_PAGO_CUBIERTO);							
							eventBloque.setPacienteId(cita.getIdPaciente());
							//SERVICIO/ITEM
							eventBloque.setServicioItemcodigo(listaVwObligaPac.get(0).getItemcodigo());
							eventBloque.setServicioItemDescripcion(listaVwObligaPac.get(0).getItemdescripcion());
							//OBLIGACION
							eventBloque.setObligacionEstado(estadoObligacionActual!=null?estadoObligacionActual:null);
							eventBloque.setObligacionId(listaVwObligaPac.get(0).getOblobligacionid());//AUX PARA EL ID DE LA OBLIGACION
							//SET ESTILO PENDIENTE DE PAGO
							if((""+Constant.OBLIGACION_ESTADO_PENDIENTE).equals(""+estadoObligacionActual)){
								eventBloque.setEtiquetaBloque(HORARIO_OCUPADO_PEND_PAGO);
							}						
						}
					}
				}
				eventBloque.setTituloBloque(titulo+"\n"+"(Paciente: "+nombrePaciente+")");
			}else{
				//CITAS LIBRES DE PAGOS
				/**Obener los datos DIRECTOS DEL PACIENTE*/
				VwPersonapaciente objPaciente =   vwPersonapacienteService.obtenerPorId(cita.getIdPaciente());
				if(objPaciente!=null){
					eventBloque.setTituloBloque(titulo+"\n"+"(Paciente: "+objPaciente.getNombreCompleto()+")");
					if(UtilesCommons.noEsVacio(eventBloque.getIdHorario())){
						
						eventBloque.setPacienteNombreCompleto(""+objPaciente.getNombreCompleto());
						eventBloque.setFlagPago(cita.getTipoCoberturaAtencion()!=null?cita.getTipoCoberturaAtencion():HCE_PAGO_CUBIERTO);						
						eventBloque.setPacienteId(cita.getIdPaciente());
					}			
				}
			}
			//SOLO SO NO ES NULO EL FILTRO (**REPROGRAMACION)
			if(filtroCita != null){
				if( (""+ filtroCita.getIdCita()).equals(""+cita.getIdCita())){
					eventBloque.setEtiquetaBloque(HORARIO_MI_CITA);					
				}			
			}		
		}
		
		public String generarTitulo(DateTime startDate, DateTime endDate) {
			String titulo = "";
			titulo = titulo + TimeCommons.imprimirSoloHora(startDate)+" - "+TimeCommons.imprimirSoloHora(endDate)+" ";
//			titulo = titulo + modelo.getNombreCompleto();
			return titulo;
		}
		
		public String generarDescripcion(HorarioBloqueJson modelo, DateTime startDate, DateTime endDate) {
			String descripcion = "";
//			descripcion = descripcion + "Id: "+ modelo.getIdHorario()+"\n ";
			descripcion = descripcion + "Fecha: "+ TimeCommons.imprimirSoloFecha(startDate)+"\n";
			descripcion = descripcion + "Turno: "+ modelo.getDescripcionTurno()+"\n ";
			descripcion = descripcion + "Horario: "+ TimeCommons.imprimirSoloHora(startDate)+" - "+TimeCommons.imprimirSoloHora(endDate)+"\n";
			descripcion = descripcion + "Pool: "+ modelo.getPoolConsultorio()+" \n ";
			return descripcion;
		}
		
}
