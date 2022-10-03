import java.util.List;

public class Account {
    List<QuantifiableProduct> assets;

    public Account(List<QuantifiableProduct> assets) {
        this.assets = assets;
    }

    public int getQuantity(String productId) {
        int totalQuantity = 0;
        for (QuantifiableProduct asset : assets) {
            totalQuantity += asset.getQuantity(productId);
        }
        return totalQuantity;
    }

}
