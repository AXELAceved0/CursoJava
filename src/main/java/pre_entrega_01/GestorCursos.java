package pre_entrega_01;

import jakarta.persistence.EntityManager;

import java.util.List;

public class GestorCursos {

    //METODO PARA CREAR ALUMNOS
    public void create(String nombre,Integer precio, Integer stock){
        EntityManager manager = GestorGenerico.getEntityManager();
        manager.getTransaction().begin();
        Curso cursos = new Curso(nombre,precio,stock);
        manager.persist(cursos);
        manager.getTransaction().commit();
        manager.close();
    }
    //METODO PARA LEER
    public List<Curso> readall() {
        EntityManager manager = GestorGenerico.getEntityManager();
        List<Curso> list = manager.createQuery("From Curso", Curso.class).getResultList();
        manager.close();
        return list;
    }
        //BUSCAR PARA VER CURSOS POR NOMBRE Y ELIMINAR POR NOMBRE
    }
