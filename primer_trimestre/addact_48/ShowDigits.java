package addact_48;

import java.util.Scanner;

/**
 * This program asks for a number and tells the digits that appear and those
 * that do not appear into the integer entered on console.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ShowDigits {

    public static void main(String[] args) {
        long num, checkNum, digit;
        boolean isPresent;
        String present = "", absent = "";
        num = get_num();
        if (num == 0) {
            present = "0";
            absent = "1 2 3 4 5 6 7 8 9";
        } else {
            for (int i = 0; i <= 9; i++) {
                checkNum = num;
                isPresent = false;
                while (checkNum != 0 && !isPresent) {
                    digit = checkNum % 10;
                    if (i == digit) {
                        present += i + " ";
                        isPresent = true;
                    }
                    checkNum /= 10;
                }
                if (!isPresent) {
                    absent += i + " ";
                }
            }
        }
        System.out.printf("List of present numbers: %s\n", present);
        System.out.printf("List of absent numbers: %s\n", absent);
    }

    /**
     * This function gets a integer number
     *
     * @return an integer number
     */
    static long get_num() {
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        num = sc.nextLong();
        return (num);
    }
}
