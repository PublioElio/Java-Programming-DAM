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
        int n, counter = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            n = sc.nextInt();
        } while (n < 1); // this do while checks that the imput is valid
        System.out.print("List of prime numbers: 1");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; (j < i / 2) && isPrime; j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                counter++;
                System.out.printf(", %d", i);
            }
        }
        System.out.printf("\nBetween 1 and %d there are %d prime numbers\n",
                n, counter);
    }
}
