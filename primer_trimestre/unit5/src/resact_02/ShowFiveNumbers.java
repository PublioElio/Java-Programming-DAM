package resact_02;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program ask the user to fill a array of five decimal numbers and then,
 * prints the array on console
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ShowFiveNumbers {

    /**
     * This function ask the user to fill a list of decimal numbers
     *
     * @param listlength the list to fill
     */
    static void getNumbers(double[] array) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter the decimal number for "
                    + "position %d: ", i);
            array[i] = sc.nextDouble();
        }
    }

    /**
     * This function prinst a list of numbers
     *
     * @param numList the list of numbers that will be printed on console
     */
    static void printList(double[] numList) {
        for (double num : numList) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        double numList[] = new double[5];
        getNumbers(numList);
        printList(numList);
    }

}
