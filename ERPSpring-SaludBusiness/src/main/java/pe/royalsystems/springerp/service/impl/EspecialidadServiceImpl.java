package pe.royalsystems.springerp.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.EspecialidadDao;
import pe.royalsystems.springerp.model.dao.EspecialidadMedicoDao;
import pe.royalsystems.springerp.model.dao.HorarioMedicoDao;
import pe.royalsystems.springerp.model.dao.SsCcFavoritoDetalleDao;
import pe.royalsystems.springerp.model.domain.SsCcFavorito;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetalle;
import pe.royalsystems.springerp.model.domain.SsCcHorario;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;
import pe.royalsystems.springerp.model.domain.vista.VwEspecialidadMedico;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.EspecialidadService;
import pe.royalsystems.springerp.service.utiles.Log;

@Service("especialidadService")
@Transactional(readOnly = true)
public class EspecialidadServiceImpl implements EspecialidadService {
	
	@Autowired
	private EspecialidadDao especialidadDao;
	
	@Autowired
	private EspecialidadMedicoDao especialidadMedicoDao;
	
	@Autowired
	private HorarioMedicoDao horarioDao;

	@Autowired
	private SsCcFavoritoDetalleDao ssCcFavoritoDetalleDao;

	
	
	@Override
	public List<SsGeEspecialidad> listarEspecialidades(SsGeEspecialidad filtro) {
		try{
			return especialidadDao.listarEspecialidades(filtro);
		}catch(Exception ex){
			Log.error(ex, "EspecialidadService :: listarVwEspecialidadMedico");
			return new ArrayList<SsGeEspecialidad>();
		}
	}

	@Override
	public List<VwEspecialidadMedico> listarVwEspecialidadMedico(VwEspecialidadMedico filtro) {
		try{
			return especialidadMedicoDao.listarVwEspecialidadMedico(filtro);
		}catch(Exception ex){
			Log.error(ex, "EspecialidadService :: listarVwEspecialidadMedico");
			return new ArrayList<VwEspecialidadMedico>();
		}
	}
	
	@Override
	public List<VwEspecialidadMedico> listarMedicosPorEspecialidadEnHorario(VwEspecialidadMedico filtro){
		try{
			SsCcHorario filtroHorario = new SsCcHorario();
			List<Integer> medicos = horarioDao.listarMedicosEnHorario(filtroHorario);
			filtro.setAtributoList("idMedico");
			filtro.setListInteger(medicos);
			
			return especialidadMedicoDao.listarVwEspecialidadMedico(filtro);
		}catch(Exception ex){
			Log.error(ex, "EspecialidadService :: listarVwEspecialidadMedicoEnHorario");
			return new ArrayList<VwEspecialidadMedico>();
		}
	}
	
	@Override
	public List<VwEspecialidadMedico> listarEspecialidadesPorMedicoEnHorario(VwEspecialidadMedico filtro){
		try{
			List<Integer> especialidades = horarioDao.listarEspecialidadesEnHorario();
			filtro.setAtributoList("idEspecialidad");
			filtro.setListInteger(especialidades);
			
			return especialidadMedicoDao.listarVwEspecialidadMedico(filtro);
		}catch(Exception ex){
			Log.error(ex, "EspecialidadService :: listarVwEspecialidadMedicoEnHorario");
			return new ArrayList<VwEspecialidadMedico>();
		}
	}

