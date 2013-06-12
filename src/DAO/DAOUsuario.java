package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Usuario;

public class DAOUsuario implements DAO<Usuario>{

    EntityManager em;
    
    public DAOUsuario(EntityManager em){
        super();
        this.em = em;
    }
    
    @Override
    public void gravar(Usuario bean) throws PersistenceException {
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();        
    }

    @Override
    public void deletar(Usuario bean) throws PersistenceException {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Usuario> buscarNome(String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Usuario e WHERE e.nome = :DESCRICAO");
        query.setParameter("DESCRICAO", nome);
        return query.getResultList();
    }

    @Override
    public List<Usuario> buscarIdNome(Long id, String nome) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Usuario e WHERE e.idusuario = :ID AND e.nome = :DESCRICAO");
        query.setParameter("ID",id );
        query.setParameter("DESCRICAO",nome);
        return query.getResultList();
    }

    @Override
    public List<Usuario> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Usuario e");
        return query.getResultList();
    }
    
    public Usuario buscarIdUsuario(Long id) throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Usuario e WHERE e.idusuario = :ID");
        query.setParameter("ID", id);
        return (Usuario) query.getSingleResult();
    }
}
