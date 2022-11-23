package appact_17;

import java.util.Scanner;

/**
 * This program checks if two numbers are amicable. Two numbers are amicable if
 * the sum of the prime divisors of 'a' is equal to the number 'b'
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AmicableNumbers {

    /**
     * This function gets a positive integer number by console
     *
     * @param ordinal the order of the requested number
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
                System.out.print("ERROR: number must be positive. ");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This program adds the list of prime divisors of a number
     *
     * @param num the number to check the list of prime divisors
     * @return the total sumatory of prime divisors
     */
    static int sumDivisors(int num) {
        int total = 0;
        for (int i = 1; i <= num / 2; i++) {
            total = num % i == 0 ? total + i : total;
        }
        return (total);
    }

    /**
     * This function checks is a and b are amicable numbers. Two numbers are
     * amicable if the sum of the prime divisors of 'a' is equal to the number
     * 'b'.
     *
     * @param a first number
     * @param b second numbber
     * @return true or false
     */
    static boolean checkAmicable(int a, int b) {
        return ((sumDivisors(a) == b) && (sumDivisors(b) == a));
    }

    public static void main(String[] args) {
        int a, b;
        boolean friends;
        System.out.println("Enter two positive integer numbers, "
                + "and this program will check if they are amicable.");
        a = getNum("first");
        b = getNum("second");
        friends = checkAmicable(a, b);

        if (!friends) {
            System.out.printf("%d and %d aren't amicable.\n", a, b);
        } else {
            System.out.printf("%d and %d are amicable.\n", a, b);
        }

    }

}
