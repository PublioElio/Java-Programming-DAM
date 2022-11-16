package resact_07;

import java.util.Scanner;

/**
 * This program gets a number by console and prints the list of prime divisors
 * of that number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrimeDivisors {

    public static void main(String[] args) {
        int num;
        num = get_num();
        System.out.printf("Prime divisors of %d: ", num);
        print_prime_divisors(num);
    }

    /**
     * This function prints the list of prime divisors of a given number
     *
     * @param num the number to check the prime divisors
     */
    static void print_prime_divisors(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (check_prime(i)) {
                    System.out.printf("%d ", i);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.print("That number has no prime divisors.\n");
        }
    }

    /**
     * This function gets a positive integer number from terminal
     *
     * @return a positive integer number
     */
    static int get_num() {
        int num;
        boolean validNum;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            validNum = num >= 0;
            if (!validNum) {
                System.out.print("Invalid number. ");
            }
        } while (!validNum);
        return (num);
    }

    /**
     * This function checks if a number is prime
     *
     * @param num the number to check if it is prime
     * @return true if the number is prime
     */
    static boolean check_prime(int num) {
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; ((i <= num / 2) && (isPrime)); i++) {
                isPrime = !(num % i == 0);
            }
        }
        return (isPrime);
    }
}
