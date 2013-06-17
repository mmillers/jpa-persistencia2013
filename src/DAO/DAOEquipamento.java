package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Equipamento;

public class DAOEquipamento {

    EntityManager em;
    
    public DAOEquipamento(EntityManager em){
        this.em = em;
    }
   
    public List<Equipamento> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Equipamento e");
        return query.getResultList();
    
    }    
}