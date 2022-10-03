public class QuantifiableDerivative extends QuantifiableProduct{

    public QuantifiableDerivative(Derivative derivativeProduct, int quantity) {
        super(derivativeProduct, quantity);
    }

    @Override
    public int getQuantity(String productId){
        return super.getQuantity() * getDerivativeProduct().getQuantity(productId);
    }

    private Derivative getDerivativeProduct(){
        return (Derivative) super.getProduct();
    }
    
}
