package appact_14;

import java.util.Scanner;

/**
 * This program ask for an integer positive numbes (n) and shows all the prime
 * numbers from 1 to 'n'
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int n, counter = 0;
        boolean isPrime;
        n = get_num();

        if (n <= 1) {
            System.out.printf("%d is not a prime number.\n", n);
        } else {
            System.out.print("List of prime numbers: ");
            for (int i = 2; i <= n; i++) {
                isPrime = true;
                for (int j = 2; (j <= (i / 2)) && isPrime; j++) {
                    if ((i % j) == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    counter++;
                    System.out.printf("%d ", i);
                }
            }
            System.out.printf("\nBetween 1 and %d there are %d prime "
                    + "numbers\n", n, counter);

        }
    }

    /**
     * This function gets a positive integer number
     *
     * @return a positive integer
     */
    static int get_num() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("The number must be positive. ");
            }
        } while (num < 0);
        return (num);
    }
}
