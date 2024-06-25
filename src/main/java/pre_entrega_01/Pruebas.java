package pre_entrega_01;

public class Pruebas {
    private GestorCursos gestorCursos = new GestorCursos();
    private GestorAlumnos gestorAlumnos = new GestorAlumnos();

    public static void main(String[] args) {
       Pruebas pruebas = new Pruebas();
        pruebas.gestorCursos.create("Java",25000,2);
        pruebas.gestorCursos.create("React.js",24000,5);

        pruebas.gestorAlumnos.create("Axel", "Acevedo",26,8);
        pruebas.gestorAlumnos.create("Luciano", "Lucianin",19,4);
    }
}
