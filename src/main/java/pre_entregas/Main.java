package pre_entregas;

import pre_entregas.managers.CartsManager;
import pre_entregas.managers.ClientsManager;
import pre_entregas.managers.ProductsManager;

public class Main {
    public static void main(String[] args) {
        ProductsManager product = new ProductsManager();
        ClientsManager client = new ClientsManager();

//        product.create("Remera M" , 100, 18.500);
//        product.create("Zapatillas" , 50, 81.250);
//        product.create("Pantalon Corto" , 200, 25.405);
//        product.create("Gorras" , 25, 10.100);
//
//
//        client.create("Rick", 42467);
//        client.create("Carol", 56468);
//        client.create("Daryl", 45003);
//        client.create("Ezequiel", 25521);

//        System.out.println(client.readOne(3));
//        System.out.println(product.readOne(2));
        CartsManager cart = new CartsManager();
//        cart.addToCart(1,product.readOne(2),client.readOne(3));
//        cart.addToCart(1,product.readOne(4),client.readOne(1));
//        cart.addToCart(1,product.readOne(1),client.readOne(2));
        System.out.println(cart.readByClient(client.readOne(3)));
        System.out.println(cart.readByClient(client.readOne(1)));
        System.out.println(cart.readByClient(client.readOne(2)));
    }
}
