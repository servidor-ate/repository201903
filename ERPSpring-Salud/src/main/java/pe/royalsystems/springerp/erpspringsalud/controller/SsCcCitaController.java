package pe.royalsystems.springerp.erpspringsalud.controller;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import pe.royalsystems.springerp.erpspringsalud.model.HorarioBloqueJson;
import pe.royalsystems.springerp.erpspringsalud.model.JsonViewInterfaces;
import pe.royalsystems.springerp.erpspringsalud.model.OpearacionResultJson;
import pe.royalsystems.springerp.erpspringsalud.model.VwCitaMedicaJson;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewAssembler;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;
import pe.royalsystems.springerp.erpspringsalud.util.UtilesRest;
import pe.royalsystems.springerp.commons.TimeCommons;
import pe.royalsystems.springerp.model.domain.SsCcCita;
import pe.royalsystems.springerp.model.domain.vista.VwCitaMedica;
import pe.royalsystems.springerp.model.util.AuditoriaModel;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.util.Log;


@RestController
@RequestMapping("/api/salud/cita") 
public class SsCcCitaController {

	@Autowired
	MessageSource msg;
	
	///@Autowired
	//CitaMedicaService citaMedicaService;
	
	 private JsonViewAssembler<VwCitaMedica, VwCitaMedicaJson> jsonAssemb = 
			 new JsonViewAssembler<VwCitaMedica, VwCitaMedicaJson>(VwCitaMedicaJson.class);

	 private JsonViewAssembler<VwCitaMedicaJson, VwCitaMedica> jsonAssembInverso = 
			 new JsonViewAssembler<VwCitaMedicaJson, VwCitaMedica>(VwCitaMedica.class);

	 
	    /** Retornar un Objeto por Id
	     * @param id
	     * @return
	     */
	    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<VwCitaMedicaJson> getElementoId(@PathVariable("id") Integer id) {	       
	    	VwCitaMedica objResult =  null ; //citaMedicaService.obtenerPorId(id);
	        if (objResult == null) {	            
	            return new ResponseEntity<VwCitaMedicaJson>(HttpStatus.NOT_FOUND);
	        }else{	        	
	        	return new ResponseEntity<VwCitaMedicaJson>(jsonAssemb.getJsonObject(objResult), HttpStatus.OK);	
	        }
	    }
     
