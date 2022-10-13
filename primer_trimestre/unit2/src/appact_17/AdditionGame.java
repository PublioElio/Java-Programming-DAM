package appact_17;

import java.util.Scanner;
import java.util.Random;

/**
 * This program generates two random numbers and asks the user for the addition
 * of both
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AdditionGame {

    public static void main(String[] args) {
        int num1, num2, res;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        num1 = random.nextInt(1, 100);
        num2 = random.nextInt(1, 100);
        /* we can get random numbers with Math class:
        num1 = Math.random() * 99 + 1;
         */

        System.out.printf("Enter the result of the next addition: "
                + "%d + %d: ", num1, num2);
        res = sc.nextInt();
        if (res == (num1 + num2)) {
            System.out.println("That's correct!");
        } else {
            System.out.println("That's incorrect!");
        }
    }

}
