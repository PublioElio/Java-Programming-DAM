package resact_07;

import java.util.Scanner;

/**
 * This program gets an integer by console and shows the number of prime
 * divisors of that number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrimeDivisors {

    /**
     * This function prints the list of prime divisors of a given number
     *
     * @param num the number to check the prime divisors
     */
    static int printPrimeDivisors(int num) {
        int counter = 0;
        for (int i = 2; i < num; i++) {
            if (checkPrime(i) && (num % i == 0)) {
                counter++;
            }
        }
        return (counter);
    }

    /**
     * This function gets a positive integer number from terminal
     *
     * @return a positive integer number
     */
    static int getNum() {
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
    static boolean checkPrime(int num) {
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

    public static void main(String[] args) {
        int num;
        num = getNum();
        System.out.printf("%d has %d prime divisors\n",
                num, printPrimeDivisors(num));
    }

}
