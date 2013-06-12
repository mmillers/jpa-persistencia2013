package DAO;

import java.util.List;
import javax.persistence.PersistenceException;

public interface DAO<T> {

    public void gravar(T Bean) throws PersistenceException;

    public void deletar(T bean) throws PersistenceException;

    public List<T> buscarNome(String nome) throws PersistenceException;

    public List<T> buscarIdNome(Long id, String nome) throws PersistenceException;

    public List<T> buscarAll() throws PersistenceException;
}
