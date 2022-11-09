package addact_36;

import java.util.Scanner;

/**
 * This program checks if a number is a palindrom
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PalindromicNum {

    public static void main(String[] args) {
        long userNum, num, rev = 0, digit;
        boolean palindromic;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userNum = sc.nextLong();
        num = userNum;

        while (num != 0) { // in this loop we reverse the number
            digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }

        palindromic = userNum == rev; // we check if it's palindromic
        
        if (!palindromic) {
            System.out.printf("%d isn't a palindromic number.\n",
                    userNum);
        } else {
            System.out.printf("%d is a palindromic number.\n",
                    userNum);
        }

    }
}
