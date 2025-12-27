package Section17_Generics_Set_Map.resolved_exercise.application;

import Section17_Generics_Set_Map.resolved_exercise.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<String> printService = new PrintService<>();

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            printService.addValue(value);
        }

        printService.print();

        String firstValue = printService.first();

        System.out.println("First: " + firstValue);
        scanner.close();
    }
}
