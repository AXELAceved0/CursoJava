package pre_entrega_01;

import jakarta.persistence.*;

public class GestorGenerico {

    private static final EntityManagerFactory entityManagerFactory;

    static  {
        entityManagerFactory = Persistence.createEntityManagerFactory("cursojavaPU");
    }

    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }

    public static void closeEntityManagerFactory(){
        if(entityManagerFactory != null && entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }
}
