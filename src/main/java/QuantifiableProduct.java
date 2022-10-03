public class QuantifiableProduct {
    private Product product;
    private int quantity;

    public QuantifiableProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getQuantity(String productId){
        return (this.product.getId().equals(productId)) ? this.quantity : 0;
    }

}
