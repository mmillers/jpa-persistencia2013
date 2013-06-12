package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Setor;

public class DAOSetor implements DAO<Setor>{

    EntityManager em;
    
    public DAOSetor(EntityManager em){
        super();
        this.em = em;
    }
    
    @Override
    public void gravar(Setor bean) throws PersistenceException {
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();        
    }

    @Override
    public void deletar(Setor bean) throws PersistenceException {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Setor> buscarNome(String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Setor e WHERE e.descricao = :DESCRICAO");
        query.setParameter("DESCRICAO", nome);
        return query.getResultList();
    }

    @Override
    public List<Setor> buscarIdNome(Long id, String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Setor e WHERE e.idsetor = :ID AND e.descricao = :DESCRICAO");
        query.setParameter("ID",id );
        query.setParameter("DESCRICAO",nome);
        return query.getResultList();
    }

    @Override
    public List<Setor> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Setor e");
        return query.getResultList();
    
    }    
    
    public Setor buscarIdSetor(Long id) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Setor e WHERE e.idsetor = :ID");
        query.setParameter("ID", id);
        return (Setor) query.getSingleResult();
    }

}
