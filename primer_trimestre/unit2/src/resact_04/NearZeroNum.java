package resact_04;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program tells if a decimal number is near-zero
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class NearZeroNum {

    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter a decimal number (use period, not comma) to "
                + "check if it is near-zero or not: ");
        n = sc.nextDouble();
        if ((n > -1) && (n < 1) && (n != 0)) {
            System.out.println(n + " is a near-zero number\n");
        } else {
            System.out.println(n + " isn't a near-zero number\n");
        }
    }

}
