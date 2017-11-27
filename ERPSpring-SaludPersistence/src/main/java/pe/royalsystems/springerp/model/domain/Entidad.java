package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Entidad implements Serializable{
	
	private int inicio;
	private int numeroFilas;
	private boolean paginable = false;// INDICA SI LA CONSULTA SERA PAGINADA
	private boolean ordernable = false;// INDICA SI LA CONSULTA SE HARA
	// ORDENADAs
	private String nombreConsulta = "";
	
	private String accionDbGlobal = "";

	private String atributoList;// SIRVE PARA COLOCAR EL NOMBRE DE LA COLUMNA
	// CON EL CUAL SE USARAN LAS CONSULTAS IN


	private List<String> listString;
	private List<Integer> listInteger;

	public boolean isPaginable() {
		return paginable;
	}

	public void setPaginable(boolean paginable) {
		this.paginable = paginable;
	}

	public boolean isOrdernable() {
		return ordernable;
	}

	public void setOrdernable(boolean ordernable) {
		this.ordernable = ordernable;
	}

	public String getAtributoOrdenacion() {
		return atributoOrdenacion;
	}

	public void setAtributoOrdenacion(String atributoOrdenacion) {
		this.atributoOrdenacion = atributoOrdenacion;
	}

	private String atributoOrdenacion;// INDICA EL NOMBRE DEL ATRIBUTO POR EL
	private String codigoTabla;
	private String codigoElemento;
	private String descripcion;
	private String urlDinamico;
	private String flagAuditoriaEntGlobal;
	private String flagAuditSoloTransactEntGlobal;
	private String nombreUsuarioEntGlobal;
	private String usuarioEntGlobal;
	private String hostEntGlobal;
	private String ipEntGlobal;
	private String conceptoPadreEntGlobal;
	private String conceptoEntGlobal;
	private String appCodigoEntGlobal;
	private String moduloEntGlobal;

	//private Date fechaIncioGlobal;
	//private Date fechaFinGlobal;
	
	private Date fechaBusqueda;
	private Date fechaInicioBusqueda;
	private Date fechaFinBusqueda;
	private Date horaInicioBusqueda;
	private Date horaFinBusqueda;
	
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	private String string6;
	private String string7;
	private String string8;
	private String string9;
	private String string10;
	
	private int int_1;
	private int int_2;
	private int int_3;
	private int int_4;
	private int int_5;
	private int int_6;
	private int int_7;
	private int int_8;
	private int int_9;
	private int int_10;
	private int int_11;
	private boolean bool_1;
	private boolean bool_2;

	public boolean isBool_1() {
		return bool_1;
	}

	public void setBool_1(boolean bool_1) {
		this.bool_1 = bool_1;
	}

	public boolean isBool_2() {
		return bool_2;
	}

	public void setBool_2(boolean bool_2) {
		this.bool_2 = bool_2;
	}

	private String dialogVar;
	public String getDialogVar() {
		return dialogVar;
	}

	public void setDialogVar(String dialogVar) {
		this.dialogVar = dialogVar;
	}

	public int getInt_1() {
		return int_1;
	}
	public void setInt_1(int int_1) {
		this.int_1 = int_1;
	}
	public int getInt_2() {
		return int_2;
	}
	public void setInt_2(int int_2) {
		this.int_2 = int_2;
	}
	public int getInt_3() {
		return int_3;
	}
	public void setInt_3(int int_3) {
		this.int_3 = int_3;
	}
	public int getInt_4() {
		return int_4;
	}
	public void setInt_4(int int_4) {
		this.int_4 = int_4;
	}
	public int getInt_5() {
		return int_5;
	}
	public void setInt_5(int int_5) {
		this.int_5 = int_5;
	}
	public int getInt_6() {
		return int_6;
	}
	public void setInt_6(int int_6) {
		this.int_6 = int_6;
	}
	public int getInt_7() {
		return int_7;
	}
	public void setInt_7(int int_7) {
		this.int_7 = int_7;
	}
	public int getInt_8() {
		return int_8;
	}
	public void setInt_8(int int_8) {
		this.int_8 = int_8;
	}
	public int getInt_9() {
		return int_9;
	}
	public void setInt_9(int int_9) {
		this.int_9 = int_9;
	}
	public int getInt_10() {
		return int_10;
	}
	public void setInt_10(int int_10) {
		this.int_10 = int_10;
	}
	public int getInt_11() {
		return int_11;
	}
	public void setInt_11(int int_11) {
		this.int_11 = int_11;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public String getString3() {
		return string3;
	}
	public void setString3(String string3) {
		this.string3 = string3;
	}
	public String getString4() {
		return string4;
	}
	public void setString4(String string4) {
		this.string4 = string4;
	}
	public String getString5() {
		return string5;
	}
	public void setString5(String string5) {
		this.string5 = string5;
	}
	public String getString6() {
		return string6;
	}
	public void setString6(String string6) {
		this.string6 = string6;
	}
	public String getString7() {
		return string7;
	}
	public void setString7(String string7) {
		this.string7 = string7;
	}
	public String getString8() {
		return string8;
	}
	public void setString8(String string8) {
		this.string8 = string8;
	}
	public String getString9() {
		return string9;
	}
	public void setString9(String string9) {
		this.string9 = string9;
	}
	public String getString10() {
		return string10;
	}
	public void setString10(String string10) {
		this.string10 = string10;
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getNumeroFilas() {
		return numeroFilas;
	}
	public void setNumeroFilas(int numeroFilas) {
		this.numeroFilas = numeroFilas;
	}
	public String getCodigoTabla() {
		return codigoTabla;
	}
	public void setCodigoTabla(String codigoTabla) {
		this.codigoTabla = codigoTabla;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigoElemento() {
		return codigoElemento;
	}
	public void setCodigoElemento(String codigoElemento) {
		this.codigoElemento = codigoElemento;
	}
	public String getFlagAuditoriaEntGlobal() {
		return flagAuditoriaEntGlobal;
	}
	public void setFlagAuditoriaEntGlobal(String flagAuditoriaEntGlobal) {
		this.flagAuditoriaEntGlobal = flagAuditoriaEntGlobal;
	}
	public String getFlagAuditSoloTransactEntGlobal() {
		return flagAuditSoloTransactEntGlobal;
	}
	public void setFlagAuditSoloTransactEntGlobal(String flagAuditSoloTransactEntGlobal) {
		this.flagAuditSoloTransactEntGlobal = flagAuditSoloTransactEntGlobal;
	}
	public String getNombreUsuarioEntGlobal() {
		return nombreUsuarioEntGlobal;
	}
	public void setNombreUsuarioEntGlobal(String nombreUsuarioEntGlobal) {
		this.nombreUsuarioEntGlobal = nombreUsuarioEntGlobal;
	}
	public String getUsuarioEntGlobal() {
		return usuarioEntGlobal;
	}
	public void setUsuarioEntGlobal(String usuarioEntGlobal) {
		this.usuarioEntGlobal = usuarioEntGlobal;
	}
	public String getHostEntGlobal() {
		return hostEntGlobal;
	}
	public void setHostEntGlobal(String hostEntGlobal) {
		this.hostEntGlobal = hostEntGlobal;
	}
	public String getIpEntGlobal() {
		return ipEntGlobal;
	}
	public void setIpEntGlobal(String ipEntGlobal) {
		this.ipEntGlobal = ipEntGlobal;
	}
	public String getConceptoPadreEntGlobal() {
		return conceptoPadreEntGlobal;
	}
	public void setConceptoPadreEntGlobal(String conceptoPadreEntGlobal) {
		this.conceptoPadreEntGlobal = conceptoPadreEntGlobal;
	}
	public String getConceptoEntGlobal() {
		return conceptoEntGlobal;
	}
	public void setConceptoEntGlobal(String conceptoEntGlobal) {
		this.conceptoEntGlobal = conceptoEntGlobal;
	}
	public String getAppCodigoEntGlobal() {
		return appCodigoEntGlobal;
	}
	public void setAppCodigoEntGlobal(String appCodigoEntGlobal) {
		this.appCodigoEntGlobal = appCodigoEntGlobal;
	}
	public String getModuloEntGlobal() {
		return moduloEntGlobal;
	}
	public void setModuloEntGlobal(String moduloEntGlobal) {
		this.moduloEntGlobal = moduloEntGlobal;
	}
	/*
	public Date getFechaIncioGlobal() {
		return fechaIncioGlobal;
	}
	public void setFechaIncioGlobal(Date fechaIncioGlobal) {
		this.fechaIncioGlobal = fechaIncioGlobal;
	}
	public Date getFechaFinGlobal() {
		return fechaFinGlobal;
	}
	public void setFechaFinGlobal(Date fechaFinGlobal) {
		this.fechaFinGlobal = fechaFinGlobal;
	}*/

	public String getUrlDinamico() {
		return urlDinamico;
	}

	public void setUrlDinamico(String urlDinamico) {
		this.urlDinamico = urlDinamico;
	}



	public String getNombreConsulta() {
		return nombreConsulta;
	}

	public void setNombreConsulta(String nombreConsulta) {
		this.nombreConsulta = nombreConsulta;
	}

	public String getAtributoList() {
		return atributoList;
	}

	public void setAtributoList(String atributoList) {
		this.atributoList = atributoList;
	}

	public List<String> getListString() {
		return listString;
	}

	public void setListString(List<String> listString) {
		this.listString = listString;
	}

	public List<Integer> getListInteger() {
		return listInteger;
	}

	public void setListInteger(List<Integer> listInteger) {
		this.listInteger = listInteger;
	}

	public Date getFechaBusqueda() {
		return fechaBusqueda;
	}

	public void setFechaBusqueda(Date fechaBusqueda) {
		this.fechaBusqueda = fechaBusqueda;
	}

	public Date getFechaInicioBusqueda() {
		return fechaInicioBusqueda;
	}

	public void setFechaInicioBusqueda(Date fechaInicioBusqueda) {
		this.fechaInicioBusqueda = fechaInicioBusqueda;
	}

	public Date getFechaFinBusqueda() {
		return fechaFinBusqueda;
	}

	public void setFechaFinBusqueda(Date fechaFinBusqueda) {
		this.fechaFinBusqueda = fechaFinBusqueda;
	}

	public Date getHoraInicioBusqueda() {
		return horaInicioBusqueda;
	}

	public void setHoraInicioBusqueda(Date horaInicioBusqueda) {
		this.horaInicioBusqueda = horaInicioBusqueda;
	}

	public Date getHoraFinBusqueda() {
		return horaFinBusqueda;
	}

	public void setHoraFinBusqueda(Date horaFinBusqueda) {
		this.horaFinBusqueda = horaFinBusqueda;
	}

	public String getAccionDbGlobal() {
		return accionDbGlobal;
	}

	public void setAccionDbGlobal(String accionDbGlobal) {
		this.accionDbGlobal = accionDbGlobal;
	}
	
	
}
