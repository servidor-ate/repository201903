package pe.royalsystems.springerp.erpspringsalud.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import pe.royalsystems.springerp.erpspringsalud.model.JsonViewInterfaces;
import pe.royalsystems.springerp.erpspringsalud.model.VwEspecialidadMedicoJson;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewAssembler;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;
import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.domain.vista.VwEspecialidadMedico;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.EspecialidadService;
import pe.royalsystems.springerp.service.SsGeEspecialidadService;


@RestController
@RequestMapping("/api/salud/especialidadmedico") 
public class VwEspecialidadMedicoController {
	
	@Autowired
	EspecialidadService especialidadService ; 
	
	@Autowired
	SsGeEspecialidadService ssGeEspecialidadService;
	
	 private JsonViewAssembler<VwEspecialidadMedico, VwEspecialidadMedicoJson> jsonAssemb = 
			 new JsonViewAssembler<VwEspecialidadMedico, VwEspecialidadMedicoJson>(VwEspecialidadMedicoJson.class);

	 private JsonViewAssembler<VwEspecialidadMedicoJson, VwEspecialidadMedico> jsonAssembInverso = 
			 new JsonViewAssembler<VwEspecialidadMedicoJson, VwEspecialidadMedico>(VwEspecialidadMedico.class);


	     
	    /** listar todos los elementos ...
	     * @return
	     */
	    @RequestMapping(value = "/all/", method = RequestMethod.GET)	   
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)	    
	    public ResponseEntity<List<VwEspecialidadMedicoJson>> listAllElementos() {
	    	
	    	VwEspecialidadMedico filtro = new VwEspecialidadMedico();
	    	filtro.setPaginable(false);
	        List<VwEspecialidadMedico> users = especialidadService.listarVwEspecialidadMedico(filtro);	        	        	       	        
	        
	        if(users.isEmpty()){
	            return new ResponseEntity<List<VwEspecialidadMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwEspecialidadMedicoJson> usersJson = jsonAssemb.getJsonListDozer(users);		    
		        
		        return new ResponseEntity<List<VwEspecialidadMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	 

	    
	    /** Listado POST, con filtros variados, SIN PAGINAR
	     * @param usuario
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/consulta/", method = RequestMethod.POST)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<VwEspecialidadMedicoJson>> listElementos(@RequestBody VwEspecialidadMedicoJson filtro, UriComponentsBuilder ucBuilder) {
	    	filtro.setPaginable(false);
	    	List<VwEspecialidadMedico> users = especialidadService.listarVwEspecialidadMedico(
	    			jsonAssembInverso.getJsonObject(filtro));
	        if(users.isEmpty()){
	            return new ResponseEntity<List<VwEspecialidadMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwEspecialidadMedicoJson> usersJson = jsonAssemb.getJsonListDozer(users);		    
		        
		        return new ResponseEntity<List<VwEspecialidadMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	   
	     
	    /** listar por el ID del medico
	     * @param idmedico
	     * @return
	     */
	    @RequestMapping(value = "/pormedico/{idmedico}", method = RequestMethod.GET)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<VwEspecialidadMedicoJson>> listPorMedico(@PathVariable("idmedico") Integer idmedico) {	       
	    	VwEspecialidadMedico filtro = new  VwEspecialidadMedico();
	    	filtro.setIdMedico(idmedico);	 
			filtro.setTipoPersona(Constant.PERSONA_NATURAL);
			//filtro.setEstadoEspecialidad(Constant.INT_ACTIVO);
			filtro.setOrdernable(true);
			filtro.setAtributoOrdenacion("nombre");
	    	
	        List<VwEspecialidadMedico> listaResult = especialidadService.listarVwEspecialidadMedico(filtro);
	        if(listaResult == null || listaResult.isEmpty()){
	            return new ResponseEntity<List<VwEspecialidadMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwEspecialidadMedicoJson> usersJson = jsonAssemb.getJsonListDozer(listaResult);
		        return new ResponseEntity<List<VwEspecialidadMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	 
	    /** listar por el ID de la especialidad
	     * @param idmedico
	     * @return
	     */
	    @RequestMapping(value = "/porespecialidad/{idespecialidad}", method = RequestMethod.GET)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<VwEspecialidadMedicoJson>> listPorEspecialidad(@PathVariable("idespecialidad") Integer idespecialidad) {	       
	    	VwEspecialidadMedico filtro = new  VwEspecialidadMedico();
			filtro.setIdEspecialidad(idespecialidad);
			filtro.setTipoPersona(Constant.PERSONA_NATURAL);
			filtro.setEstadoPersona(Constant.ACTIVO);
			filtro.setOrdernable(true);
			filtro.setAtributoOrdenacion("nombreCompleto");
	    	
	        List<VwEspecialidadMedico> listaResult = especialidadService.listarVwEspecialidadMedico(filtro);
	        if(listaResult == null || listaResult.isEmpty()){
	            return new ResponseEntity<List<VwEspecialidadMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwEspecialidadMedicoJson> usersJson = jsonAssemb.getJsonListDozer(listaResult);
		        return new ResponseEntity<List<VwEspecialidadMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	    
	    
	    /** listar por el ID de la especialidad y hacer el cruce con los Favoritos-Medicos de un Agente
	     * @param idespecialidad
	     * @param idagente
	     * @return
	     */
	    @RequestMapping(value = "/porespecialidad/med_favoritos/{idespecialidad}/{idagente}", method = RequestMethod.GET)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<VwEspecialidadMedicoJson>> listPorEspecialidadMedicosFavoritos(
	    		@PathVariable("idespecialidad") Integer idespecialidad,
	    		@PathVariable("idagente") Integer idagente
	    		) {	       
	    	VwEspecialidadMedico filtro = new  VwEspecialidadMedico();
			filtro.setIdEspecialidad(idespecialidad);
			filtro.setTipoPersona(Constant.PERSONA_NATURAL);
			filtro.setEstadoPersona(Constant.ACTIVO);
			filtro.setOrdernable(true);
			filtro.setAtributoOrdenacion("nombreCompleto");
	    	
	        List<VwEspecialidadMedico> listaResult = especialidadService.listarVwEspecialidadMedicoFavoritos(filtro,
	        		idagente,Constant.FAVORITO_TABLA_MEDICO,true,null,null);
	        if(listaResult == null || listaResult.isEmpty()){
	            return new ResponseEntity<List<VwEspecialidadMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{	        		        	
		        List<VwEspecialidadMedicoJson> usersJson = jsonAssemb.getJsonListDozer(listaResult);
		      //usar variables correctas del MAPEO  ***JRE_1.8 
		        usersJson.forEach(emJson -> {
		        								emJson.setIndicaFavorito(emJson.isBool_1());
		        								emJson.setIconoFavorito(emJson.getString1());
		        								emJson.setIdFavorito(emJson.getInt_1());
		        								emJson.setFavoritoSecuencia(emJson.getInt_2());
		        							} );
		        
		        return new ResponseEntity<List<VwEspecialidadMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	    

	    /** Listar por el ID de la especialidad y una fecha que corresponda al horario del medico (Si tuviese)
	     * @param idespecialidad
	     * @param yyyyMMdd
	     * @param cant_dias_post
	     * @return
	     */
	    @RequestMapping(value = "/porespecialidad/horario/{idespecialidad}/{yyyyMMdd}/{cant_dias_post}/", method = RequestMethod.GET)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<VwEspecialidadMedicoJson>> listPorEspecialidadHorario(
	    		@PathVariable("idespecialidad") Integer idespecialidad,
	    		@PathVariable("yyyyMMdd") String fechaformato,
	    		@PathVariable("cant_dias_post") Integer cant_dias_post
	    		) {	       
	    	VwEspecialidadMedico filtro = new  VwEspecialidadMedico();
			filtro.setIdEspecialidad(idespecialidad);
			filtro.setTipoPersona(Constant.PERSONA_NATURAL);
			filtro.setEstadoPersona(Constant.ACTIVO);
			filtro.setOrdernable(true);
			filtro.setAtributoOrdenacion("nombreCompleto");
	    	//
	    	Date fechaFiltroInicio = null;
	    	Date fechaFiltroFin = null;
			if(UtilesCommons.noEsVacio(fechaformato)){
				fechaFiltroInicio = UtilesCommons.getDateFormat("yyyyMMdd", fechaformato);
			}				
	    	if(cant_dias_post > 0 && fechaFiltroInicio != null){
	    		//Rango de fechas	    		
	    		fechaFiltroFin = UtilesCommons.fechaMasNumeroDias(fechaFiltroInicio,cant_dias_post);	    		
	    	}
	    	
	        List<VwEspecialidadMedico> listaResult = especialidadService.listarVwEspecialidadMedicoConHorarios(
	        		filtro,fechaFiltroInicio,fechaFiltroFin);
	        if(listaResult == null || listaResult.isEmpty()){
	            return new ResponseEntity<List<VwEspecialidadMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwEspecialidadMedicoJson> usersJson = jsonAssemb.getJsonListDozer(listaResult);
		        return new ResponseEntity<List<VwEspecialidadMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }	    
	    
	    /** Listar por el ID de la especialidad y una fecha que corresponda al horario del medico (Si tuviese)
	     * y hacer el cruce con los Favoritos-Medicos de un Agente
	     * @param idespecialidad
	     * @param fechaformato
	     * @param cant_dias_post
	     * @param idagente
	     * @return
	     */
	    @RequestMapping(value = "/porespecialidad/horario/med_favoritos/{idespecialidad}/{yyyyMMdd}/{cant_dias_post}/{idagente}", method = RequestMethod.GET)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<VwEspecialidadMedicoJson>> listPorEspecialidadHorarioMedicosFavoritos(
	    		@PathVariable("idespecialidad") Integer idespecialidad,
	    		@PathVariable("yyyyMMdd") String fechaformato,
	    		@PathVariable("cant_dias_post") Integer cant_dias_post,
	    		@PathVariable("idagente") Integer idagente
	    		) {	       
	    	VwEspecialidadMedico filtro = new  VwEspecialidadMedico();
			filtro.setIdEspecialidad(idespecialidad);
			filtro.setTipoPersona(Constant.PERSONA_NATURAL);
			filtro.setEstadoPersona(Constant.ACTIVO);
			filtro.setOrdernable(true);
			filtro.setAtributoOrdenacion("nombreCompleto");
	    	//
	    	Date fechaFiltroInicio = null;
	    	Date fechaFiltroFin = null;
			if(UtilesCommons.noEsVacio(fechaformato)){
				fechaFiltroInicio = UtilesCommons.getDateFormat("yyyyMMdd", fechaformato);
			}				
	    	if(cant_dias_post > 0 && fechaFiltroInicio != null){
	    		//Rango de fechas	    		
	    		fechaFiltroFin = UtilesCommons.fechaMasNumeroDias(fechaFiltroInicio,cant_dias_post);	    		
	    	}
	    	List<VwEspecialidadMedico> listaResult = especialidadService.listarVwEspecialidadMedicoFavoritos(filtro,
	        		idagente,Constant.FAVORITO_TABLA_MEDICO,true,fechaFiltroInicio,fechaFiltroFin);
	    	
	        if(listaResult == null || listaResult.isEmpty()){
	            return new ResponseEntity<List<VwEspecialidadMedicoJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<VwEspecialidadMedicoJson> usersJson = jsonAssemb.getJsonListDozer(listaResult);
		        
			      //usar variables correctas del MAPEO  ***JRE_1.8 
		        usersJson.forEach(emJson -> {
		        								emJson.setIndicaFavorito(emJson.isBool_1());
		        								emJson.setIconoFavorito(emJson.getString1());
		        								emJson.setIdFavorito(emJson.getInt_1());
		        								emJson.setFavoritoSecuencia(emJson.getInt_2());
		        							} );

		        
		        return new ResponseEntity<List<VwEspecialidadMedicoJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }	
	    
}
