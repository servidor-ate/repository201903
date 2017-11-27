package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by AquilesMH on 09/10/2015.
 */
@Entity
public class Usuario  extends Entidad implements Serializable{
    private String usuario;

    @Id
    @javax.persistence.Column(name = "Usuario")
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    private String usuarioPerfil;

    @Basic
    @javax.persistence.Column(name = "UsuarioPerfil")
    public String getUsuarioPerfil() {
        return usuarioPerfil;
    }

    public void setUsuarioPerfil(String usuarioPerfil) {
        this.usuarioPerfil = usuarioPerfil;
    }

    private String nombre;

    @Basic
    @javax.persistence.Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String clave;

    @Basic
    @javax.persistence.Column(name = "Clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    private String expirarPasswordFlag;

    @Basic
    @javax.persistence.Column(name = "ExpirarPasswordFlag")
    public String getExpirarPasswordFlag() {
        return expirarPasswordFlag;
    }

    public void setExpirarPasswordFlag(String expirarPasswordFlag) {
        this.expirarPasswordFlag = expirarPasswordFlag;
    }

    private Timestamp fechaExpiracion;

    @Basic
    @javax.persistence.Column(name = "FechaExpiracion")
    public Timestamp getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Timestamp fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    private Timestamp ultimoLogin;

    @Basic
    @javax.persistence.Column(name = "UltimoLogin")
    public Timestamp getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(Timestamp ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    private Integer numeroLoginsDisponible;

    @Basic
    @javax.persistence.Column(name = "NumeroLoginsDisponible")
    public Integer getNumeroLoginsDisponible() {
        return numeroLoginsDisponible;
    }

    public void setNumeroLoginsDisponible(Integer numeroLoginsDisponible) {
        this.numeroLoginsDisponible = numeroLoginsDisponible;
    }

    private Integer numeroLoginsUsados;

    @Basic
    @javax.persistence.Column(name = "NumeroLoginsUsados")
    public Integer getNumeroLoginsUsados() {
        return numeroLoginsUsados;
    }

    public void setNumeroLoginsUsados(Integer numeroLoginsUsados) {
        this.numeroLoginsUsados = numeroLoginsUsados;
    }

    private String usuarioRed;

    @Basic
    @javax.persistence.Column(name = "UsuarioRed")
    public String getUsuarioRed() {
        return usuarioRed;
    }

    public void setUsuarioRed(String usuarioRed) {
        this.usuarioRed = usuarioRed;
    }

    private String sqlLogin;

    @Basic
    @javax.persistence.Column(name = "SQLLogin")
    public String getSqlLogin() {
        return sqlLogin;
    }

    public void setSqlLogin(String sqlLogin) {
        this.sqlLogin = sqlLogin;
    }

    private String sqlPassword;

    @Basic
    @javax.persistence.Column(name = "SQLPassword")
    public String getSqlPassword() {
        return sqlPassword;
    }

    public void setSqlPassword(String sqlPassword) {
        this.sqlPassword = sqlPassword;
    }

    private String estado;

    @Basic
    @javax.persistence.Column(name = "Estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String ultimoUsuario;

    @Basic
    @javax.persistence.Column(name = "UltimoUsuario")
    public String getUltimoUsuario() {
        return ultimoUsuario;
    }

    public void setUltimoUsuario(String ultimoUsuario) {
        this.ultimoUsuario = ultimoUsuario;
    }

    private Timestamp ultimaFechaModif;

    @Basic
    @javax.persistence.Column(name = "UltimaFechaModif")
    public Timestamp getUltimaFechaModif() {
        return ultimaFechaModif;
    }

    public void setUltimaFechaModif(Timestamp ultimaFechaModif) {
        this.ultimaFechaModif = ultimaFechaModif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario1 = (Usuario) o;

        if (usuario != null ? !usuario.equals(usuario1.usuario) : usuario1.usuario != null) return false;
        if (usuarioPerfil != null ? !usuarioPerfil.equals(usuario1.usuarioPerfil) : usuario1.usuarioPerfil != null)
            return false;
        if (nombre != null ? !nombre.equals(usuario1.nombre) : usuario1.nombre != null) return false;
        if (clave != null ? !clave.equals(usuario1.clave) : usuario1.clave != null) return false;
        if (expirarPasswordFlag != null ? !expirarPasswordFlag.equals(usuario1.expirarPasswordFlag) : usuario1.expirarPasswordFlag != null)
            return false;
        if (fechaExpiracion != null ? !fechaExpiracion.equals(usuario1.fechaExpiracion) : usuario1.fechaExpiracion != null)
            return false;
        if (ultimoLogin != null ? !ultimoLogin.equals(usuario1.ultimoLogin) : usuario1.ultimoLogin != null)
            return false;
        if (numeroLoginsDisponible != null ? !numeroLoginsDisponible.equals(usuario1.numeroLoginsDisponible) : usuario1.numeroLoginsDisponible != null)
            return false;
        if (numeroLoginsUsados != null ? !numeroLoginsUsados.equals(usuario1.numeroLoginsUsados) : usuario1.numeroLoginsUsados != null)
            return false;
        if (usuarioRed != null ? !usuarioRed.equals(usuario1.usuarioRed) : usuario1.usuarioRed != null) return false;
        if (sqlLogin != null ? !sqlLogin.equals(usuario1.sqlLogin) : usuario1.sqlLogin != null) return false;
        if (sqlPassword != null ? !sqlPassword.equals(usuario1.sqlPassword) : usuario1.sqlPassword != null)
            return false;
        if (estado != null ? !estado.equals(usuario1.estado) : usuario1.estado != null) return false;
        if (ultimoUsuario != null ? !ultimoUsuario.equals(usuario1.ultimoUsuario) : usuario1.ultimoUsuario != null)
            return false;
        if (ultimaFechaModif != null ? !ultimaFechaModif.equals(usuario1.ultimaFechaModif) : usuario1.ultimaFechaModif != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usuario != null ? usuario.hashCode() : 0;
        result = 31 * result + (usuarioPerfil != null ? usuarioPerfil.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (expirarPasswordFlag != null ? expirarPasswordFlag.hashCode() : 0);
        result = 31 * result + (fechaExpiracion != null ? fechaExpiracion.hashCode() : 0);
        result = 31 * result + (ultimoLogin != null ? ultimoLogin.hashCode() : 0);
        result = 31 * result + (numeroLoginsDisponible != null ? numeroLoginsDisponible.hashCode() : 0);
        result = 31 * result + (numeroLoginsUsados != null ? numeroLoginsUsados.hashCode() : 0);
        result = 31 * result + (usuarioRed != null ? usuarioRed.hashCode() : 0);
        result = 31 * result + (sqlLogin != null ? sqlLogin.hashCode() : 0);
        result = 31 * result + (sqlPassword != null ? sqlPassword.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (ultimoUsuario != null ? ultimoUsuario.hashCode() : 0);
        result = 31 * result + (ultimaFechaModif != null ? ultimaFechaModif.hashCode() : 0);
        return result;
    }
}
