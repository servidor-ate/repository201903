package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.VwAtencionpacienteGeneralDao;
import pe.royalsystems.springerp.model.domain.AtencionPacienteGeneral;
import pe.royalsystems.springerp.model.domain.VwAtencionpacienteGeneral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class VwAtencionpacienteGeneralDaoImpl extends AbstractDaoImpl<VwAtencionpacienteGeneral, String> implements VwAtencionpacienteGeneralDao{

	protected VwAtencionpacienteGeneralDaoImpl() {
		super(VwAtencionpacienteGeneral.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<VwAtencionpacienteGeneral> listVwAtencionpacienteGeneral(
			VwAtencionpacienteGeneral vwAtencionpacienteGeneral) {
		try {

			
			Query query = getCurrentSession()
					.createSQLQuery("{ CALL SP_VW_ATENCIONPACIENTE_LISTAR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
							+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
							+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");

			System.out.println("mirando accion " + vwAtencionpacienteGeneral.getAccion());
			System.out.println("mirando accion getIdOrdenAtencion = " + vwAtencionpacienteGeneral.getIdOrdenAtencion());

			query.setParameter(0, vwAtencionpacienteGeneral.getUnidadReplicacion());
			query.setParameter(1, vwAtencionpacienteGeneral.getIdEpisodioAtencion());
			query.setParameter(2, vwAtencionpacienteGeneral.getUnidadReplicacionEc());
			query.setParameter(3, vwAtencionpacienteGeneral.getIdPaciente());
			query.setParameter(4, vwAtencionpacienteGeneral.getEpisodioClinico());
			query.setParameter(5, vwAtencionpacienteGeneral.getIdEstablecimientoSalud());
			query.setParameter(6, vwAtencionpacienteGeneral.getIdUnidadServicio());
			query.setParameter(7, vwAtencionpacienteGeneral.getIdPersonalSalud());
			query.setParameter(8, null); // @aaaaAtencion
			query.setParameter(9, vwAtencionpacienteGeneral.getEpisodioAtencion());
			query.setParameter(10, vwAtencionpacienteGeneral.getFechaRegistro());
			query.setParameter(11, vwAtencionpacienteGeneral.getFechaAtencion());
			query.setParameter(12, vwAtencionpacienteGeneral.getTipoAtencion());
			query.setParameter(13, vwAtencionpacienteGeneral.getIdOrdenAtencion());
			query.setParameter(14, vwAtencionpacienteGeneral.getLineaOrdenAtencion());
			query.setParameter(15, vwAtencionpacienteGeneral.getTipoOrdenAtencion());
			query.setParameter(16, null); // estado
			query.setParameter(17, vwAtencionpacienteGeneral.getUsuarioModificacion());
			query.setParameter(18, vwAtencionpacienteGeneral.getFechaModificacion());
			query.setParameter(19, vwAtencionpacienteGeneral.getIdEspecialidad());
			query.setParameter(20, vwAtencionpacienteGeneral.getCodigoOa());
			query.setParameter(21, vwAtencionpacienteGeneral.getFechaOrden());
			query.setParameter(22, vwAtencionpacienteGeneral.getIdProcedimiento());
			query.setParameter(23, null); // id tipo orden
			query.setParameter(24, null); // @FechaRegistroEpiClinico
			query.setParameter(25, vwAtencionpacienteGeneral.getFechaCierreEpiClinico());
			query.setParameter(26, vwAtencionpacienteGeneral.getTipoPaciente());
			query.setParameter(27, null); // @Edad
			query.setParameter(28, vwAtencionpacienteGeneral.getCodigoHc());
			query.setParameter(29, vwAtencionpacienteGeneral.getCodigoHcanterior());
			query.setParameter(30, null); // @CodigoHCSecundario
			query.setParameter(31, null); // @TipoHistoria
			query.setParameter(32, null); // @EstadoPaciente
			query.setParameter(33, 0); // @NumeroFile
			query.setParameter(34, null); // @IDPACIENTE_OK
			query.setParameter(35, 0); // @Persona
			query.setParameter(36, vwAtencionpacienteGeneral.getNombres()); // @NombreCompleto
			query.setParameter(37, vwAtencionpacienteGeneral.getTipoDocumento());
			query.setParameter(38, vwAtencionpacienteGeneral.getDocumento());
			query.setParameter(39, null); // @EsCliente
			query.setParameter(40, null); // @EsProveedor
			query.setParameter(41, null); // @EsEmpleado
			query.setParameter(42, null); // @EsOtro
			query.setParameter(43, null); // @TipoPersona
			query.setParameter(44, vwAtencionpacienteGeneral.getFechaNacimiento());
			query.setParameter(45, vwAtencionpacienteGeneral.getSexo());
			query.setParameter(46, null); // @Nacionalidad
			query.setParameter(47, vwAtencionpacienteGeneral.getEstadoCivil());
			query.setParameter(48, vwAtencionpacienteGeneral.getNivelInstruccion());
			query.setParameter(49, vwAtencionpacienteGeneral.getCodigoPostal());
			query.setParameter(50, vwAtencionpacienteGeneral.getProvincia());
			query.setParameter(51, vwAtencionpacienteGeneral.getDepartamento());
			query.setParameter(52, vwAtencionpacienteGeneral.getFechaInicio()); // @FecIniDiscamec
			query.setParameter(53, vwAtencionpacienteGeneral.getFechaFin()); // @FecFinDiscamec
			query.setParameter(54, vwAtencionpacienteGeneral.getPais());
			query.setParameter(55, vwAtencionpacienteGeneral.getEsPaciente());
			query.setParameter(56, vwAtencionpacienteGeneral.getEsEmpresa());
			query.setParameter(57, null); // @personanew
			query.setParameter(58, vwAtencionpacienteGeneral.getEstadoPersona());
			query.setParameter(59, null); // @Servicio
			query.setParameter(60, vwAtencionpacienteGeneral.getInicio());
			query.setParameter(61, vwAtencionpacienteGeneral.getNumeroFilas());
			query.setParameter(62, vwAtencionpacienteGeneral.getVersion());
			query.setParameter(63, vwAtencionpacienteGeneral.getAccion());

			VwAtencionpacienteGeneral atencionpacienteGeneral;
		 
			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<VwAtencionpacienteGeneral> listaRetorno = new ArrayList<VwAtencionpacienteGeneral>();
			
			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				atencionpacienteGeneral = new VwAtencionpacienteGeneral();
				
				if (obj[0] != null) {
					atencionpacienteGeneral.setUnidadReplicacion(String.valueOf(obj[0]));
				}
				
				if (obj[1] != null) {
					atencionpacienteGeneral.setIdEpisodioAtencion(Long.parseLong(String.valueOf(obj[1])));
				}
				
				if (obj[4] != null) {
					atencionpacienteGeneral.setEpisodioClinico(Integer.parseInt(String.valueOf(obj[4])));
				}
				
				if (obj[5] != null) {
					atencionpacienteGeneral.setEpisodioAtencion(Integer.parseInt(String.valueOf(obj[5])));
				}
				
				if (obj[11] != null) {
					atencionpacienteGeneral.setTipoAtencion(Integer.parseInt(String.valueOf(obj[11])));
				}
				
				if (obj[20] != null) {
					atencionpacienteGeneral.setCodigoOa(String.valueOf(obj[20]));
				}
				
				if (obj[39] != null) {
					atencionpacienteGeneral.setTipoPaciente(Integer.parseInt(String.valueOf(obj[39])));
				}
				
				if (obj[46] != null) {
					atencionpacienteGeneral.setCodigoHc(String.valueOf(obj[46]));
				}
				
				if (obj[59] != null) {
					atencionpacienteGeneral.setEstadoEpiClinico(Integer.parseInt(String.valueOf(obj[59])));
				}
				
				if (obj[60] != null) {
					atencionpacienteGeneral.setUnidadReplicacion(String.valueOf(obj[60]));
				}
				
				if (obj[61] != null) {
					atencionpacienteGeneral.setUnidadReplicacionEc(String.valueOf(obj[61]));
				}
				
				if (obj[62] != null) {
					atencionpacienteGeneral.setIdEpisodioAtencion(Long.parseLong(String.valueOf(obj[62])));
				}			
				
				if (obj[64] != null) {
					atencionpacienteGeneral.setIdEstablecimientoSalud(Integer.parseInt(String.valueOf(obj[64])));
				}
				
				if (obj[65] != null) {
					atencionpacienteGeneral.setIdUnidadServicio(Integer.parseInt(String.valueOf(obj[65])));
				}
				
				if (obj[66] != null) {
					atencionpacienteGeneral.setIdPersonalSalud(Integer.parseInt(String.valueOf(obj[66])));
				}
				
				if (obj[70] != null) {
					atencionpacienteGeneral.setEstadoEpiAtencion(Integer.parseInt(String.valueOf(obj[70])));
				}
				
				if (obj[82] != null) {
					atencionpacienteGeneral.setOrigen(String.valueOf(obj[82]));
				}
				
				if (obj[85] != null) {
					atencionpacienteGeneral.setPacienteNombre(String.valueOf(obj[85]));
				}
				
				if (obj[138] != null) {
					System.out.println("entro a setear estado DAOImpl ==== "+String.valueOf(obj[138]));
					atencionpacienteGeneral.setEstado(Integer.parseInt(String.valueOf(obj[138])));
				}
				
				
				listaRetorno.add(atencionpacienteGeneral);
			}

			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<AtencionPacienteGeneral> listaVwAtencionpacienteGeneral_2(
			AtencionPacienteGeneral vwAtencionpacienteGeneral) {
		// TODO Auto-generated method stub
		try {
		
			
			int contadorTotales = contadorTotales(vwAtencionpacienteGeneral);
			
			System.out.println("contadorTotales === "+contadorTotales);
			
			String sqlString = "SELECT * FROM (SELECT VW_ATENCIONPACIENTE.*, "
					+ " VW_ATENCIONPACIENTE.Persona as Personax,SS_AD_OrdenAtencion.Especialidad as EspecialidadX, "
					+ " SS_AD_OrdenAtencion.CodigoOA as CodigoOAx,SS_AD_OrdenAtencion.IdOrdenAtencion as IdOrdenAtencionX,"
					+ " SS_AD_OrdenAtencionDetalle.Linea as LineaOAX,VW_ATENCIONPACIENTE.NombreCompleto as NombreCompletoX,"
					+ " ROW_NUMBER() OVER (ORDER BY VW_ATENCIONPACIENTE.IdEpisodioAtencion ASC ) AS RowNumber from VW_ATENCIONPACIENTE"
					+ " inner join SS_AD_OrdenAtencionDetalle "
					+ " on (SS_AD_OrdenAtencionDetalle.IdPaciente = VW_ATENCIONPACIENTE.Persona "
					+ " and ( (VW_ATENCIONPACIENTE.IdOrdenAtencion is Not null "
					+ " and SS_AD_OrdenAtencionDetalle.IdOrdenAtencion = VW_ATENCIONPACIENTE.IdOrdenAtencion) "
					+ " OR (VW_ATENCIONPACIENTE.IdOrdenAtencion is  null )))"
					+ "	inner join SS_AD_OrdenAtencion on (SS_AD_OrdenAtencionDetalle.IdPaciente = SS_AD_OrdenAtencion.IdPaciente "
					+ " AND SS_AD_OrdenAtencionDetalle.IdOrdenAtencion = SS_AD_OrdenAtencion.IdOrdenAtencion) ";
					if (vwAtencionpacienteGeneral.getCodigoHC()!=null) {
						sqlString = sqlString + " WHERE (CodigoHC = '"+vwAtencionpacienteGeneral.getCodigoHC()+"') ";
					}
					if (vwAtencionpacienteGeneral.getCodigoHCAnterior()!=null) {
						sqlString = sqlString  + " and ( CodigoHCAnterior = '"+vwAtencionpacienteGeneral.getCodigoHCAnterior()+"')";
					}
					if (vwAtencionpacienteGeneral.getPacienteNombre()!=null) {
						sqlString = sqlString + " and ( upper(VW_ATENCIONPACIENTE.NombreCompleto) like '%'+upper("+vwAtencionpacienteGeneral.getPacienteNombre()+")+'%')";
					}
					if (vwAtencionpacienteGeneral.getCodigoOA() !=null) {
						sqlString = sqlString + " and (upper(VW_ATENCIONPACIENTE.CodigoOA) like '%'+upper("+vwAtencionpacienteGeneral.getCodigoOA()+")+'%')";
					}
					if (vwAtencionpacienteGeneral.getEpisodioClinico()!=null) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.EpisodioClinico = "+vwAtencionpacienteGeneral.getEpisodioClinico()+" or  "+vwAtencionpacienteGeneral.getEpisodioClinico()+"=0)";
					}
					if (vwAtencionpacienteGeneral.getEpisodioAtencion()!=null) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.EpisodioAtencion = "+vwAtencionpacienteGeneral.getEpisodioAtencion()+" or  "+vwAtencionpacienteGeneral.getEpisodioAtencion()+"=0)";
					}
					if (vwAtencionpacienteGeneral.getIdOrdenAtencion()!=0) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.IdOrdenAtencion = "+vwAtencionpacienteGeneral.getIdOrdenAtencion()+")";
					}
					if (vwAtencionpacienteGeneral.getLineaOrdenAtencion()!=0) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.LineaOrdenAtencion = "+vwAtencionpacienteGeneral.getLineaOrdenAtencion()+")";
					}
					if (vwAtencionpacienteGeneral.getEstadoEpiAtencion()!=null) {
						sqlString = sqlString + " and ((case when VW_ATENCIONPACIENTE.Estado IS null then 0 else VW_ATENCIONPACIENTE.Estado end ) = "+vwAtencionpacienteGeneral.getEstadoEpiAtencion()+") ";
								
					}
					
					sqlString = sqlString + ")AS LISTADO ";
					
					sqlString = sqlString + "	 WHERE RowNumber BETWEEN "+vwAtencionpacienteGeneral.getNumeroFila()+"  AND "+vwAtencionpacienteGeneral.getContador();
			
		
			Query query = getCurrentSession().createSQLQuery(sqlString);
			
			AtencionPacienteGeneral atencionpacienteGeneral;
			 
			List<Object> result = query.list();
			
			System.out.println("mirando el tamano del result "+result.size());
			Iterator itr = result.iterator();
			List<AtencionPacienteGeneral> listaRetorno = new ArrayList<AtencionPacienteGeneral>();
			
			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				atencionpacienteGeneral = new AtencionPacienteGeneral();
				
				if (obj[0] != null) {
					atencionpacienteGeneral.setUnidadReplicacion(String.valueOf(obj[0]));
				}
				
				if (obj[1] != null) {
					atencionpacienteGeneral.setIdEpisodioAtencion(Long.parseLong(String.valueOf(obj[1])));
				}
				
				if (obj[4] != null) {
					atencionpacienteGeneral.setEpisodioClinico(Integer.parseInt(String.valueOf(obj[4])));
				}
				
				if (obj[5] != null) {
					atencionpacienteGeneral.setEpisodioAtencion(Integer.parseInt(String.valueOf(obj[5])));
				}
				
				if (obj[11] != null) {
					atencionpacienteGeneral.setTipoAtencion(Integer.parseInt(String.valueOf(obj[11])));
				}
				
				if (obj[20] != null) {
					atencionpacienteGeneral.setCodigoOA(String.valueOf(obj[20]));
				}
				
				if (obj[39] != null) {
					atencionpacienteGeneral.setTipoPaciente(Integer.parseInt(String.valueOf(obj[39])));
				}
				
				if (obj[46] != null) {
					atencionpacienteGeneral.setCodigoHC(String.valueOf(obj[46]));
				}
				
				if (obj[142] != null) {
					atencionpacienteGeneral.setEstadoEpiClinico(Integer.parseInt(String.valueOf(obj[142])));
				}
				
				if (obj[0] != null) {
					atencionpacienteGeneral.setUnidadReplicacion(String.valueOf(obj[0]));
				}
				
				if (obj[2] != null) {
					atencionpacienteGeneral.setUnidadReplicacionEC(String.valueOf(obj[2]));
				}
				
				if (obj[5] != null) {
					atencionpacienteGeneral.setIdEpisodioAtencion(Long.parseLong(String.valueOf(obj[5])));
				}			
				
				if (obj[6] != null) {
					atencionpacienteGeneral.setIdEstablecimientoSalud(Integer.parseInt(String.valueOf(obj[6])));
				}
				
				if (obj[7] != null) {
					atencionpacienteGeneral.setIdUnidadServicio(Integer.parseInt(String.valueOf(obj[7])));
				}
				
				if (obj[8] != null) {
					atencionpacienteGeneral.setIdPersonalSalud(Integer.parseInt(String.valueOf(obj[8])));
				}
				
				if (obj[70] != null) {
					atencionpacienteGeneral.setEstadoEpiAtencion(Integer.parseInt(String.valueOf(obj[70])));
				}
				
				if (obj[82] != null) {
					atencionpacienteGeneral.setOrigen(String.valueOf(obj[82]));
				}
				
				if (obj[85] != null) {
					atencionpacienteGeneral.setPacienteNombre(String.valueOf(obj[85]));
				}
				
				if (obj[138] != null) {
					
					atencionpacienteGeneral.setEstadoEpiAtencion(Integer.parseInt(String.valueOf(obj[138])));
				}
				
				atencionpacienteGeneral.setContador(contadorTotales);
				
				listaRetorno.add(atencionpacienteGeneral);
			}
			
			System.out.println("mirando la lista de retorono = "+listaRetorno.size());
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getLocalizedMessage();
			e.getMessage();
			return null;
		}
	}

	@Override
	public int contadorTotales(AtencionPacienteGeneral vwAtencionpacienteGeneral) {
		// TODO Auto-generated method stub
		try {
		
			
			String sqlString = "SELECT * FROM (SELECT VW_ATENCIONPACIENTE.*, "
					+ " VW_ATENCIONPACIENTE.Persona as Personax,SS_AD_OrdenAtencion.Especialidad as EspecialidadX, "
					+ " SS_AD_OrdenAtencion.CodigoOA as CodigoOAx,SS_AD_OrdenAtencion.IdOrdenAtencion as IdOrdenAtencionX,"
					+ " SS_AD_OrdenAtencionDetalle.Linea as LineaOAX,VW_ATENCIONPACIENTE.NombreCompleto as NombreCompletoX,"
					+ " ROW_NUMBER() OVER (ORDER BY VW_ATENCIONPACIENTE.IdEpisodioAtencion ASC ) AS RowNumber from VW_ATENCIONPACIENTE"
					+ " inner join SS_AD_OrdenAtencionDetalle "
					+ " on (SS_AD_OrdenAtencionDetalle.IdPaciente = VW_ATENCIONPACIENTE.Persona "
					+ " and ( (VW_ATENCIONPACIENTE.IdOrdenAtencion is Not null "
					+ " and SS_AD_OrdenAtencionDetalle.IdOrdenAtencion = VW_ATENCIONPACIENTE.IdOrdenAtencion) "
					+ " OR (VW_ATENCIONPACIENTE.IdOrdenAtencion is  null )))"
					+ "	inner join SS_AD_OrdenAtencion on (SS_AD_OrdenAtencionDetalle.IdPaciente = SS_AD_OrdenAtencion.IdPaciente "
					+ " AND SS_AD_OrdenAtencionDetalle.IdOrdenAtencion = SS_AD_OrdenAtencion.IdOrdenAtencion)";
					if (vwAtencionpacienteGeneral.getCodigoHC()!=null) {
						sqlString = sqlString + " WHERE (CodigoHC = '"+vwAtencionpacienteGeneral.getCodigoHC()+"') ";
					}
					if (vwAtencionpacienteGeneral.getCodigoHCAnterior()!=null) {
						sqlString = sqlString  + " and ( CodigoHCAnterior = '"+vwAtencionpacienteGeneral.getCodigoHCAnterior()+"')";
					}
					if (vwAtencionpacienteGeneral.getPacienteNombre()!=null) {
						sqlString = sqlString + " and ( upper(VW_ATENCIONPACIENTE.NombreCompleto) like '%'+upper("+vwAtencionpacienteGeneral.getPacienteNombre()+")+'%')";
					}
					if (vwAtencionpacienteGeneral.getCodigoOA() !=null) {
						sqlString = sqlString + " and (upper(VW_ATENCIONPACIENTE.CodigoOA) like '%'+upper("+vwAtencionpacienteGeneral.getCodigoOA()+")+'%')";
					}
					if (vwAtencionpacienteGeneral.getEpisodioClinico()!=null) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.EpisodioClinico = "+vwAtencionpacienteGeneral.getEpisodioClinico()+" or  "+vwAtencionpacienteGeneral.getEpisodioClinico()+"=0)";
					}
					if (vwAtencionpacienteGeneral.getEpisodioAtencion()!=null) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.EpisodioAtencion = "+vwAtencionpacienteGeneral.getEpisodioAtencion()+" or  "+vwAtencionpacienteGeneral.getEpisodioAtencion()+"=0)";
					}
					if (vwAtencionpacienteGeneral.getIdOrdenAtencion()!=0) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.IdOrdenAtencion = "+vwAtencionpacienteGeneral.getIdOrdenAtencion()+")";
					}
					if (vwAtencionpacienteGeneral.getLineaOrdenAtencion()!=0) {
						sqlString = sqlString + " and (VW_ATENCIONPACIENTE.LineaOrdenAtencion = "+vwAtencionpacienteGeneral.getLineaOrdenAtencion()+")";
					}
					if (vwAtencionpacienteGeneral.getEstadoEpiAtencion()!=null) {
						sqlString = sqlString + " and ((case when VW_ATENCIONPACIENTE.Estado IS null then 0 else VW_ATENCIONPACIENTE.Estado end ) = "+vwAtencionpacienteGeneral.getEstadoEpiAtencion()+") ";
								
					}
					
					sqlString = sqlString + ")AS LISTADO "; 
			
		
			Query query = getCurrentSession().createSQLQuery(sqlString);
			
			AtencionPacienteGeneral atencionpacienteGeneral;
			 
			List<Object> result = query.list();
			
			System.out.println("mirando el tamano del result "+result.size());
			Iterator itr = result.iterator();
			List<AtencionPacienteGeneral> listaRetorno = new ArrayList<AtencionPacienteGeneral>();
			
			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				atencionpacienteGeneral = new AtencionPacienteGeneral();
				
				listaRetorno.add(atencionpacienteGeneral);
			}
			
			System.out.println("mirando la lista de retorono = "+listaRetorno.size());
			
			if (listaRetorno.size()>0) {
				return listaRetorno.size();
			}
			
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	
}
