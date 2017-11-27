package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.EspecialidadDao;
import pe.royalsystems.springerp.model.dao.EspecialidadMedicoDao;
import pe.royalsystems.springerp.model.dao.HorarioMedicoDao;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;
import pe.royalsystems.springerp.model.domain.vista.VwEspecialidadMedico;
import pe.royalsystems.springerp.service.EspecialidadService;
import pe.royalsystems.springerp.service.utiles.Log;

import java.util.ArrayList;
import java.util.List;

@Service("especialidadService")
@Transactional(readOnly = true)
public class EspecialidadServiceImpl implements EspecialidadService {
	
	@Autowired
	private EspecialidadDao especialidadDao;
	
	@Autowired
	private EspecialidadMedicoDao especialidadMedicoDao;
	
	@Autowired
	private HorarioMedicoDao horarioDao;
	
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
			List<Integer> medicos = horarioDao.listarMedicosEnHorario();
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

}
