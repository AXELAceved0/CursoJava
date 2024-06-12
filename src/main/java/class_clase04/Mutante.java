package class_clase04;

public class Mutante {
        int edad;
        String nombre;
        int energia;
        static final int EDAD_ENTRENAMIENTO_NINJA = 7;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }


        void comer(int valor){
            energia = energia +  valor;
    }
    void entrenar(int valor, int cantidad){
            energia = energia - valor * cantidad;
    }
}