package pre_entrega_01;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


public class GestorProducto {
    ///METODO CREAR CLIENTE
    public void create(String nombre, Integer precio, Integer stock) {
        EntityManager manager = null;
        try {
            manager = GestorGenerico.getEntityManager();
            manager.getTransaction().begin();
            Producto producto = new Producto(nombre, precio, stock);
            manager.persist(producto);
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
    public List<Producto> readAll(){
        EntityManager manager = GestorGenerico.getEntityManager();
        List<Producto> lista = null;
        try{
            lista = manager.createQuery("FROM Producto ", Producto.class).getResultList();
        }finally {
            manager.close();
        }
        return lista;
    }

    //METODO PARA BUSCAR POR NOMBRE
    public List<Producto> readByName(String nombre){
        EntityManager manager = null;
        try {
            manager = GestorGenerico.getEntityManager();
            TypedQuery<Producto> query = manager.createQuery("SELECT c FROM Producto c WHERE c.nombre = :nombre", Producto.class);
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
            Query query = manager.createQuery(" DELETE  FROM Producto c WHERE c.nombre = :nombre");
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

    public void addToCart(Cliente cliente , Producto producto){
        EntityManager manager = GestorGenerico.getEntityManager();;
        try {
            if (cliente.getCarrito() == null){
                cliente.setCarrito(new ArrayList<>());
            }

            manager.getTransaction().begin();
            cliente.getCarrito().add(producto);
            manager.getTransaction().commit();
        }catch (Exception e){
            if (manager != null && manager.getTransaction().isActive()){
                manager.getTransaction().rollback();
            }
            throw e;
        }finally {
            if (manager != null) {
                manager.close();
            }
        }
    }

    public void removeToCart(Cliente cliente, Producto producto){
        EntityManager manager = GestorGenerico.getEntityManager();
        try {
            manager.getTransaction().begin();
            cliente.getCarrito().remove(producto);
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
