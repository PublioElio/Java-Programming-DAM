package addact_09;

import java.util.Scanner;

/**
 * This program calculates the volume of a cone
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class ConeVolumeCalculator {

    public static void main(String[] args) {
        double h, r, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        h = sc.nextDouble();
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        v = (Math.PI * Math.pow(r, 2) * h) / 3;
        System.out.printf("The volume of the cone is %,.2f\n", v);
    }
}
