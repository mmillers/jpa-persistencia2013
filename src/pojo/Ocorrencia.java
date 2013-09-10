/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maximiller
 */
@Entity
@Table(name = "ocorrencia", catalog = "jpa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ocorrencia.findAll", query = "SELECT o FROM Ocorrencia o"),
    @NamedQuery(name = "Ocorrencia.findByIdocorrencia", query = "SELECT o FROM Ocorrencia o WHERE o.idocorrencia = :idocorrencia"),
    @NamedQuery(name = "Ocorrencia.findByAbertura", query = "SELECT o FROM Ocorrencia o WHERE o.abertura = :abertura")})
public class Ocorrencia implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idocorrencia")
    private Integer idocorrencia;
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "abertura")
    private String abertura;
    @JoinColumn(name = "id_chamado", referencedColumnName = "idchamado")
    @ManyToOne
    private Chamado idChamado;

    public Ocorrencia() {
    }

    public Ocorrencia(Integer idocorrencia) {
        this.idocorrencia = idocorrencia;
    }

    public Integer getIdocorrencia() {
        return idocorrencia;
    }

    public void setIdocorrencia(Integer idocorrencia) {
        Integer oldIdocorrencia = this.idocorrencia;
        this.idocorrencia = idocorrencia;
        changeSupport.firePropertyChange("idocorrencia", oldIdocorrencia, idocorrencia);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        String oldAbertura = this.abertura;
        this.abertura = abertura;
        changeSupport.firePropertyChange("abertura", oldAbertura, abertura);
    }

    public Chamado getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Chamado idChamado) {
        Chamado oldIdChamado = this.idChamado;
        this.idChamado = idChamado;
        changeSupport.firePropertyChange("idChamado", oldIdChamado, idChamado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idocorrencia != null ? idocorrencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocorrencia)) {
            return false;
        }
        Ocorrencia other = (Ocorrencia) object;
        if ((this.idocorrencia == null && other.idocorrencia != null) || (this.idocorrencia != null && !this.idocorrencia.equals(other.idocorrencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.Ocorrencia[ idocorrencia=" + idocorrencia + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
