package pe.royalsystems.springerp.model.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.VwAtencionpacienteTsaludDao;
import pe.royalsystems.springerp.model.domain.vista.VwAtencionpacienteTsalud;

@Repository
public class VwAtencionpacienteTsaludDaoImpl extends AbstractDaoImpl<VwAtencionpacienteTsalud,Long> implements VwAtencionpacienteTsaludDao  {

	protected VwAtencionpacienteTsaludDaoImpl() {
		super(VwAtencionpacienteTsalud.class);		
	}

	@Override
	public List<VwAtencionpacienteTsalud> listar(VwAtencionpacienteTsalud objFiltro, boolean paginado) {
		
		Criteria criteria = getCurrentSession().createCriteria(VwAtencionpacienteTsalud.class);
		
		if ( UtilesCommons.noEsVacio(objFiltro.getUnidadReplicacion())) {
			criteria.add(Restrictions.eq("unidadReplicacion", objFiltro.getUnidadReplicacion()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getIdPersonalSalud())) {
			criteria.add(Restrictions.eq("idPersonalSalud", objFiltro.getIdPersonalSalud()));
		}
		if ( objFiltro.getEstadoEpiAtencion()!=null) {
			criteria.add(Restrictions.eq("estadoEpiAtencion", objFiltro.getEstadoEpiAtencion()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getIdOrdenAtencion())) {
			criteria.add(Restrictions.eq("idOrdenAtencion", objFiltro.getIdOrdenAtencion()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getIdEstablecimientoSalud())) {
			criteria.add(Restrictions.eq("idEstablecimientoSalud", objFiltro.getIdEstablecimientoSalud()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getCodigoHC())) {
			criteria.add(Restrictions.eq("codigoHC", objFiltro.getCodigoHC()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getCodigoOA())) {
			criteria.add(Restrictions.eq("codigoOA", objFiltro.getCodigoOA()));
		}
		
		if ( UtilesCommons.noEsVacio(objFiltro.getPacienteNombre())) {
			criteria.add(Restrictions.like("pacienteNombre", objFiltro.getPacienteNombre(),MatchMode.ANYWHERE).ignoreCase());
		}
		
		if (objFiltro.getCitaFecha()!=null ) {
			try{
				if("RANGOFECHAS".equals(objFiltro.getString1())){ // flag si las fechas son iguales o no
					// --- RANGOOO ----
					//Conjunction and = Restrictions.conjunction();
					// mayor igual que
					
					String fechaIniStr = UtilesCommons.printDate("yyyyMMdd",objFiltro.getCitaFecha()); 
					Date fechaIni = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaIniStr+"00:00:00");
					criteria.add( Restrictions.ge("citaFecha",fechaIni) );							
					if (objFiltro.getFechaFinBusqueda()!=null ) {
						// menor que
						// fecha // fecha Inicio
						 //FechaFinBusqueda // fecha fin
						String fechaFinStr = UtilesCommons.printDate("yyyyMMdd",objFiltro.getFechaFinBusqueda()); 
						Date fechaFin = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaFinStr+"23:59:59");
						criteria.add( Restrictions.lt("citaFecha",fechaFin) ); 							    					   
					}	
	
					
				}else{					
					// MISMA FECHA 
					String fechaIniStr = UtilesCommons.printDate("yyyyMMdd",objFiltro.getCitaFecha()); 
					String fechaFinStr = UtilesCommons.printDate("yyyyMMdd", UtilesCommons.fechaMasNumeroDias(objFiltro.getCitaFecha(),1));
					Date fechaIni = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaIniStr+"00:00:00");					
					Date fechaFin = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaFinStr+"00:00:00");
					//criteria.add(Restrictions.between("fechaApertura",fechaIni, fechaFin));
					criteria.add( Restrictions.ge("citaFecha",fechaIni) );
					criteria.add( Restrictions.lt("citaFecha", fechaFin));				
				}		
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}	
		
		if(paginado){
			criteria.setFirstResult(objFiltro.getInicio());
			criteria.setMaxResults(objFiltro.getNumeroFilas());
			criteria.setFetchSize(objFiltro.getNumeroFilas());
		}		
		
		return criteria.list();				
	}

	@Override
	public int contarListado(VwAtencionpacienteTsalud objFiltro) {
		Criteria criteria = getCurrentSession().createCriteria(VwAtencionpacienteTsalud.class);
		
		if ( UtilesCommons.noEsVacio(objFiltro.getUnidadReplicacion())) {
			criteria.add(Restrictions.eq("unidadReplicacion", objFiltro.getUnidadReplicacion()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getIdPersonalSalud())) {
			criteria.add(Restrictions.eq("idPersonalSalud", objFiltro.getIdPersonalSalud()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getEstadoEpiAtencion())) {
			criteria.add(Restrictions.eq("estadoEpiAtencion", objFiltro.getEstadoEpiAtencion()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getIdOrdenAtencion())) {
			criteria.add(Restrictions.eq("idOrdenAtencion", objFiltro.getIdOrdenAtencion()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getIdEstablecimientoSalud())) {
			criteria.add(Restrictions.eq("idEstablecimientoSalud", objFiltro.getIdEstablecimientoSalud()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getCodigoHC())) {
			criteria.add(Restrictions.eq("codigoHC", objFiltro.getCodigoHC()));
		}
		if ( UtilesCommons.noEsVacio(objFiltro.getCodigoOA())) {
			criteria.add(Restrictions.eq("codigoOA", objFiltro.getCodigoOA()));
		}
		
		if ( UtilesCommons.noEsVacio(objFiltro.getPacienteNombre())) {
			criteria.add(Restrictions.like("pacienteNombre", objFiltro.getPacienteNombre(),MatchMode.ANYWHERE).ignoreCase());
		}
		
		if (objFiltro.getCitaFecha()!=null ) {
			try{
				if("RANGOFECHAS".equals(objFiltro.getString1())){ // flag si las fechas son iguales o no
					// --- RANGOOO ----
					//Conjunction and = Restrictions.conjunction();
					// mayor igual que
					
					String fechaIniStr = UtilesCommons.printDate("yyyyMMdd",objFiltro.getCitaFecha()); 
					Date fechaIni = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaIniStr+"00:00:00");
					criteria.add( Restrictions.ge("citaFecha",fechaIni) );							
					if (objFiltro.getFechaFinBusqueda()!=null ) {
						// menor que
						// fecha // fecha Inicio
						 //FechaFinBusqueda // fecha fin
						String fechaFinStr = UtilesCommons.printDate("yyyyMMdd",objFiltro.getFechaFinBusqueda()); 
						Date fechaFin = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaFinStr+"23:59:59");
						criteria.add( Restrictions.lt("citaFecha",fechaFin) ); 							    					   
					}	
	
					
				}else{					
					// MISMA FECHA 
					String fechaIniStr = UtilesCommons.printDate("yyyyMMdd",objFiltro.getCitaFecha()); 
					String fechaFinStr = UtilesCommons.printDate("yyyyMMdd", UtilesCommons.fechaMasNumeroDias(objFiltro.getCitaFecha(),1));
					Date fechaIni = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaIniStr+"00:00:00");					
					Date fechaFin = UtilesCommons.getDateFormat("yyyyMMddhh:mm:ss",fechaFinStr+"00:00:00");
					//criteria.add(Restrictions.between("fechaApertura",fechaIni, fechaFin));
					criteria.add( Restrictions.ge("citaFecha",fechaIni) );
					criteria.add( Restrictions.lt("citaFecha", fechaFin));				
				}		
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}	
		criteria.setProjection(Projections.rowCount());
		Object result = criteria.uniqueResult() ;				
		return Integer.parseInt(result != null ? result.toString() : "0");
	}

}
