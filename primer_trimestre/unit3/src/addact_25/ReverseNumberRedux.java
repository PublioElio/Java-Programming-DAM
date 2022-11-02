package addact_25;

import java.util.Scanner;

/**
 * This program flips an integer positive number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ReverseNumberRedux {

    public static void main(String[] args) {
        int num;
        num = get_num();
        num = reverse(num);
        System.out.printf("The reversed number is: %d\n", num);
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
     * This function flips a given number
     *
     * @param num an positive integer number
     * @return the reversed integer number
     */
    static int reverse(int num) {
        int digit, reversed = 0;
        while (num != 0) {
            digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        return (reversed);
    }

}
