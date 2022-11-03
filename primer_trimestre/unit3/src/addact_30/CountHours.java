package addact_30;

import java.util.Scanner;

/**
 * This program calculates the hours between two days of the week. Minutes and
 * seconds will not be taken into account. The day of the week can be entered as
 * a number (from 1 to 7) or as a String (from "Monday" to "Sunday"). Check that
 * the user enters the data correctly and that the second day is later than the
 * first.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CountHours {

    public static void main(String[] args) {
        int dayNum1, dayNum2, hour1, hour2, totalHours;

        /* asking for the days */
        boolean isValid;
        do {
            System.out.print("Enter first day. ");
            dayNum1 = get_day_name();
            System.out.print("Enter second day. ");
            dayNum2 = get_day_name();
            isValid = dayNum1 < dayNum2;
            if (!isValid) {
                System.out.println("The second day must be later "
                        + "than the first");
            }
        } while (!isValid);

        /* asking for the hours */
        System.out.print("Enter first day hour. ");
        hour1 = get_hour();
        System.out.print("Enter last day hour. ");
        hour2 = get_hour();

        /* calculating hours */
        totalHours = ((dayNum2 * 24) + hour2) - ((dayNum1 * 24) + hour1);
        System.out.printf("There are %d hours between that days",
                totalHours);
    }

    /**
     * This function gets a valid hour
     *
     * @return a positive integer number between 0 and 23
     */
    static int get_hour() {
        int hour;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Use 0-23 format: ");
            hour = sc.nextInt();
            if (hour < 0) {
                System.out.println("Invalid hour, must be a positive "
                        + "integer number");
            }
        } while (hour < 0 || hour > 23);
        return (hour);
    }

    /**
     * This function gets the number of the day from a string entered by the
     * user
     *
     * @return a positive integer number between 1 and 7
     */
    static int get_day_name() {
        int dayNum;
        String dayName;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Imput numbers from 1 to 7 "
                    + "or the name of the day: ");
            dayName = sc.nextLine();
            dayName = dayName.toLowerCase();

            dayNum = switch (dayName) {
                case "monday", "1" ->
                    1;
                case "tuesday", "2" ->
                    2;
                case "wednesday", "3" ->
                    3;
                case "thursday", "4" ->
                    4;
                case "friday", "5" ->
                    5;
                case "saturday", "6" ->
                    6;
                case "sunday", "7" ->
                    7;
                default ->
                    8;
            };
            if (dayNum == 8) {
                System.out.println("Invalid imput.");
            }
        } while (dayNum == 8);
        return (dayNum);
    }

}
