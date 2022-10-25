package appact_19;

import java.util.Scanner;

/**
 * Calculates a square root by approximation, in case it is not exact, it gives
 * the nearest number, plus the rest
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SquareRoot {

    public static void main(String[] args) {
        int num, sqrt, pow, remainder;
        num = get_num();
        test_sqrt(num);
        get_sqrt(num);
    }

    /**
     * Gets a integer positive number from console
     *
     * @return an integer positive number
     */
    static int get_num() {
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Invalid imput.");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * Calculates the square root of a number using the Math Java library. This
     * is a function to test the exercise
     *
     * @param num the number to calculate the sqrt
     */
    static void test_sqrt(int num) {
        int sqrt, pow, remainder;
        sqrt = (int) Math.sqrt(num);
        pow = (int) Math.pow(sqrt, 2);
        remainder = num - pow;
        if (remainder > 0) {
            System.out.printf("The square root of %d is %d, with a remainder"
                    + " of %d\n", num, sqrt, remainder);
        } else {
            System.out.printf("The square root of %d is %d\n",
                    num, sqrt);
        }

    }

    /**
     * This is the calculation of the square root via approach
     *
     * @param num the calculation of the sqrt
     */
    static void get_sqrt(int num) {
        int sqrt, pow, remainder;
        for (sqrt = 1; (sqrt * sqrt) <= num; sqrt++) {
        }
        sqrt--; // decreasing the index is needed
        pow = sqrt * sqrt;
        remainder = num - pow;
        if (remainder > 0) {
            System.out.printf("The square root of %d is %d, with a remainder"
                    + " of %d\n", num, sqrt, remainder);
        } else {
            System.out.printf("The square root of %d is %d\n",
                    num, sqrt);
        }
    }

}
