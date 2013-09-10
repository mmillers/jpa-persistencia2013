package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

/**
 *
 * @author Maximiller
 */
public class GenericDAO implements DAO<Object> {

    EntityManager em;

    public GenericDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public void gravar(Object bean) throws PersistenceException {
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
    }

    @Override
    public void deletar(Class c, Object bean) throws PersistenceException {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public void atualizar(Class c, Object bean) throws PersistenceException {
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Object> buscarNome(Class c, String nome) throws PersistenceException {
        return (List<Object>) em.find(c, nome);
    }

    @Override
    public Object buscarId(Class c, int id) throws PersistenceException {
        return em.find(c, id);
    }
}
