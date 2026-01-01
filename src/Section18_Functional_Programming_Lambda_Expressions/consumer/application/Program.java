package Section18_Functional_Programming_Lambda_Expressions.consumer.application;

import Section18_Functional_Programming_Lambda_Expressions.consumer.util.PriceUpdate;
import Section18_Functional_Programming_Lambda_Expressions.consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        Consumer<Product> consumer = product -> {
            product.setPrice(product.getPrice() * factor);
        };

        list.forEach(Product::nonStaticPriceUpdate);

        list.forEach(System.out::println);

    }
}
