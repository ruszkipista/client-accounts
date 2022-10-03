public abstract class Product {
    private String id;
    private String name;
    private String description;
    private int quantity;

    public Product(String id, String name, String description, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
  
    public String getId(){
        return this.id;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public int getQuantity(String productId){
        return (this.id.equals(productId)) ? this.quantity : 0;
    }
    
}