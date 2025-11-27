package simp.SerializationPractice;

import java.io.Serializable;

public class Product implements Serializable {

    // THIS LINE IS MANDATORY TO STOP THE ERROR FOREVER
    private static final long serialVersionUID = 1L;

    String productName;
    float price;                  // ← removed 'transient' (or keep it if you really want price = 0 on load)

    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{productName='" + productName + "', price=" + price + '}';
    }
}