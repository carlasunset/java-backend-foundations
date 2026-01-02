package Section18_Streams.resolved_exercise.application;

import Section18_Streams.resolved_exercise.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Product> productList = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(",");
                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            double average = productList.stream()
                    .map(product -> product.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / productList.size();

            System.out.println("Average price: " + String.format("%.2f", average));

            Comparator<String> comparator = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());

            List<String> productNames = productList.stream()
                    .filter(product -> product.getPrice() < average)
                    .map(product -> product.getName())
                    .sorted(comparator.reversed()).toList();

            productNames.forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Error:" + e.getMessage());
        }
        scanner.close();

    }
}
