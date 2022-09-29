package resact_11;

import java.util.Scanner;

/**
 * Enter a day and this program will show the name on console
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DaysOfTheWeek {

    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number: ");
        day = sc.nextInt();
        switch (day) {
            case 1 -> {
                System.out.printf("Day '%d' is Sunday\n", day);
            }
            case 2 -> {
                System.out.printf("Day '%d' is Monday\n", day);
            }
            case 3 -> {
                System.out.printf("Day '%d' is Tuesday\n", day);
            }
            case 4 -> {
                System.out.printf("Day '%d' is Wednesday\n", day);
            }
            case 5 -> {
                System.out.printf("Day '%d' is Thursday\n", day);
            }
            case 6 -> {
                System.out.printf("Day '%d' is Friday\n", day);
            }
            case 7 -> {
                System.out.printf("Day '%d' is Saturday\n", day);
            }
            default -> {
                System.out.println("That's not a valid day");
            }
        }
    }
}
