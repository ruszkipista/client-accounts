import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        Share share1 = new Share("s1",  "IBM",  "desc.", 500);
        Bond bond1 = new Bond("b1", "Gov. Bond HUN",  "desc.", 3, LocalDate.of(2024, 12, 31));

        Derivative deriv1 = new Derivative("d1", "Ruby", "desc.", 2, LocalDate.of(2024, 12, 31));
        deriv1.addProduct(new Share("s1",  "IBM",  "desc.", 10) );
        deriv1.addProduct(new Bond("b1", "Gov. Bond HUN",  "desc.", 4, LocalDate.of(2024, 12, 31)));

        List<Product> products = new ArrayList<>();
        products.add(share1);
        products.add(bond1);
        products.add(deriv1);

        Account acc1 = new Account(products);

        System.out.println("IBM shares in account assets: "+acc1.getQty("s1"));
        System.out.println("Gov. Bond HUN in account assets: "+acc1.getQty("b1"));
    }
}
