package Section09_Constructors_This_Overloading_Encapsulation.encapsulation.application;

import Section09_Constructors_This_Overloading_Encapsulation.encapsulation.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        Product product = new Product(name, price);
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("Updted data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updted data: " + product);

        scanner.close();
    }
}
