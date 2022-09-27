package appact_21;

import java.util.Scanner;

/**
 * This program asks for two numbers and returns true if both are the same
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class EqualNumbers {
    public static void main(String[] args){
        int num1, num2;
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        num2 = sc.nextInt();
        result = num1 == num2;
        System.out.println("Both numbers are equal? " + result);
    }
}
