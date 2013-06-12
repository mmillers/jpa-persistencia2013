/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Maximiller
 */
@Entity
@Table(name = "setor", catalog = "jpa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Setor.findAll", query = "SELECT s FROM Setor s"),
    @NamedQuery(name = "Setor.findByIdsetor", query = "SELECT s FROM Setor s WHERE s.idsetor = :idsetor"),
    @NamedQuery(name = "Setor.findByDescricao", query = "SELECT s FROM Setor s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Setor.findByRamal", query = "SELECT s FROM Setor s WHERE s.ramal = :ramal")})
public class Setor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "idsetor")
    private Integer idsetor;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "ramal")
    private String ramal;
    @OneToMany(mappedBy = "idSetor")
    private List<Equipamento> equipamentoList;

    public Setor() {
    }

    public Setor(Integer idsetor) {
        this.idsetor = idsetor;
    }

    public Integer getIdsetor() {
        return idsetor;
    }

    public void setIdsetor(Integer idsetor) {
        this.idsetor = idsetor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @XmlTransient
    public List<Equipamento> getEquipamentoList() {
        return equipamentoList;
    }

    public void setEquipamentoList(List<Equipamento> equipamentoList) {
        this.equipamentoList = equipamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsetor != null ? idsetor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setor)) {
            return false;
        }
        Setor other = (Setor) object;
        if ((this.idsetor == null && other.idsetor != null) || (this.idsetor != null && !this.idsetor.equals(other.idsetor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.Setor[ idsetor=" + idsetor + " ]";
    }
    
}
