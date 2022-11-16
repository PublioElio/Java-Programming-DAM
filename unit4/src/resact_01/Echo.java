package resact_01;

import java.util.Scanner;

/**
 * This program prints "Echo..." on terminal 'n' times
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Echo {

    public static void main(String[] args) {
        int n;
        n = get_num();
        echo(n);
    }

    /**
     * This function prints "Echo..." on console 'n' times
     *
     * @param n the number of times "Echo..." will be printed
     */
    static void echo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Echo...");
        }
    }

    /**
     * This function gets a positive inger number
     *
     * @return a positive integer number
     */
    static int get_num() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.print("The number must be positive. ");
            }
        } while (n < 0);
        return (n);
    }
}