	@Override
	public List<VwEspecialidadMedico> listarVwEspecialidadMedicoFavoritos(VwEspecialidadMedico filtro,
			Integer idAgente,String codTablaFavorito,
			boolean indicaCruceHorarios,Date horarioFechaInicio, Date horarioFechaFin) {
		try{
			final List<Integer> medicosValidosHorario;
			if(indicaCruceHorarios){
				/** Listar ESPECIALIDAD-MEDICO haciendo un cruce con el rango de fechas de acuerdo al HORARIO DEL MEDICO  */
				/**1.- Construir una lista de Fechas (para filtros) con el rango proporcionado
				 *  Logica: traer todos los HORARIOS que cumpla
				 * 	(fechaInicio <= horarioFechaInicio && fechaFin >= horarioFechaInicio) 
				 * 		|| ( fechaFin >= horarioFechaFin && fechaInicio <= horarioFechaFin )
				 * 	y la especialidad enviada 
				 ***/
				SsCcHorario filtroHorario = new SsCcHorario();
				filtroHorario.setIdEspecialidad(filtro.getIdEspecialidad());
				filtroHorario.setNombreConsulta("FILTRO_RANGO_FECHAS");
				filtroHorario.setFechaInicioBusqueda(horarioFechaInicio);
				filtroHorario.setFechaFinBusqueda(horarioFechaFin);
				medicosValidosHorario = horarioDao.listarMedicosEnHorario(filtroHorario);											
			}else{
				medicosValidosHorario = null;
			}

			
			
			/******Listar Medico-especialidad CON CRUCE DE FAVORITOS*****/
			List<VwEspecialidadMedico>  listaMedicosEspecResult = new ArrayList<VwEspecialidadMedico>();
			List<VwEspecialidadMedico>  listaMedicosEspecFavoritos = new ArrayList<VwEspecialidadMedico>();
			List<VwEspecialidadMedico>  listaMedicosEspecNoFavoritos = new ArrayList<VwEspecialidadMedico>();
			
			/**1.- valores def del Filtro MEDICOS-ESPEC */
			filtro.setIdMedico(null);
			
			/**2.- Listar favoritos */
			SsCcFavoritoDetalle favDetFiltro = new SsCcFavoritoDetalle();
			favDetFiltro.setSsCcFavorito(new SsCcFavorito());
			//usar ....codTablaFavorito
			favDetFiltro.getSsCcFavorito().setCodigoTablaFavorito(Constant.FAVORITO_TABLA_MEDICO);
			favDetFiltro.getSsCcFavorito().setIdAgente(idAgente);
			favDetFiltro.setEstado(Constant.ACTIVO);
			List<SsCcFavoritoDetalle>  listaFavDetTemp = ssCcFavoritoDetalleDao.listarElementos(favDetFiltro, false);						
			
			/**OBS: SE HACE USO DE ***JRE_1.8 *****/
			/**3.- Filtrar Favoritos MEDICOS * */	
			if(UtilesCommons.noEsVacio(listaFavDetTemp)){													
				//Agregar los ValorId que no son vacios como List al filtro 'ListInteger'
				filtro.setAtributoList("idMedico");
				filtro.setListInteger(listaFavDetTemp.stream().filter(p -> UtilesCommons.noEsVacio(p.getValorId()))
						.map(e -> e.getValorId())
						.collect(Collectors.toList()));
				if(UtilesCommons.noEsVacio(filtro.getListInteger())){
					filtro.setNombreConsulta("IN_MEDICO"); //***quiza no sea necesaio
					listaMedicosEspecFavoritos = especialidadMedicoDao.listarVwEspecialidadMedico(filtro);	
				}			
				//Agregar valores default a listado favorito
				if(UtilesCommons.noEsVacio(listaMedicosEspecFavoritos)){										
					listaMedicosEspecFavoritos.stream()
						.forEach(me -> {	me.setBool_1(true);//AUX para indicar es boolean
											me.setString1(Constant.ICONFAVORITO_FAVORITO);//AUX para indicar el tipo de icono
											try{
												//AUX para indicar el ID FAVORITO
												Integer valorIdFavorito =listaFavDetTemp.stream()
														.filter(fav -> (""+fav.getValorId()).equals(""+me.getIdMedico()))
														.map(f -> f.getId().getIdFavorito()) // solo el Id favorito
														.limit(1).collect(Collectors.toList()).get(0); // asegurar solo un elemento
												me.setInt_1(valorIdFavorito!=null?valorIdFavorito.intValue():0);
												
												//AUX para indicar el ID FAVORITO DETALLE : SECUENCIA **evaluar usar Util.Optional	
												Integer valorSecuencia = listaFavDetTemp.stream()
														.filter(fav -> (""+fav.getValorId()).equals(""+me.getIdMedico()))
														.map(f -> f.getId().getSecuencia()) // solo el Id DETALLE: SECUENCIA
														.limit(1).collect(Collectors.toList()).get(0); // asegurar solo un elemento 
												me.setInt_2(valorSecuencia!=null?valorSecuencia.intValue():0);	
											}catch(Exception e){
												e.printStackTrace();												
											}
										});
					
				}				
			}
			
			/**4-. Filtrar los NO Favoritos MEDICOS (si no hubire debera ser un listado normal)*/
			if(UtilesCommons.noEsVacio(filtro.getListInteger())){
				filtro.setAtributoList("idMedico");
				filtro.setNombreConsulta("NO_IN_MEDICO");
					
			}							
			listaMedicosEspecNoFavoritos = especialidadMedicoDao.listarVwEspecialidadMedico(filtro);
			if(UtilesCommons.noEsVacio(listaMedicosEspecNoFavoritos)){
				//Agregar valores default a listado NO favorito
				listaMedicosEspecNoFavoritos.stream().forEach(p -> {
																p.setBool_1(false);//AUX para indicar es boolean
																p.setString1(Constant.ICONFAVORITO_ADD_FAVORITO);//AUX para indicar el tipo de icono
																});
			}
			
			/**5.- Armar Listado final : en primeras filas los favoritos luego el resto*/
			if(listaMedicosEspecFavoritos!=null){
				listaMedicosEspecResult.addAll(listaMedicosEspecFavoritos);	
			}			
			listaMedicosEspecResult.addAll(listaMedicosEspecNoFavoritos);
			
			/**5.1.- Antes de retornar validar y cruzar con la lista de medicos con horarios validos 
			 * (Si se indica cruzar con los horarios)**/
			if(indicaCruceHorarios){
				if(UtilesCommons.noEsVacio(medicosValidosHorario)){
					//Filtrar de la lista RESULT los elementos 
					//cuyo IdMedico esten incuidos en las lista ed Ids 'medicosValidosHorario'					
					listaMedicosEspecResult = listaMedicosEspecResult.stream()
							.filter(me ->  listaContieneElemento(medicosValidosHorario,me.getIdMedico()))
							.collect(Collectors.toList());											
				}else{
					//ning�n Idmedico valido existe con un horario que incluya el rango de fechas enviado
					listaMedicosEspecResult.clear();
				}
			}
			
			
			
			/**6-. Retornar lista*/
			return listaMedicosEspecResult;
		}catch(Exception ex){
			Log.error(ex, "EspecialidadService :: listarVwEspecialidadMedico");
			return new ArrayList<VwEspecialidadMedico>();
		}
	}
	
	
	/**
	 * @param listaInt
	 * @param elemento
	 * @return
	 */
	public boolean listaContieneElemento(List<Integer> listaInt, Integer elemento){
		boolean result = true;
		result = listaInt.stream().anyMatch(e -> (""+e).equals(""+elemento));//Si contiene
		return result;
	}

