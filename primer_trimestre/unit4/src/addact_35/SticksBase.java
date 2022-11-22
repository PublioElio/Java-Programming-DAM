package addact_35;

import static addact_14.CustomMathLib.*;

/**
 * This program converts a number into sticks base
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SticksBase {

    /**
     * This function gets a decimal number and converts it into decimal base
     *
     * @param n the decimal number
     * @return a string in sticks base
     */
    public static String sticksBase(int n) {
        String result = "";

        for (int i = 0; i < digits(n); i++) {
            for (int j = 0; j < digitN(n, i); j++) {
                result += "|";
            }
            if (i < digits(n) - 1) {
                result += "-";
            }
        }

        return (result);
    }

    public static void main(String[] args) {
        int num;
        String result;
        System.out.print("Enter a number to turn in sticks base: ");
        num = getPositiveInt();
        result = sticksBase(num);
        System.out.printf("%d in sticks base is: %s\n", num, result);
    }

}
