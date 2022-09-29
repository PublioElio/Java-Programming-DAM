package resact_14;

import java.util.Scanner;

/**
 * This program asks for a date and calculates the same date, a day after
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class DateNextDay {

    public static void main(String[] args) {
        int day, month, year, monthType;
        String day2, month2, year2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        day = sc.nextInt();
        System.out.println("Enter month: ");
        month = sc.nextInt();
        System.out.println("Enter year: ");
        year = sc.nextInt();
        day++;
        monthType = switch (month) {
            case 2 ->
                28;
            case 4, 6, 9, 11 ->
                31;
            default ->
                30;
        };
        if (day > monthType) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        if (year == 0) {
            year = 1;
        }
        day2 = (day < 10) ? "0" + day : "" + day;
        month2 = (month < 10) ? "0" + month : "" + month;
        year2 = (year < 10) ? "0" + year : "" + year;
        System.out.printf("Date, one day after: %s/%s/%s\n",
                day2, month2, year2);
    }
}
