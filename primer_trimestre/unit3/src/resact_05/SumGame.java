package resact_05;

import java.util.Scanner;
import java.util.Random;

/**
 * This program adds two random numbers, as long as the user continues to
 * respond correctly to the result of the operation
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SumGame {

    public static void main(String[] args) {
        int num1, num2, userNum, res, tries = 0;
        Scanner sc = new Scanner(System.in);
        do {
            num1 = (int) (Math.random() * 100) + 1;
            num2 = (int) (Math.random() * 100) + 1;
            /* we can do it also with random class
            Random rand = new Random();
            num1 = rand.nextInt(1, 101);
            num2 = rand.nextInt(1, 101); */
            System.out.printf("What's the result of %d + %d ? ",
                    num1, num2);
            res = num1 + num2;
            tries++;
            userNum = sc.nextInt();
        } while (userNum == res);
        System.out.printf("""
                          The correct answer is %d; You failed after %d tries! 
                          """, res, tries);
    }
}
