package resact_09;

import java.util.Scanner;

/**
 * This program asks for a number between 1 and 10 and displays its
 * multiplication table
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int num, res;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter an integer positive number: ");
            num = sc.nextInt();
        } while ((num < 1) || (num > 10));
        for (int i = 1; i <= 10; i++) {
            res = num * i;
            System.out.printf("%d   X   %d  =   %d\n",
                    num, i, res);
        }
    }
}
