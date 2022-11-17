package appact_14;

import java.util.Scanner;

/**
 * This program asks for a number of days, hours and minutes and calculates a
 * total amount seconds
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CalculateSeconds {

    /**
     * This function gets a positive integer number
     *
     * @param time this is the time unit that will be requested
     * @return a positive integer number
     */
    static int getNum(String time) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Enter a number of %s: ", time);
            n = sc.nextInt();
            if (n < 0) {
                System.out.printf("ERROR: %s can't be negative. ", time);
            }
        } while (n < 0);
        return (n);
    }

    /**
     * This function calculates the total amount of seconds in a given number of
     * days, hours and seconds
     *
     * @param days number of days
     * @param hours number of hours
     * @param minutes number of minutes
     * @return total amount of seconds
     */
    static int calculateSec(int days, int hours, int minutes) {
        return ((days * 86_400) + (hours * 3600) + (minutes * 60));
    }

    public static void main(String[] args) {
        int days, hours, min;
        days = getNum("days");
        hours = getNum("hours");
        min = getNum("minutes");
        System.out.printf("The total amount of seconds is %d\n",
                calculateSec(days, hours, min));
    }

}
