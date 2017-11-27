package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.royalsystems.springerp.commons.model.Email;
import pe.royalsystems.springerp.commons.service.EmailService;
import pe.royalsystems.springerp.model.domain.MaMiscelaneosDetalle;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.EmailGenericService;
import pe.royalsystems.springerp.service.MaMiscelaneosDetalleService;
import pe.royalsystems.springerp.service.utiles.Utiles;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service("emailGenericService")
public class EmailGenericServiceImpl implements EmailGenericService {


	@Autowired
	private MaMiscelaneosDetalleService maMiscelaneosDetalleService;
	
	@Override
	public int enviarCorreo(Email objCorreo) {
		int resultMsg = 0;
		try{
			/**1: BUSCAR PARAMETROS DE CONEX*/		
			
			/**2: SET PAR|METROS DE CONEXI|N**/
			if(objCorreo!=null){
				if(!objCorreo.isParametrosConexionSet()){
					// BUSCAR PARAMETROS DE CONEX en DB
					MaMiscelaneosDetalle objMisc = new MaMiscelaneosDetalle();
					objMisc.setAplicacionCodigo(Utiles.getPropertyService("PAR_CODE_APP"));
					objMisc.setCompania(Utiles.getPropertyService("PAR_CODE_COMPANY"));
					objMisc.setCodigoTabla(Utiles.getPropertyService("PAR_CODIGOTABLA_VARCORREOS"));
					objMisc.setEstado(Constant.ACTIVO);
					boolean halladoParametrosConex = false;
					List<MaMiscelaneosDetalle>  lista = maMiscelaneosDetalleService.listarElementos(objMisc);
					if(lista!=null){
						if(lista.size()>0){
							halladoParametrosConex = true;
							EmailService.setEmailParametrosConexion(objCorreo,
									lista.get(0).getValorCodigo1(), 
									lista.get(0).getValorCodigo2(),  
									lista.get(0).getValorCodigo3(),  
									lista.get(0).getValorCodigo4(), 
									lista.get(0).getValorCodigo5(),  
									lista.get(0).getValorCodigo6(),   
									lista.get(0).getValorCodigo7()  );
						}
					}
					if(!halladoParametrosConex){
						EmailService.setEmailParametrosConexion(objCorreo,
								Utiles.getPropertyService("PAR_VAL_CORREO_ENVIA"),
								Utiles.getPropertyService("PAR_VAL_CLAVE_CORREO_ENVIA"),
								Utiles.getPropertyService("PAR_VAL_CORREO_HOST"),
								Utiles.getPropertyService("PAR_VAL_CORREO_PORT"),
								Utiles.getPropertyService("PAR_VAL_CORREO_SPORT"),
								Utiles.getPropertyService("PAR_VAL_CORREO_TTL"),
								Utiles.getPropertyService("PAR_VAL_CORREO_ACCOUNT"));
					}					
				}

			}
			/**3: ENVIO CORREOS */
			resultMsg = EmailService.enviarEmail(objCorreo,objCorreo.isEsBodyPlantilla());
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return resultMsg;
	}

	@Override
	public int enviarCorreo(Email objCorreo, String procesoPlantilla) {
		int resultMsg = 0;
		try{
			if(objCorreo!=null){
				/**1: BUSCAR PLANTILLAS PARA EL BODY*/		
				// BUSCAR PARAMETROS DE CONEX en DB
				MaMiscelaneosDetalle objMiscPlant = new MaMiscelaneosDetalle();
				objMiscPlant.setAplicacionCodigo(Utiles.getPropertyService("PAR_CODE_APP"));
				objMiscPlant.setCompania(Utiles.getPropertyService("PAR_CODE_COMPANY"));
				objMiscPlant.setCodigoTabla(Utiles.getPropertyService("PAR_CODIGOTABLA_PLANT_CORREOS"));
				objMiscPlant.setEstado(Constant.ACTIVO);
				objMiscPlant.setValorCodigo1(procesoPlantilla);
				boolean halladoPlantillaCorreo = false;
				String plantillaCorreo = null;
				List<MaMiscelaneosDetalle>  listaPt = maMiscelaneosDetalleService.listarElementos(objMiscPlant);
				if(listaPt!=null){
					if(listaPt.size()>0){
						halladoPlantillaCorreo = true;
						plantillaCorreo = listaPt.get(0).getDataTexto();
					}
				}
				/**2: MATCH VARIABLES CON PLANTILLA CORREO**/
				if(halladoPlantillaCorreo && plantillaCorreo!=null && objCorreo.isEsBodyPlantilla()){
					objCorreo.setBody(plantillaCorreo);					
				}else{
					objCorreo.setEsBodyPlantilla(false);
				}										
			/**3: SET PAR|METROS DE CONEXI|N**/
			
				if(!objCorreo.isParametrosConexionSet()){
					// BUSCAR PARAMETROS DE CONEX en DB
					MaMiscelaneosDetalle objMisc = new MaMiscelaneosDetalle();
					objMisc.setAplicacionCodigo(Utiles.getPropertyService("PAR_CODE_APP"));
					objMisc.setCompania(Utiles.getPropertyService("PAR_CODE_COMPANY"));
					objMisc.setCodigoTabla(Utiles.getPropertyService("PAR_CODIGOTABLA_VARCORREOS"));
					objMisc.setEstado(Constant.ACTIVO);
					boolean halladoParametrosConex = false;
					List<MaMiscelaneosDetalle>  lista = maMiscelaneosDetalleService.listarElementos(objMisc);
					if(lista!=null){
						if(lista.size()>0){
							halladoParametrosConex = true;
							EmailService.setEmailParametrosConexion(objCorreo,
									lista.get(0).getValorCodigo1(), 
									lista.get(0).getValorCodigo2(),  
									lista.get(0).getValorCodigo3(),  
									lista.get(0).getValorCodigo4(), 
									lista.get(0).getValorCodigo5(),  
									lista.get(0).getValorCodigo6(),   
									lista.get(0).getValorCodigo7()  );
						}
					}
					if(!halladoParametrosConex){
						EmailService.setEmailParametrosConexion(objCorreo,
								Utiles.getPropertyService("PAR_VAL_CORREO_ENVIA"),
								Utiles.getPropertyService("PAR_VAL_CLAVE_CORREO_ENVIA"),
								Utiles.getPropertyService("PAR_VAL_CORREO_HOST"),
								Utiles.getPropertyService("PAR_VAL_CORREO_PORT"),
								Utiles.getPropertyService("PAR_VAL_CORREO_SPORT"),
								Utiles.getPropertyService("PAR_VAL_CORREO_TTL"),
								Utiles.getPropertyService("PAR_VAL_CORREO_ACCOUNT"));
					}					
				}

			}								
			/**3: ENVIO CORREOS */
			resultMsg = EmailService.enviarEmail(objCorreo,objCorreo.isEsBodyPlantilla());
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return resultMsg;
	}

	@Override
	public Email getObjetoMail(List<String> listCorreoDestinos, String subject, String body,
                               List<String> listPathFileAtached, Date correoFecha, boolean contienePlantilla) {
		Email email =
				EmailService.construirMail(listCorreoDestinos, subject, body,
						listPathFileAtached, correoFecha);
		email.setEsBodyPlantilla(contienePlantilla);
		return email;
	}

	@Override
	public Email getObjetoMail(List<String> listCorreoDestinos, String subject, String bodyPlantilla,
                               List<String> listPathFileAtached, Date correoFecha, Map<String, String> mapvariablesValores) {
		
		Email email =
				EmailService.construirMail(listCorreoDestinos, subject, bodyPlantilla,
						listPathFileAtached, correoFecha);
		email.setMapvariablesValores(mapvariablesValores);			
		if(mapvariablesValores!=null){
			email.setEsBodyPlantilla(true);	
		}		
		return email;
	}

	@Override
	public int enviarCorreoMixto(List<Email> listaObjCorreo) {
		// TODO Auto-generated method stub
		return 0;
	}



}
