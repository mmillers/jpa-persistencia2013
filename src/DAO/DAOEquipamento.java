package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Equipamento;

public class DAOEquipamento implements DAO<Equipamento>{

    EntityManager em;
    
    public DAOEquipamento(EntityManager em){
        super();
        this.em = em;
    }
    
    @Override
    public void gravar(Equipamento bean) throws PersistenceException {
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();        
    }

    @Override
    public void deletar(Equipamento bean) throws PersistenceException {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Equipamento> buscarNome(String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Equipamento e WHERE e.descricao = :DESCRICAO");
        query.setParameter("DESCRICAO", nome);
        return query.getResultList();
    }

    @Override
    public List<Equipamento> buscarIdNome(Long id, String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Equipamento e WHERE e.idequipamento = :ID AND e.descricao = :DESCRICAO");
        query.setParameter("ID",id );
        query.setParameter("DESCRICAO",nome);
        return query.getResultList();
    }

    @Override
    public List<Equipamento> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Equipamento e");
        return query.getResultList();
    
    }    
    
    public Equipamento buscarIdEquipamento(Long id) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Equipamento e WHERE e.idequipamento = :ID");
        query.setParameter("ID", id);
        return (Equipamento) query.getSingleResult();
    }

}