package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mamania on 20/11/2015.
 */
@Entity
@javax.persistence.Table(name = "SS_GE_Paciente")
public class SsGePaciente extends Entidad implements Serializable{
    private Integer idPaciente;

    @Id
    @javax.persistence.Column(name = "IdPaciente")
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    private Integer tipoPaciente;

    @Basic
    @javax.persistence.Column(name = "TipoPaciente")
    public Integer getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(Integer tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    private Integer edad;

    @Basic
    @javax.persistence.Column(name = "Edad")
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    private String raza;

    @Basic
    @javax.persistence.Column(name = "Raza")
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    private String religion;

    @Basic
    @javax.persistence.Column(name = "Religion")
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    private String cargo;

    @Basic
    @javax.persistence.Column(name = "Cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private String areaLaboral;

    @Basic
    @javax.persistence.Column(name = "AreaLaboral")
    public String getAreaLaboral() {
        return areaLaboral;
    }

    public void setAreaLaboral(String areaLaboral) {
        this.areaLaboral = areaLaboral;
    }

    private String ocupacion;

    @Basic
    @javax.persistence.Column(name = "Ocupacion")
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    private String codigoHc;

    @Basic
    @javax.persistence.Column(name = "CodigoHC")
    public String getCodigoHc() {
        return codigoHc;
    }

    public void setCodigoHc(String codigoHc) {
        this.codigoHc = codigoHc;
    }

    private String codigoHcAnterior;

    @Basic
    @javax.persistence.Column(name = "CodigoHCAnterior")
    public String getCodigoHcAnterior() {
        return codigoHcAnterior;
    }

    public void setCodigoHcAnterior(String codigoHcAnterior) {
        this.codigoHcAnterior = codigoHcAnterior;
    }

    private String codigoHcSecundario;

    @Basic
    @javax.persistence.Column(name = "CodigoHCSecundario")
    public String getCodigoHcSecundario() {
        return codigoHcSecundario;
    }

    public void setCodigoHcSecundario(String codigoHcSecundario) {
        this.codigoHcSecundario = codigoHcSecundario;
    }

    private String tipoAlmacenamiento;

    @Basic
    @javax.persistence.Column(name = "TipoAlmacenamiento")
    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    private String tipoHistoria;

    @Basic
    @javax.persistence.Column(name = "TipoHistoria")
    public String getTipoHistoria() {
        return tipoHistoria;
    }

    public void setTipoHistoria(String tipoHistoria) {
        this.tipoHistoria = tipoHistoria;
    }

    private String tipoSituacion;

    @Basic
    @javax.persistence.Column(name = "TipoSituacion")
    public String getTipoSituacion() {
        return tipoSituacion;
    }

    public void setTipoSituacion(String tipoSituacion) {
        this.tipoSituacion = tipoSituacion;
    }

    private Integer idUbicacion;

    @Basic
    @javax.persistence.Column(name = "IdUbicacion")
    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    private String lugarProcedencia;

    @Basic
    @javax.persistence.Column(name = "LugarProcedencia")
    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    private String rutaFoto;

    @Basic
    @javax.persistence.Column(name = "RutaFoto")
    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    private Date fechaIngreso;

    @Basic
    @javax.persistence.Column(name = "FechaIngreso")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    private Integer indicadorNuevo;

    @Basic
    @javax.persistence.Column(name = "IndicadorNuevo")
    public Integer getIndicadorNuevo() {
        return indicadorNuevo;
    }

    public void setIndicadorNuevo(Integer indicadorNuevo) {
        this.indicadorNuevo = indicadorNuevo;
    }

    private Integer estado;

    @Basic
    @javax.persistence.Column(name = "Estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    private String usuarioCreacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioCreacion")
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    private Date fechaCreacion;

    @Basic
    @javax.persistence.Column(name = "FechaCreacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    private String usuarioModificacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioModificacion")
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    private Date fechaModificacion;

    @Basic
    @javax.persistence.Column(name = "FechaModificacion")
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    private Integer numeroFile;

    @Basic
    @javax.persistence.Column(name = "NumeroFile")
    public Integer getNumeroFile() {
        return numeroFile;
    }

    public void setNumeroFile(Integer numeroFile) {
        this.numeroFile = numeroFile;
    }

    private String servicio;

    @Basic
    @javax.persistence.Column(name = "Servicio")
    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    private String usuarioAlmacenamiento;

    @Basic
    @javax.persistence.Column(name = "UsuarioAlmacenamiento")
    public String getUsuarioAlmacenamiento() {
        return usuarioAlmacenamiento;
    }

    public void setUsuarioAlmacenamiento(String usuarioAlmacenamiento) {
        this.usuarioAlmacenamiento = usuarioAlmacenamiento;
    }

    private Date fechaAlmacenamiento;

    @Basic
    @javax.persistence.Column(name = "FechaAlmacenamiento")
    public Date getFechaAlmacenamiento() {
        return fechaAlmacenamiento;
    }

    public void setFechaAlmacenamiento(Date fechaAlmacenamiento) {
        this.fechaAlmacenamiento = fechaAlmacenamiento;
    }

    private String observacion;

    @Basic
    @javax.persistence.Column(name = "Observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    private Integer indicadorAsistencia;

    @Basic
    @javax.persistence.Column(name = "IndicadorAsistencia")
    public Integer getIndicadorAsistencia() {
        return indicadorAsistencia;
    }

    public void setIndicadorAsistencia(Integer indicadorAsistencia) {
        this.indicadorAsistencia = indicadorAsistencia;
    }

    private Integer cantidadAsistencia;

    @Basic
    @javax.persistence.Column(name = "CantidadAsistencia")
    public Integer getCantidadAsistencia() {
        return cantidadAsistencia;
    }

    public void setCantidadAsistencia(Integer cantidadAsistencia) {
        this.cantidadAsistencia = cantidadAsistencia;
    }

    private Integer ubicacionHhcc;

    @Basic
    @javax.persistence.Column(name = "UbicacionHHCC")
    public Integer getUbicacionHhcc() {
        return ubicacionHhcc;
    }

    public void setUbicacionHhcc(Integer ubicacionHhcc) {
        this.ubicacionHhcc = ubicacionHhcc;
    }

    private Integer indicadorMigradoSiteds;

    @Basic
    @javax.persistence.Column(name = "IndicadorMigradoSiteds")
    public Integer getIndicadorMigradoSiteds() {
        return indicadorMigradoSiteds;
    }

    public void setIndicadorMigradoSiteds(Integer indicadorMigradoSiteds) {
        this.indicadorMigradoSiteds = indicadorMigradoSiteds;
    }

    private String numeroCaja;

    @Basic
    @javax.persistence.Column(name = "NumeroCaja")
    public String getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(String numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    private Integer indicadorCodigoBarras;

    @Basic
    @javax.persistence.Column(name = "IndicadorCodigoBarras")
    public Integer getIndicadorCodigoBarras() {
        return indicadorCodigoBarras;
    }

    public void setIndicadorCodigoBarras(Integer indicadorCodigoBarras) {
        this.indicadorCodigoBarras = indicadorCodigoBarras;
    }

    private Integer idpacienteOk;

    @Basic
    @javax.persistence.Column(name = "IDPACIENTE_OK")
    public Integer getIdpacienteOk() {
        return idpacienteOk;
    }

    public void setIdpacienteOk(Integer idpacienteOk) {
        this.idpacienteOk = idpacienteOk;
    }

    private String codigoAsegurado;

    @Basic
    @javax.persistence.Column(name = "CodigoAsegurado")
    public String getCodigoAsegurado() {
        return codigoAsegurado;
    }

    public void setCodigoAsegurado(String codigoAsegurado) {
        this.codigoAsegurado = codigoAsegurado;
    }

    private Integer numeroPoliza;

    @Basic
    @javax.persistence.Column(name = "NumeroPoliza")
    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    private Integer numeroCertificado;

    @Basic
    @javax.persistence.Column(name = "NumeroCertificado")
    public Integer getNumeroCertificado() {
        return numeroCertificado;
    }

    public void setNumeroCertificado(Integer numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }

    private String codigoProducto;

    @Basic
    @javax.persistence.Column(name = "CodigoProducto")
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    private String codigoPlan;

    @Basic
    @javax.persistence.Column(name = "CodigoPlan")
    public String getCodigoPlan() {
        return codigoPlan;
    }

    public void setCodigoPlan(String codigoPlan) {
        this.codigoPlan = codigoPlan;
    }

    private Integer tipoParentesco;

    @Basic
    @javax.persistence.Column(name = "TipoParentesco")
    public Integer getTipoParentesco() {
        return tipoParentesco;
    }

    public void setTipoParentesco(Integer tipoParentesco) {
        this.tipoParentesco = tipoParentesco;
    }

    private String codigoBeneficio;

    @Basic
    @javax.persistence.Column(name = "CodigoBeneficio")
    public String getCodigoBeneficio() {
        return codigoBeneficio;
    }

    public void setCodigoBeneficio(String codigoBeneficio) {
        this.codigoBeneficio = codigoBeneficio;
    }

    private Integer situacion;

    @Basic
    @javax.persistence.Column(name = "Situacion")
    public Integer getSituacion() {
        return situacion;
    }

    public void setSituacion(Integer situacion) {
        this.situacion = situacion;
    }

    private Integer tomoActual;

    @Basic
    @javax.persistence.Column(name = "TomoActual")
    public Integer getTomoActual() {
        return tomoActual;
    }

    public void setTomoActual(Integer tomoActual) {
        this.tomoActual = tomoActual;
    }

    private Integer indicadorHistoriaFisica;

    @Basic
    @javax.persistence.Column(name = "IndicadorHistoriaFisica")
    public Integer getIndicadorHistoriaFisica() {
        return indicadorHistoriaFisica;
    }

    public void setIndicadorHistoriaFisica(Integer indicadorHistoriaFisica) {
        this.indicadorHistoriaFisica = indicadorHistoriaFisica;
    }

    private String descripcionHistoria;

    @Basic
    @javax.persistence.Column(name = "DescripcionHistoria")
    public String getDescripcionHistoria() {
        return descripcionHistoria;
    }

    public void setDescripcionHistoria(String descripcionHistoria) {
        this.descripcionHistoria = descripcionHistoria;
    }

    private String accion;

    @Basic
    @javax.persistence.Column(name = "Accion")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    private Integer idPersonal;

    @Basic
    @javax.persistence.Column(name = "IdPersonal")
    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    private String atencionLugar;

    @Basic
    @javax.persistence.Column(name = "AtencionLugar")
    public String getAtencionLugar() {
        return atencionLugar;
    }

    public void setAtencionLugar(String atencionLugar) {
        this.atencionLugar = atencionLugar;
    }

    private String atencion;

    @Basic
    @javax.persistence.Column(name = "Atencion")
    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    private String idEstablecimientoIngreso;

    @Basic
    @javax.persistence.Column(name = "IdEstablecimientoIngreso")
    public String getIdEstablecimientoIngreso() {
        return idEstablecimientoIngreso;
    }

    public void setIdEstablecimientoIngreso(String idEstablecimientoIngreso) {
        this.idEstablecimientoIngreso = idEstablecimientoIngreso;
    }

    private String idServicioIngreso;

    @Basic
    @javax.persistence.Column(name = "IdServicioIngreso")
    public String getIdServicioIngreso() {
        return idServicioIngreso;
    }

    public void setIdServicioIngreso(String idServicioIngreso) {
        this.idServicioIngreso = idServicioIngreso;
    }

    private String prestacion;

    @Basic
    @javax.persistence.Column(name = "Prestacion")
    public String getPrestacion() {
        return prestacion;
    }

    public void setPrestacion(String prestacion) {
        this.prestacion = prestacion;
    }

    private String destino;

    @Basic
    @javax.persistence.Column(name = "Destino")
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    private Integer nroAutorizacion;

    @Basic
    @javax.persistence.Column(name = "NroAutorizacion")
    public Integer getNroAutorizacion() {
        return nroAutorizacion;
    }

    public void setNroAutorizacion(Integer nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
    }

    private BigDecimal monto;

    @Basic
    @javax.persistence.Column(name = "Monto")
    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    private Date fechaIngresoHosp;

    @Basic
    @javax.persistence.Column(name = "FechaIngresoHosp")
    public Date getFechaIngresoHosp() {
        return fechaIngresoHosp;
    }

    public void setFechaIngresoHosp(Date fechaIngresoHosp) {
        this.fechaIngresoHosp = fechaIngresoHosp;
    }

    private Date fechaCorteHosp;

    @Basic
    @javax.persistence.Column(name = "FechaCorteHosp")
    public Date getFechaCorteHosp() {
        return fechaCorteHosp;
    }

    public void setFechaCorteHosp(Date fechaCorteHosp) {
        this.fechaCorteHosp = fechaCorteHosp;
    }

    private String establecimiento01;

    @Basic
    @javax.persistence.Column(name = "Establecimiento01")
    public String getEstablecimiento01() {
        return establecimiento01;
    }

    public void setEstablecimiento01(String establecimiento01) {
        this.establecimiento01 = establecimiento01;
    }

    private String referenciaHoja01;

    @Basic
    @javax.persistence.Column(name = "ReferenciaHoja01")
    public String getReferenciaHoja01() {
        return referenciaHoja01;
    }

    public void setReferenciaHoja01(String referenciaHoja01) {
        this.referenciaHoja01 = referenciaHoja01;
    }

    private String establecimiento02;

    @Basic
    @javax.persistence.Column(name = "Establecimiento02")
    public String getEstablecimiento02() {
        return establecimiento02;
    }

    public void setEstablecimiento02(String establecimiento02) {
        this.establecimiento02 = establecimiento02;
    }

    private String referenciaHoja02;

    @Basic
    @javax.persistence.Column(name = "ReferenciaHoja02")
    public String getReferenciaHoja02() {
        return referenciaHoja02;
    }

    public void setReferenciaHoja02(String referenciaHoja02) {
        this.referenciaHoja02 = referenciaHoja02;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsGePaciente that = (SsGePaciente) o;

        if (idPaciente != that.idPaciente) return false;
        if (tipoPaciente != null ? !tipoPaciente.equals(that.tipoPaciente) : that.tipoPaciente != null) return false;
        if (edad != null ? !edad.equals(that.edad) : that.edad != null) return false;
        if (raza != null ? !raza.equals(that.raza) : that.raza != null) return false;
        if (religion != null ? !religion.equals(that.religion) : that.religion != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (areaLaboral != null ? !areaLaboral.equals(that.areaLaboral) : that.areaLaboral != null) return false;
        if (ocupacion != null ? !ocupacion.equals(that.ocupacion) : that.ocupacion != null) return false;
        if (codigoHc != null ? !codigoHc.equals(that.codigoHc) : that.codigoHc != null) return false;
        if (codigoHcAnterior != null ? !codigoHcAnterior.equals(that.codigoHcAnterior) : that.codigoHcAnterior != null)
            return false;
        if (codigoHcSecundario != null ? !codigoHcSecundario.equals(that.codigoHcSecundario) : that.codigoHcSecundario != null)
            return false;
        if (tipoAlmacenamiento != null ? !tipoAlmacenamiento.equals(that.tipoAlmacenamiento) : that.tipoAlmacenamiento != null)
            return false;
        if (tipoHistoria != null ? !tipoHistoria.equals(that.tipoHistoria) : that.tipoHistoria != null) return false;
        if (tipoSituacion != null ? !tipoSituacion.equals(that.tipoSituacion) : that.tipoSituacion != null)
            return false;
        if (idUbicacion != null ? !idUbicacion.equals(that.idUbicacion) : that.idUbicacion != null) return false;
        if (lugarProcedencia != null ? !lugarProcedencia.equals(that.lugarProcedencia) : that.lugarProcedencia != null)
            return false;
        if (rutaFoto != null ? !rutaFoto.equals(that.rutaFoto) : that.rutaFoto != null) return false;
        if (fechaIngreso != null ? !fechaIngreso.equals(that.fechaIngreso) : that.fechaIngreso != null) return false;
        if (indicadorNuevo != null ? !indicadorNuevo.equals(that.indicadorNuevo) : that.indicadorNuevo != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(that.usuarioCreacion) : that.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(that.usuarioModificacion) : that.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(that.fechaModificacion) : that.fechaModificacion != null)
            return false;
        if (numeroFile != null ? !numeroFile.equals(that.numeroFile) : that.numeroFile != null) return false;
        if (servicio != null ? !servicio.equals(that.servicio) : that.servicio != null) return false;
        if (usuarioAlmacenamiento != null ? !usuarioAlmacenamiento.equals(that.usuarioAlmacenamiento) : that.usuarioAlmacenamiento != null)
            return false;
        if (fechaAlmacenamiento != null ? !fechaAlmacenamiento.equals(that.fechaAlmacenamiento) : that.fechaAlmacenamiento != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (indicadorAsistencia != null ? !indicadorAsistencia.equals(that.indicadorAsistencia) : that.indicadorAsistencia != null)
            return false;
        if (cantidadAsistencia != null ? !cantidadAsistencia.equals(that.cantidadAsistencia) : that.cantidadAsistencia != null)
            return false;
        if (ubicacionHhcc != null ? !ubicacionHhcc.equals(that.ubicacionHhcc) : that.ubicacionHhcc != null)
            return false;
        if (indicadorMigradoSiteds != null ? !indicadorMigradoSiteds.equals(that.indicadorMigradoSiteds) : that.indicadorMigradoSiteds != null)
            return false;
        if (numeroCaja != null ? !numeroCaja.equals(that.numeroCaja) : that.numeroCaja != null) return false;
        if (indicadorCodigoBarras != null ? !indicadorCodigoBarras.equals(that.indicadorCodigoBarras) : that.indicadorCodigoBarras != null)
            return false;
        if (idpacienteOk != null ? !idpacienteOk.equals(that.idpacienteOk) : that.idpacienteOk != null) return false;
        if (codigoAsegurado != null ? !codigoAsegurado.equals(that.codigoAsegurado) : that.codigoAsegurado != null)
            return false;
        if (numeroPoliza != null ? !numeroPoliza.equals(that.numeroPoliza) : that.numeroPoliza != null) return false;
        if (numeroCertificado != null ? !numeroCertificado.equals(that.numeroCertificado) : that.numeroCertificado != null)
            return false;
        if (codigoProducto != null ? !codigoProducto.equals(that.codigoProducto) : that.codigoProducto != null)
            return false;
        if (codigoPlan != null ? !codigoPlan.equals(that.codigoPlan) : that.codigoPlan != null) return false;
        if (tipoParentesco != null ? !tipoParentesco.equals(that.tipoParentesco) : that.tipoParentesco != null)
            return false;
        if (codigoBeneficio != null ? !codigoBeneficio.equals(that.codigoBeneficio) : that.codigoBeneficio != null)
            return false;
        if (situacion != null ? !situacion.equals(that.situacion) : that.situacion != null) return false;
        if (tomoActual != null ? !tomoActual.equals(that.tomoActual) : that.tomoActual != null) return false;
        if (indicadorHistoriaFisica != null ? !indicadorHistoriaFisica.equals(that.indicadorHistoriaFisica) : that.indicadorHistoriaFisica != null)
            return false;
        if (descripcionHistoria != null ? !descripcionHistoria.equals(that.descripcionHistoria) : that.descripcionHistoria != null)
            return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;
        if (idPersonal != null ? !idPersonal.equals(that.idPersonal) : that.idPersonal != null) return false;
        if (atencionLugar != null ? !atencionLugar.equals(that.atencionLugar) : that.atencionLugar != null)
            return false;
        if (atencion != null ? !atencion.equals(that.atencion) : that.atencion != null) return false;
        if (idEstablecimientoIngreso != null ? !idEstablecimientoIngreso.equals(that.idEstablecimientoIngreso) : that.idEstablecimientoIngreso != null)
            return false;
        if (idServicioIngreso != null ? !idServicioIngreso.equals(that.idServicioIngreso) : that.idServicioIngreso != null)
            return false;
        if (prestacion != null ? !prestacion.equals(that.prestacion) : that.prestacion != null) return false;
        if (destino != null ? !destino.equals(that.destino) : that.destino != null) return false;
        if (nroAutorizacion != null ? !nroAutorizacion.equals(that.nroAutorizacion) : that.nroAutorizacion != null)
            return false;
        if (monto != null ? !monto.equals(that.monto) : that.monto != null) return false;
        if (fechaIngresoHosp != null ? !fechaIngresoHosp.equals(that.fechaIngresoHosp) : that.fechaIngresoHosp != null)
            return false;
        if (fechaCorteHosp != null ? !fechaCorteHosp.equals(that.fechaCorteHosp) : that.fechaCorteHosp != null)
            return false;
        if (establecimiento01 != null ? !establecimiento01.equals(that.establecimiento01) : that.establecimiento01 != null)
            return false;
        if (referenciaHoja01 != null ? !referenciaHoja01.equals(that.referenciaHoja01) : that.referenciaHoja01 != null)
            return false;
        if (establecimiento02 != null ? !establecimiento02.equals(that.establecimiento02) : that.establecimiento02 != null)
            return false;
        if (referenciaHoja02 != null ? !referenciaHoja02.equals(that.referenciaHoja02) : that.referenciaHoja02 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
    	int result = idPaciente;
        result = 31 * result + (tipoPaciente != null ? tipoPaciente.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (raza != null ? raza.hashCode() : 0);
        result = 31 * result + (religion != null ? religion.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (areaLaboral != null ? areaLaboral.hashCode() : 0);
        result = 31 * result + (ocupacion != null ? ocupacion.hashCode() : 0);
        result = 31 * result + (codigoHc != null ? codigoHc.hashCode() : 0);
        result = 31 * result + (codigoHcAnterior != null ? codigoHcAnterior.hashCode() : 0);
        result = 31 * result + (codigoHcSecundario != null ? codigoHcSecundario.hashCode() : 0);
        result = 31 * result + (tipoAlmacenamiento != null ? tipoAlmacenamiento.hashCode() : 0);
        result = 31 * result + (tipoHistoria != null ? tipoHistoria.hashCode() : 0);
        result = 31 * result + (tipoSituacion != null ? tipoSituacion.hashCode() : 0);
        result = 31 * result + (idUbicacion != null ? idUbicacion.hashCode() : 0);
        result = 31 * result + (lugarProcedencia != null ? lugarProcedencia.hashCode() : 0);
        result = 31 * result + (rutaFoto != null ? rutaFoto.hashCode() : 0);
        result = 31 * result + (fechaIngreso != null ? fechaIngreso.hashCode() : 0);
        result = 31 * result + (indicadorNuevo != null ? indicadorNuevo.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (numeroFile != null ? numeroFile.hashCode() : 0);
        result = 31 * result + (servicio != null ? servicio.hashCode() : 0);
        result = 31 * result + (usuarioAlmacenamiento != null ? usuarioAlmacenamiento.hashCode() : 0);
        result = 31 * result + (fechaAlmacenamiento != null ? fechaAlmacenamiento.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (indicadorAsistencia != null ? indicadorAsistencia.hashCode() : 0);
        result = 31 * result + (cantidadAsistencia != null ? cantidadAsistencia.hashCode() : 0);
        result = 31 * result + (ubicacionHhcc != null ? ubicacionHhcc.hashCode() : 0);
        result = 31 * result + (indicadorMigradoSiteds != null ? indicadorMigradoSiteds.hashCode() : 0);
        result = 31 * result + (numeroCaja != null ? numeroCaja.hashCode() : 0);
        result = 31 * result + (indicadorCodigoBarras != null ? indicadorCodigoBarras.hashCode() : 0);
        result = 31 * result + (idpacienteOk != null ? idpacienteOk.hashCode() : 0);
        result = 31 * result + (codigoAsegurado != null ? codigoAsegurado.hashCode() : 0);
        result = 31 * result + (numeroPoliza != null ? numeroPoliza.hashCode() : 0);
        result = 31 * result + (numeroCertificado != null ? numeroCertificado.hashCode() : 0);
        result = 31 * result + (codigoProducto != null ? codigoProducto.hashCode() : 0);
        result = 31 * result + (codigoPlan != null ? codigoPlan.hashCode() : 0);
        result = 31 * result + (tipoParentesco != null ? tipoParentesco.hashCode() : 0);
        result = 31 * result + (codigoBeneficio != null ? codigoBeneficio.hashCode() : 0);
        result = 31 * result + (situacion != null ? situacion.hashCode() : 0);
        result = 31 * result + (tomoActual != null ? tomoActual.hashCode() : 0);
        result = 31 * result + (indicadorHistoriaFisica != null ? indicadorHistoriaFisica.hashCode() : 0);
        result = 31 * result + (descripcionHistoria != null ? descripcionHistoria.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (idPersonal != null ? idPersonal.hashCode() : 0);
        result = 31 * result + (atencionLugar != null ? atencionLugar.hashCode() : 0);
        result = 31 * result + (atencion != null ? atencion.hashCode() : 0);
        result = 31 * result + (idEstablecimientoIngreso != null ? idEstablecimientoIngreso.hashCode() : 0);
        result = 31 * result + (idServicioIngreso != null ? idServicioIngreso.hashCode() : 0);
        result = 31 * result + (prestacion != null ? prestacion.hashCode() : 0);
        result = 31 * result + (destino != null ? destino.hashCode() : 0);
        result = 31 * result + (nroAutorizacion != null ? nroAutorizacion.hashCode() : 0);
        result = 31 * result + (monto != null ? monto.hashCode() : 0);
        result = 31 * result + (fechaIngresoHosp != null ? fechaIngresoHosp.hashCode() : 0);
        result = 31 * result + (fechaCorteHosp != null ? fechaCorteHosp.hashCode() : 0);
        result = 31 * result + (establecimiento01 != null ? establecimiento01.hashCode() : 0);
        result = 31 * result + (referenciaHoja01 != null ? referenciaHoja01.hashCode() : 0);
        result = 31 * result + (establecimiento02 != null ? establecimiento02.hashCode() : 0);
        result = 31 * result + (referenciaHoja02 != null ? referenciaHoja02.hashCode() : 0);
        return result;
    }
}