	@Override
	public List<VwEspecialidadMedico> listarVwEspecialidadMedicoConHorarios(VwEspecialidadMedico filtro,
			Date horarioFechaInicio, Date horarioFechaFin) {
		try{
			/** Listar ESPECIALIDAD-MEDICO haciendo un cruce con el rango de fechas de acuerdo al HORARIO DEL MEDICO  */
			/**1.- Construir una lista de Fechas (para filtros) con el rango proporcionado
			 *  Logica: traer todos los HORARIOS que cumpla
			 * 	(fechaInicio <= horarioFechaInicio && fechaFin >= horarioFechaInicio) 
			 * 		|| ( fechaFin >= horarioFechaFin && fechaInicio <= horarioFechaFin )
			 * 	y la especialidad enviada 
			 ***/
			SsCcHorario filtroHorario = new SsCcHorario();
			filtroHorario.setIdEspecialidad(filtro.getIdEspecialidad());
			filtroHorario.setNombreConsulta("FILTRO_RANGO_FECHAS");
			filtroHorario.setFechaInicioBusqueda(horarioFechaInicio);
			filtroHorario.setFechaFinBusqueda(horarioFechaFin);
			List<Integer> medicos = horarioDao.listarMedicosEnHorario(filtroHorario);
			/**2.- set como atributos IN los id de los medicos validos*/		
			if(UtilesCommons.noEsVacio(medicos)){
				filtro.setAtributoList("idMedico");
				filtro.setListInteger(medicos);
				/**3.- listar por los filstro actuales*/
				return especialidadMedicoDao.listarVwEspecialidadMedico(filtro);
			}else{
				return new ArrayList<VwEspecialidadMedico>();
			}
						
		}catch(Exception ex){
			Log.error(ex, "EspecialidadService :: listarVwEspecialidadMedico");
			return new ArrayList<VwEspecialidadMedico>();
		}
	}

