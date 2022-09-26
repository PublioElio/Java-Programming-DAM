package appact_20;

import java.util.Scanner;

/**
 * This program calculates the square root of a given number
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SquareRoot {
    public static void main(String[] args){
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate square root: ");
        num = sc.nextDouble();
        System.out.println("The square root of " + num 
                + " es " + Math.sqrt(num));
    }
}
