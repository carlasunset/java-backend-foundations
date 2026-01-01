package Section18_Functional_Programming_Lambda_Expressions.function.application;

import Section18_Functional_Programming_Lambda_Expressions.function.entities.Product;
import Section18_Functional_Programming_Lambda_Expressions.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).toList();

        names.forEach(System.out::println);

    }
}