	@Override
	public List<SsGeEspecialidad> listarEspecialidadesFavoritos(SsGeEspecialidad filtro, Integer idAgente) {
		try{
			/******Listar Medico-especialidad CON CRUCE DE FAVORITOS*****/
			/**1.- inicializa listas */	
			List<SsGeEspecialidad>  listaEspecResult = new ArrayList<SsGeEspecialidad>();
			List<SsGeEspecialidad>  listaEspecFavoritos = new ArrayList<SsGeEspecialidad>();
			List<SsGeEspecialidad>  listaEspecNoFavoritos = new ArrayList<SsGeEspecialidad>();
			
					
			
			/**2.- Listar favoritos */
			SsCcFavoritoDetalle favDetFiltro = new SsCcFavoritoDetalle();
			favDetFiltro.setSsCcFavorito(new SsCcFavorito());
			//usar ....codTablaFavorito
			favDetFiltro.getSsCcFavorito().setCodigoTablaFavorito(Constant.FAVORITO_TABLA_ESPECIALIDAD);
			favDetFiltro.getSsCcFavorito().setIdAgente(idAgente);
			favDetFiltro.setEstado(Constant.ACTIVO);
			List<SsCcFavoritoDetalle>  listaFavDetTemp = ssCcFavoritoDetalleDao.listarElementos(favDetFiltro, false);	
			/**OBS: SE HACE USO DE ***JRE_1.8 *****/
			/**3.- Filtrar Favoritos MEDICOS * */	
			if(UtilesCommons.noEsVacio(listaFavDetTemp)){													
				//Agregar los ValorId que no son vacios como List al filtro 'ListInteger'			
				filtro.setAtributoList("idEspecialidad");
				filtro.setListInteger(listaFavDetTemp.stream().filter(p -> UtilesCommons.noEsVacio(p.getValorId()))
						.map(e -> e.getValorId())
						.collect(Collectors.toList()));
				if(UtilesCommons.noEsVacio(filtro.getListInteger())){
					filtro.setNombreConsulta("IN_ESPECIALIDAD"); //***quiza no sea necesaio					
					listaEspecFavoritos = especialidadDao.listarEspecialidades(filtro);	
				}			
				//Agregar valores default a listado favorito
				if(UtilesCommons.noEsVacio(listaEspecFavoritos)){										
					listaEspecFavoritos.stream()
						.forEach(me -> {	me.setBool_1(true);//AUX para indicar es boolean
											me.setString1(Constant.ICONFAVORITO_FAVORITO);//AUX para indicar el tipo de icono
											try{
												//AUX para indicar el ID FAVORITO
												Integer valorIdFavorito =listaFavDetTemp.stream()
														.filter(fav -> (""+fav.getValorId()).equals(""+me.getIdEspecialidad()))
														.map(f -> f.getId().getIdFavorito()) // solo el Id favorito
														.limit(1).collect(Collectors.toList()).get(0); // asegurar solo un elemento
												me.setInt_1(valorIdFavorito!=null?valorIdFavorito.intValue():0);
												
												//AUX para indicar el ID FAVORITO DETALLE : SECUENCIA **evaluar usar Util.Optional	
												Integer valorSecuencia = listaFavDetTemp.stream()
														.filter(fav -> (""+fav.getValorId()).equals(""+me.getIdEspecialidad()))
														.map(f -> f.getId().getSecuencia()) // solo el Id DETALLE: SECUENCIA
														.limit(1).collect(Collectors.toList()).get(0); // asegurar solo un elemento 
												me.setInt_2(valorSecuencia!=null?valorSecuencia.intValue():0);	
											}catch(Exception e){
												e.printStackTrace();												
											}
										});
					
				}				
			}
			
			/**4-. Filtrar los NO Favoritos MEDICOS (si no hubire debera ser un listado normal)*/
			if(UtilesCommons.noEsVacio(filtro.getListInteger())){
				filtro.setAtributoList("idEspecialidad");
				filtro.setNombreConsulta("NO_IN_ESPECIALIDAD");
					
			}							
			listaEspecNoFavoritos = especialidadDao.listarEspecialidades(filtro);	
			if(UtilesCommons.noEsVacio(listaEspecNoFavoritos)){
				//Agregar valores default a listado NO favorito
				listaEspecNoFavoritos.stream().forEach(p -> {
																p.setBool_1(false);//AUX para indicar es boolean
																p.setString1(Constant.ICONFAVORITO_ADD_FAVORITO);//AUX para indicar el tipo de icono
																});
			}
			
			/**5.- Armar Listado final : en primeras filas los favoritos luego el resto*/
			if(listaEspecFavoritos!=null){
				listaEspecResult.addAll(listaEspecFavoritos);	
			}			
			listaEspecResult.addAll(listaEspecNoFavoritos);
			
			//return especialidadDao.listarEspecialidades(filtro);
			return listaEspecResult;
		}catch(Exception ex){
			Log.error(ex, "EspecialidadService :: listarVwEspecialidadMedico");
			return new ArrayList<SsGeEspecialidad>();
		}
	}

}
