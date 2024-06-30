package pre_entrega_01;

import jakarta.persistence.*;

import java.util.List;

public class GestorCliente {

    ///METODO CREAR CLIENTE
    public void create(String nombre, String apellido, Integer dni, Integer edad) {
        EntityManager manager = null;
        try {
            manager = GestorGenerico.getEntityManager();
            manager.getTransaction().begin();
            Cliente cliente = new Cliente(nombre, apellido, dni, edad);
            manager.persist(cliente);
            manager.getTransaction().commit();
        } catch (Exception e) {
            if (manager != null && manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (manager != null) {
                manager.close();
            }
        }
    }

    //METODO PARA LEER
    public List<Cliente> readAll(){
        EntityManager manager = GestorGenerico.getEntityManager();
        List<Cliente> lista = null;
        try{
            lista = manager.createQuery("FROM Cliente ", Cliente.class).getResultList();
        }finally {
            manager.close();
        }
        return lista;
    }

    //METODO PARA BUSCAR POR NOMBRE
public List<Cliente> readByName(String nombre){
        EntityManager manager = null;
    try {
        manager = GestorGenerico.getEntityManager();
        TypedQuery<Cliente> query = manager.createQuery("SELECT c FROM Cliente c WHERE c.nombre = :nombre", Cliente.class);
        query.setParameter("nombre", nombre);
        return query.getResultList();
    }finally {
        if(manager != null) {
            manager.close();
        }
    }
}


//METODO PARA ELIMINAR POR NOMBRE
    public void deleteByName(String nombre){
        EntityManager manager = null;
        try{
            manager = GestorGenerico.getEntityManager();
            manager.getTransaction().begin();
            Query query = manager.createQuery(" DELETE  FROM Cliente c WHERE c.nombre = :nombre");
            query.setParameter("nombre", nombre);
            query.executeUpdate();
            manager.getTransaction().commit();
        }catch (Exception e){
            if(manager != null && manager.getTransaction().isActive()){
                manager.getTransaction().rollback();
            }
            throw e;
        }finally {
            if (manager != null){
                manager.close();
            }
        }
    }
}
