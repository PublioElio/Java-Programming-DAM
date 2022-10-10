package resact_13;

import java.util.Scanner;

/**
 * This program calculates the time after a given quantity of hours, minutes and
 * seconds
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CheckHourRedux {

    public static void main(String[] args) {
        int hours, minutes, seconds;
        String sec2, min2, hour2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds > 59) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes > 59) {
            hours += minutes / 60;
            minutes %= 60;

            hours %= 24;
        }
        sec2 = (seconds < 10) ? "0" + seconds : "" + seconds;
        min2 = (minutes < 10) ? "0" + minutes : "" + minutes;
        hour2 = (hours < 10) ? "0" + hours : "" + hours;
        System.out.println("Your time, one second later: "
                + hour2 + "/" + min2 + "/" + sec2);

    }
}
