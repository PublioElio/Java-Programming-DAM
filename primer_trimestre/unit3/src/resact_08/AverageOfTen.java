package resact_08;

import java.util.Scanner;

/**
 * This program asks for 10 numbers and does the arithmetic mean
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class AverageOfTen {

    public static void main(String[] args) {
        int num, total = 0;
        double average;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a integer positive number: ");
            num = sc.nextInt();
            total += num;
        }
        average = (total * 1.0) / 10;
        System.out.printf("The aritmethic average is: %,.2f\n",
                average);
    }
}
