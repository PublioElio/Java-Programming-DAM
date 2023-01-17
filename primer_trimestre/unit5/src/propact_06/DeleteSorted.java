package propact_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program asks the user to create an array of integer, with a length
 * between '1' and '15'. Then sorts the array and deletes element form the
 * array, chosen by the user
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DeleteSorted {

    /**
     * This function makes a copy of an array of integers, with a given length,
     * if the new array is longer than the original, fills the new array with
     * '0'
     *
     * @param src the array to copy
     * @param length the length of the new array
     * @return a new array
     */
    static int[] copyOf(int[] src, int length) {
        int[] dst = new int[length];
        for (int i = 0; (i < length) && (i < src.length); i++) {
            dst[i] = src[i];
        }
        return (dst);
    }

    /**
     * This function deletes an integer number from a sorted array of integers
     *
     * @param src the array (must be sorted)
     * @param element the element to delete
     * @return the array without the element
     */
    static int[] deleteSorted(int[] src, int element) {
        int deleteIndex;
        deleteIndex = Arrays.binarySearch(src, element);
        if (deleteIndex >= 0) {
            for (int i = deleteIndex; i < src.length - 1; i++) {
                src[i] = src[i + 1];
            }
            src = copyOf(src, src.length - 1);
        }
        return (src);
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
     * This function prints on terminal an array of integer numbers
     *
     * @param array
     */
    static void printArray(int[] array) {
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
     * This is a function to swap values in an array
     *
     * @param array
     * @param i first position
     * @param j second position
     */
    static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    /**
     * This function sorts an array using the bubble method
     *
     * @param array
     */
    static void bubbleSort(int[] array) {
        boolean swapped;
        int last = 0;

        do {
            swapped = false;
            for (int i = 0; i < (array.length - 1 - last); i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            last++;
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] t = new int[getNumber("Enter the length of the array: ",
                "ERROR. Length must be between '1' and '15'. ",
                1, 15)];
        fillArray(t, 1, Integer.MAX_VALUE);
        bubbleSort(t);
        System.out.print("Original array: ");
        printArray(t);

        t = deleteSorted(t, getNumber("Enter a value to delete "
                + "from the array: ",
                "ERROR. Value must be between '1' and '"
                + Integer.MAX_VALUE + "'. ", 1,
                Integer.MAX_VALUE));
        System.out.print("Array without element: ");
        printArray(t);

    }
}
