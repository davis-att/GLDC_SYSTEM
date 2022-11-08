/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dg3861
 */
@Entity
@Table(name = "pw_queue_programacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PwQueueProgramacion.findAll", query = "SELECT p FROM PwQueueProgramacion p")
    , @NamedQuery(name = "PwQueueProgramacion.findByIdProg", query = "SELECT p FROM PwQueueProgramacion p WHERE p.idProg = :idProg")
    , @NamedQuery(name = "PwQueueProgramacion.findByIdUsuario", query = "SELECT p FROM PwQueueProgramacion p WHERE p.idUsuario = :idUsuario")
    , @NamedQuery(name = "PwQueueProgramacion.findByFechaInicial", query = "SELECT p FROM PwQueueProgramacion p WHERE p.fechaInicial = :fechaInicial")
    , @NamedQuery(name = "PwQueueProgramacion.findByFechaFinal", query = "SELECT p FROM PwQueueProgramacion p WHERE p.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "PwQueueProgramacion.findByFechaRegistro", query = "SELECT p FROM PwQueueProgramacion p WHERE p.fechaRegistro = :fechaRegistro")})
public class PwQueueProgramacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_prog")
    private BigDecimal idProg;
    @Column(name = "id_usuario")
    private BigInteger idUsuario;
    @Column(name = "fecha_inicial  ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "fecha_final   ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "fecha_registro  ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    public PwQueueProgramacion() {
    }

    public PwQueueProgramacion(BigDecimal idProg) {
        this.idProg = idProg;
    }

    public BigDecimal getIdProg() {
        return idProg;
    }

    public void setIdProg(BigDecimal idProg) {
        this.idProg = idProg;
    }

    public BigInteger getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigInteger idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProg != null ? idProg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PwQueueProgramacion)) {
            return false;
        }
        PwQueueProgramacion other = (PwQueueProgramacion) object;
        if ((this.idProg == null && other.idProg != null) || (this.idProg != null && !this.idProg.equals(other.idProg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.PwQueueProgramacion[ idProg=" + idProg + " ]";
    }
    
}
