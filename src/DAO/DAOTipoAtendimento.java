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

    public List<TipoAtendimento> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM TipoAtendimento e");
        return query.getResultList();
    }
    
    public TipoAtendimento encontraTipo(String descricao) {
        List<TipoAtendimento> lista = buscarAll();
        for (TipoAtendimento set : lista) {
            if (set.getDescricao().equals(descricao)) {
                return set;
            }
        }
        return null;
    }
    
    public long procuraTipo(String descricao) {
        List<TipoAtendimento> lista = buscarAll();
        for (TipoAtendimento us : lista) {
            if (us.getDescricao().equals(descricao)) {
                return us.getIdtipoAtendimento();
            }
        }
        return -1;
    }
}
