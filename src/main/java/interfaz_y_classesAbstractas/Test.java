package interfaz_y_classesAbstractas;

public class Test {
    public static void main(String[] args) {
        try {
            Biblioteca biblioteca = new Biblioteca();

            Libro digital1 = new LibroDigital(1988, "El chavo", "Roberto Gomez Bolaños", 1.75);
            biblioteca.agregarLibro(digital1);

            Libro digital2 = new LibroDigital(2024, "El Leon", "Leonardo Angel", 2.150);

            Libro impreso2 = new LibroImpreso("Dog", "Brutus", 2023, 150);
            biblioteca.agregarLibro(impreso2);

            System.out.println(digital1.getInfo());

            System.out.println(biblioteca.mostrarLibros());

            for (Libro libro : biblioteca.mostrarLibros()) {
                System.out.println(libro.getTitulo());
            }
            System.out.println(biblioteca.buscarLibroPorTitulo("chavo").getInfo());
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}