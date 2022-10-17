package addact_01;

import java.util.Scanner;

/**
 * This program flips an integer
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ReverseNumber {
    public static void main(String[] args){
        int num, rev = 0;
        String revString = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer number: ");
        num = sc.nextInt();
        num = Math.abs(num);
        while(num != 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            revString = revString + ("" + digit); // alternative way
            num /= 10;
        }
        System.out.printf("The reversed number is: %d\n", rev);
        System.out.printf("The reversed number is: %s (this is a String "
                + "type variable)\n", revString);
    }
}
