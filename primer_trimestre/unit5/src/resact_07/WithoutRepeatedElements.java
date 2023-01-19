package resact_07;

import java.util.Scanner;

/**
 * This program asks the user to create an integer array of maximum 15 elements,
 * then creates a copy of the array, but without repeated elements
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class WithoutRepeatedElements {

    /**
     * This function searchs in an array of integers for a key, and returns the
     * position where it is. If the value is not presents, it returns '-1'
     *
     * @param t the source array to search
     * @param key the value to search
     * @return the position of the key or '-1' if it's not present
     */
    static int search(int t[], int key) {
        int pos = -1;
        for (int i = 0; (i < t.length) && (pos == -1); i++) {
            pos = t[i] == key ? i : -1;
        }
        return (pos);
    }

    /**
     * This function inserts a value in an unsorted integer array
     *
     * @param src the array to insert the value
     * @param key the value to search
     * @return the array, with the new element
     */
    public static int[] insertNonSorted(int[] src, int key) {
        src = copyOf(src, src.length + 1);
        src[src.length - 1] = key;
        return (src);
    }

    /**
     * This function makes a copy of an array of integers, with a given length,
     * if the new array is longer than the original, fills the new array with
     * '0'
     *
     * @param src the array to copy
     * @param length the length of the new array
     * @return a new array
     */
    public static int[] copyOf(int[] src, int length) {
        int[] dest = new int[length];
        for (int i = 0; (i < length) && (i < src.length); i++) {
            dest[i] = src[i];
        }
        return (dest);
    }

    /**
     * This function creates a new integer array without repeated elements
     *
     * @param t the array to delete repeated elements
     * @return a new array, without repeated elements
     */
    static int[] nonRepeated(int[] t) {
        int[] newList = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (search(newList, t[i]) == -1) {
                newList = insertNonSorted(newList, t[i]);
            }
        }
        return (newList);
    }

    /**
     * This function prints on console an array of integer numbers
     *
     * @param array
     */
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " - ");
            }
        }
        System.out.println("]");
    }

    /**
     * This function fills an array with integer numbers, between two values,
     * asking the user to enter the numbers by terminal
     *
     * @param array the array to fill
     * @param min minimum value
     * @param max maximum value
     * @return the array, filled
     */
    static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumber("Enter a number for "
                    + "position " + i + ": ", "ERROR. Number must be "
                    + "between '" + min + "' and '" + max + "'. ",
                    min, max);
        }

    }

    /**
     * This function gets an integer number form the user, between a minimun and
     * a maximum value
     *
     * @param message a message to show to the user
     * @param errorMessage an error message if the imput is incorrect
     * @param min
     * @param max
     * @return
     */
    static int getNumber(String message, String errorMessage, int min,
            int max) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < min || num > max) {
                System.out.print(errorMessage);
            }
        } while (num < min || num > max);
        return (num);
    }

    public static void main(String[] args) {
        int[] t = new int[getNumber("Enter the length of the array: ",
                "ERROR. Length must be between '1' and '15'. ",
                1, 15)];
        fillArray(t, 1, Integer.MAX_VALUE);
        System.out.println("Source array: ");
        printArray(t);
        t = nonRepeated(t);
        System.out.println("New array, without repeated elements: ");
        printArray(t);
    }

}
