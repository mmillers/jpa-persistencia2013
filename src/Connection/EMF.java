package Connection;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EMF {
    
    // singleton
    private static EntityManager em;
    
    public static EntityManager geEntityManager () {
        if(em == null ){
            em = Persistence.createEntityManagerFactory("ManutencaoInformaticaPU").createEntityManager();
        }
        return em;
    };    
}
