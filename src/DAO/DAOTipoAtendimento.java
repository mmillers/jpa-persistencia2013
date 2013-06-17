package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.TipoAtendimento;

public class DAOTipoAtendimento {

    EntityManager em;
    
    public DAOTipoAtendimento(EntityManager em){
        this.em = em;
    }

    public List<TipoAtendimento> buscarAll(Class c) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoAtendimento e");
        return query.getResultList();
    }
}
