package variables_clase01;
import java.util.Scanner;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese su segundo numero");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Los numeros son iguales");
        }else {
            String resultado = num1 >= num2 ? " Es mayor" : " Es menor";
            int numResultado = num1 >= num2 ? num1 : num2;
            int resultadoInverso = num1 >= num2 ? num2 : num1;
            System.out.println(numResultado + resultado + " que " + resultadoInverso);
        }
        sc.close();


        //System.out.println(num1 == num2); // ES IGUAL IGUAL ==
        //System.out.println(num1 != num2); //NO ES IGUAL !=
        //System.out.println(num1 < num2); //ES MENOR <
        //System.out.println(num1 <= num2); //ES MENOR O IGUAL <=
        //System.out.println(num1 > num2); // ES MAYOR >
        //System.out.println(num1 >= num2); // ES MAYOR O IGUAL <=

    }
}
