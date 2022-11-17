package resact_12;

import java.util.Scanner;

/**
 * This program shows the fibonacci sequence up to position 'n'
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class RecursiveFibonacci {

    /**
     * This function gets a positive integer number
     *
     * @return a positive integer number
     */
    static int getNum() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.print("ERROR: number must be positive. ");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function calculates the 'n' iteration of Fibonacci sequence
     *
     * @param n the iteration that we want to show
     * @return a integer number
     */
    static int recursiveFibonacci(int n) {
        int res;
        if (n <= 1) {
            res = 1;
        } else {
            res = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
        return (res);
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Enter the fibonacci iteration you want to "
                    + "display. Must be a number less than 40. ");
            n = getNum();
            if (n >= 40) {
                System.out.print("ERROR: number must be less than 40. ");
            }
        } while (n >= 40); // numbers greater than 40 take a long time to calculate
        
        System.out.println("The '" + n + "' iteration of Fibonacci sequence is: "
                + recursiveFibonacci(n));
    }
}
