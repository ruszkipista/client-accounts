import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        QuantifiableProduct share1 = new QuantifiableProduct(new Share("s1",  "IBM",  "desc.") , 500);
        QuantifiableProduct bond1 = new QuantifiableProduct(new Bond("b1", "Gov. Bond HUN",  "desc.", LocalDate.of(2024, 12, 31)), 3);

        List<QuantifiableProduct> products = new ArrayList<>();
        products.add(new QuantifiableProduct(new Share("s1",  "IBM",  "desc."), 10));
        products.add(new QuantifiableProduct(new Bond("b1", "Gov. Bond HUN",  "desc.", LocalDate.of(2024, 12, 31)),4));

        QuantifiableProduct deriv1 = new QuantifiableDerivative(new Derivative("d1", "Ruby", "desc.", LocalDate.of(2024, 12, 31),products),2);

        List<QuantifiableProduct> assets = new ArrayList<>();
        assets.add(share1);
        assets.add(bond1);
        assets.add(deriv1);

        Account acc1 = new Account(assets);

        System.out.println("IBM shares in account assets: "+acc1.getQuantity("s1"));
        System.out.println("Gov. Bond HUN in account assets: "+acc1.getQuantity("b1"));
    }
}
