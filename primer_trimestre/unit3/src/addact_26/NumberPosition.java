package addact_26;

import java.util.Scanner;

/**
 * Tis program asks for a number and then for a digit. The program gives us the
 * position (or positions) counting from left to right that occupies that digit
 * in the entered number.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class NumberPosition {

    public static void main(String[] args) {
        int num, digit, length;
        num = get_num();
        length = num_length(num);
        digit = get_digit();
        System.out.printf("%d in %d is in the next position(s): \n",
                digit, num);
        /* In this loop we get the positions of the 
        digit inside the given number */
        while (num != 0) {
            if ((num % 10) == digit) {
                System.out.printf("%d ", length);
            }
            length--;
            num /= 10;
        }
    }

    /**
     * This function gets a integer positive number
     *
     * @return
     */
    static int get_num() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a posisitive integer number: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Invalid imput, must be a positive"
                        + " integer number.");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function gets a digit
     *
     * @return an integer between 0 and 9
     */
    static int get_digit() {
        int digit;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the digit to search in the integer: ");
            digit = sc.nextInt();
            if (digit < 0 || digit > 9) {
                System.out.println("Invalid imput.");
            }
        } while (digit < 0 || digit > 9);
        return (digit);
    }

    /**
     * This function gets the total length of the given number
     *
     * @param num the number to get the total size
     * @return the length of the number given as a parameter
     */
    static int num_length(int num) {
        int length = 0;
        while (num != 0) {
            length++;
            num /= 10;
        }
        return (length);
    }

}
