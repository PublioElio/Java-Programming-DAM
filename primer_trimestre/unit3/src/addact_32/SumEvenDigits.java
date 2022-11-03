package addact_32;

import java.util.Scanner;

/**
 * This program asks for a positive integer; showing the list of even digits and
 * adding them.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SumEvenDigits {

    public static void main(String[] args) {
        long num, digit;
        String printList = "";
        int total = 0;
        num = get_num();
        /* getting the list of numbers and the total */
        do {
            digit = num % 10;
            if ((digit % 2) == 0) {
                printList = digit + " " + printList;
                total += digit;
            }
            num /= 10;
        } while (num != 0);
        System.out.printf("Even digits: %s\n", printList);
        System.out.printf("The total addition of even digits: %d\n",
                total);
    }

    static long get_num() {
        long num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextLong();
            if (num < 0) {
                System.out.println("Invalid imput, number must be positive.");
            }
        } while (num < 0);
        return (num);
    }
}
