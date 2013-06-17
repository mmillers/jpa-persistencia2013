package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.TipoUsuario;

public class DAOTipoUsuario {

    EntityManager em;
    
    public DAOTipoUsuario(EntityManager em){
        this.em = em;
    }
    
    public List<TipoUsuario> buscarAll(Class c) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoUsuario e");
        return query.getResultList();
    }
}
