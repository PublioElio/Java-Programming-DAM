package appact_13;

import java.util.Scanner;

/**
 * This program asks for a time, then a number of seconds and modifies the time
 * depending on the number of seconds
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SetTime {

    public static void main(String[] args) {
        int h, min, sec, userSec;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        h = Math.abs(sc.nextInt());
        System.out.print("Enter minutes: ");
        min = Math.abs(sc.nextInt());
        System.out.print("Enter seconds: ");
        sec = Math.abs(sc.nextInt());

        if (sec > 59) {
            min += sec / 60;
            sec %= 60;
        }
        if (min > 59) {
            h += min / 60;
            min %= 60;
        }
        if (h > 23) {
            h %= 24;
        }

        printHour(h, min, sec);

        System.out.print("Enter seconds to recalculate time: ");
        userSec = sc.nextInt();

        min += (userSec / 60);
        sec += userSec % 60;
        if (sec > 59) {
            min += (sec / 60);
            sec %= 60;
        }
        if (min > 59) {
            h += (min / 60);
            min %= 60;
        }
        if (h > 23) {
            h %= 24;
        }
        printHour(h, min, sec);
    }

    public static void printHour(int h, int min, int sec) {
        String sec2, min2, hour2;
        sec2 = (sec < 10) ? "0" + sec : "" + sec;
        min2 = (min < 10) ? "0" + min : "" + min;
        hour2 = (h < 10) ? "0" + h : "" + h;
        System.out.println("Your time is: "
                + hour2 + "/" + min2 + "/" + sec2);
    }

}
