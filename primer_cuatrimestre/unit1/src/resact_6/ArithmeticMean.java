package resact_6;

import java.util.Scanner;

/**
 * This program calculates the arithmetic mean 
 * of two ratings entered by the user.
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ArithmeticMean {
    public static void main(String[] args)
    {
        int rating1, rating2;
        double mean;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first score: ");
        rating1 = sc.nextInt();
        System.out.println("Enter second score: ");
        rating2 = sc.nextInt();
        mean = (rating1 + rating2) / 2;
        System.out.println("The arithmetic mean is: " + mean);
    }
}
