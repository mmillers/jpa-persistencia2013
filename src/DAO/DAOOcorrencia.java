/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Ocorrencia;

/**
 *
 * @author Maximiller
 */
public class DAOOcorrencia {

    EntityManager em;

    public DAOOcorrencia(EntityManager em) {
        this.em = em;
    }

    public List<Ocorrencia> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Ocorrencia e");
        return query.getResultList();
    }

    public List<Ocorrencia> verificaChamadoOcorrencia(int chamado) {
        List<Ocorrencia> lista = buscarAll();
        List<Ocorrencia> retorno = new ArrayList<>();
        for (Ocorrencia set : lista) {
            if (set.getIdChamado().getIdchamado().equals(chamado))
                retorno.add(set);
        }
        return retorno;
    }
}
