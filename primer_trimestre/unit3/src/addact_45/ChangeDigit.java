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

        num = get_num(); // first, we get a valid number

        /* if the number has only one position, we just change the number */
        if (num < 10) {
            num = get_digit();
        } else {
            lenght = num_lenght(num); // we get the lenght of the number
            pos = get_position(lenght); // here, we get a valid position
            newDigit = get_digit(); // we get the new digit
            num = change_num(num, pos, newDigit, lenght); // we put the new digit in the number
        }

        System.out.printf("The new number, with the changed digit is: %s\n",
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

    /**
     * This function changes a digit of a number in a given position
     *
     * @param num the number to change digit
     * @param pos the position in the number
     * @param newDigit the new digit
     * @param lenght the lenght of the number
     * @return the number with the new digit in the given position
     */
    static long change_num(long num, long pos, int newDigit, int lenght) {
        long newNum = 0, tempDigit, exp = 0;
        for (int i = lenght; i > 0; i--) {
            tempDigit = num % 10;
            if (i == pos) {
                newNum = newNum + newDigit * (int) Math.pow(10, exp);
            } else {
                newNum = newNum + tempDigit * (int) Math.pow(10, exp);
            }
            exp++;
            num /= 10;
        }
        return (newNum);
    }

    /**
     * This function gets a valid position for a number of a given lenght
     *
     * @param lenght the size of the number in digits
     * @return the position that we want to change in the number
     */
    private static long get_position(int lenght) {
        long pos;
        boolean validPos;
        do {
            System.out.printf("Choose the position to change "
                    + "(between 1 and %d). ", lenght);
            pos = get_num();
            validPos = (pos <= lenght) && (pos > 0);
            if (!validPos) {
                System.out.println("That's not a valid position. ");
            }
        } while (!validPos);
        return (pos);
    }
}
