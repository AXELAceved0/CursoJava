package pre_entrega_01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class GestorCursos {

    //METODO PARA CREAR CURSOS
    public void create(String nombre,Integer precio, Integer stock){
        EntityManager manager = GestorGenerico.getEntityManager();
        manager.getTransaction().begin();
        Curso cursos = new Curso(nombre,precio,stock);
        manager.persist(cursos);
        manager.getTransaction().commit();
        manager.close();
    }
    //METODO PARA LEER
    public List<Curso> readAll() {
        EntityManager manager = GestorGenerico.getEntityManager();
        List<Curso> list = manager.createQuery("From Curso", Curso.class).getResultList();
        manager.close();
        return list;
    }
        //BUSCAR PARA VER CURSOS POR NOMBRE Y ELIMINAR POR NOMBRE

    public List<Curso> readByName(String nombre){
        EntityManager manager = GestorGenerico.getEntityManager();
        try{
            TypedQuery<Curso> query = manager.createQuery("SELECT a FROM Curso WHERE a.nombre = :nombre", Curso.class);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        }finally {
            manager.close();
        }
    }

    public void addToCart(Alumnos alumnos, Curso curso){
        EntityManager manager = GestorGenerico.getEntityManager();
        manager.getTransaction().begin();
        alumnos.getCurso().add(curso);
        manager.persist(curso);
        manager.getTransaction().commit();
        manager.close();
    }

    public void removeToCart(Alumnos alumnos, Curso curso){
        EntityManager manager = GestorGenerico.getEntityManager();
        manager.getTransaction().begin();
        alumnos.getCurso().remove(curso);
        manager.persist(curso);
        manager.getTransaction().commit();
        manager.close();
    }
    }
