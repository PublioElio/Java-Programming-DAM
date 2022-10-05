package appact_16;

import java.util.Scanner;

/**
 * This program shows the absolute number of a given value
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AbsoluteNumber {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        num = sc.nextInt();
        num = num < 0 ? -num : num;
        // alternative way: Math.abs(num);
        System.out.printf("The absolute value of that number is: %d\n",
                num);
    }
}
