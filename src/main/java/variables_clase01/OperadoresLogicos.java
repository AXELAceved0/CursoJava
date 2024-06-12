package variables_clase01;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 15;
        int b = 8;
        boolean resultado = ( a > 0) && (b > 10);
        System.out.println(resultado);
        boolean resultado2 = (a > 10) || (b  > 10);
        System.out.println(resultado2);
        System.out.println(!resultado2);
        System.out.println(!resultado);
    }
}
