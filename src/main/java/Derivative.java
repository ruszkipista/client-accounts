import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Derivative extends Product implements CanExpire {
    private LocalDate expiryDate;
    List<Product> products = new ArrayList<>();

    public Derivative(String id, String name, String description, int quantity, LocalDate expiryDate) {
        super(id, name, description, quantity);
        this.expiryDate = expiryDate;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    
    @Override
    public int getQuantity(String productId) {
        int sum = 0;
        for (Product actualProduct : products){
            sum += super.getQuantity() * actualProduct.getQuantity(productId);
        }
        return sum;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }
    
}
