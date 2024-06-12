package class_clase04;


public class Tortugas {
    public static void main(String[] args) {
        Mutante rafael = new Mutante();
        rafael.nombre = "Rafael";
        rafael.edad = 15;
        rafael.energia = 100;
        rafael.comer(35);
        rafael.entrenar(18,3);
        System.out.println(rafael.energia);

        Mutante donatello = new Mutante();
        donatello.setNombre("Donatello");
        donatello.setEdad(17);
        donatello.setEnergia(100);
        donatello.comer(40);
        donatello.entrenar(15, 2);
        System.out.println(donatello.energia);
        System.out.println(Mutante.EDAD_ENTRENAMIENTO_NINJA);

        Rata splinter = new Rata();
        splinter.nombre = "Splinter";
        splinter.setColor("Gris");
        splinter.setEdad(55);
        splinter.setMaestro(true);
        splinter.setPeso(10);
        System.out.println("El maestro de las Tortugas ninjas se llama: "  + splinter.getNombre());
        System.out.println("El color de su pelaje es: " + splinter.getColor());
        System.out.println("Tiene " + splinter.getEdad() + " años de edad");
        System.out.println("Pesa " + splinter.getPeso() + "KG");
        String resultado = splinter.getMaestro() ? "Es su maestro" : "No es su mastro";
        System.out.println(resultado);
    }
}
