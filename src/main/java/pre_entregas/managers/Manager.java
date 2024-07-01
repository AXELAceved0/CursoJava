package pre_entregas.managers;

import jakarta.persistence.*;


public class Manager {
    private static final EntityManagerFactory entityManagerFactory;

    static  {
        entityManagerFactory = Persistence.createEntityManagerFactory("javacursoPU");
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
