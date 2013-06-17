package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Usuario;

public class DAOUsuario {

    EntityManager em;
    
    public DAOUsuario(EntityManager em){
        this.em = em;
    }
    
    public List<Usuario> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Usuario e");
        return query.getResultList();
    }
}
