package appact_12;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program calculates the Euclidean distance between two points
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class EuclideanDistance {

    /**
     * This function calculates the Eclidean distance between two points
     *
     * @param x1 Coordinates for point one
     * @param y1 Coordinates for point one
     * @param x2 Coordinates for point two
     * @param y2 Coordinates for point two
     * @return the Euclidean distance
     */
    static double distance(double x1, double y1, double x2, double y2) {
        return (Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }

    /**
     * This function gets a double from console
     *
     * @param axis this string shows the axis ('x' or 'y')
     * @param ordinal this is the order of the point
     * @return a double (coordinates)
     */
    static double getCoords(String axis, String ordinal) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.printf("Enter %s axis for %s point: ", axis, ordinal);
        return (sc.nextDouble());
    }

    public static void main(String[] args) {
        double x1, y1, x2, y2;
        x1 = getCoords("x", "first");
        y1 = getCoords("y", "first");
        x2 = getCoords("x", "second");
        y2 = getCoords("y", "second");
        System.out.printf("The Euclidean distance between those two points is: %,.2f\n",
                distance(x1, y1, x2, y2));
    }

}
