package resact_04;

import java.util.Scanner;

/**
 * This program compares two numbers entered by the user, showing the greater
 * value
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class GetMaximun {

    /**
     * This function asks for an integer number
     *
     * @param ordinal this string is the ordinal number entered
     * @return an integer number
     */
    static int getNum(String ordinal) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter %s integer number: ", ordinal);
        return (sc.nextInt());
    }

    /**
     * This function compares two numbers, and returns the maximum value
     *
     * @param n1 first number
     * @param n2 second number
     * @return the greater value
     */
    static int getMax(int n1, int n2) {
        int max;
        max = n1 > n2 ? n1 : n2;
        return (max);
    }

    public static void main(String[] args) {
        int n1, n2, max;
        n1 = getNum("first");
        n2 = getNum("second");
        if (n1 != n2) {
            max = getMax(n1, n2);
            System.out.printf("The maximum between %d and %d is %d\n",
                    n1, n2, max);
        } else {
            System.out.println("First and second are the same number!");
        }
    }

}
