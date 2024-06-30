package pre_entrega_01;

public class Pruebas {
    private GestorCliente gestorCliente = new GestorCliente();
    private GestorProducto gestorProducto = new GestorProducto();

    public static void main(String[] args) {
       Pruebas pruebas = new Pruebas();
        pruebas.gestorCliente.create("Axel","Acevedo",40652478,26);
        pruebas.gestorCliente.create("Luciano","Lucianin",55465,5);
        pruebas.gestorCliente.create("Abril","Abrilin",70272758,1);

        pruebas.gestorProducto.create("Java", 15500,5);
        pruebas.gestorProducto.create("React.js", 20000,3);
        pruebas.gestorProducto.create("Angular", 18500,1);
    }
}
