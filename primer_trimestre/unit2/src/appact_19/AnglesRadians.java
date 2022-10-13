package appact_19;

import java.util.Scanner;

/**
 * This program converts the value of the angle in degrees, to its equivalent 
 * radians
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class AnglesRadians {
    public static void main (String[] args){
        int degrees;
        double radians;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        degrees = sc.nextInt();
        if ((degrees > 360) || (degrees < -360)){
            degrees %= 360;
        }
        degrees = degrees < 0 ? 360 + degrees : degrees;
        radians = degrees * (Math.PI / 180);
        System.out.printf("Radians: %,.4f rad\n", radians);
    }
}
