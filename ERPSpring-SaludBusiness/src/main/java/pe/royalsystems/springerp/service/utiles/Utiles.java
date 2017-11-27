package pe.royalsystems.springerp.service.utiles;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

public class Utiles {

	public static final String COMPANIA_VARIABLE = "999999";
	public static final String APLICACION_CODIGO = "WA"; //***cambiar a WS ...pero PREVENIR IMPACTO EN DB
	
	public static ResourceBundle propiedadesService= ResourceBundle.getBundle("parametrosService");
	public static ResourceBundle propiedadesMsg= ResourceBundle.getBundle("mensajesService");
	
	
	
	/**Obtener el recurso del propertie*/
	public static String getPropertyService(String prop){
		if(propiedadesService.containsKey(prop)){
			return propiedadesService.getString(prop);	
		}else{
			return "";
		}				
	}
	
    public static String getPropertyMsg(String prop) {
		if(propiedadesMsg.containsKey(prop)){
			return propiedadesMsg.getString(prop);	
		}else{
			return "";
		}			
	}

//    public static String getPropertyMsgParam(String prop, Object ... parametros){
//		try{
//			String propMsg = propiedadesMsg.getString(prop);
//			String msjFormateado = MessageFormat.format(propMsg, parametros);
//			return msjFormateado;
//    	}catch(Exception e){
//    		return "";
//    	}
//    }
    
	
////Convert Date to calendar
	public static Calendar dateToCalendar(Date date) {

		
		if (date!=null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar;
		} else {
			return null;
		}

	}

	// Convert Calendar to Date
	public static Date calendarToDate(Calendar calendar) {
		if (calendar!=null) {
			return calendar.getTime();
		} else {
			return null;
		}
		
	}
	
    public static boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }
    
    public static String formatoFechaString(Date fecha,String formato){
    	 SimpleDateFormat sdf = new SimpleDateFormat(formato);  
    	 String fechaConFormato = sdf.format(fecha);  
    	 return fechaConFormato;
    }
	public static java.sql.Timestamp TimestampFecha(){
		long millisForTs = new Date().getTime();  // Extract milliseconds-since-epoch long integer. (not "int"!)
		java.sql.Timestamp ts = new java.sql.Timestamp(millisForTs);
		return ts;
	}

}
