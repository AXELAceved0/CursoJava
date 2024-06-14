package desafio2;

import java.util.ArrayList;
import java.util.List;

public class Alumnos {
    protected List<Persona> alumnos;

    public Alumnos(){
        this.alumnos = new ArrayList<>();
    }

    public List<Persona> mostrarAlumnos(){
        return alumnos;
    }

    public void agregasAlumnos(Persona personas){
        this.alumnos.add(personas);
        System.out.println("Se agrego un nuevo alumno al curso");
    }


    public Persona buscarPorNombres(String nombre) throws Exception{
        for (Persona persona : alumnos){
            if (persona.getNombre().equalsIgnoreCase(nombre)){
                return persona;
            }
        }
        throw new Exception("Alumno no encontrado en la lista");
    }
}
