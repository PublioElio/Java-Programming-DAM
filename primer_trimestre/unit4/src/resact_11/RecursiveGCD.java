package resact_11;

import java.util.Scanner;

/**
 * This program calculates de greatest common divisor between two numbers
 * (recursively)
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class RecursiveGCD {

    /**
     * This function gets a positive integer number
     *
     * @param ordinal the order of the number
     * @return a positive integer number
     */
    static int getNum(String ordinal) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Enter %s positive integer number: ",
                    ordinal);
            num = sc.nextInt();
            if (num < 0) {
                System.out.print("ERROR: number must be a positive integer. ");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function calculates the GCD recursively between teo numbers
     *
     * @param num1 first integer number
     * @param num2 second integer number
     * @return the GCD
     */
    static int gcd(int num1, int num2) {
        int gcd;
        if (num1 == 0) {
            gcd = num2;
        } else if (num2 == 0) {
            gcd = num1;
        } else {
            int min = num1 <= num2 ? num1 : num2;
            int max = num1 >= num2 ? num1 : num2;
            gcd = gcd(min, max - min);
        }
        return (gcd);
    }

    public static void main() {
        int num1, num2;
        num1 = getNum("first");
        num2 = getNum("second");
        System.out.printf("The greatest common divisor (GCD) of %d and %d"
                + " is %d\n", num1, num2, gcd(num1, num2));
    }

}
