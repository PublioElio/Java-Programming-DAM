package addact_16;

import java.util.Scanner;
import static addact_14.CustomMathLib.isPalindromic;

/**
 * This program shows all palindromic numbers between 1 and 99_999
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class PalindromicNumbers {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 99_999; i++) {
            if (isPalindromic(i)) {
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
