package appact_19;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class AnglesRadians {
    public static void main (String[] args){
        int degrees;
        double radians;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        degrees = sc.nextInt();
        degrees = degrees < 0 ? -degrees : degrees;
        degrees = degrees > 360 ? degrees % 360 : degrees; 
        radians = (degrees * Math.PI) / 180;
        System.out.printf("Radians: %,.4f rad\n", radians);
    }
}
