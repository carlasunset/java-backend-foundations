package Section05_Conditional_Statements;

import java.util.Locale;
import java.util.Scanner;

public class CompoundOperators {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();
        double sum = 50.0;

        if (minutes > 100){
            sum += (minutes - 100) * 2; // sum = sum + (minutes - 100) * 2;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", sum);

        sc.close();

        /*
          Compound Operators
          a += b -> a = a + b
          a -+ b -> a = a - b
          a *= b -> a = a * b
          a /= b -> a = a / b
          a %= b -> a = a % b

         */
    }
}
