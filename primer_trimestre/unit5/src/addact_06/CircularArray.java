package addact_06;

import java.util.Scanner;
import java.util.Arrays;

/**
 * This program rotates an array
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CircularArray {

    /**
     * This function gets an integer number from the user
     *
     * @param minValue the minimum value to ve requested
     * @param message a messaje to show to the user
     * @param errorMessage an error message if a minimum value isn't entered
     * @return an integer
     */
    static int getInteger(int minValue, String message, String errorMessage) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < minValue) {
                System.out.println(errorMessage);
            }
        } while (num < minValue);
        return (num);
    }

    /**
     * This function gets an integer number from the user
     *
     * @param message a messaje to show to the user
     * @return an integer
     */
    static int getInteger(String message) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        num = sc.nextInt();
        return (num);
    }

    /**
     * This function fills an array with elements
     *
     * @param array
     */
    static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getInteger("Enter a element for position " + i + ": ");
        }
    }

    /**
     * This function rotates an array
     *
     * @param array
     */
    static void circularArray(int[] array) {
        int first = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = first;
    }

    public static void main(String[] args) {
        int length;
        length = getInteger(1, "Enter the array length: ",
                "ERROR: min value of '1'");
        int[] array = new int[length];
        fillArray(array);
        circularArray(array);
        System.out.println(Arrays.toString(array));
    }

}
