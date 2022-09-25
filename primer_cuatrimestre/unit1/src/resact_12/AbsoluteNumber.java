package resact_12;

import java.util.Scanner;

/**
 * This program asks for a number and shows the absolute value on console
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class AbsoluteNumber {
    public static void main(String[] args){
        int num, absoluteValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive or negative number: ");
        num = sc.nextInt();
        absoluteValue = num < 0 ? -1* num : num;
//      alternative solution: absoluteValue = Math.abs(num);
        System.out.println("The absolute value of " + num + " is: " 
                + absoluteValue);
    }    
}
