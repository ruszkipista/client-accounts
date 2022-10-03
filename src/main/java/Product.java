public abstract class Product {
    private String id;
    private String name;
    private String description;

    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
  
    public String getId(){
        return this.id;
    }
    
}