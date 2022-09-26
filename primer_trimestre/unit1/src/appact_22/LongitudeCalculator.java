package appact_22;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program gets a distance in meters and prints the same distance 
 * in centimeters without decimal part
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class LongitudeCalculator {
    public static void main(String[] args){
        double num;
        int round;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter a distance in meters "
                + "(with decimals, using period, not comma): ");
        num = sc.nextDouble();
        num *= 100;
        round = (int)num;
        System.out.printf("The mark is: %d\n", round);
    }
}
