package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Usuario;

public class DAOUsuario {

    EntityManager em;

    public DAOUsuario(EntityManager em) {
        this.em = em;
    }

    public List<Usuario> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Usuario e");
        return query.getResultList();
    }

    public Usuario verificaLogin(String login, String senha) {
        List<Usuario> lista = buscarAll();
        for (Usuario us : lista) {
            if (us.getLogin().equals(login) && us.getSenha().equals(senha)) {
                return us;
            }
        }
        return null;
    }

    public Usuario procurarUsuario(String descricao) {
        List<Usuario> lista = buscarAll();
        for (Usuario us : lista) {
            if (us.getNome().equals(descricao)) {
                return us;
            }
        }
        return null;
    }

    public List<Usuario> verificaUsuario(String user) {
        List<Usuario> lista = buscarAll();
        List<Usuario> retorno = new ArrayList<>();
        for (Usuario us : lista) {
            if (us.getNome().toUpperCase().equals(user.toUpperCase())) {
//                System.out.println("dao - antes -");
                retorno.add(us);
//                System.out.println("dao - dps - ");
                return retorno;
            }
        }
//        System.out.println("NULLOOOOOOO");
        return null;
    }
}
