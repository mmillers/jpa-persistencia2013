package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Chamado;

public class DAOChamado {

    EntityManager em;

    public DAOChamado(EntityManager em) {
        this.em = em;
    }

    public List<Chamado> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Chamado e");
        return query.getResultList();
    }
}