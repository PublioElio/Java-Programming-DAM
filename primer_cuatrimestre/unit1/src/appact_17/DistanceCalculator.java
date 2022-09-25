package appact_17;

import java.util.Scanner;

/**
 * This program calculates distance in total centimeters from an imput of 
 * milimeters, centimeters and meters
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class DistanceCalculator {
    public static void main(String[] args){
        int m;
        double cm, ml;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter milimeters: ");
        ml = sc.nextDouble();
        System.out.println("Enter centimeters: ");
        cm = sc.nextDouble();
        System.out.println("Enter meters: ");
        m = sc.nextInt();
        cm += (m * 100) + (ml / 10);
        System.out.printf("""
                          Te total distance in centimeters is: %,.2f m.
                          """, cm);
    }        
}
