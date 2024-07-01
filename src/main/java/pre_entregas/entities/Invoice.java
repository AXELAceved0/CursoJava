package pre_entregas.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime create_ad;

    private double total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client_id;

    public Invoice() {
    }

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getCreate_ad() {
        return create_ad;
    }

    public void setCreate_ad(LocalDateTime create_ad) {
        this.create_ad = create_ad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(total, invoice.total) == 0 && Objects.equals(id, invoice.id) && Objects.equals(create_ad, invoice.create_ad) && Objects.equals(client_id, invoice.client_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_ad, total, client_id);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", client_id=" + client_id.getId() +
                ", create_ad=" + create_ad +
                ", total=" + total +
                '}';
    }
}
