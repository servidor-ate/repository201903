package pe.royalsystems.springerp.service.impl;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.commons.TimeCommons;
import pe.royalsystems.springerp.commons.model.HorarioModel;
import pe.royalsystems.springerp.model.dao.CitaMedicaDao;
import pe.royalsystems.springerp.model.dao.HorarioMedicoDao;
import pe.royalsystems.springerp.model.domain.SsCcCita;
import pe.royalsystems.springerp.model.domain.vista.VwHorarioMedico;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.HorarioMedicoService;
import pe.royalsystems.springerp.service.utiles.Log;

import java.util.*;

@Service("horarioMedicoService")
@Transactional(readOnly = true)
public class HorarioMedicoServiceImpl implements HorarioMedicoService {

	@Autowired
	private HorarioMedicoDao horarioMedicoDao;
	
	@Autowired
	private CitaMedicaDao citaMedicaDao;
	
	@Override
	public DateTime[] buscarFechaHoraLimites(VwHorarioMedico filtro) {
		DateTime fecha, horaMinima, horaMaxima;
		
		Date horaDBMinima = horarioMedicoDao.buscarHoraMinima(filtro);
		
		if(horaDBMinima == null){
			horaMinima = TimeCommons.obtenerHoraMinimaDia();
		}else{
			horaMinima = TimeCommons.getSoloHora(horaDBMinima);
			horaMinima = horaMinima.minusMinutes(horaMinima.getMinuteOfHour()).withSecondOfMinute(0).withMillisOfSecond(0);
		}
		
		Date horaDBMaxima = horarioMedicoDao.buscarHoraMaxima(filtro);
		if(horaDBMaxima == null){
			horaMaxima = TimeCommons.obtenerHoraMaximaDia();
		}else{
			horaMaxima = TimeCommons.getSoloHora(horaDBMaxima);
			horaMaxima = horaMaxima.withHourOfDay(horaMaxima.getHourOfDay()+1).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0);
		}
		
		List<VwHorarioMedico> list = horarioMedicoDao.buscarFechaInicio(filtro);
		if(list == null || list.isEmpty()){
			fecha = TimeCommons.getSoloFecha(filtro.getFechaBusqueda());
		}else{
			VwHorarioMedico result = list.get(0);
			DateTime fechaInicio = TimeCommons.getSoloFecha(result.getFechaInicio());
			DateTime fechaFin = TimeCommons.getSoloFecha(result.getFechaFin());
			DateTime fechaActual = TimeCommons.getSoloFecha(filtro.getFechaBusqueda());
			
			DateTime horaFinal = TimeCommons.getSoloHora(result.getHoraFin());
			DateTime horaActual = TimeCommons.getSoloHora(DateTime.now()).withSecondOfMinute(0).withMillisOfSecond(0);
			
			int dias = Days.daysBetween(fechaInicio, fechaActual).getDays();
			fechaInicio = fechaInicio.plusDays(dias);
			
			Map<Integer, Integer> mapaDias = mapaDiasSemana(list);
			Map<String, List<HorarioModel>> mapaCitas = elaborarMapaCitas(list, fechaInicio);
			
			boolean hacerBreak = false;
			
			while((fechaInicio.isBefore(fechaFin) || fechaInicio.isEqual(fechaFin))){
				hacerBreak = false;
				if(fechaInicio.isAfter(fechaActual)){
					if(mapaDias.containsKey(fechaInicio.getDayOfWeek())){
						String key = fechaInicio.toString(TimeCommons.PATTERN_FECHA);
						List<HorarioModel> modelos = mapaCitas.get(key);
						if(modelos == null || modelos.isEmpty()){
							hacerBreak = true;
						}else{
							for(HorarioModel modelo : modelos){
								if(TimeCommons.sonHorasIguales(modelo.getHoraInicio(), modelo.getHoraInicioSup()) && TimeCommons.sonHorasIguales(modelo.getHoraFin(), modelo.getHoraFinSup())){
									
								}else{
									hacerBreak = true;
									break;
								}
							}
						}
						
					}
					if(hacerBreak){
						break;
					}
				}else if(fechaInicio.isEqual(fechaActual)){
					if(horaActual.isBefore(horaFinal)){
						if(mapaDias.containsKey(fechaInicio.getDayOfWeek())){
							String key = fechaInicio.toString(TimeCommons.PATTERN_FECHA);
							List<HorarioModel> modelos = mapaCitas.get(key);
							if(modelos == null || modelos.isEmpty()){
								hacerBreak = true;
							}else{
								for(HorarioModel modelo : modelos){
									if(TimeCommons.sonHorasIguales(modelo.getHoraInicio(), modelo.getHoraInicioSup()) && TimeCommons.sonHorasIguales(modelo.getHoraFin(), modelo.getHoraFinSup())){
										
									}else{
										hacerBreak = true;
										break;
									}
								}
							}
						}
					}
					if(hacerBreak){
						break;
					}
				}
				fechaInicio = fechaInicio.plusDays(1);
			}
			fecha = fechaInicio;
		}
		
