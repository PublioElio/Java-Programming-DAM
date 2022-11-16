package resact_10;

import java.util.Scanner;
import java.util.Locale;

/**
 * This program calculates a number (a) to a given power (n)
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class IterativePower {

    public static void main(String[] args) {
        double a, pow;
        int n;

        a = get_double();
        n = get_int();
        pow = iterative_pow(a, n);

        System.out.printf("%,.2f to the power of %d is %,.2f\n",
                a, n, pow);
    }

    /**
     * This program calculates 'a' to the power of 'n'
     *
     * @param a positive real number, higher than '0'
     * @param n integer positive number
     * @return the result, a double
     */
    static double iterative_pow(double a, int n) {
        double pow = a;
        if (n == 0) {
            pow = 1;
        } else {
            for (int i = n; i > 1; i--) {
                pow *= a;
            }
        }
        return (pow);
    }

    /**
     * This function gets a positive integer number by keyboard
     *
     * @return a positive integer number
     */
    static int get_int() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter an integer positive number: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.print("ERROR: number must be positive. ");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function gets a real number
     *
     * @return a real number, higher than '0'
     */
    static double get_double() {
        double num;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        do {
            System.out.print("Enter a real number: ");
            num = sc.nextDouble();
            if (num <= 0) {
                System.out.print("ERROR: imput must be higher than '0'. ");
            }
        } while (num <= 0);
        return (num);
    }

}
