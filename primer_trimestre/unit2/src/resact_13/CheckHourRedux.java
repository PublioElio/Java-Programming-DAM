package resact_13;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CheckHourRedux {
    public static void main(String[] args){
        int hours, minutes, seconds;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter hours: ");
//        hours = sc.nextInt();
//        System.out.println("Enter minutes: ");
//        minutes = sc.nextInt();
        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        
        minutes = seconds / 60;
        seconds %= 60;
        
        hours = minutes / 60;
        minutes %= 60; 
        
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        
    }
}
