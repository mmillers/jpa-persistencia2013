package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.TipoUsuario;

public class DAOTipoUsuario {

    EntityManager em;

    public DAOTipoUsuario(EntityManager em) {
        this.em = em;
    }

    public List<TipoUsuario> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoUsuario e");
        return query.getResultList();
    }

    public long procuraTipoUsuario(String descricao) {
        List<TipoUsuario> lista = buscarAll();
        for (TipoUsuario us : lista) {
            if (us.getDescricao().equals(descricao)) {
                return us.getIdtipoUsuario();
            }
        }
        return -1;
    }

    public TipoUsuario procurarTipoUsuario(String descricao) {
        List<TipoUsuario> lista = buscarAll();
        for (TipoUsuario us : lista) {
            if (us.getDescricao().equals(descricao)) {
                return us;
            }
        }
        return null;
    }
}
