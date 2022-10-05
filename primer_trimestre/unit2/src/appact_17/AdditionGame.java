package appact_17;

import java.util.Scanner;

/**
 * This program generates two random numbers and asks the user for the addition
 * of both
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AdditionGame {

    public static void main(String[] args) {
        double randomNum1, randomNum2;
        int num1, num2;
        int res;
        Scanner sc = new Scanner(System.in);
        randomNum1 = Math.random();
        randomNum1 *= 100;
        num1 = (int) randomNum1;
        randomNum2 = Math.random();
        randomNum2 *= 100;
        num2 = (int) randomNum2;
        System.out.printf("Enter the result of the next addition: "
                + "%d + %d:", num1, num2);
        res = sc.nextInt();
        if (res == (num1 + num2)) {
            System.out.println("That's correct!");
        } else {
            System.out.println("That's incorrect!");
        }
    }

}
