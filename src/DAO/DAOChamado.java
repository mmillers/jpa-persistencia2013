package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Chamado;

public class DAOChamado implements DAO<Chamado>{

    EntityManager em;
    
    public DAOChamado(EntityManager em){
        super();
        this.em = em;
    }
    
    @Override
    public void gravar(Chamado bean) throws PersistenceException {
        em.getTransaction().begin();
        em.merge(bean);
//        em.persist(bean);
        em.getTransaction().commit();        
    }

    @Override
    public void deletar(Chamado bean) throws PersistenceException {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Chamado> buscarNome(String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Chamado e WHERE e.descProblema = :DESCRICAO");
        query.setParameter("DESCRICAO", nome);
        return query.getResultList();
    }

    @Override
    public List<Chamado> buscarIdNome(Long id, String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Chamado e WHERE e.idchamado = :ID AND e.descProblema = :DESCRICAO");
        query.setParameter("ID",id );
        query.setParameter("DESCRICAO",nome);
        return query.getResultList();
    }

    @Override
    public List<Chamado> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Chamado e");
        return query.getResultList();
    }

    public Chamado buscarId(Long id) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Chamado e WHERE e.idchamado = :ID");
        query.setParameter("ID", id);
        return (Chamado) query.getSingleResult();
    }
}
