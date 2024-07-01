package pre_entregas.managers;

import jakarta.persistence.*;
import pre_entregas.entities.Client;

import java.util.List;

public class ClientsManager {
    //CREAR PRODUCTO
    public void create(String name, Integer docnumber){
        EntityManager manager = null;
        EntityTransaction transaction;
        try{
            manager = Manager.getEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();
            Client client = new Client();
            client.setName(name);
            client.setDocnumber(docnumber);
            manager.persist(client);
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
    public Client readOne(int clientId) {
        EntityManager manager = Manager.getEntityManager();
        Client client = null;
        try {
            client = manager.find(Client.class, clientId);

            // Cargar carts si es necesario
            if (client != null) {
                client.getCarts().size(); // Esto fuerza la carga de carts si es necesario
            }

        } catch (Exception e) {
            System.out.println("Error al leer el cliente con ID " + clientId + ": " + e.getMessage());
        } finally {
            if (manager != null && manager.isOpen()) {
                manager.close();
            }
        }
        return client;
    }


    // LEER CLIENTES O BUSCAR POR FILTRO
    public List<Client> readAll(String filter){
        EntityManager manager = Manager.getEntityManager();
        List<Client> list = null;
        try{
            String queryString = "FROM Client";
            if (filter != null && !filter.isEmpty()) {
                queryString += " WHERE name LIKE :filter";
                TypedQuery<Client> query = manager.createQuery(queryString, Client.class);
                query.setParameter("filter", "%" + filter + "%");
                list = query.getResultList();
            } else {
                list = manager.createQuery(queryString, Client.class).getResultList();
            }
        }catch (Exception e){
            System.out.println("Error al leer todos los clientes: " + e.getMessage());
        }finally {
            if(manager != null && manager.isOpen()){
                manager.close();
            }
        }
        return list;
    }

}
