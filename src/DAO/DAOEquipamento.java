package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Equipamento;

public class DAOEquipamento {

    EntityManager em;

    public DAOEquipamento(EntityManager em) {
        this.em = em;
    }

    public List<Equipamento> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Equipamento e");
        return query.getResultList();
    }

    public List<Equipamento> verificaEquipamento(String equip) {
        List<Equipamento> lista = buscarAll();
        List<Equipamento> retorno = new ArrayList<>();
        for (Equipamento set : lista) {
            if (set.getDescricao().toUpperCase().equals(equip.toUpperCase())) {
                retorno.add(set);
                return retorno;
            }
        }
        return null;
    }
    
    public Equipamento procurarEquipamento(String descricao) {
         List<Equipamento> lista = buscarAll();
        for (Equipamento set : lista) {
            if (set.getDescricao().equals(descricao)){
                return set;
            }
        }
        return null;
    }
    
    
    
}