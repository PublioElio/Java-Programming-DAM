package resact_09;

import java.util.Scanner;

/**
 * This program tells how many numbers has an integer between 0 and 99.999
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class NumberCounter {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number between "
                + "-99.999 and 99.999: ");
        num = sc.nextInt();
        num = num < 0 ? num * -1 : num;
        if (num < 10) {
            System.out.print("That number has 1 digit");
        } else if (num < 100) {
            System.out.print("That number has 2 digits");
        } else if (num < 1000) {
            System.out.print("That number has 3 digits");
        } else if (num < 10_000) {
            System.out.print("That number has 4 digits");
        } else if (num < 100_000) {
            System.out.print("That number has 5 digits");
        }
    }
}
