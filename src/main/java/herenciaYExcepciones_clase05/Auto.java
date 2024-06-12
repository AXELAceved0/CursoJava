package herenciaYExcepciones_clase05;

public class Auto {
    private int puertas;
    private String modelo;
    private int anho;

    public Auto() {}

    public Auto(int puertas, String modelo){
        this.puertas = puertas;
        this.modelo = modelo;
        this.anho = anho;
    }

        
    public void  setPuertas(int puertas){
            this.puertas = puertas;
    }

    public int getPuertas(){
        return puertas;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAnho(){
        return anho;
    }

    public void setAnho(int anho){
        this.anho = anho;
    }
}



class Prueba{
    public static void main(String[] args) {
        Auto ford = new Auto(5,"Raptor");
        System.out.println(ford.getModelo());
        System.out.println(ford.getPuertas());
        Auto jeep = new Auto();
        jeep.setPuertas(4);
        jeep.setModelo("Renegade");
        jeep.setAnho(2024);
        System.out.println("El modelo es " + jeep.getModelo());
        System.out.println("Tiene: "+ jeep.getPuertas() + " puertas");
        System.out.println("La Jepp " + jeep.getModelo() + " con " + jeep.getPuertas() + " puertas salio en el año: " + jeep.getAnho() );

    }

}
