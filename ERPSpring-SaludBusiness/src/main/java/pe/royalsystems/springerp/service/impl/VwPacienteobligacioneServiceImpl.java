package pe.royalsystems.springerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.royalsystems.springerp.model.dao.VwPacienteobligacioneDao;
import pe.royalsystems.springerp.model.domain.vista.VwPacienteobligacione;
import pe.royalsystems.springerp.service.VwPacienteobligacioneService;

import java.util.List;

@Service("vwPacienteobligacioneService")
@Transactional(readOnly = true)
public class VwPacienteobligacioneServiceImpl implements VwPacienteobligacioneService {

	@Autowired
	private VwPacienteobligacioneDao vwPacienteobligacioneDao;


	@Override
	public List<VwPacienteobligacione> listar(VwPacienteobligacione objgeDiagnostico, boolean paginable) {
		try {
			return vwPacienteobligacioneDao.listar(objgeDiagnostico,paginable);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public VwPacienteobligacione buscar(VwPacienteobligacione objgeDiagnostico) {
		try {
			return vwPacienteobligacioneDao.buscar(objgeDiagnostico);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contar(VwPacienteobligacione objgeDiagnostico) {
		try {
			return vwPacienteobligacioneDao.contar(objgeDiagnostico);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}
}
