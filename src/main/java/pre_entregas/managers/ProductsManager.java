package pre_entregas.managers;

import jakarta.persistence.*;
import pre_entregas.entities.Client;
import pre_entregas.entities.Product;

import java.util.List;

public class ProductsManager {
    //CREAR PRODUCTO
    public void create(String name, Integer stock,Double price){
        EntityManager manager = null;
        EntityTransaction transaction;
        try{
            manager = Manager.getEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setStock(stock);
            manager.persist(product);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);
        } finally {
            if(manager != null){
                manager.close();
            }
        }
    }

    //LEER CLIENTE
    public Product readOne(Integer id){
        if(id == null || id <= 0){
            throw new IllegalArgumentException("ID del producto no valido: " + id);
        }
        try(EntityManager manager = Manager.getEntityManager()){
            return manager.find(Product.class, id);
        }catch (Exception e){
            System.out.println("Error al leer el producto con ID " + id + ": " + e.getMessage());
            return null;
        }
    }

    // LEER CLIENTES O BUSCAR POR FILTRO
    public List<Product> readAll(String filter){
        EntityManager manager = Manager.getEntityManager();
        List<Product> product = null;
        try{
            String queryString = "FROM Product";
            if (filter != null && !filter.isEmpty()) {
                queryString += " WHERE name LIKE :filter";
                TypedQuery<Product> query = manager.createQuery(queryString, Product.class);
                query.setParameter("filter", "%" + filter + "%");
                product = query.getResultList();
            } else {
                product = manager.createQuery(queryString, Product.class).getResultList();
            }
        }catch (Exception e){
            System.out.println("Error al leer todos los productos: " + e.getMessage());
        }finally {
            if(manager != null && manager.isOpen()){
                manager.close();
            }
        }
        return product;
    }
}
