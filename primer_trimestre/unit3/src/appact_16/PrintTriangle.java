package appact_16;

import java.util.Scanner;

/**
 * this program requests a height and prints a triangle of asterisks
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class PrintTriangle {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number for the height"
                    + " of the triangle: ");
            n = sc.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" "); // print spaces before '*'
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* "); // prints '*'
            }
            System.out.println();
        }
    }

}
