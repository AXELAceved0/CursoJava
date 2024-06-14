package desafio2;

import java.util.Comparator;
import java.util.List;

public class ImprimirPersona {
    public static void main(String[] args) {
        //TRY Y CATCH
        try {

//LISTA DE ALUMNOS
            Alumnos alumnos = new Alumnos();

//AGREGAR ALUMNOS
            Persona persona1 = new Persona("Dario", "Lazaro");
            alumnos.agregasAlumnos(persona1);

            Persona persona2 = new Persona("Roberto", "Carlos");
            alumnos.agregasAlumnos(persona2);

            Persona persona3 = new Persona();
            persona3.setNombre("Carol");
            persona3.setApellido("Dixon");
            alumnos.agregasAlumnos(persona3);

            Persona persona4 = new Persona();
            persona4.setNombre("Rick");
            persona4.setApellido("Grime");
            alumnos.agregasAlumnos(persona4);

            Persona persona5 = new Persona("Leo", "Messi");
            alumnos.agregasAlumnos(persona5);
 //LISTA PARA ORDENAR ALUMNOS POR SU NOMBRE
            List<Persona> listaOrdenada = alumnos.mostrarAlumnos();
            listaOrdenada.sort(Comparator.comparing(Persona::getNombre));
//FOREACH PARA RECORRE EL ARAY
            for (Persona persona : listaOrdenada) {
                System.out.println(persona.getNombre() + " " + persona.getApellido());
            }
            //BUSCAR ALUMNOS
            System.out.println(alumnos.buscarPorNombres("lionel"));

            //FINAL CATHC
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}
