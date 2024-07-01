package pre_entregas.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer amount;

    private Double  price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client_id;

   public Cart(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient_id() {
        return client_id;
    }

    public void setClient_id(Client client_id) {
        this.client_id = client_id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id) && Objects.equals(amount, cart.amount) && Objects.equals(price, cart.price) && Objects.equals(product_id, cart.product_id) && Objects.equals(client_id, cart.client_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, price, product_id, client_id);
    }

    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", amount=" + amount +
                ", price=" + price +
                ", product=" + (product_id != null ? product_id.getName() : "null") +
                ", client=" + (client_id != null ? client_id.getName() : "null") +
                '}';
    }
}
