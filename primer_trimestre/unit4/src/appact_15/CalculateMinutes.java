package appact_15;

import java.util.Scanner;

/**
 * This program gets two hours in 24h format, and calculates the amount of
 * minutes between those hours entered
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CalculateMinutes {

    /**
     * This function calculates the total amount of minutes between two hours
     *
     * @param hour1 the first hour
     * @param min1 the minutes for the first hour
     * @param hour2 the second hour
     * @param min2 the minutes for the second hour
     * @return the total number of minutes between the two given hours
     */
    static int minDifference(int hour1, int min1, int hour2, int min2) {
        int totalMin = hour1 < hour2 ? ((((hour2 - hour1) * 60) - min1) + min2) : (((((24 - hour1) + hour2) * 60) - min1) + min2);
        return (totalMin);
    }

    /**
     * This function gets a positive integer number for a given time
     *
     * @param time hours or minutes
     * @param ordinal the order of the hour/minute
     * @return a positive integer number
     */
    static int getTime(String time, String ordinal) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Enter %s %s: ", ordinal, time);
            n = sc.nextInt();
            if (n < 0) {
                System.out.print("ERROR: %s must be positive. ");
            }
        } while (n < 0);
        return (n);
    }

    public static void main(String[] args) {
        int hour1, min1, hour2, min2;
        hour1 = getTime("hour", "first");
        min1 = getTime("hour minutes", "first");
        hour2 = getTime("hour", "second");
        min2 = getTime("hour minutes", "second");
        System.out.printf("""
                          The amounr of minutes between the two entered hours is: %d
                          """,
                minDifference(hour1, min1, hour2, min2));
    }

}
