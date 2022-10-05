package appact_15;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program calculates area of a triangle, asking for base and height. If
 * any of them is negative, shows an error message
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class TriangleAreaCalculator {

    public static void main(String[] args) {
        double b, h, s;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Enter base: ");
        b = sc.nextDouble();
        System.out.print("Enter height: ");
        h = sc.nextDouble();
        if (b < 0 || h < 0) {
            System.out.print("Error: negative imput\n");
        } else {
            s = (b * h) / 2;
            System.out.printf("The area of this triangle is: %,.2f\n",
                    s);
        }
    }
}
