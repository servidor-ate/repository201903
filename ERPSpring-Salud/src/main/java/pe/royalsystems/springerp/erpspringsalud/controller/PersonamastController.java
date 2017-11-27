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
import pe.royalsystems.springerp.erpspringsalud.model.OpearacionResultJson;
import pe.royalsystems.springerp.erpspringsalud.model.PersonamastJson;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewAssembler;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;
import pe.royalsystems.springerp.erpspringsalud.util.UtilesRest;
import pe.royalsystems.springerp.model.domain.Personamast;
import pe.royalsystems.springerp.service.PersonamastService;

@RestController
@RequestMapping("/api/salud/persona") 
public class PersonamastController {

	@Autowired
	PersonamastService personamastService ; 
	
	 private JsonViewAssembler<Personamast, PersonamastJson> jsonAssemb = 
			 new JsonViewAssembler<Personamast, PersonamastJson>(PersonamastJson.class);

	 private JsonViewAssembler<PersonamastJson, Personamast> jsonAssembInverso = 
			 new JsonViewAssembler<PersonamastJson, Personamast>(Personamast.class);


	     
	    /** listar todos los elementos ...
	     * @return
	     */
	    @RequestMapping(value = "/all/", method = RequestMethod.GET)	   
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<PersonamastJson>> listAllElementos() {
	        List<Personamast> users = personamastService.listarPersonamast(new Personamast(),false);	        	        	       	        
	        
	        if(users.isEmpty()){
	            return new ResponseEntity<List<PersonamastJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<PersonamastJson> usersJson = jsonAssemb.getJsonListDozer(users);		    
		        
		        return new ResponseEntity<List<PersonamastJson>>(usersJson, HttpStatus.OK);	        	
	        }
	    }
	 
	 
	   
	     
	    /** Retornar un Objeto por Id
	     * @param id
	     * @return
	     */
	    @RequestMapping(value = "/persona/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<PersonamastJson> getElementoId(@PathVariable("id") Integer id) {	       
	        Personamast objResult = personamastService.obtenerPorId(id);
	        if (objResult == null) {	            
	            return new ResponseEntity<PersonamastJson>(HttpStatus.NOT_FOUND);
	        }else{	        	
	        	return new ResponseEntity<PersonamastJson>(jsonAssemb.getJsonObject(objResult), HttpStatus.OK);	
	        }
	    }
	 

	    
	    /** Listado POST, con filtros variados, SIN PAGINAR
	     * @param usuario
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/personas/", method = RequestMethod.POST)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<PersonamastJson>> listElementos(@RequestBody PersonamastJson persona, UriComponentsBuilder ucBuilder) {
	        //System.out.println("Fetching User with id " + usuario);
	    	
	    	List<Personamast> users = personamastService.listarPersonamast(
	    			jsonAssembInverso.getJsonObject(persona), false);
	        if(users.isEmpty()){
	            return new ResponseEntity<List<PersonamastJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
		        List<PersonamastJson> usersJson = jsonAssemb.getJsonListDozer(users);		    
		        
		        return new ResponseEntity<List<PersonamastJson>>(usersJson, HttpStatus.OK);	        	
	        }
	        	     
	    }
	    
	    /** Listado POST, con filtros variados, PAGINADO
	     * @param usuario
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/personas/pag/", method = RequestMethod.POST)    		
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<List<PersonamastJson>> listElementosPaginado(@RequestBody PersonamastJson persona, UriComponentsBuilder ucBuilder) {
	        //System.out.println("Fetching User with id " + usuario);
	    	Personamast filtro = jsonAssembInverso.getJsonObject(persona);
	    	List<Personamast> listado = personamastService.listarPersonamast(
	    			filtro,true);	        	        	       	        	        
	        if(listado.isEmpty()){
	            return new ResponseEntity<List<PersonamastJson>>(HttpStatus.NO_CONTENT);	            
	        }else{
	        	//Set valor de la cuenta para la paginacion...
	        	int cuenta = personamastService.contadorDeTotales(filtro);
	        	
	        	List<PersonamastJson> listadoJson = jsonAssemb.getJsonListDozer(listado);
	        	
	        	//listado.stream().forEach(u -> {u.setContadorTotal(cuenta);});	        		        	        		        			        
	        	for(PersonamastJson obj : listadoJson){
	        		obj.setContadorTotal(cuenta);
	        	}
		        return new ResponseEntity<List<PersonamastJson>>(listadoJson, HttpStatus.OK);	        	
	        }
	        	     
	    }
	    	     
	    
	    /** Guardar nuevo
	     * @param persona
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/persona/i/", method = RequestMethod.POST)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<PersonamastJson> guardar(@RequestBody PersonamastJson persona,    UriComponentsBuilder ucBuilder) {	       
	         try{	 	 	
	        	 Personamast objTransacc = jsonAssembInverso.getJsonObject(persona);
	        	 int result = personamastService.guardarPersonamast(objTransacc);
	        	 if(result > 0){
	        		 objTransacc.setPersona(result);
	        		 persona.setPersona(result);
	        	 }	
			     return new ResponseEntity<PersonamastJson>(persona, HttpStatus.CREATED);
		     }catch(Exception e){
		        return new ResponseEntity<PersonamastJson>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		     }		         	         
	    }
	    
	    /**Actualizar
	     * @param persona
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/persona/u/", method = RequestMethod.POST)
	    //@RequestMapping(value = "/user/u/", method = RequestMethod.PUT)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<PersonamastJson> actualizar(@RequestBody PersonamastJson persona,    UriComponentsBuilder ucBuilder) {	        
	         try{	 
	        	 int result = 0;
	        	 //Personamast objTransacc = jsonAssembInverso.getJsonObject(persona);
	        	 Personamast objTransacc =  personamastService.obtenerPorId(persona.getPersona());
	        	 if(objTransacc!=null){
	        		 //Actualizar Objeto obtenido con los valores del Objeto parametro recibido...
	        		 objTransacc = jsonAssembInverso.getJsonObjectDestino(persona, objTransacc);
		        	 result = personamastService.actualizar(objTransacc);
		        	 if(result > 0){
		        		 //persona.setUsuaId(result);
		        	 }		        		 
	        	 }
	        	 if(result > 0){
	        		 return new ResponseEntity<PersonamastJson>(persona, HttpStatus.CREATED);	 
	        	 }else{
	        		 return new ResponseEntity<PersonamastJson>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
	        	 }			     
		     }catch(Exception e){
		        return new ResponseEntity<PersonamastJson>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		     }		         	         
	    }
	    
	    /**Eliminar
	     * @param persona
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/persona/d/", method = RequestMethod.DELETE)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<PersonamastJson> eliminar(@RequestBody PersonamastJson persona,    UriComponentsBuilder ucBuilder) {	        
	         try{	 
	        	 int result = 0;
	        	 //Personamast objTransacc = jsonAssembInverso.getJsonObject(persona);
	        	 Personamast objTransacc =  personamastService.obtenerPorId(persona.getPersona());
	        	 if(objTransacc!=null){
	        		 //Actualizar Objeto obtenido con los valores del Objeto parametro recibido...
	        		 objTransacc = jsonAssembInverso.getJsonObjectDestino(persona, objTransacc);
		        	 result = personamastService.eliminarPersonamast(objTransacc);
		        	 if(result > 0){
		        		 //persona.setUsuaId(result);
		        	 }		        		 
	        	 }
	        	 if(result > 0){
	        		 return new ResponseEntity<PersonamastJson>(persona, HttpStatus.CREATED);	 
	        	 }else{
	        		 return new ResponseEntity<PersonamastJson>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
	        	 }			     
		     }catch(Exception e){
		        return new ResponseEntity<PersonamastJson>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		     }	
	         
	    }	 	  		 
	

	    /**Regsitrar la persona - paciente - usuario
	     * @param persona
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/persona/registrar", method = RequestMethod.POST)	    
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<PersonamastJson> registrarPersonaUsuario(@RequestBody PersonamastJson persona,    UriComponentsBuilder ucBuilder) {	        
	         try{	 
	        	 Personamast objTransacc = jsonAssembInverso.getJsonObject(persona);
	        	 int result= personamastService.guardarUsuarioPaciente(objTransacc);	
					
	        	 if(result>0){				
	        		 int resultCorreo = personamastService.enviarCorreoRegistroPersonaUsuario(objTransacc);
	        		 //boolean resultEnvio = postEnvioCorreoUser(resultCorreo);
	        		 persona.setAccion(""+resultCorreo);//AUX RESULT CORREO
	        		 
	        		 return new ResponseEntity<PersonamastJson>(persona, HttpStatus.CREATED);	 
	        	 }else{
	        		 return new ResponseEntity<PersonamastJson>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
	        	 }			     
		     }catch(Exception e){
		        return new ResponseEntity<PersonamastJson>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		     }		         	         
	    }
	    
	    /**Envio de correo ... a una persona - usuario
	     * @param persona
	     * @param ucBuilder
	     * @return
	     */
	    @RequestMapping(value = "/registropersona/enviocorreo", method = RequestMethod.POST)	    
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<OpearacionResultJson> enviarCorreoPersonaUsuario(@RequestBody PersonamastJson persona,    UriComponentsBuilder ucBuilder) {	        
	         try{	
	        	 OpearacionResultJson objResult = new OpearacionResultJson();
	        	 Personamast objTransacc = jsonAssembInverso.getJsonObject(persona);
	         	int resultMsg = personamastService.enviarCorreoRegistroPersonaUsuario(objTransacc);
	        	boolean resultEnvio = postEnvioCorreoUser(objResult,resultMsg);
	        	objResult.setOk(resultEnvio);
	        	objResult.setEnvioCorreoOperacion(resultEnvio);
	        	return new ResponseEntity<OpearacionResultJson>(objResult, HttpStatus.OK);    				    
		     }catch(Exception e){
		    	 return new ResponseEntity<OpearacionResultJson>(HttpStatus.NOT_FOUND);
		     }		         	         
	    }	    
	    
	    
		/** tratameinto del resultado del enio de correos...mostrar mensajes
		 * @param reusltMsg
		 * @return
		 */
		public boolean postEnvioCorreoUser(OpearacionResultJson objResult, int reusltMsg) {
			boolean result = false;
			/**MOSTRAR MENSAJES */
			String mensaje = UtilesRest.getMsgResultCorreo(reusltMsg);
			objResult.setCodigoOperacion(""+reusltMsg);		
			objResult.setMensajeOperacion(mensaje);
			return result;
		}
}
