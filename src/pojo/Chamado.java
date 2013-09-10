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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "chamado", catalog = "jpa", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chamado.findAll", query = "SELECT c FROM Chamado c"),
    @NamedQuery(name = "Chamado.findByIdchamado", query = "SELECT c FROM Chamado c WHERE c.idchamado = :idchamado"),
    @NamedQuery(name = "Chamado.findByStatus", query = "SELECT c FROM Chamado c WHERE c.status = :status"),
    @NamedQuery(name = "Chamado.findByInicio", query = "SELECT c FROM Chamado c WHERE c.inicio = :inicio"),
    @NamedQuery(name = "Chamado.findByFim", query = "SELECT c FROM Chamado c WHERE c.fim = :fim")})
public class Chamado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idchamado")
    private Integer idchamado;
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Lob
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "status")
    private String status;
    @Column(name = "inicio")
    private String inicio;
    @Column(name = "fim")
    private String fim;
    @JoinTable(name = "chamado_has_equipamento", joinColumns = {
        @JoinColumn(name = "chamado_idchamado", referencedColumnName = "idchamado")}, inverseJoinColumns = {
        @JoinColumn(name = "equipamento_idequipamento", referencedColumnName = "idequipamento")})
    @ManyToMany
    private List<Equipamento> equipamentoList;
    @JoinColumn(name = "id_usuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "id_tipo_atendimento", referencedColumnName = "idtipo_atendimento")
    @ManyToOne
    private TipoAtendimento idTipoAtendimento;
    @OneToMany(mappedBy = "idChamado")
    private List<Ocorrencia> ocorrenciaList;

    public Chamado() {
        equipamentoList = new ArrayList<>();
        ocorrenciaList = new ArrayList<>();
    }

    public Chamado(Integer idchamado) {
        this.idchamado = idchamado;
        equipamentoList = new ArrayList<>();
        ocorrenciaList = new ArrayList<>();
    }

    public Integer getIdchamado() {
        return idchamado;
    }

    public void setIdchamado(Integer idchamado) {
        this.idchamado = idchamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    @XmlTransient
    public List<Equipamento> getEquipamentoList() {
        return equipamentoList;
    }

    public void setEquipamentoList(List<Equipamento> equipamentoList) {
        this.equipamentoList = equipamentoList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoAtendimento getIdTipoAtendimento() {
        return idTipoAtendimento;
    }

    public void setIdTipoAtendimento(TipoAtendimento idTipoAtendimento) {
        this.idTipoAtendimento = idTipoAtendimento;
    }

    @XmlTransient
    public List<Ocorrencia> getOcorrenciaList() {
        return ocorrenciaList;
    }

    public void setOcorrenciaList(List<Ocorrencia> ocorrenciaList) {
        this.ocorrenciaList = ocorrenciaList;
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
        return "" + idchamado;
    }
    
    
    public void addEquipamento (Equipamento e) {
        equipamentoList.add(e);
    }
    
    public void addOcorrencia (Ocorrencia o) {
        ocorrenciaList.add(o);
    }
}
