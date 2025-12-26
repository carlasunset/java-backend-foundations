package Section16_Interfaces.default_methods.application;

import Section16_Interfaces.default_methods.services.BrazilInterestService;
import Section16_Interfaces.default_methods.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Months: ");
        int months = scanner.nextInt();

        // Program depends on the InterestService interface, not on concrete classes
        InterestService brazilInterestService = new BrazilInterestService(1.0);

        // Calls the default method defined in the interface
        double payment = brazilInterestService.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f%n", payment);



        scanner.close();
    }
}
