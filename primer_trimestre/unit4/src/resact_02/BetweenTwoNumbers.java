package resact_02;

import java.util.Scanner;

/**
 * This program asks for two numbers and prints all the numbers between them
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class BetweenTwoNumbers {

    public static void main(String[] args) {
        int n1, n2;
        n1 = get_num("first");
        n2 = get_num("second");
        print_numbers(n1, n2);
    }

    /**
     * This function arranges from lower to greater two given numbers, then
     * prints on console the list of integers between them
     *
     * @param n1 the first number
     * @param n2 the second number
     */
    static void print_numbers(int n1, int n2) {
        int greater, lower;
        String list = "";
        greater = n1 > n2 ? n1 : n2;
        lower = n1 < n2 ? n1 : n2;
        for (int i = lower; i <= greater; i++) {
            if (i == greater) {
                list = list + i + ".";
            } else {
                list = list + i + ", ";
            }
        }
        System.out.printf("The numbers between %d and %d are: %s\n",
                lower, greater, list);
    }

    /**
     * This function requests a number in a given order and returns that number
     *
     * @param order a string with the ordinal position of the number
     * @return the entered number
     */
    static int get_num(String order) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter %s number: ", order);
        n = sc.nextInt();
        return (n);
    }
}
