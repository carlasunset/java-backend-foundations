package Section18_Functional_Programming_Lambda_Expressions.function.util;

import Section18_Functional_Programming_Lambda_Expressions.function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
