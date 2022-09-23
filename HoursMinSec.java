package hoursminsec;

import java.util.Scanner;

/**
 * This program asks for a number of secons and calculates the same time in 
 * hours and minutes
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class HoursMinSec {
    public static void main(String[] args){
        int sec;
        double hours, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number of seconds: ");
        sec = sc.nextInt();
        min = sec / 60;
        hours = min / 60;
        System.out.printf("Total: %,.2f h. %,.2f min. %d sec.\n",
                hours, min, sec);
    }
}
