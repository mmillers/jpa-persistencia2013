package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pojo.Chamado;

public class DAOChamado {

    EntityManager em;

    public DAOChamado(EntityManager em) {
        this.em = em;
    }

    public List<Chamado> buscarAll() throws PersistenceException {
        Query query = em.createQuery("SELECT e FROM Chamado e");
        return query.getResultList();
    }

    public List<Chamado> verificaTipoAtendimento(String descricao) {
        List<Chamado> lista = buscarAll();
        List<Chamado> retorno = new ArrayList<>();
        for (Chamado set : lista) {
               if( set.getIdTipoAtendimento().getDescricao().toUpperCase().compareTo(descricao.toUpperCase()) == 0)
                    retorno.add(set);
        }
        return retorno;
    }

    public List<Chamado> verificaTipoChamado(String usuario, String situacao) {
        List<Chamado> lista = buscarAll();
//        System.out.println(lista.size());
        List<Chamado> retorno = new ArrayList<>();
        for (Chamado set : lista) {
            if (set.getStatus().toUpperCase().equals(situacao.toUpperCase()) &&
                    set.getIdUsuario().getNome().toUpperCase().compareTo(usuario.toUpperCase()) == 0) 
                retorno.add(set);
        }
         return retorno;
    }

    public Chamado buscaChamadoUsuario(int valor, String usuario) {
        List<Chamado> lista = buscarAll();
        for (Chamado set : lista) {
            if (set.getIdchamado().equals(valor)
                    && set.getIdUsuario().getNome().toUpperCase().equals(usuario.toUpperCase())) {
                return set;
            }
        }
        return null;
    }

    public Chamado procurarId(int valor) {
        List<Chamado> lista = buscarAll();
        for (Chamado us : lista) {
            if (us.getIdchamado().equals(valor)) {
                return us;
            }
        }
        return null;
    }
}