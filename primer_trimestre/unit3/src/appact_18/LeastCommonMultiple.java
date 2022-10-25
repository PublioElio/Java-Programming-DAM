package appact_18;

import java.util.Scanner;

/**
 * Calculates the greatest common divisor (GCD) of two integers, then,
 * calculates the least common multiple
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class LeastCommonMultiple {

    public static void main(String[] args) {
        int a, b, lower, greater, divisor, multiple;
        a = get_number();
        b = get_number();
        lower = a < b ? a : b;
        greater = a > b ? a : b;
        divisor = get_GCD(lower, greater);
        multiple = (a * b) / divisor;
        System.out.printf("The least common multiple (LCM) of the entered"
                + " numbers is: %d\n", multiple);

    }

    /**
     * Ask the user for a positive integer number
     *
     * @return the entered int
     */
    static int get_number() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
        } while (num < 0);
        return (num);
    }

    /**
     * Calcutes the GCD from the lower number
     *
     * @param lower the lower int enterded by the user
     * @param greater the greater int enterded by the user
     * @return the GCD
     */
    static int get_GCD(int lower, int greater) {
        int gcd = lower;
        for (; gcd > 0; gcd--) {
            if (((lower % gcd) == 0) && ((greater % gcd) == 0)) {
                return (gcd);
            }
        }
        return (gcd);
    }
}
