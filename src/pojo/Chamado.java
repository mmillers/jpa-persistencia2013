/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maximiller
 */
@Entity
@Table(name = "chamado", catalog = "jpa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chamado.findAll", query = "SELECT c FROM Chamado c"),
    @NamedQuery(name = "Chamado.findByIdchamado", query = "SELECT c FROM Chamado c WHERE c.idchamado = :idchamado"),
    @NamedQuery(name = "Chamado.findByStatus", query = "SELECT c FROM Chamado c WHERE c.status = :status")})
public class Chamado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "idchamado")
    private Integer idchamado;
    @Lob
    @Column(name = "desc_problema")
    private String descProblema;
    @Lob
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_usuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "id_equipamento", referencedColumnName = "idequipamento")
    @ManyToOne
    private Equipamento idEquipamento;
    @JoinColumn(name = "id_tipo_atendimento", referencedColumnName = "idtipo_atendimento")
    @ManyToOne
    private TipoAtendimento idTipoAtendimento;

    public Chamado() {
    }

    public Chamado(Integer idchamado) {
        this.idchamado = idchamado;
    }

    public Integer getIdchamado() {
        return idchamado;
    }

    public void setIdchamado(Integer idchamado) {
        this.idchamado = idchamado;
    }

    public String getDescProblema() {
        return descProblema;
    }

    public void setDescProblema(String descProblema) {
        this.descProblema = descProblema;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Equipamento getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Equipamento idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public TipoAtendimento getIdTipoAtendimento() {
        return idTipoAtendimento;
    }

    public void setIdTipoAtendimento(TipoAtendimento idTipoAtendimento) {
        this.idTipoAtendimento = idTipoAtendimento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idchamado != null ? idchamado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamado)) {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.idchamado == null && other.idchamado != null) || (this.idchamado != null && !this.idchamado.equals(other.idchamado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.Chamado[ idchamado=" + idchamado + " ]";
    }
    
}
