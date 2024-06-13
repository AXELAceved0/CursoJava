package interfaz_y_classesAbstractas;

public class LibroDigital extends Libro{
    private double pesoArchivo;

    public LibroDigital(int fecha, String titulo, String autor, double pesoArchivo){
        super(titulo, autor, fecha);
        this.pesoArchivo = pesoArchivo;
    }

    public double getPesoArchivo() {
        return pesoArchivo;
    }

    public void setPesoArchivo(double pesoArchivo) {
        this.pesoArchivo = pesoArchivo;
    }


    public String getInfo(){
    return "El libro se llama " + this.getTitulo() + " y pesa " + this.getPesoArchivo();
}
}
