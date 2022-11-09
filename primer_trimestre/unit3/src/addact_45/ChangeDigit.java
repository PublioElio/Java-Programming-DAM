package addact_45;

import java.util.Scanner;

/**
 * This program changes a digit within a number, whith a position and the new
 * value given by the user. Positions are counted from left to right starting
 * from 1.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ChangeDigit {

    public static void main(String[] args) {
        long num, pos;
        int newDigit, lenght;
        boolean changeDigit = false, validPos;
        num = get_num();
        /* if the number has only one position, we just change the number */
        if (num < 10) {
            num = get_digit();
        } else {
            lenght = num_lenght(num);
            do {
                System.out.printf("Choose the position to change "
                        + "(between 1 and %d). ", lenght);
                pos = get_num();
                validPos = (pos <= lenght) && (pos > 0);
                if (!validPos) {
                    System.out.println("That's not a valid position. ");
                }
            } while (!validPos);
            newDigit = get_digit();
            num = reverse_num(num, pos, newDigit, changeDigit);
            changeDigit = true;
            num = reverse_num(num, pos, newDigit, changeDigit);
        }

        System.out.printf("The new number, with the changed digit is: %d\n",
                num);
    }

    /**
     * With this function we get the lenght of the number (in digits)
     *
     * @param num the number whose size we whant to know
     * @return the lenght of the number
     */
    static int num_lenght(long num) {
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num != 0);
        return (count);
    }

    /**
     *
     * This function flips a number and changes a digit in a given position
     *
     * @param num the number to flip
     * @param pos the position of the number to flip
     * @param newDigit the digit to change in the given position
     * @param changeDigit if its true, the function has to change the digit in
     * the given position
     * @return the reversed number
     */
    static long reverse_num(long num, long pos, int newDigit, boolean changeDigit) {
        long rev = 0, digit;
        int counter = 0;
        while (num != 0) {
            if (changeDigit) {
                counter++;
                digit = (counter == pos) ? newDigit : (num % 10);
            } else {
                digit = num % 10;
            }

            rev = (rev * 10) + digit;
            num /= 10;
        }
        return (rev);
    }

    /**
     * This function gets a number between 0 and 9
     *
     * @return a integer between 0 and 9
     */
    static int get_digit() {
        int digit;
        boolean isValid;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the new value (positive integer number between"
                    + " 0 and 9): ");
            digit = sc.nextInt();
            isValid = (digit >= 0) && (digit < 10);
            if (!isValid) {
                System.out.println("Invalid imput.");
            }
        } while (!isValid);
        return (digit);
    }

    /**
     * This function gets a positive number
     *
     * @return a positive number (long)
     */
    static long get_num() {
        long num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextLong();
            if (num < 0) {
                System.out.println("The number must be positive.");
            }
        } while (num < 0);
        return (num);
    }
}
