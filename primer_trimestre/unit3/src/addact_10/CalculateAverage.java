package addact_10;

import java.util.Scanner;

/**
 * This program calculates the arithmetic average of the entered numbers, until
 * the user imputs a negative number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CalculateAverage {

    public static void main(String[] args) {
        int num, total = 0;
        double average, count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number.\nEnter a "
                    + "negative number to calculate average: ");
            num = sc.nextInt();
            if (num >= 0) {
                total += num;
                count++;
            }
        } while (num >= 0);
        if (count != 0) { // this conditional skips zero division
            average = total / count;
            System.out.printf("The arithmetic average of the entered numbers"
                    + " is: %,.2f\n", average);
        } else {
            System.out.println("No valid numbers entered. End of program.");
        }
    }

}
