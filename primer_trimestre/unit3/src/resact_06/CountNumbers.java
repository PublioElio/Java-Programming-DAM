package resact_06;

import java.util.Scanner;

/**
 * This program displays all numbers between 1 and 'n' inclusive
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CountNumbers {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.printf("%d", i);
            } else {
                System.out.printf("%d, ", i);
            }
        }
        System.out.print(".\n");
    }
}
