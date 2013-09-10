/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "tipo_atendimento", catalog = "jpa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAtendimento.findAll", query = "SELECT t FROM TipoAtendimento t"),
    @NamedQuery(name = "TipoAtendimento.findByIdtipoAtendimento", query = "SELECT t FROM TipoAtendimento t WHERE t.idtipoAtendimento = :idtipoAtendimento"),
    @NamedQuery(name = "TipoAtendimento.findByDescricao", query = "SELECT t FROM TipoAtendimento t WHERE t.descricao = :descricao")})
public class TipoAtendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_atendimento")
    private Integer idtipoAtendimento;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(mappedBy = "idTipoAtendimento")
    private List<Chamado> chamadoList;

    public TipoAtendimento() {
        chamadoList = new ArrayList<>();
    }

    public TipoAtendimento(Integer idtipoAtendimento) {
        this.idtipoAtendimento = idtipoAtendimento;
         chamadoList = new ArrayList<>();
    }

    public Integer getIdtipoAtendimento() {
        return idtipoAtendimento;
    }

    public void setIdtipoAtendimento(Integer idtipoAtendimento) {
        this.idtipoAtendimento = idtipoAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Chamado> getChamadoList() {
        return chamadoList;
    }

    public void setChamadoList(List<Chamado> chamadoList) {
        this.chamadoList = chamadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoAtendimento != null ? idtipoAtendimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAtendimento)) {
            return false;
        }
        TipoAtendimento other = (TipoAtendimento) object;
        if ((this.idtipoAtendimento == null && other.idtipoAtendimento != null) || (this.idtipoAtendimento != null && !this.idtipoAtendimento.equals(other.idtipoAtendimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    public void addChamados(Chamado c) {
        chamadoList.add(c);
    }
    
}
