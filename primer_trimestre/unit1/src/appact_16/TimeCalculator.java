package appact_16;

import java.util.Scanner;

/**
 * This program asks for a number of secons and calculates the same time in
 * hours and minutes
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class TimeCalculator {

    public static void main(String[] args) {
        int sec;
        double hours, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number of seconds: ");
        sec = sc.nextInt();
        hours = sec / 3600;
        min = (sec % 3600) / 60;
        sec %= 60;
        System.out.printf("Total: %d h. %d min. %d sec.\n",
                (int)hours, (int)min, sec);
    }
}
