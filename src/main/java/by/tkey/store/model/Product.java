package by.tkey.store.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private float price;

    @Column(name = "product_image")
    private String img;

    @Column(name = "need")
    private boolean need;

//    @ElementCollection
//    @CollectionTable(name="products")
//    Set<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isNeed() {
        return need;
    }

    public void setNeed(boolean need) {
        this.need = need;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
