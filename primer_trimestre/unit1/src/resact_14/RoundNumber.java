package resact_14;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program asks the user for a decimal number and rounds it
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class RoundNumber {

    public static void main(String[] args) {
        double num;
        long rounded;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // to use period instead of comma for decimals
        System.out.println("Enter a decimal number "
                + "(use period, not comma): ");
        num = sc.nextDouble();
        rounded = Math.round(num);
        System.out.println("Decimal number rounded: " + rounded);
        num += 0.5;
        System.out.println("\nAlternative solution:\n"
                + "----------------------------------------------------------\n"
                + "Decimal number rounded: " + (int) num);
    }
}
