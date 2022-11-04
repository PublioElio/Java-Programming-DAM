package addact_34;

import java.util.Scanner;

/**
 * This program that asks for two numbers and then shuffles them into a new
 * number with the even digits and the odd digits. They are checking the digits
 * as follows: first digit of first number, first digit of the second number,
 * second digit of the first number, second digit of the second number, third
 * digit of the first number...
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class ShuffleNumbers {

    public static void main(String[] args) {
        long num1, num2, digit1, digit2, evenNum = 0, oddNum = 0;
        boolean validLength;

        System.out.print("First number. ");
        num1 = get_number();

        /* In this loop we check that the second number is positive and has the 
        same length than the first number */
        do {
            System.out.print("Second number. ");
            num2 = get_number();
            validLength = (int) (Math.log10(num2) + 1)
                    == (int) (Math.log10(num1) + 1); // checks number length
            if (!validLength) {
                System.out.println("Error: the second number must have same "
                        + "number of digits than the first number.");
            }
        } while (!validLength);

        /* Here we flip the numbers to start operating from the left */
        num1 = reverse_num(num1);
        num2 = reverse_num(num2);

        /* Now, we assing the odd and enven numbers to a different variables */
        do {
            digit1 = num1 % 10;
            evenNum = digit1 % 2 == 0 ? (evenNum * 10) + digit1 : evenNum;
            oddNum = digit1 % 2 != 0 ? (oddNum * 10) + digit1 : oddNum;
            digit2 = num2 % 10;
            evenNum = digit2 % 2 == 0 ? (evenNum * 10) + digit2 : evenNum;
            oddNum = digit2 % 2 != 0 ? (oddNum * 10) + digit2 : oddNum;
            num1 /= 10;
            num2 /= 10;
        } while (num1 != 0);

        System.out.println("The list of even numbers is: " + evenNum);
        System.out.println("The list of odd numbers is: " + oddNum);

    }

    /**
     * This function gets a number in console and checks that the number is
     * positive
     *
     * @return a positive integer number
     */
    static long get_number() {
        long num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextLong();
            if (num < 0) {
                System.out.println("Error: number must be positive.");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function flips a number
     *
     * @param num, a long number to flip
     * @return the reversed number
     */
    static long reverse_num(long num) {
        long digit, rev = 0;
        while (num
                != 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        return (rev);
    }
}
