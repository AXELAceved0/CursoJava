package Iterables_clase03;

public class Arrays {
        public static void main(String[] args) {
            char[] arrayDeLetras = {'a', 'b', 'c', 'd', 'e', 'f'};
            boolean[] arrayDeBoolean = {true, false, true, false, true, false, true, true};
            System.out.println(arrayDeBoolean.length);
            System.out.println(arrayDeLetras.length);
            arrayDeBoolean[2] = false;
            arrayDeBoolean[arrayDeBoolean.length-1] = false;

            for (boolean verdad : arrayDeBoolean){
                System.out.println(verdad);
            }
        }
    }
