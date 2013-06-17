package DAO;

import java.util.List;
import javax.persistence.PersistenceException;

public interface DAO<Object> {

    public void gravar(Object Bean) throws PersistenceException;

    public void deletar(Class c, Object bean) throws PersistenceException;

    public void atualizar(Class c, Object bean) throws PersistenceException;

    public List<Object> buscarNome(Class c, String nome) throws PersistenceException;

    public Object buscarId(Class c, Long id) throws PersistenceException;

//    public List<Object> buscarAll(Class c) throws PersistenceException;
}
