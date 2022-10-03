import java.time.LocalDate;
import java.util.List;

public class Derivative extends Product implements CanExpire {
    private LocalDate expiryDate;
    List<QuantifiableProduct> products;

    public Derivative(String id, String name, String description, LocalDate expiryDate, List<QuantifiableProduct> products) {
        super(id, name, description);
        this.expiryDate = expiryDate;
        this.products = products;
    }

    public int getQuantity(String productId) {
        int sum = 0;
        for (QuantifiableProduct quantifiableProduct : products) {
            sum += quantifiableProduct.getQuantity(productId);
        }
        return sum;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

}
