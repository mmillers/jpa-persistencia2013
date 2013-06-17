package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Setor;

public class DAOSetor {

    EntityManager em;
    
    public DAOSetor(EntityManager em){
        this.em = em;
    }
    
    public List<Setor> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Setor e");
        return query.getResultList();
    
    }    
}
