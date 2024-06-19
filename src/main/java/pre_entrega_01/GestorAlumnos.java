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
    public List<Alumnos> readall(){
        EntityManager manager = GestorGenerico.getEntityManager();
        List<Alumnos> list = manager.createQuery("From Alumnos", Alumnos.class).getResultList();
        manager.close();
        return list;

        //BUSCAR PARA VER ALUMNOS POR NOMBRE Y ELIMINAR POR NOMBRE
    }
}
