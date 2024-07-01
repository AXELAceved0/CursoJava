package pre_entregas.managers;

import jakarta.persistence.*;
import pre_entregas.entities.Cart;
import pre_entregas.entities.Client;
import pre_entregas.entities.Product;

import java.util.List;

public class CartsManager {
    public void addToCart(Integer amount , Product product, Client client){
        EntityManager manager = null;
        EntityTransaction transaction;
        try{
            manager = Manager.getEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();
            Cart cart = new Cart();
            cart.setAmount(amount);
            cart.setPrice(product.getPrice());
            cart.setClient_id(client);
            cart.setProduct_id(product);
            manager.persist(cart);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);
        }finally {
           manager.close();
        }
    }

    public List<Cart> readByClient(Client client){
        EntityManager manager = null;
        List<Cart> carts = null;
        try{
            manager = Manager.getEntityManager();
            carts = manager.
                    createQuery("SELECT id FROM Cart id WHERE id.client_id = :client", Cart.class)
                    .setParameter("client", client)
                    .getResultList();

        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (manager != null) {
                manager.close();
            }
            return carts;
        }
    }
}
