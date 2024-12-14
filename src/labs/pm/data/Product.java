package labs.pm.data;

import java.math.BigDecimal;

/**
 * @author $(Jonathan)
 **/
//test comment
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        price = BigDecimal.ONE;
        this.price = price;
    }
}
