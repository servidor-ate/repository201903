package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mamania on 16/05/2017.
 */
public class SsHcObligaciondetallePK implements Serializable {
    private Integer secuencia;
    private Integer oblobligacionid;

    @Column(name = "Secuencia")
    @Id
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    @Column(name = "Oblobligacionid")
    @Id
    public Integer getOblobligacionid() {
        return oblobligacionid;
    }

    public void setOblobligacionid(Integer oblobligacionid) {
        this.oblobligacionid = oblobligacionid;
    }



}
