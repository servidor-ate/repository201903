package pe.royalsystems.springerp.model.domain;

//default package
//Generated Sep 10, 2015 3:48:09 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
* VwSsGeEspecialidadmedico generated by hbm2java
*/
@Entity
@Table(name = "VW_SS_GE_ESPECIALIDADMEDICO")
public class VwSsGeEspecialidadmedico implements java.io.Serializable {

	private VwSsGeEspecialidadmedicoId id;

	public VwSsGeEspecialidadmedico() {
	}

	public VwSsGeEspecialidadmedico(VwSsGeEspecialidadmedicoId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "persona", column = @Column(name = "PERSONA", nullable = false) ),
			@AttributeOverride(name = "origen", column = @Column(name = "ORIGEN", nullable = false, length = 4) ),
			@AttributeOverride(name = "nombres", column = @Column(name = "NOMBRES", length = 40) ),
			@AttributeOverride(name = "nombrecompleto", column = @Column(name = "NOMBRECOMPLETO", length = 100) ),
			@AttributeOverride(name = "busqueda", column = @Column(name = "BUSQUEDA", length = 100) ),
			@AttributeOverride(name = "tipodocumentoidentidad", column = @Column(name = "TIPODOCUMENTOIDENTIDAD", length = 1) ),
			@AttributeOverride(name = "documentoidentidad", column = @Column(name = "DOCUMENTOIDENTIDAD", length = 20) ),
			@AttributeOverride(name = "escliente", column = @Column(name = "ESCLIENTE", length = 1) ),
			@AttributeOverride(name = "esproveedor", column = @Column(name = "ESPROVEEDOR", length = 1) ),
			@AttributeOverride(name = "esempleado", column = @Column(name = "ESEMPLEADO", length = 1) ),
			@AttributeOverride(name = "esotro", column = @Column(name = "ESOTRO", length = 1) ),
			@AttributeOverride(name = "tipopersona", column = @Column(name = "TIPOPERSONA", length = 1) ),
			@AttributeOverride(name = "fechanacimiento", column = @Column(name = "FECHANACIMIENTO", length = 23) ),
			@AttributeOverride(name = "ciudadnacimiento", column = @Column(name = "CIUDADNACIMIENTO", length = 20) ),
			@AttributeOverride(name = "documentofiscal", column = @Column(name = "DOCUMENTOFISCAL", length = 20) ),
			@AttributeOverride(name = "documento", column = @Column(name = "DOCUMENTO", nullable = false, length = 20) ),
			@AttributeOverride(name = "personaant", column = @Column(name = "PERSONAANT", length = 15) ),
			@AttributeOverride(name = "correoelectronico", column = @Column(name = "CORREOELECTRONICO", length = 50) ),
			@AttributeOverride(name = "clasepersonacodigo", column = @Column(name = "CLASEPERSONACODIGO", length = 3) ),
			@AttributeOverride(name = "estado", column = @Column(name = "ESTADO", length = 1) ),
			@AttributeOverride(name = "ultimousuario", column = @Column(name = "ULTIMOUSUARIO", length = 25) ),
			@AttributeOverride(name = "ultimafechamodif", column = @Column(name = "ULTIMAFECHAMODIF", length = 23) ),
			@AttributeOverride(name = "tipopersonausuario", column = @Column(name = "TIPOPERSONAUSUARIO", length = 3) ),
			@AttributeOverride(name = "cmp", column = @Column(name = "CMP", length = 25) ),
			@AttributeOverride(name = "foto", column = @Column(name = "FOTO", length = 150) ),
			@AttributeOverride(name = "numeroregistroespecialidad", column = @Column(name = "NUMEROREGISTROESPECIALIDAD", length = 25) ),
			@AttributeOverride(name = "tipogeneracioncita", column = @Column(name = "TIPOGENERACIONCITA") ),
			@AttributeOverride(name = "tiempopromedioatencion", column = @Column(name = "TIEMPOPROMEDIOATENCION", precision = 9) ),
			@AttributeOverride(name = "idespecialidad", column = @Column(name = "IDESPECIALIDAD") ),
			@AttributeOverride(name = "nombre", column = @Column(name = "NOMBRE", length = 80) ),
			@AttributeOverride(name = "accion", column = @Column(name = "ACCION", length = 25) ),
			@AttributeOverride(name = "sexo", column = @Column(name = "SEXO", length = 1) ),
			@AttributeOverride(name = "direccion", column = @Column(name = "DIRECCION", length = 190) ),
			@AttributeOverride(name = "telefono", column = @Column(name = "TELEFONO", length = 15) ),
			@AttributeOverride(name = "programado", column = @Column(name = "PROGRAMADO", nullable = false) ),
			@AttributeOverride(name = "servicio", column = @Column(name = "SERVICIO", nullable = false) ),
			@AttributeOverride(name = "tipohorario", column = @Column(name = "TIPOHORARIO", nullable = false, length = 3) ),
			@AttributeOverride(name = "idhorario", column = @Column(name = "IDHORARIO", nullable = false) ),
			@AttributeOverride(name = "codigousuario", column = @Column(name = "CODIGOUSUARIO", length = 25) ) })
	public VwSsGeEspecialidadmedicoId getId() {
		return this.id;
	}

	public void setId(VwSsGeEspecialidadmedicoId id) {
		this.id = id;
	}

}
