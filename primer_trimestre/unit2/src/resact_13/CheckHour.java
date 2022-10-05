package resact_13;

import java.util.Scanner;

/**
 * This program asks for an imput of time, and calculates the same time, one
 * second later
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CheckHour {

    public static void main(String[] args) {
        int sec, min, hour;
        String sec2, min2, hour2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in this format: hour/min/sec "
                + "(example: 23/45/12)");
        System.out.print("Enter hour: ");
        hour = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
        System.out.print("Enter seconds: ");
        sec = sc.nextInt();
        sec++;
        if ((hour > 23 || sec > 60 || min > 60) 
                || (hour < 0 || sec < 0 || min < 0)) {
            System.out.print("Error: invalid imput\n");
        } else {
            if (sec == 60) {
                sec = 0;
                min++;
                if (min == 60) {
                    min = 0;
                    hour++;
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }
            sec2 = (sec < 10) ? "0" + sec : "" + sec;
            min2 = (min < 10) ? "0" + min : "" + min;
            hour2 = (hour < 10) ? "0" + hour : "" + hour;
            System.out.println("Your time, one second later: "
                    + hour2 + "/" + min2 + "/" + sec2);
        }
    }

}
