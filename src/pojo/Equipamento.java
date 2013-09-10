/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Maximiller
 */
@Entity
@Table(name = "equipamento", catalog = "jpa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipamento.findAll", query = "SELECT e FROM Equipamento e"),
    @NamedQuery(name = "Equipamento.findByIdequipamento", query = "SELECT e FROM Equipamento e WHERE e.idequipamento = :idequipamento"),
    @NamedQuery(name = "Equipamento.findByDescricao", query = "SELECT e FROM Equipamento e WHERE e.descricao = :descricao"),
    @NamedQuery(name = "Equipamento.findBySerie", query = "SELECT e FROM Equipamento e WHERE e.serie = :serie")})
public class Equipamento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idequipamento")
    private Integer idequipamento;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "serie")
    private String serie;
    @ManyToMany(mappedBy = "equipamentoList")
    private List<Chamado> chamadoList;
    @JoinColumn(name = "id_setor", referencedColumnName = "idsetor")
    @ManyToOne
    private Setor idSetor;

    public Equipamento() {
        chamadoList = new ArrayList<>();
    }

    public Equipamento(Integer idequipamento) {
        this.idequipamento = idequipamento;
        chamadoList = new ArrayList<>();
    }

    public Integer getIdequipamento() {
        return idequipamento;
    }

    public void setIdequipamento(Integer idequipamento) {
        Integer oldIdequipamento = this.idequipamento;
        this.idequipamento = idequipamento;
        changeSupport.firePropertyChange("idequipamento", oldIdequipamento, idequipamento);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        String oldSerie = this.serie;
        this.serie = serie;
        changeSupport.firePropertyChange("serie", oldSerie, serie);
    }

    @XmlTransient
    public List<Chamado> getChamadoList() {
        return chamadoList;
    }

    public void setChamadoList(List<Chamado> chamadoList) {
        this.chamadoList = chamadoList;
    }

    public Setor getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Setor idSetor) {
        Setor oldIdSetor = this.idSetor;
        this.idSetor = idSetor;
        changeSupport.firePropertyChange("idSetor", oldIdSetor, idSetor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipamento != null ? idequipamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamento)) {
            return false;
        }
        Equipamento other = (Equipamento) object;
        if ((this.idequipamento == null && other.idequipamento != null) || (this.idequipamento != null && !this.idequipamento.equals(other.idequipamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    public void addChamado( Chamado c) {
        chamadoList.add(c);
    }
    
    

}
