package appact_11;

import java.util.Scanner;
import java.util.Arrays;

/**
 * This program gets an array and searchs in it for a key value, then returns a
 * new array with the positions were that value was found
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SearchAll {

    /**
     * This function gets a integer from terminal
     *
     * @param mustBePositive if the number must be positive
     * @param message the mesage to show to de user
     * @param errorMessage the error message if the number isn't positive
     * @return an integer
     */
    static int getInt(boolean mustBePositive, String message,
            String errorMessage) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if ((num < 0) && mustBePositive) {
                System.out.print(errorMessage);
            } else {
                mustBePositive = false;
            }
        } while (mustBePositive);
        return (num);
    }

    /**
     * In this function we get the lenght of a new array, counting the number of
     * times a key is present
     *
     * @param array the original array to search the numbers of times a key is
     * present
     * @param key an integer number
     * @return the total length of the new array
     */
    static int getNewLength(int[] array, int key) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length = key == array[i] ? length + 1 : length;
        }
        return (length);
    }

    /**
     * This function creates a new array with the positions where a key is found
     * in a given array. If there are no coincidences, returns an empty array
     *
     * @param array the original array
     * @param key the key to search
     * @return a new array with the positions of the key
     */
    static int[] searchAll(int[] array, int key) {
        int[] newArray = new int[getNewLength(array, key)];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                newArray[counter++] = i;
            }
        }
        return (newArray);
    }

    public static void main(String[] args) {
        int[] num = {1, 0, 0, 1, 0, 1, -4, 21, -4};
        int key;

        System.out.println("The array were we're going to search: "
                + Arrays.toString(num));
        key = getInt(false, "Enter a number to get the "
                + "position(s) in the array: ", "");

        int[] res = searchAll(num, key);
        System.out.println("That number is in the position(s): "
                + Arrays.toString(res));
    }
}
