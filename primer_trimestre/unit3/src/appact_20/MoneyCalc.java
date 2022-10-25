package appact_20;

import java.util.Scanner;
import java.util.Locale;

/**
 * This program asks the user for different amounts of money and calculates the
 * total amount when the user enters '0'
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MoneyCalc {

    public static void main(String[] args) {
        double money, totalAmount = 0;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        do {
            do {
                System.out.print("Enter a positive quantity of money. Use '.' "
                        + "for decimals ('0' to finish program): ");
                money = sc.nextDouble();
                if (money < 0) {
                    System.out.println("Negative imput not valid!");
                }
            } while (money < 0);
            totalAmount += money;
        } while (money != 0);
        System.out.printf("The total amount is: %,.2f €\n",
                totalAmount);
    }
}
