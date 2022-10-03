import java.util.ArrayList;
import java.util.List;

public class Account {
    List<Product> products = new ArrayList<>();

    public Account(List<Product> products) {
        this.products = products;
    }

    public int getQty(String productId) {
        int totalQuantity = 0;
        for (Product actualProduct : products) {
            totalQuantity += actualProduct.getQuantity(productId);
        }
        return totalQuantity;
    }

}
