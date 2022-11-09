package addact_49;

import java.util.Scanner;

/**
 * This program calculates the maximum, the minimum and the mean of a series of
 * positive integers entered by keyboard. The program will end when the user
 * enters a prime number. This last number will not be taken into account in the
 * calculations. The program must also indicate how many numbers has entered the
 * user (not counting the last prime number).
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class PrimeNumberExit {

    public static void main(String[] args) {
        int num, counter = 0, max = 0, min = 0, total = 0;
        double average;
        boolean isPrime;
        do {
            num = get_num();
            isPrime = check_prime(num);
            if (!isPrime) {
                counter++;
                /* the first valid number is assigned to min and max */
                if (counter == 1) {
                    min = num;
                    max = num;
                } else {
                    max = num > max ? num : max;
                    min = num < min ? num : min;
                }
                total += num;
            }
        } while (!isPrime);

        if (counter >= 1) {
            average = (double) total / counter;
            System.out.printf("""
                              Numbers entered: %d.
                              Higher value: %d.
                              Lower value: %d.
                              Arithmetic average: %,.2f.
                              """, counter, max, min, average);
        } else {
            System.out.printf("The only number entered was prime (%d).\n",
                    num);
        }

    }

    /**
     * This function gets a positive integer number
     *
     * @return a positive ingeger number
     */
    static int get_num() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number. "
                    + "If the number is prime, the program will stop: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Number must be positive. ");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function checks if a number is prime
     *
     * @param num the number to check if it's prime
     * @return a boolean
     */
    static boolean check_prime(int num) {
        var isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; (i <= (num / 2)) && isPrime; i++) {
                if ((num % i) == 0) {
                    isPrime = false;
                }
            }
        }
        return (isPrime);
    }

}
