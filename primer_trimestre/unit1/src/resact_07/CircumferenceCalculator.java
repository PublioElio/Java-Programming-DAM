package resact_07;

import java.util.Scanner;

/**
 * This program asks for the radius of a circle and calculates circumference and
 * area.
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CircumferenceCalculator {
    public static void main(String[] args)
    {
        double cir, radius, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        radius = sc.nextDouble();
        cir = 2 * (Math.PI * radius);
        area = Math.PI * Math.pow(radius,2);
        System.out.printf("Circumference: %,.2f \tArea: %,.2f\n", 
                cir, area);
    }
}
