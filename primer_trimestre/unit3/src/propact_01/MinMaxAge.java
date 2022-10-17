package propact_01;

import java.util.Scanner;

/**
 * This program asks for numbers until the user enters a -1. Then shows the
 * minimum an maximum value entered
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MinMaxAge {

    public static void main(String[] args) {
        int min, max, num;
        boolean validNum = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number,"
                + " or write -1 to finish program: ");
        num = sc.nextInt();
        min = num;
        max = num;
        validNum = num != -1;
        while (validNum) {
            if ((num < 1) || (num > 100)) {
                System.out.print("That's not a valid imput\n");
            } else {
                max = max < num ? num : max;
                min = min > num ? num : min;
            }
            System.out.print("Enter a positive integer number,"
                    + " or write -1 to finish program: ");
            num = sc.nextInt();
            validNum = num != -1;
        }
        min = min < 0 ? 1 : min;
        System.out.printf("The maximum is %d, and the minimum is %d\n",
                    max, min);


    }

}
