package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.TipoUsuario;

public class DAOTipoUsuario implements DAO<TipoUsuario>{

    EntityManager em;
    
    public DAOTipoUsuario(EntityManager em){
        super();
        this.em = em;
    }
    
    @Override
    public void gravar(TipoUsuario bean) throws PersistenceException {
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();        
    }

    @Override
    public void deletar(TipoUsuario bean) throws PersistenceException {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<TipoUsuario> buscarNome(String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoUsuario e WHERE e.descricao = :DESCRICAO");
        query.setParameter("DESCRICAO", nome);
        return query.getResultList();
    }

    @Override
    public List<TipoUsuario> buscarIdNome(Long id, String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoUsuario e WHERE e.idtipoUsuario = :ID AND e.descricao = :DESCRICAO");
        query.setParameter("ID",id );
        query.setParameter("DESCRICAO",nome);
        return query.getResultList();
    }

    @Override
    public List<TipoUsuario> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoUsuario e");
        return query.getResultList();
    }
    
    public TipoUsuario buscarIdTipoUsuario(Long id) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoUsuario e WHERE e.idtipoUsuario = :ID");
        query.setParameter("ID", id);
        return (TipoUsuario) query.getSingleResult();
    }
}
