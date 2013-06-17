package gui;

import Connection.EMF;
import DAO.DAOSetor;
import DAO.DAOUsuario;
import DAO.GenericDAO;
import javax.persistence.EntityManager;
import pojo.Setor;

/**
 *
 * @author Maximiller
 */
public class App {

    public static void main(String[] args) {
        EntityManager em =  EMF.geEntityManager();
        Setor s = new Setor();
        s.setIdsetor(140);
        GenericDAO dao = new GenericDAO(em);
        dao.gravar(s);
        
        Long id = 140L;
        Setor s2 = (Setor) dao.buscarId(Setor.class, id);
        
        DAOUsuario us = new DAOUsuario(em);
        us.buscarAll();
        
        DAOSetor set = new DAOSetor(em);
        set.buscarAll();
        
        System.out.println("s == s2? " + (s == s2));
        System.out.println("s.equals(s2) ? " + (s.equals(s2)));
    }
}
