package addact_18;

import java.util.Scanner;

/**
 * This program obtains the integers between two numbers entered by keyboard
 * (validated as different), starts with the smallest of the entered integers
 * and increase from seven to seven.
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class TwoNumberSeries {

    public static void main(String[] args) {
        int num1, num2, greater, lower;

        /*number imput & validation*/
        num1 = get_number();
        do {
            num2 = get_number();
            if (num1 == num2) {
                System.out.println("Error: the numbers must be different");
            }
        } while (num1 == num2);

        /*arrange numbers*/
        greater = num1 > num2 ? num1 : num2;
        lower = num1 < num2 ? num1 : num2;

        print_series(lower, greater);
    }

    /**
     * Gets a number from console
     *
     * @return an integer number
     */
    static int get_number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return (sc.nextInt());
    }

    /**
     * Prints a range of numbers from seven to seven
     *
     * @param lower the first number
     * @param greater the last number
     */
    static void print_series(int lower, int greater) {
        for (int i = lower; i <= greater; i += 7) {
            System.out.printf("%d, ", i);
        }
        System.out.println(greater);
    }

}
