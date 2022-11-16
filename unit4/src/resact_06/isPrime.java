package resact_06;

import java.util.Scanner;

/**
 * This program checks if a number is prime
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class isPrime {

    public static void main(String[] args) {
        int n;
        boolean isPrime;
        n = get_num();
        isPrime = check_prime_num(n);
        if (isPrime) {
            System.out.printf("'%d' is a prime number.\n", n);
        } else {
            System.out.printf("'%d' isn't a prime number.\n", n);
        }
    }

    /**
     * This function gets a positive integer number
     *
     * @return a positive integer number
     */
    static int get_num() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.print("Number must be positive. ");
            }
        } while (n < 0);
        return (n);
    }

    /**
     * This function checks if a given number is prime
     *
     * @param n the number to check
     * @return true if the number is prime
     */
    static boolean check_prime_num(int n) {
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= (n / 2) && isPrime; i++) {
                if ((n % i) == 0) {
                    isPrime = false;
                }
            }
        }
        return (isPrime);
    }
}
