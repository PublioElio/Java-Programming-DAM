package resact_01_02_03_06;

import java.util.Scanner;

/**
 * This program compares two numbers using the if-else statement
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CompareNumbers {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first integer value: ");
        a = sc.nextInt();
        System.out.println("Enter a second integer value: ");
        b = sc.nextInt();
        if ((a % 2) == 0) {
            System.out.printf("\n'%d' is an even number\n", a);
        } else {
            System.out.printf("\n'%d' isn't an even number\n", a);
        }
        if (a == b) {
            System.out.printf("\n'%d' and '%d' are the same number\n",
                    a, b);
        } else if (a > b) {
            System.out.printf("\n'%d' is greater than '%d'\n", a, b);
        } else {
            System.out.printf("\n'%d' is greater than '%d'\n", b, a);
        }
    }
}
