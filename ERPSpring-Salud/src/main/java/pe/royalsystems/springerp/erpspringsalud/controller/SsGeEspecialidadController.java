package pe.royalsystems.springerp.erpspringsalud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import pe.royalsystems.springerp.erpspringsalud.model.JsonViewInterfaces;
import pe.royalsystems.springerp.erpspringsalud.model.SsGeEspecialidadJson;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewAssembler;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;

import pe.royalsystems.springerp.service.EspecialidadService;
import pe.royalsystems.springerp.service.SsGeEspecialidadService;


@RestController
@RequestMapping("/api/salud/especialidad") 
public class SsGeEspecialidadController {
	
	@Autowired
	EspecialidadService especialidadService ;
	
	@Autowired
	SsGeEspecialidadService ssGeEspecialidadService;
	
	 private JsonViewAssembler<SsGeEspecialidad, SsGeEspecialidadJson> jsonAssemb = 
			 new JsonViewAssembler<SsGeEspecialidad, SsGeEspecialidadJson>(SsGeEspecialidadJson.class);

	 private JsonViewAssembler<SsGeEspecialidadJson, SsGeEspecialidad> jsonAssembInverso = 
			 new JsonViewAssembler<SsGeEspecialidadJson, SsGeEspecialidad>(SsGeEspecialidad.class);


	     
	    /** listar todos los elementos ...
	     * @return
	     */
	    @RequestMapping(value = "/all/", method = RequestMethod.GET)	   
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)	    
	    public ResponseEntity<List<SsGeEspecialidadJson>> listAllElementos() {
	        List<SsGeEspecialidad> users = especialidadService.
	        		listarEspecialidades(new SsGeEspecialidad());	        	        	       	        
	        
	        if(users.isEmpty()){
	            return new ResponseEntity<List<SsGeEspecialidadJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<SsGeEspecialidadJson> usersJson = jsonAssemb.getJsonListDozer(users);		    
		        
		        return new ResponseEntity<List<SsGeEspecialidadJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	 
	 
	   
	     
	    /** Retornar un Objeto por Id
	     * @param id
	     * @return
	     */
	    @RequestMapping(value = "/especialidad/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<SsGeEspecialidadJson> getElementoId(@PathVariable("id") Integer id) {	       
	    	SsGeEspecialidad filtro = new  SsGeEspecialidad();
	    	filtro.setIdEspecialidad(id);	    	
	        SsGeEspecialidad objResult = ssGeEspecialidadService.buscarSsGeEspecialidadID(filtro);
	        if (objResult == null) {	            
	            return new ResponseEntity<SsGeEspecialidadJson>(HttpStatus.NOT_FOUND);
	        }else{	        	
	        	return new ResponseEntity<SsGeEspecialidadJson>(jsonAssemb.getJsonObject(objResult), HttpStatus.OK);	
	        }
	    }
	 

	    
	    /** Listado POST, con filtros variados, SIN PAGINAR
	     * @param usuario
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/especialidad/", method = RequestMethod.POST)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<SsGeEspecialidadJson>> listElementos(@RequestBody SsGeEspecialidadJson especialidad, UriComponentsBuilder ucBuilder) {
	        //System.out.println("Fetching User with id " + usuario);
	    	
	    	List<SsGeEspecialidad> users = especialidadService.listarEspecialidades(
	    			jsonAssembInverso.getJsonObject(especialidad));
	        if(users.isEmpty()){
	            return new ResponseEntity<List<SsGeEspecialidadJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<SsGeEspecialidadJson> usersJson = jsonAssemb.getJsonListDozer(users);		    
		        
		        return new ResponseEntity<List<SsGeEspecialidadJson>>(usersJson, HttpStatus.OK);	        	
	        }
	        	     
	    }
	    
	    /** Listado POST, con filtros variados, PAGINADO
	     * @param usuario
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/especialidad/pag/", method = RequestMethod.POST)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<SsGeEspecialidadJson>> listElementosPaginado(@RequestBody SsGeEspecialidadJson especialidad, UriComponentsBuilder ucBuilder) {
	        //System.out.println("Fetching User with id " + usuario);
	    	SsGeEspecialidad filtro = jsonAssembInverso.getJsonObject(especialidad);
	    	filtro.setPaginable(true);
	    	List<SsGeEspecialidad> listado = ssGeEspecialidadService.listarTablaSsGeEspecialidad(
	    			filtro);	        	        	       	        	        
	        if(listado.isEmpty()){
	            return new ResponseEntity<List<SsGeEspecialidadJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
	        	//Set valor de la cuenta para la paginacion...
	        	int cuenta = ssGeEspecialidadService.contadorDeTotales(filtro);
	        	
	        	List<SsGeEspecialidadJson> listadoJson = jsonAssemb.getJsonListDozer(listado);
	        	
	        	//listado.stream().forEach(u -> {u.setContadorTotal(cuenta);});	SDK 8	        	        		        			        
	        	for(SsGeEspecialidadJson obj : listadoJson){
	        		obj.setContadorTotal(cuenta);
	        	}
		        return new ResponseEntity<List<SsGeEspecialidadJson>>(listadoJson, HttpStatus.OK);	        	
	        }
	        	     
	    }
}
