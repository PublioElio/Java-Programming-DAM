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
     * @param listLenght the lenght of the list to fill
     * @return the array
     */
    static double[] getNumbers(int listLenght) {
        double numList[] = new double[listLenght];
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        for (int i = 0; i < numList.length; i++) {
            System.out.printf("Enter the decimal number for "
                    + "position %d: ", i);
            numList[i] = sc.nextDouble();
        }
        return (numList);
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
        numList = getNumbers(numList.length);
        printList(numList);
    }

}
