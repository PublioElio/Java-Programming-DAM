package appact_13;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SetTime {

    public static void main(String[] args) {
        int h, min, sec, userSec;
        int extraHours, extraMin, extraSec;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour: ");
        h = Math.abs(sc.nextInt());
        System.out.print("Enter minutes: ");
        min = Math.abs(sc.nextInt());        
        System.out.print("Enter seconds: ");
        sec = Math.abs(sc.nextInt());
        
        System.out.printf("%d/%d/%d\n", h, min, sec);
        
        System.out.print("Enter seconds: ");
        userSec = sc.nextInt();
        
        min += (userSec / 60);
        sec += userSec % 60;
        
        if()
        
    }

}
