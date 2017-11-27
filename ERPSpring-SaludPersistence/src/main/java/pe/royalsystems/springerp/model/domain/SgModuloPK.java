package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mamania on 08/05/2017.
 */
public class SgModuloPK implements Serializable {
    private String sistema;
    private String modulo;

    @Column(name = "Sistema")
    @Id
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Column(name = "Modulo")
    @Id
    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgModuloPK that = (SgModuloPK) o;

        if (sistema != null ? !sistema.equals(that.sistema) : that.sistema != null) return false;
        if (modulo != null ? !modulo.equals(that.modulo) : that.modulo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sistema != null ? sistema.hashCode() : 0;
        result = 31 * result + (modulo != null ? modulo.hashCode() : 0);
        return result;
    }
}