		return new DateTime[]{fecha, horaMinima, horaMaxima};
	}
	
	public Map<Integer, Integer> mapaDiasSemana(List<VwHorarioMedico> list){
		Map<Integer, Integer> mapaDias = new LinkedHashMap<Integer, Integer>();
		for(VwHorarioMedico vista : list){
			mapaDias = mapaDiasSemana(mapaDias, vista);
		}
		return mapaDias;
	}
	
	public Map<Integer, Integer> mapaDiasSemana(Map<Integer, Integer> mapaDias, VwHorarioMedico vista){
		if(vista.getIndicadorLunes().compareTo(Constant.INT_ACTIVO) == 0){
			mapaDias.put(TimeCommons.DIA_LUNES_JODA, TimeCommons.DIA_LUNES_JODA);
		}
		if(vista.getIndicadorMartes().compareTo(Constant.INT_ACTIVO) == 0){
			mapaDias.put(TimeCommons.DIA_MARTES_JODA, TimeCommons.DIA_MARTES_JODA);
		}
		if(vista.getIndicadorMiercoles().compareTo(Constant.INT_ACTIVO) == 0){
			mapaDias.put(TimeCommons.DIA_MIERCOLES_JODA, TimeCommons.DIA_MIERCOLES_JODA);
		}
		if(vista.getIndicadorJueves().compareTo(Constant.INT_ACTIVO) == 0){
			mapaDias.put(TimeCommons.DIA_JUEVES_JODA, TimeCommons.DIA_JUEVES_JODA);
		}
		if(vista.getIndicadorViernes().compareTo(Constant.INT_ACTIVO) == 0){
			mapaDias.put(TimeCommons.DIA_VIERNES_JODA, TimeCommons.DIA_VIERNES_JODA);
		}
		if(vista.getIndicadorSabado().compareTo(Constant.INT_ACTIVO) == 0){
			mapaDias.put(TimeCommons.DIA_SABADO_JODA, TimeCommons.DIA_SABADO_JODA);
		}
		if(vista.getIndicadorDomingo().compareTo(Constant.INT_ACTIVO) == 0){
			mapaDias.put(TimeCommons.DIA_DOMINGO_JODA, TimeCommons.DIA_DOMINGO_JODA);
		}
		return mapaDias;
	}
	
	public Map<String, List<HorarioModel>> elaborarMapaCitas(List<VwHorarioMedico> list, DateTime fechaInicio){
		Map<String, List<HorarioModel>> map = new LinkedHashMap<String, List<HorarioModel>>();
		List<Integer> ids = new ArrayList<Integer>();
		Map<Integer, VwHorarioMedico> mapa_horarios = new LinkedHashMap<Integer, VwHorarioMedico>();
		for(VwHorarioMedico horario : list){
			ids.add(horario.getIdHorario());
			mapa_horarios.put(horario.getIdHorario(), horario);
		}
		String noCopiar = "NO_COPIAR";
		List<SsCcCita> citas = citaMedicaDao.obtenerPorIdsHorario(ids, Constant.INT_ACTIVO, fechaInicio.toDate());
		for(SsCcCita cita : citas){
			String key = TimeCommons.imprimirSoloFecha(cita.getFechaCita());
			HorarioModel newModel = construirModelo(cita, mapa_horarios);
			if(map.containsKey(key)){
				List<HorarioModel> modelos = map.get(key);
				boolean cambioModeloOriginal = false;
				Set<Integer> posiciones = new LinkedHashSet<Integer>();
				int i = 0;
				for(HorarioModel modelo : modelos){
					if(TimeCommons.sonHorasIguales(modelo.getHoraInicio(), newModel.getHoraFin())){
						newModel.setHoraFin(modelo.getHoraFin());
						modelo.setEstado(noCopiar);
						cambioModeloOriginal = true;
						posiciones.add(i);
					}else if(TimeCommons.sonHorasIguales(modelo.getHoraFin(), newModel.getHoraInicio())){
						newModel.setHoraInicio(modelo.getHoraInicio());
						modelo.setEstado(noCopiar);
						cambioModeloOriginal = true;
						posiciones.add(i);
					}
					i++;
				}
				if(cambioModeloOriginal){
//					for(Integer posicion : posiciones){
//						modelos.remove(posicion);
//					}
//					modelos.add(newModel);
//					map.put(key, modelos);
					List<HorarioModel> newModelos = new ArrayList<HorarioModel>();
					for(HorarioModel modelo : modelos){
						if(!modelo.getEstado().equalsIgnoreCase(noCopiar)){
							newModelos.add(modelo);
						}
					}
					newModelos.add(newModel);
					map.put(key, newModelos);
				}else{
					map.get(key).add(newModel);
				}
			}else{
				map.put(key, new ArrayList<HorarioModel>());
				map.get(key).add(newModel);
			}
		}
		return map;
	}
	
	public HorarioModel construirModelo(SsCcCita cita, Map<Integer, VwHorarioMedico> mapa_horario){
		HorarioModel model = new HorarioModel();
		model.setId(cita.getIdCita().toString());
		model.setIdSecundario(cita.getIdHorario().toString());
		model.setFecha(TimeCommons.getSoloFecha(cita.getFechaCita()));
		model.setHoraInicio(TimeCommons.getSoloHora(cita.getFechaCita()));
		model.setHoraFin(TimeCommons.getSoloHora(cita.getFechaCita()).plusMinutes(cita.getDuracionPromedio().intValue()));
		model.setEstado("");
		model.setHoraInicioSup(TimeCommons.getSoloHora(mapa_horario.get(cita.getIdHorario()).getHoraInicio()));
		model.setHoraFinSup(TimeCommons.getSoloHora(mapa_horario.get(cita.getIdHorario()).getHoraFin()));
		return model;
	}
	
	@Override
	public List<VwHorarioMedico> listarVwHorarioMedico(VwHorarioMedico filtro) {
		try{
			return horarioMedicoDao.listarVwHorarioMedico(filtro);
		}catch(Exception ex){
			Log.error(ex, "HorarioMedicoServiceImpl :: listarVwHorarioMedico");
			return new ArrayList<VwHorarioMedico>();
		}
	}

}
