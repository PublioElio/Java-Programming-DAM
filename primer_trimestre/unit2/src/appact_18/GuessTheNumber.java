package appact_18;

import java.util.Scanner;
import java.util.Random;

/**
 * This program generates two random numbers and asks the user for the addition
 * of both
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GuessTheNumber{

    public static void main(String[] args) {
        double randomNum1, randomNum2;
        int num1, num2, num3;
        int res;
        Random randomNum3 = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println(randomNum3.nextInt(3));
        randomNum1 = Math.random();
        randomNum1 *= 100;
        num1 = (int) randomNum1;
        randomNum2 = Math.random();
        randomNum2 *= 100;
        num2 = (int) randomNum2;
        System.out.println(randomNum3);
        
        /*
        randomNum3 = Math.random();
        randomNum3 *= 10;
        num3 = (int) randomNum3;
        System.out.println(num3); */
        
        System.out.printf("Enter the result of the next operation: "
                + "%d %c %d:", num1, num2);
        res = sc.nextInt();
        if (res == (num1 + num2)) {
            System.out.println("That's correct!");
        } else {
            System.out.println("That's incorrect!");
        }
    }

}
