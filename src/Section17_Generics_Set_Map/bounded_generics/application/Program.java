package Section17_Generics_Set_Map.bounded_generics.application;

import Section17_Generics_Set_Map.bounded_generics.entities.Product;
import Section17_Generics_Set_Map.bounded_generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        String path = "C:\\assets.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            Product product = CalculationService.max(productList);
            System.out.println("Max: " + product);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } ;

    }
}
