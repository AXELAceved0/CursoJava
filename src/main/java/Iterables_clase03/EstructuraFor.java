package Iterables_clase03;

import java.util.ArrayList;
import java.util.List;

public class EstructuraFor {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println(i*2);
        }
        List<String> productos = new ArrayList<>();
        productos.add("Manteca");
        productos.add("Sal");
        productos.add("Agua");
        productos.add("Coca cola");
        for (int i= 0; i < productos.size(); i++){
            System.out.println("Los productos son: " + productos.get(i));//productos.get(i) Obtengos los productos 1 por 1 del array
        }
        for (String producto : productos){//ForEach
            System.out.println("El producto es: " + producto);
        }
    }
}
