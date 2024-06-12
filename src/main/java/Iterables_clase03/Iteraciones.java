package Iterables_clase03;

public class Iteraciones {
    public static void main(String[] args) {
        int edad = 30;
        while (edad <= 21){
            System.out.println("No puedes pasar");
            edad++;
        }
        System.out.println("Ahora si puedes pasar");

        do {
            System.out.println("No puedes pasar");
            edad++;
        }while (edad < 21);
            System.out.println("Se termino la iteracion");
    }
}
