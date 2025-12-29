package Section17_Generics_Set_Map.map;

import java.util.HashMap;
import java.util.Map;

public class SecondDemo {
    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product product1 = new Product("TV", 900.00);
        Product product2 = new Product("Laptop", 1200.00);
        Product product3 = new Product("Tablet", 400.00);

        stock.put(product1, 10000.0);
        stock.put(product2, 20000.0);
        stock.put(product3, 15000.0);

        Product ps = new Product("TV", 900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
