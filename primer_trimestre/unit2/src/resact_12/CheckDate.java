package resact_12;

import java.util.Scanner;

/**
 * This program checks if the imput date is valid
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CheckDate {

    public static void main(String[] args) {
        int day, month, year;
        boolean date;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        day = sc.nextInt();
        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
        if (year <= 0) {
            System.out.println("'0' isn't a valid year");
            date = false;
        } else {
            if (month == 2 && (day >= 1 && day <= 28)) {
                date = true;
            } else if ((month == 4 || month == 6 || month == 9 || month == 11)
                    && (day >= 1 && day <= 30)) {
                date = true;
            } else if ((month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12)
                    && (day >= 1 && day <= 31)) {
                date = true;
            } else {
                date = false;
            }

        }
        if (date) {
            System.out.printf("%d/%d/%d is a valid date\n",
                    day, month, year);
        } else {
            System.out.println("Invalid date");
        }
    }
}
