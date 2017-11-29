package pe.royalsystems.springerp.erpspringsalud.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.royalsystems.springerp.erpspringsalud.model.FavoritoDetalleJson;
import pe.royalsystems.springerp.erpspringsalud.model.JsonViewInterfaces;
import pe.royalsystems.springerp.erpspringsalud.model.OpearacionResultJson;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewAssembler;
import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;
import pe.royalsystems.springerp.commons.model.ResultTx;
import pe.royalsystems.springerp.model.domain.SsCcFavorito;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetalle;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetallePK;
import pe.royalsystems.springerp.service.SsCcFavoritoDetalleService;

@RestController
@RequestMapping("/api/salud/favoritos") 
public class SsCcFavoritoController {

	@Autowired
	SsCcFavoritoDetalleService ssCcFavoritoDetalleService;
	
	
	 private JsonViewAssembler<SsCcFavoritoDetalle, FavoritoDetalleJson> jsonAssemb = 
			 new JsonViewAssembler<SsCcFavoritoDetalle, FavoritoDetalleJson>(FavoritoDetalleJson.class);

	 private JsonViewAssembler<FavoritoDetalleJson, SsCcFavoritoDetalle> jsonAssembInverso = 
			 new JsonViewAssembler<FavoritoDetalleJson, SsCcFavoritoDetalle>(SsCcFavoritoDetalle.class);

	 
	    /** Obtener todos los elementos
	     * @return
	     */
	    @RequestMapping(value = "/poragente/{idAgente}", method = RequestMethod.GET)	   
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)	    
	    public ResponseEntity<List<FavoritoDetalleJson>> listAllElementos(
	    		@PathVariable("idAgente") Integer idAgente
	    		) {
	    	SsCcFavoritoDetalle objRest = new SsCcFavoritoDetalle();
	    	objRest.setSsCcFavorito(new SsCcFavorito());
	    	objRest.getSsCcFavorito().setIdAgente(idAgente);
	        List<SsCcFavoritoDetalle> listaElementos = ssCcFavoritoDetalleService.listarElementos(objRest,false);	        	        	       	               
	        if(listaElementos.isEmpty()){
	            return new ResponseEntity<List<FavoritoDetalleJson>>(HttpStatus.NO_CONTENT);	            
	        }else{	        	
	        	List<FavoritoDetalleJson> listaElementoJson = new  ArrayList<FavoritoDetalleJson>();
	        	//mapear lista **
	        	for(SsCcFavoritoDetalle detalleFav : listaElementos){
	        		FavoritoDetalleJson favJson = jsonAssemb.getJsonObjectMultiple(detalleFav,
	        				detalleFav.getId(),
	        				detalleFav.getSsCcFavorito());
	        		listaElementoJson.add(favJson);
	        	}
	        	
	        	//List<FavoritoDetalleJson> listaElementoJson = jsonAssemb.getJsonList(listaElementos);
		        return new ResponseEntity<List<FavoritoDetalleJson>>(listaElementoJson, HttpStatus.OK);	        	
	        }
	    }
	    
	    

	    /** Registrar favorito detalle de un AGENTE (Cabecera si no esistiere) del tipo de tabla MEDICO
	     * @param idAgente
	     * @param idMedico
	     * @return
	     */
	    @RequestMapping(value = "/nuevo/medico/{idAgente}/{idMedico}", method = RequestMethod.POST)	    
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<FavoritoDetalleJson> registrarAgentePacienteMedico(
	    		@PathVariable("idAgente") Integer idAgente,
	    		@PathVariable("idMedico") Integer idMedico
	    		//,
	    		//@RequestBody HorarioBloqueJson horarioBloque,    UriComponentsBuilder ucBuilder
	    		) {
	    	FavoritoDetalleJson objFavoritoDet = new FavoritoDetalleJson();
	         try{
	        	 ResultTx<SsCcFavoritoDetalle> result = 
	        			 ssCcFavoritoDetalleService.guardarDefaultFavoritoMedico(idAgente, idMedico);
	        	 if(result.isOk()){				
	        		 //mapear y retornar ...
	        		 objFavoritoDet = jsonAssemb.getJsonObjectMultiple(result.getResult(),
	        				 result.getResult().getId(),
	        				 result.getResult().getSsCcFavorito());	        		 
	        		 return new ResponseEntity<FavoritoDetalleJson>(objFavoritoDet, HttpStatus.CREATED);	 
	        	 }else{
	        		 return new ResponseEntity<FavoritoDetalleJson>(objFavoritoDet, HttpStatus.INTERNAL_SERVER_ERROR);
	        	 }			     
		     }catch(Exception e){
		        return new ResponseEntity<FavoritoDetalleJson>(objFavoritoDet, HttpStatus.INTERNAL_SERVER_ERROR);
		     }		         	         
	    }		    


	    /** Registrar favorito detalle de un AGENTE (Cabecera si no esistiere) del tipo de tabla MEDICO
	     * @param idAgente
	     * @param idEspecialidad
	     * @return
	     */
	    @RequestMapping(value = "/nuevo/especialidad/{idAgente}/{idEspecialidad}", method = RequestMethod.POST)	    
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<FavoritoDetalleJson> registrarFavoritoAgenteEspecialidad(
	    		@PathVariable("idAgente") Integer idAgente,
	    		@PathVariable("idEspecialidad") Integer idEspecialidad
	    		//,
	    		//@RequestBody HorarioBloqueJson horarioBloque,    UriComponentsBuilder ucBuilder
	    		) {
	    	FavoritoDetalleJson objFavoritoDet = new FavoritoDetalleJson();
	         try{
	        	 ResultTx<SsCcFavoritoDetalle> result = 
	        			 ssCcFavoritoDetalleService.guardarDefaultFavoritoEspecialidad(idAgente, idEspecialidad);
	        	 if(result.isOk()){				
	        		 //mapear y retornar ...
	        		 objFavoritoDet = jsonAssemb.getJsonObjectMultiple(result.getResult(),
	        				 result.getResult().getId(),
	        				 result.getResult().getSsCcFavorito());	        		 
	        		 return new ResponseEntity<FavoritoDetalleJson>(objFavoritoDet, HttpStatus.CREATED);	 
	        	 }else{
	        		 return new ResponseEntity<FavoritoDetalleJson>(objFavoritoDet, HttpStatus.INTERNAL_SERVER_ERROR);
	        	 }			     
		     }catch(Exception e){
		        return new ResponseEntity<FavoritoDetalleJson>(objFavoritoDet, HttpStatus.INTERNAL_SERVER_ERROR);
		     }		         	         
	    }
	    

	    /** Permite eliminar un elemento favorito detalle por su PK
	     * @param idFavorito
	     * @param idFavoritoSecuencia
	     * @return
	     */
	    @RequestMapping(value = "/eliminar/detalle/{idFavorito}/{idFavoritoSecuencia}", method = RequestMethod.DELETE)	    
	    @JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
	    public ResponseEntity<OpearacionResultJson> eliminarFavoritoAgente(
	    		@PathVariable("idFavorito") Integer idFavorito,
	    		@PathVariable("idFavoritoSecuencia") Integer idFavoritoSecuencia
	    		//,
	    		//@RequestBody HorarioBloqueJson horarioBloque,    UriComponentsBuilder ucBuilder
	    		) {
	    	OpearacionResultJson objResult = new OpearacionResultJson();
	         try{
	        	 SsCcFavoritoDetallePK favoritoDetDelPk = new SsCcFavoritoDetallePK();
	        	 favoritoDetDelPk.setIdFavorito(idFavorito);
	        	 favoritoDetDelPk.setSecuencia(idFavoritoSecuencia);
	        	 SsCcFavoritoDetalle favoritoDetDel = ssCcFavoritoDetalleService.obtenerPorId(favoritoDetDelPk);
	        	 if(favoritoDetDel!=null){
		        	 int result = ssCcFavoritoDetalleService.eliminar(favoritoDetDel);
		        	 if(result > 0){				
		        		 objResult.setOk(true);       		 
		        		 return new ResponseEntity<OpearacionResultJson>(objResult, HttpStatus.CREATED);	 
		        	 }else{	        		
		        		 return new ResponseEntity<OpearacionResultJson>(objResult, HttpStatus.INTERNAL_SERVER_ERROR);
		        	 }		        		 
	        	 }else{
	        		 return new ResponseEntity<OpearacionResultJson>(objResult, HttpStatus.INTERNAL_SERVER_ERROR);
	        	 }		     
		     }catch(Exception e){
		        return new ResponseEntity<OpearacionResultJson>(objResult, HttpStatus.INTERNAL_SERVER_ERROR);
		     }		         	         
	    }	    
}
