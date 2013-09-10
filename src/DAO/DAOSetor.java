package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import pojo.Setor;

public class DAOSetor {

    EntityManager em;

    public DAOSetor(EntityManager em) {
        this.em = em;
    }
    /*    
     public List<Setor> buscarAll() throws PersistenceException {
     Query query = em.createQuery("SELECT e FROM Setor e");
     return query.getResultList();
     }    
     */

    public List<Setor> buscarAll() throws PersistenceException {
//fabrica as definições de consultas (CriteriaQuery)
        CriteriaBuilder cb = em.getCriteriaBuilder();
// cria uma estrutura de consulta para a classe passada por parâmetro.
        CriteriaQuery<Setor> c = cb.createQuery(Setor.class);
// Após montar a estrutura da consulta, é necessário passar o CriteriaQuery para o em.createQuery().
// Quando chamamos o método em.createQuery passando uma CriteriaQuery temos uma consulta fortemente tipada.
        TypedQuery<Setor> q = em.createQuery(c);
        return q.getResultList();
    }

    public Setor encontraSetor(String descricao) {
        List<Setor> lista = buscarAll();
        for (Setor set : lista) {
            if (set.getDescricao().equals(descricao)) {
                return set;
            }
        }
        return null;
    }

    public List<Setor> verificaSetor(String descricao) {
        List<Setor> lista = buscarAll();
        List<Setor> retorno = new ArrayList<>();
        for (Setor set : lista) {
            if (set.getDescricao().toUpperCase().equals(descricao.toUpperCase())) {
                retorno.add(set);
                return retorno;
            }
        }
        return null;

    }
}
//return em.createQuery(em.getCriteriaBuilder().createQuery(Setor.class)).getResultList();
