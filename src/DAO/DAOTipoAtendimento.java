package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.TipoAtendimento;

public class DAOTipoAtendimento implements DAO<TipoAtendimento> {

    EntityManager em;
    
    public DAOTipoAtendimento(EntityManager em){
        super();
        this.em = em;
    }
    
    @Override
    public void gravar(TipoAtendimento bean) throws PersistenceException {
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();        
    }

    @Override
    public void deletar(TipoAtendimento bean) throws PersistenceException {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<TipoAtendimento> buscarNome(String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoAtendimento e WHERE e.descricao = :DESCRICAO");
        query.setParameter("DESCRICAO", nome);
        return query.getResultList();
    }

    @Override
    public List<TipoAtendimento> buscarIdNome(Long id, String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoAtendimento e WHERE e.idtipoAtendimento = :ID AND e.descricao = :DESCRICAO");
        query.setParameter("ID",id );
        query.setParameter("DESCRICAO",nome);
        return query.getResultList();
    }

    @Override
    public List<TipoAtendimento> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoAtendimento e");
        return query.getResultList();
    }
    
    public TipoAtendimento buscarIdTipoAtendimento(Long id) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoAtendimento e WHERE e.idtipoAtendimento = :ID");
        query.setParameter("ID", id);
        return (TipoAtendimento) query.getSingleResult();
    }
}
