package addact_24;

import java.util.Scanner;

/**
 * This program reads a number 'n' and prints a pyramid of numbers with 'n' rows
 * as in the following figure:
 *      1
 *     121 
 *    12321 
 *   1234321
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class NumbersTriangle {

    public static void main(String[] args) {
        int n;
        n = get_num();
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.printf("%d", k);
            }
            for (int m = i; m > 0; m--) {
                System.out.printf("%d", m);
            }
            System.out.println();
        }
    }

    /**
     * Gets a positive integer number
     * 
     * @return a positive integer number
     */
    static int get_num() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Invalid number");
            }
        } while (num <= 0);
        return (num);
    }
}
