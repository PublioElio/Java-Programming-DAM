package appact_11;

import java.util.Scanner;

/**
 * This program checks if a number is a palindrome or not, BUT ONLY USING 
 * conditionals (if-else and switch)
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class PalindromeNum {

    public static void main(String[] args) {
        int num, numDigits, revNum;
        boolean palindrome = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between '0' & '9.999': ");
        num = sc.nextInt();
        if (num < 0 || num >= 10_000) { // here we get number of digits
            numDigits = 0;
        } else if (num < 10 && num >= 0) {
            numDigits = 1;
        } else {
            if (num >= 10 && num < 100) {
                numDigits = 2;
            } else if (num >= 100 && num < 1000) {
                numDigits = 3;
            } else {
                numDigits = 4;
            }
        }

        switch (numDigits) { // here we reverse the number and compare
            case 0 -> {
                System.out.println("That's not a valid number!");
                palindrome = false;
            }
            case 1 ->
                palindrome = true;
            case 2 -> {
                revNum = ((num % 10) * 10) + (num / 10);
                if (num != revNum) {
                    palindrome = false;
                }
            }
            case 3 -> {
                revNum = ((num % 10) * 100) + (((num / 10) % 10) * 10)
                        + (num / 100);
                if (num != revNum) {
                    palindrome = false;
                }
            }
            case 4 -> {
                revNum = ((num % 10) * 1000) + (((num / 10) % 10) * 100)
                        + (((num / 100) % 10) * 10) + (num / 1000);
                if (num != revNum) {
                    palindrome = false;
                }
            }

        }

        System.out.printf("\nIs '%d' a palindrome number? %b\n",
                num, palindrome);

    }

}
