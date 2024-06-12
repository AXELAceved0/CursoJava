package variables_clase01;

public class OperadoresAritmeticos {
    public static void main(String[] args){
        int num1 = 1000;
        int num2 = 57;
        System.out.println(num1 - num2 + " resta");
        System.out.println(num1 + num2 + " suma");
        //System.out.println(num1 / num2); // SE CASTEA O SE TRANSFORMA
        Float resultadoDivision = (float) num1 / num2;
        System.out.println(resultadoDivision + " division");
        System.out.println(num1 * num2 + " multiplicacion");
        System.out.println(num1%num2 + " resto");
        int num3 = num1++;
        //ASIGNA 1000 Y LUEGO LE SUMA 1 A 1000
        int num4 = ++num1;
        // SUMA 1 A  1001 Y LUEGO ASIGNA
        System.out.println(num3 + " suma 1");
        System.out.println(num4 + " suma 2");
        int num5 = num2--;
        //ASIGNA 1000 Y LUEGO RESTA 1 A 1000
        int num6 = --num2;
        //PRIMERO RESTA 1 A 1000 Y LUEGO ASIGNA
        System.out.println(num5 + " resta 1");
        System.out.println(num6 + " resta 2");
    }
}
