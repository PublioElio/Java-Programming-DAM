package resact_03;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program calculates de area or the volume of a cylinder
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Cylinder {

    public static void main(String[] args) {
        menu();
    }

    /**
     * This function asks for an option: '1' is for calculate area, '2' is for
     * calculate volume
     */
    static void menu() {
        int option;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Choose an option: 1 to calculate area; 2 to "
                    + "calculate volume: ");
            option = sc.nextInt();
            switch (option) {
                case 1 ->
                    cylinder_area();
                case 2 ->
                    cylinder_volume();
                default ->
                    System.out.print("Invalid option. ");
            }
        } while (option > 2 || option < 1);
    }

    /**
     * This function calculates the area of a cylinder, asking for radius and
     * height
     */
    static void cylinder_area() {
        double a, h, r;
        r = get_value("radius");
        h = get_value("height");
        a = 2 * Math.PI * r * (h + r);
        System.out.printf("The area of a cylinder with radius %,.2f "
                + "and height %,.2f is: %,.2f\n", r, h, a);
    }

    /**
     * This function calculates the volume of a cylinder, asking for radius and
     * height
     */
    static void cylinder_volume() {
        double v, h, r;
        r = get_value("radius");
        h = get_value("height");
        v = Math.PI * Math.pow(r, 2) * h;
        System.out.printf("The volume of a cylinder with radius %,.2f "
                + "and height %,.2f is: %,.2f\n", r, h, v);
    }

    /**
     * This function asks the user for parameters on terminal. The parameter is
     * a given string
     *
     * @param value the value that will be asked to the user
     * @return the user entered value
     */
    static double get_value(String value) {
        double n;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        do {
            System.out.printf("Enter %s: ", value);
            n = sc.nextDouble();
            if (n < 0) {
                System.out.printf("The %s must be positive. ", value);
            }
        } while (n < 0);
        return (n);
    }
}
