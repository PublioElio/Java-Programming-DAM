package addact_15;

import java.util.Scanner;
import static addact_14.CustomMathLib.isPrime;

/**
 * This program shows the first 1000 prime numbers
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class ThousandPrimeNumbers {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                counter++;
                if ((counter % 25) == 0) {
                    System.out.printf("%d\n", i);
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
        System.out.printf("\n---------- Total numbers printed: %d ----------\n",
                counter);
    }

}
