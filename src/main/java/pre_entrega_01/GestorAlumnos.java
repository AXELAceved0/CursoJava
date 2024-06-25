package pre_entrega_01;

import com.mysql.cj.xdevapi.Schema;
import jakarta.persistence.*;

import java.util.List;

public class GestorAlumnos {

    //METODO PARA CREAR ALUMNOS
    public void create(String nombre, String apellido, Integer edad, Integer nota){
        EntityManager manager = GestorGenerico.getEntityManager();
        manager.getTransaction().begin();
        Alumnos alumnos = new Alumnos(nombre,apellido,edad,nota);
        manager.persist(alumnos);
        manager.getTransaction().commit();
        manager.close();
    }
    //METODO PARA LEER
    public List<Alumnos> readAll(){
        EntityManager manager = GestorGenerico.getEntityManager();
        List<Alumnos> list = manager.createQuery("From Alumnos", Alumnos.class).getResultList();
        manager.close();
        return list;
        }

        //BUSCAR POR NOMBRE
    public List<Alumnos> readByName(String nombre){
        EntityManager manager = GestorGenerico.getEntityManager();
        try {
            TypedQuery<Alumnos> query = manager.createQuery("SELECT a FROM Alumnos a WHERE a.nombre = :nombre", Alumnos.class);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        }finally {
            manager.close();
        }
    }

    //ELIMINAR POR NOMBRE
    public void deleteByName(String nombre){
        EntityManager manager = GestorGenerico.getEntityManager();
        try {
            manager.getTransaction().begin();
            Query query = manager.createQuery("DELETE a FROM Alumnos WHERE a.nombre = :nombre");
            query.setParameter("nombre", nombre);
            query.executeUpdate();
            manager.getTransaction().commit();
        } catch (Exception e){
            if(manager.getTransaction().isActive()){
                manager.getTransaction().rollback();
            }
            throw e;
        }finally {
            manager.close();
        }
    }
    }
