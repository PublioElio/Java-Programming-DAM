package resact_12;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CheckDate {

    public static void main(String[] args) {
        int day, month, year;
        boolean date;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day");
        day = sc.nextInt();
        System.out.print("Enter month");
        month = sc.nextInt();
        System.out.print("Enter year");
        year = sc.nextInt();
        if (year == 0) {
            System.out.print("'0' isn't a valid year\n");
        } else {
            if (month == 2 && (day >= 1 && day <= 28)) {
                date = true;
            } else if (month == 4 || month == 6){
                
            }
        }
    }
}
