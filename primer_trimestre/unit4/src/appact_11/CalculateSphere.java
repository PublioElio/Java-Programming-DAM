package appact_11;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program calculates the volume and area of ​​a sphere
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CalculateSphere {

    /**
     * This function gets a positive double
     *
     * @return a positive double (radius)
     */
    static double getRadius() {
        double r;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        do {
            System.out.print("Enter a positive number for radius: ");
            r = sc.nextDouble();
            if (r < 0) {
                System.out.print("ERROR: number must be positive. ");
            }
        } while (r < 0);
        return (r);
    }

    /**
     * This function calculates and prints area and volume of a sphere.
     *
     * @param r the radius
     */
    static void calculateSphere(double r) {
        System.out.printf("The area of the sphere is: %,.2f\n",
                ((4 * Math.PI) * Math.pow(r, 2)));
        System.out.printf("The volume of the sphere is: %,.2f\n",
                (((4 * Math.PI) / 3) * Math.pow(r, 3)));
    }

    public static void main(String[] args) {
        double r;
        r = getRadius();
        calculateSphere(r);
    }

}