    /** listar todos  elementos por ID PACIENTE...
     * @return
     */
    @RequestMapping(value = "/paciente/{idPaciente}", method = RequestMethod.GET)	   
    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)	    
    public ResponseEntity<List<VwCitaMedicaJson>> listElementosPorPaciente(@PathVariable("idPaciente") Integer idPaciente) {
    	VwCitaMedica filtro = new VwCitaMedica();
    	filtro.setCitaEstado(Constant.INT_ACTIVO);
    	filtro.setIdPaciente(idPaciente);
        List<VwCitaMedica> listaResult = null ; //citaMedicaService.listarVwCitasMedicas(filtro);
        
        if(listaResult == null || listaResult.isEmpty()){
            return new ResponseEntity<List<VwCitaMedicaJson>>(HttpStatus.NO_CONTENT);	            
        }else{
	        List<VwCitaMedicaJson> usersJson = jsonAssemb.getJsonListDozer(listaResult);		    	        
	        return new ResponseEntity<List<VwCitaMedicaJson>>(usersJson, HttpStatus.OK);	        	
        }
    }

    /** listar todos  elementos por ID PACIENTE...
     * @return
     */
    @RequestMapping(value = "/horario/{idHorario}", method = RequestMethod.GET)	   
    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)	    
    public ResponseEntity<List<VwCitaMedicaJson>> listElementosPorHorario(@PathVariable("idHorario") Integer idHorario) {
    	VwCitaMedica filtro = new VwCitaMedica();
    	filtro.setCitaEstado(Constant.INT_ACTIVO);
    	filtro.setIdHorario(idHorario);
        List<VwCitaMedica> listaResult = null ;//citaMedicaService.listarVwCitasMedicas(filtro);
        
        if(listaResult == null || listaResult.isEmpty()){
            return new ResponseEntity<List<VwCitaMedicaJson>>(HttpStatus.NO_CONTENT);	            
        }else{
	        List<VwCitaMedicaJson> usersJson = jsonAssemb.getJsonListDozer(listaResult);		    	        
	        return new ResponseEntity<List<VwCitaMedicaJson>>(usersJson, HttpStatus.OK);	        	
        }
    }

    
    /**Regsitrar cita en el horario indicado

     * @param ucBuilder
     * @return
     */
    @RequestMapping(value = "/reserva/horario/{idPaciente}", method = RequestMethod.POST)	    
    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
    public ResponseEntity<HorarioBloqueJson> registrarCitaHorario(@PathVariable("idPaciente") Integer idPaciente,
    		@RequestBody HorarioBloqueJson horarioBloque,    UriComponentsBuilder ucBuilder) {	        
         try{	 
        	 SsCcCita citaModel =  getModeloCita(horarioBloque, idPaciente);	
				     		
     		AuditoriaModel auditoria = new AuditoriaModel();
     		//auditoria.setIdUsuarioAuditoria(EntityGlobal.getInstance().getPersona());//ANT
     		auditoria.setIdUsuarioAuditoria(idPaciente);		
     		auditoria.setUsuarioAuditoria(horarioBloque.getCodigoConsultorio());
     		auditoria.setFechaAuditoria(DateTime.now().toDate());
     		auditoria.setIpAuditoria(null);
     		auditoria.setMacAuditoria(null);
     		
        	 Integer idCita = 0;//citaMedicaService.reservarCitaMedica(citaModel, auditoria);
     			//vistaSelected.setIdCita(idCita);
     		
        	 if(idCita>0){				
        		 //int resultCorreo = personamastService.enviarCorreoRegistroPersonaUsuario(objTransacc);
        		 //boolean resultEnvio = postEnvioCorreoUser(resultCorreo);
        		 //persona.setAccion(""+resultCorreo);//AUX RESULT CORREO
        		 horarioBloque.setIdCita(idCita);
        		 return new ResponseEntity<HorarioBloqueJson>(horarioBloque, HttpStatus.CREATED);	 
        	 }else{
        		 return new ResponseEntity<HorarioBloqueJson>(horarioBloque, HttpStatus.INTERNAL_SERVER_ERROR);
        	 }			     
	     }catch(Exception e){
	        return new ResponseEntity<HorarioBloqueJson>(horarioBloque, HttpStatus.INTERNAL_SERVER_ERROR);
	     }		         	         
    }	
    
	 
    /** Envio de correo de una cita

     * @return
     */
    @RequestMapping(value = "/enviocorreo/{idCIta}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
    public ResponseEntity<OpearacionResultJson> enviarCorreoCitas(@PathVariable("idCIta") Integer idCIta) {	       
    	OpearacionResultJson objResult = new OpearacionResultJson();
    	try{
        	int resultMsg = 0; //citaMedicaService.enviarCorreoReservaCita(idCIta, "SOLO_CITA");
        	boolean resultEnvio = postEnvioCorreoUser(objResult,resultMsg);
        	objResult.setOk(resultEnvio);
        	objResult.setEnvioCorreoOperacion(resultEnvio);
        	return new ResponseEntity<OpearacionResultJson>(objResult, HttpStatus.OK);    		
    	}catch(Exception e){
    		Log.error(e, "enviarCorreoCitas");
    		return new ResponseEntity<OpearacionResultJson>(HttpStatus.NOT_FOUND);
    	}    	
    }
    
    /***UTILES CITAS**/
    
    public SsCcCita getModeloCita(HorarioBloqueJson horarioBloque, Integer pacienteId){		
    	/**Cita*/
    	SsCcCita modelo = new SsCcCita();
    	modelo.setIdCita(horarioBloque.getIdCita());
    	modelo.setIdHorario(horarioBloque.getIdHorario());
    	modelo.setFechaCita(horarioBloque.getFechaInicio()); //****
    	modelo.setFechaLlegada(horarioBloque.getFechaInicio());
    	
    	modelo.setIndicadorExcedente(Constant.INT_INACTIVO);
    	modelo.setIndicadorHistoriaClinica(Constant.INT_INACTIVO);
    	modelo.setDuracionPromedio(horarioBloque.getTiempoPromedioAtencion());
    	modelo.setDuracionReal(horarioBloque.getTiempoPromedioAtencion());
    	modelo.setTipoCita(Constant.TIPO_CITA_DEFAULT);
    	modelo.setIdPaciente(pacienteId);//SETEAMOS EL ID DEL PACIENTE
    	modelo.setIndicadorInasistencia(Constant.INT_INACTIVO);
    	modelo.setIndicadorReemplazo(Constant.INT_INACTIVO);
    	modelo.setEstadoDocumento(Constant.ESTADO_DOCUMENTO_APROBADO);//CITA PROGRAMADA
    	modelo.setEstado(Constant.INT_ACTIVO);
    	modelo.setIndicadorRegistroCompartido(Constant.INT_INACTIVO);
    	modelo.setIdTipoAtencion(Constant.INT_INACTIVO);
    	modelo.setIdGrupoAtencion(Constant.INT_INACTIVO);
    	modelo.setIdServicio(horarioBloque.getIdServicio());
    	modelo.setIdMedico(horarioBloque.getMedico());    	
    	modelo.setFechaCitaFecha(TimeCommons.getSoloFecha(horarioBloque.getFechaInicio()).toDate());
    	modelo.setIndicadorWeb(Constant.INT_ACTIVO);
    	
//    	modelo.setCompania(EntityGlobal.getInstance().getCodigoCompanyowner());
//    	modelo.setSucursal(EntityGlobal.getInstance().getCodigoSucursal());
//    	modelo.setUnidadReplicacion(EntityGlobal.getInstance().getUnidadReplicacion());
		return modelo;
    }
    
	/** tratameinto del resultado del enio de correos...mostrar mensajes
	 * @param reusltMsg
	 * @return
	 */
	public boolean postEnvioCorreoUser(OpearacionResultJson objResult,int reusltMsg) {
		boolean result = false;
		/**MOSTRAR MENSAJES */
		String mensaje = UtilesRest.getMsgResultCorreo(reusltMsg);
		objResult.setCodigoOperacion(""+reusltMsg);		
		objResult.setMensajeOperacion(mensaje);
		return result;
	}    
    
}
