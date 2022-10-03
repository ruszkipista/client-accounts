import java.time.LocalDate;

public class Bond extends Product implements CanExpire{
    private LocalDate expiryDate;

    public Bond(String id, String name, String description, int quantity, LocalDate expiryDate) {
        super(id, name, description, quantity);
        this.expiryDate = expiryDate;
    }
    
    public LocalDate getExpiryDate(){
        return this.expiryDate;
    }
}
