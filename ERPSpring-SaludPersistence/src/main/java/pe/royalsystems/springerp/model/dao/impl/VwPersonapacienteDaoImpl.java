package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.VwPersonapacienteDao;
import pe.royalsystems.springerp.model.domain.VwPersonapaciente;

@Repository
public class VwPersonapacienteDaoImpl extends AbstractDaoImpl<VwPersonapaciente, Integer>
		implements VwPersonapacienteDao {

	protected VwPersonapacienteDaoImpl() {
		super(VwPersonapaciente.class);
	}

	@Override
	public List<VwPersonapaciente> listarElementosPag(VwPersonapaciente objDao) {

			Criteria criteria = getCurrentSession().createCriteria(VwPersonapaciente.class);

			
			if (objDao.getPersona()  != null &&  objDao.getPersona() != 0) {
				criteria.add(Restrictions.eq("persona", objDao.getPersona()));
			}

			if (objDao.getPaciente() != null) {
				criteria.add(Restrictions.eq("paciente", objDao.getPaciente()));
			}

			if ( UtilesCommons.noEsVacio(objDao.getNombreCompleto())) {
				criteria.add(Restrictions.like("nombreCompleto", objDao.getNombreCompleto(), MatchMode.ANYWHERE).ignoreCase());
			}

			if ( UtilesCommons.noEsVacio(objDao.getEstado())) {			
				criteria.add(Restrictions.eq("estado", objDao.getEstado()));
			}

			if ( UtilesCommons.noEsVacio(objDao.getEsEmpleado())) {
				criteria.add(Restrictions.eq("esEmpleado", objDao.getEsEmpleado()));
			}	


			criteria.setFirstResult(objDao.getInicio());
			criteria.setMaxResults(objDao.getNumeroFilas());

			List<VwPersonapaciente> listaRetorno = criteria.list();

			return listaRetorno;
		
	}

	@Override
	public VwPersonapaciente obtenerPorId(Integer key) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(VwPersonapaciente.class);
			criteria.add(Restrictions.eq("persona", key));
			return (VwPersonapaciente) criteria.uniqueResult();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}



	@Override
	public int contarTotal(VwPersonapaciente objDao) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(VwPersonapaciente.class);
			criteria.setProjection(Projections.rowCount());

			
			if (objDao.getPersona()  != null &&  objDao.getPersona() != 0) {
				criteria.add(Restrictions.eq("persona", objDao.getPersona()));
			}

			if (objDao.getPaciente() != null) {
				criteria.add(Restrictions.eq("paciente", objDao.getPaciente()));
			}

			if ( UtilesCommons.noEsVacio(objDao.getNombreCompleto())) {
				criteria.add(Restrictions.like("nombreCompleto", objDao.getNombreCompleto(), MatchMode.ANYWHERE).ignoreCase());
			}

			if ( UtilesCommons.noEsVacio(objDao.getEstado())) {			
				criteria.add(Restrictions.eq("estado", objDao.getEstado()));
			}

			if ( UtilesCommons.noEsVacio(objDao.getEsEmpleado())) {
				criteria.add(Restrictions.eq("esEmpleado", objDao.getEsEmpleado()));
			}	

			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminar(VwPersonapaciente vwPersonapaciente) {
		
			delete(vwPersonapaciente);
			return 1;
		
	}

	@Override
	public int guardar(VwPersonapaciente vwPersonapaciente) {
		try {
			String sql = "update PERSONAMAST set TipoDocumento = '" + vwPersonapaciente.getTipoDocumento()
					+ "',Documento = '" + vwPersonapaciente.getDocumento() 
					+ "',ApellidoPaterno = '"+ vwPersonapaciente.getApellidoPaterno() + "'" 
					+ "',ApellidoMaterno = '"+ vwPersonapaciente.getApellidoMaterno() + "'" 
					+ "',Nombres = '"+ vwPersonapaciente.getNombres() + "'" 
					+ "',NombreCompleto = '"+ vwPersonapaciente.getNombreCompleto() + "'" 
					+ "',Busqueda = '"+ vwPersonapaciente.getBusqueda() + "'" 
					+ "',TipoPersona = '"+ vwPersonapaciente.getTipoPersona() + "'" 
					+ "',DocumentoIdentidad = '"+ vwPersonapaciente.getDocumentoIdentidad() + "'" 
					+ "',EstadoCivil = '"+ vwPersonapaciente.getEstadoCivil() + "'" 
					+ "',Telefono = '"+ vwPersonapaciente.getTelefono() + "'" 
					+ "',Celular = '"+ vwPersonapaciente.getCelular() + "'" 
					+ "',CorreoElectronico = '"+ vwPersonapaciente.getCorreoElectronico() + "'" 
					+ "',Persona = '"+ vwPersonapaciente.getPersona() + "'" 
					+ "',FechaNacimiento = '"+ vwPersonapaciente.getFechaNacimiento() + "'" 
					+ "',Sexo = '"+ vwPersonapaciente.getSexo() + "'" 
					+ "',NivelInstruccion = '"+ vwPersonapaciente.getNivelInstruccion() + "'" 
					+ "',RangoEtario = '"+ vwPersonapaciente.getRangoEtario() + "'" 
					+ "',Edad = '"+ vwPersonapaciente.getEdad() + "'" 
					+ "',Direccion = '"+ vwPersonapaciente.getDireccion() + "'" 
					+ "',LugarNacimiento = '"+ vwPersonapaciente.getLugarNacimiento()+ "'" 
					+ "',Nacionalidad = '"+ vwPersonapaciente.getNacionalidad() + "'" 
					+ "',Pais = '"+ vwPersonapaciente.getPais() + "'" 
					+ "',Departamento = '"+ vwPersonapaciente.getDepartamento() + "'" 
					+ "',Provincia = '"+ vwPersonapaciente.getProvincia() + "'" 
					+ "',Estado = '"+ vwPersonapaciente.getEstado() + "'" 
					+ "',UltimoUsuario = '"+ vwPersonapaciente.getUltimoUsuario() + "'" 
					+ "',UltimaFechaModif = '"+ vwPersonapaciente.getUltimaFechaModif() + "'" 
					+ " where Persona = '" + vwPersonapaciente.getPersona() + "'";
			Query query = getCurrentSession().createSQLQuery(sql);
			query.executeUpdate();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<VwPersonapaciente> listarElementos(VwPersonapaciente objDao) {
		Criteria criteria = getCurrentSession().createCriteria(VwPersonapaciente.class);

		if (objDao.getPersona()  != null &&  objDao.getPersona() != 0) {
			criteria.add(Restrictions.eq("persona", objDao.getPersona()));
		}

		if (objDao.getPaciente() != null) {
			criteria.add(Restrictions.eq("paciente", objDao.getPaciente()));
		}

		if ( UtilesCommons.noEsVacio(objDao.getNombreCompleto())) {
			criteria.add(Restrictions.like("nombreCompleto", objDao.getNombreCompleto(), MatchMode.ANYWHERE).ignoreCase());
		}

		if ( UtilesCommons.noEsVacio(objDao.getEstado())) {			
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}
		if ( UtilesCommons.noEsVacio(objDao.getDocumento())) {			
			criteria.add(Restrictions.eq("documento", objDao.getDocumento()));
		}
		if ( UtilesCommons.noEsVacio(objDao.getEsEmpleado())) {
			criteria.add(Restrictions.eq("esEmpleado", objDao.getEsEmpleado()));
		}		
		return  criteria.list();
	}

	@Override
	public int actualizar(VwPersonapaciente objDao) {
		// TODO Auto-generated method stub
		return 0;
	}

}
