package condicionales_clase02;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Ingrese el dia");

        String dia = sc.nextLine();

        switch (dia){
            case "lunes":
                System.out.println("Arranca la semana");
                break;
            case "martes":
                System.out.println("Es dia de mucha fiaca");
                break;
            case "miercoles":
                System.out.println("Mitad de semana");
                break;
            case "jueves":
                System.out.println("Casi termina la semana");
                break;
            case "viernes":
                System.out.println("Por fin viernes");
                break;
            case "sabado":
                System.out.println("Sabado de flojera");
                break;
            case "domingo":
                System.out.println("Domingo de los simpson");
                break;
            default:
                System.out.println("Ponga una fecha valida");
                break;
        }

    }
}
