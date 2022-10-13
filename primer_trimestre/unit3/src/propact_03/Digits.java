package propact_03;

import java.util.Scanner;

/**
 * This program requests a number from the user and displays it digit by digit
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Digits {

    public static void main(String[] args) {
        int userNumber, digit, counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        userNumber = sc.nextInt();
        userNumber = Math.abs(userNumber);
        while (userNumber > 0) {
            digit = (userNumber % 10);
            System.out.printf("%d. numeral is: %d \n",
                    counter, digit);
            counter++;
            userNumber /= 10;
        }
    }
}
