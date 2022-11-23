package addact_37;

import static addact_14.CustomMathLib.*;

/**
 * This program converts a positive integer number into morse code (in a string)
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class MorseCode {

    /**
     * This function returns a single digit into morse code, in a String
     *
     * @param digit the digit to turn into morse code
     * @return the string in morse code
     */
    public static String morseDigit(int digit) {
        String dMorse = "";
        if (digit > 0 && digit < 6) {
            for (int i = 1; i <= 5; i++) {
                if (i <= digit) {
                    dMorse += ". ";
                } else {
                    dMorse += "_ ";
                }
            }
        } else {
            for (int i = 6; i <= 10; i++) {
                if (i <= digit) {
                    dMorse += "_ ";
                } else {
                    dMorse += ". ";
                }
            }
        }
        return (dMorse);
    }

    /**
     * This function convers a positive integer number into morse code
     *
     * @param n the positive integer number
     * @return the string in morse code
     */
    public static String morseCode(int n) {
        int digit;
        String nMorse = "";
        if (n == 0) {
            nMorse = "_ _ _ _ _";
        } else {
            for (int i = 0; i <= (digits(n) - 1); i++) {
                digit = digitN(n, i);
                nMorse += morseDigit(digit);
            }
        }
        return (nMorse);
    }

    public static void main(String[] args) {
        int n;
        String nMorse;
        System.out.print("Enter a number to change to morse code: ");
        n = getPositiveInt();
        nMorse = morseCode(n);
        System.out.println(nMorse);

    }

}
