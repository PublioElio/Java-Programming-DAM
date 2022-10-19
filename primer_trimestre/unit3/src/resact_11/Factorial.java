package resact_11;

import java.util.Scanner;

/**
 * This program calculates the factorial of a given number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Factorial {

    public static void main(String[] args) {
        int num, fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer number to calculate "
                + "factorial: ");
        num = sc.nextInt();
        num = Math.abs(num);
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.printf("The factorial of %d is: %d\n", num,
                fact);
    }
}
