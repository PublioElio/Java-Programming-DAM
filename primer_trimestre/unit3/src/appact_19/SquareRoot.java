package appact_19;

import java.util.Scanner;

/**
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
    public static int get_num() {
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
        } while (num < 0);
        return (num);
    }

    public static void test_sqrt(int num) {
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

    public static void get_sqrt(int num) {
        int sqrt, pow, remainder;
        for (sqrt = 1; (sqrt * sqrt) <= num; sqrt++) {
        }
        sqrt--;
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
