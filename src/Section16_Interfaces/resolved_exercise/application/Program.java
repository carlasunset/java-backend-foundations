package Section16_Interfaces.resolved_exercise.application;

import Section16_Interfaces.resolved_exercise.entities.Contract;
import Section16_Interfaces.resolved_exercise.entities.Installment;
import Section16_Interfaces.resolved_exercise.services.ContractService;
import Section16_Interfaces.resolved_exercise.services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data:");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Date dd/MM/yyyy: ");
        LocalDate date = LocalDate.parse(scanner.next(), formatter);
        System.out.print("Contract value: ");
        double contractValue = scanner.nextDouble();

        Contract contract = new Contract(number, date, contractValue);

        System.out.print("Enter with the installments number: ");
        int installments = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);
        System.out.println("Installments: ");

        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        scanner.close();

    }
}
