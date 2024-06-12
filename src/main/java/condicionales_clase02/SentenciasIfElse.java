package condicionales_clase02;
import java.util.Scanner;

public class SentenciasIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad >= 18 && edad <= 30){
            System.out.println("Puedes pasar");
        } else if (edad < 18) {
            System.out.println("No puedes pasar eres MENOR!!!");
        }else{
            System.out.println("No puedes pasar solo se admiten hasta 30 Años la entrada");
        }
        sc.close();
    }
}
