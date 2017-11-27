package pe.royalsystems.springerp.erpspringsalud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import pe.royalsystems.springerp.erpspringsalud.model.JsonViewInterfaces;
import pe.royalsystems.springerp.erpspringsalud.model.SgAgenteJson;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewAssembler;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;
import pe.royalsystems.springerp.model.domain.SgAgente;
import pe.royalsystems.springerp.service.SgAgenteService;

@RestController
@RequestMapping("/api/salud/agente") 
public class SgAgenteController {

	@Autowired
	SgAgenteService sgAgenteService ; 
	
	 private JsonViewAssembler<SgAgente, SgAgenteJson> jsonAssemb = 
			 new JsonViewAssembler<SgAgente, SgAgenteJson>(SgAgenteJson.class);

	 private JsonViewAssembler<SgAgenteJson, SgAgente> jsonAssembInverso = 
			 new JsonViewAssembler<SgAgenteJson, SgAgente>(SgAgente.class);

	    /** Obtener todos los elementos
	     * @return
	     */
	    @RequestMapping(value = "/all", method = RequestMethod.GET)	   
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)	    
	    public ResponseEntity<List<SgAgenteJson>> listAllElementos() {
	    	SgAgente objRest = new SgAgente();	    	
	        List<SgAgente> listaElementos = sgAgenteService.listarElementos(objRest,false);	        	        	       	               
	        if(listaElementos.isEmpty()){
	            return new ResponseEntity<List<SgAgenteJson>>(HttpStatus.NO_CONTENT);	            
	        }else{	        	
	        	
	        	List<SgAgenteJson> listaElementoJson = jsonAssemb.getJsonList(listaElementos);
	        	//List<SgAgenteJson> listaElementoJson = new  ArrayList<SgAgenteJson>();
//	        	for(SgAgente  objModel : listaElementos){
//	        		//AHORA PK
//	        		SgAgenteJson objJson = jsonAssemb.getJsonObject(objModel);        		        		
//	        		//objJson.setActivo(objModel.getId().getActivo());        		   	
//	        		listaElementoJson.add(objJson);
//	        	}  
	        	
		        return new ResponseEntity<List<SgAgenteJson>>(listaElementoJson, HttpStatus.OK);	        	
	        }
	    }
	    
	    /** Obtener un Usuario por el LOGIN
	     * @param usuario
	     * @param clave
	     * @return
	     */
	    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<SgAgenteJson> getLogin(@RequestBody SgAgenteJson objRest,UriComponentsBuilder ucBuilder) {
	    	SgAgente filtro = jsonAssembInverso.getJsonObject(objRest);
	    	SgAgente user = sgAgenteService.validarLogin(filtro);
	        if (user == null) {	            
	            return new ResponseEntity<SgAgenteJson>(HttpStatus.NOT_FOUND);
	        }else{	        	
	        	return new ResponseEntity<SgAgenteJson>(jsonAssemb.getJsonObject(user), HttpStatus.OK);	
	        }
	    }
	    	    
	 
}
