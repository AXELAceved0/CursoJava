package interfaz_y_classesAbstractas;

public class LibroImpreso extends Libro {
    private int numerosPagina;

    public LibroImpreso(String titulo, String autor, int fecha, int numerosPagina){
        super(titulo, autor, fecha);
        this.numerosPagina = numerosPagina;
    }

    public int getNumerosPagina() {
        return numerosPagina;
    }
    public void setNumerosPagina(int numerosPagina){
        this.numerosPagina = numerosPagina;
    }

    @Override
    public String getInfo() {
        return "El libro tiene " + this.getNumerosPagina() + " paginas y lo escribio el autor " + this.getAutor();
    }
}
