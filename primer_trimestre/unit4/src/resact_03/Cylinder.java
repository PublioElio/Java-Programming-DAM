package resact_03;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program calculates de area or the volume of a cylinder
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Cylinder {

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
                    cylinderArea();
                case 2 ->
                    cylinderVolume();
                default ->
                    System.out.print("Invalid option. ");
            }
        } while (option > 2 || option < 1);
    }

    /**
     * This function calculates the area of a cylinder, asking for radius and
     * height
     */
    static void cylinderArea() {
        double a, h, r;
        r = getValue("radius");
        h = getValue("height");
        a = 2 * Math.PI * r * (h + r);
        System.out.printf("The area of a cylinder with radius %,.2f "
                + "and height %,.2f is: %,.2f\n", r, h, a);
    }

    /**
     * This function calculates the volume of a cylinder, asking for radius and
     * height
     */
    static void cylinderVolume() {
        double v, h, r;
        r = getValue("radius");
        h = getValue("height");
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
    static double getValue(String value) {
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

    public static void main(String[] args) {
        menu();
    }

}
