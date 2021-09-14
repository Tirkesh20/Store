package by.tkey.store.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne()
    private Long customerId;

    private String productName;



    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private Set<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private boolean status;
}
