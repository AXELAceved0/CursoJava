package Iterables_clase03;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Robert");
        nombres.add("Maria");
        nombres.add("Leo");
        nombres.add("Juana");
        nombres.add("Carol");
        System.out.println("Los alumnos aprobados son: " + nombres);
        System.out.println("El puntaje mas alto es de: " + nombres.get(2));
        System.out.println("El puntaje mas bajo es de: " + nombres.get(nombres.toArray().length-1));//Funciona tambien con SIZE EN VES DE TOARRAY
        nombres.set(0,"Goku");
        System.out.println("Carlos sale del grupo y quedaria formado por: " + nombres);
        nombres.remove(nombres.size()-1);
        System.out.println(nombres);

        List<String> apellidos = new ArrayList<>();
        apellidos.add("Acevedo");
        apellidos.add("Grimes");
        apellidos.add("Dixon");
        apellidos.add("Soto");
        apellidos.add("Santillan");
        apellidos.add("Romero");
        nombres.addAll(apellidos); // ADDALL agrega una lista con varios nombres o demas
        System.out.println(nombres);
        //Lista para eliminar
        List<String> eliminar = new ArrayList<>();
        //Agregar para eliminar
        eliminar.add("Romero");
        eliminar.add("Soto");
        //Eliminar de a varios con el array principal donde se ven todos los arrays
        nombres.removeAll(eliminar);
        System.out.println(nombres);
    }
}
