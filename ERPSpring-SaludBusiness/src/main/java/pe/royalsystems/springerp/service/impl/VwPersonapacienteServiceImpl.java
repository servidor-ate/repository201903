package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.PersonamastDao;
import pe.royalsystems.springerp.model.dao.SsGePacienteDao;
import pe.royalsystems.springerp.model.dao.SsTipoTrabajadorDao;
import pe.royalsystems.springerp.model.dao.VwPersonapacienteDao;
import pe.royalsystems.springerp.model.domain.Personamast;
import pe.royalsystems.springerp.model.domain.SsGePaciente;
import pe.royalsystems.springerp.model.domain.SsTipoTrabajador;
import pe.royalsystems.springerp.model.domain.VwPersonapaciente;
import pe.royalsystems.springerp.model.util.Constant;
import pe.royalsystems.springerp.service.VwPersonapacienteService;

import java.util.Date;
import java.util.List;

@Service("vwPersonapacienteService")
@Transactional(readOnly = true)
public class VwPersonapacienteServiceImpl implements VwPersonapacienteService {

	@Autowired
	private VwPersonapacienteDao vwPersonapacienteDao;

	@Autowired
	private SsTipoTrabajadorDao ssTipoTrabajadorDao;
	
	@Autowired
	private PersonamastDao personamastDao;

	@Autowired
	private SsGePacienteDao ssGePacienteDao;
	
	public List<VwPersonapaciente> listarElementosPag(VwPersonapaciente objVwPersonapaciente) {
		try {
			return vwPersonapacienteDao.listarElementosPag(objVwPersonapaciente);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public VwPersonapaciente buscarVwPersonapacienteID(VwPersonapaciente objvwPersonapaciente) {
		try {
			VwPersonapaciente personapacienteRetorno = vwPersonapacienteDao
					.obtenerPorId(objvwPersonapaciente.getPersona());

			if (personapacienteRetorno != null) {
				SsTipoTrabajador objSsTipoTrabajador = new SsTipoTrabajador();
				objSsTipoTrabajador.setTipoTrabajador(personapacienteRetorno.getTipoTrabajador());
				objSsTipoTrabajador = ssTipoTrabajadorDao.retornarSsTipoTrabajadorXid(objSsTipoTrabajador);
				if (objSsTipoTrabajador != null) {
					personapacienteRetorno.setString1(objSsTipoTrabajador.getDescripcionLocal());
				}
			}

			return personapacienteRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public VwPersonapaciente obtenerPorId(Integer key) {
		try {
			return vwPersonapacienteDao.obtenerPorId(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contarTotal(VwPersonapaciente objVwPersonapaciente) {
		try {
			return vwPersonapacienteDao.contarTotal(objVwPersonapaciente);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public int eliminar(VwPersonapaciente vwPersonapaciente) {
		try {
			return vwPersonapacienteDao.eliminar(vwPersonapaciente);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(readOnly= false)
	public int guardarPersonaPaciente(VwPersonapaciente vwPersonapaciente) {
		try {
			Personamast objPersonaSave = new Personamast();
			int resultPersona =0;
			int resultPac =0;
			boolean personaHallada = false;
			if(vwPersonapaciente.getPersona()!=null){
				String doc = vwPersonapaciente.getDocumento();
				Personamast objPersona = new Personamast();
				List<Personamast>  lisatPers = personamastDao.listarPersonamast(objPersona,false);
				
				if(lisatPers!=null){
					if(lisatPers.size()>0){
						objPersonaSave = lisatPers.get(0);
						resultPersona = objPersonaSave.getPersona();
						personaHallada = true;
					}
				}
			}
								
			if(!personaHallada){
				objPersonaSave.setNombres(vwPersonapaciente.getNombres());
				objPersonaSave.setTipoDocumento("D");//****
				objPersonaSave.setDocumento(vwPersonapaciente.getDocumento());
				objPersonaSave.setApellidoPaterno(vwPersonapaciente.getApellidoPaterno());
				objPersonaSave.setApellidoMaterno(vwPersonapaciente.getApellidoMaterno());
				
				objPersonaSave.setNombreCompleto(vwPersonapaciente.getApellidoPaterno().trim()+
						" "+vwPersonapaciente.getApellidoMaterno().trim() +", "+ vwPersonapaciente.getNombres().trim());
				objPersonaSave.setFechaNacimiento(vwPersonapaciente.getFechaNacimiento());
				objPersonaSave.setOrigen("LIMA");
				objPersonaSave.setEstado(Constant.ACTIVO);
				objPersonaSave.setUltimoUsuario(vwPersonapaciente.getUltimoUsuario());				
				objPersonaSave.setUltimaFechaModif(new Date());
				
				
				resultPersona = personamastDao.guardarPersonamast(objPersonaSave);
			}
			//return vwPersonapacienteDao.guardar(vwPersonapaciente);
			
			if(resultPersona>0){
				SsGePaciente objValidacio = ssGePacienteDao.obtenerPorId(resultPersona);
				if(objValidacio==null){
					SsGePaciente objPacienteSave = new SsGePaciente();
					objPacienteSave.setIdPaciente(resultPersona);
					objPacienteSave.setTipoPaciente(5);//****
					objPacienteSave.setEstado(Constant.HCE_INT_ACTIVO);
					objPacienteSave.setUsuarioCreacion(vwPersonapaciente.getUltimoUsuario());
					objPacienteSave.setUsuarioModificacion(vwPersonapaciente.getUltimoUsuario());
					objPacienteSave.setFechaCreacion(new Date());
					objPacienteSave.setFechaModificacion(new Date());
					resultPac = ssGePacienteDao.guardar(objPacienteSave);						
				}				
			}						
			
			return resultPersona;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<VwPersonapaciente> listarElementos(VwPersonapaciente objDao) {
		try {
			return vwPersonapacienteDao.listarElementos(objDao);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
