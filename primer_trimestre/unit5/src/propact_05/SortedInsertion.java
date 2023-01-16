package propact_05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program inserts a new element in a sorted array of integer numbers
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SortedInsertion {

    /**
     * This method mimics the behavior of the arrayCopy method, copying a
     * fragment of one array of integers into another, thus eliminating the
     * previous content in the destination array
     *
     * @param source the source array
     * @param sourcePos the position to copy from
     * @param dest the destination array
     * @param destPos the destinatio position to start copying
     * @param size the number of elements to copy
     */
    static void arrayCopy(int[] source, int sourcePos,
            int[] dest, int destPos, int size) {
        for (int i = 0; i < size; i++) {
            dest[destPos + i] = source[sourcePos + i];
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
    static int getNumber(String message, String errorMessage, int min, int max) {
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
     * This function creates an array of integer numbers, between two values,
     * asking the user to fill the array using the terminal
     *
     * @param array
     * @param min
     * @param max
     * @param random
     * @return
     */
    static void createArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumber("Enter a number for "
                    + "position " + i + ": ", "ERROR. Number must be "
                    + "between '" + min + "' and '" + max + "'. ",
                    min, max);
        }

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

    /**
     * This method inserts a value in a sorted integer array
     *
     * @param array the sorted array where to insert a new element
     * @param newValue the new element to insert
     * @return the array with the new element
     */
    public static int[] insertSorted(int[] array, int newValue) {
        int insertionIndex = Arrays.binarySearch(array, newValue);
        if (insertionIndex < 0) {
            insertionIndex = -insertionIndex - 1;
        }
        int copy[] = new int[array.length + 1];
        arrayCopy(array, 0, copy, 0,
                insertionIndex);
        arrayCopy(array, insertionIndex, copy,
                (insertionIndex + 1), (array.length - insertionIndex));
        copy[insertionIndex] = newValue;
        return (copy);
    }

    /**
     * This function prints an array of integer numbers
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

    public static void main(String[] args) {
        int[] t = new int[getNumber("Enter the length of the array: ",
                "ERROR. Length must be between '1' and '50'. ",
                1, 10)];
        createArray(t, 1, Integer.MAX_VALUE);
        bubbleSort(t);
        int newValue = getNumber("Enter a new value to insert in the array: ",
                "ERROR. Value must be between '1' and '" + Integer.MAX_VALUE
                + "' . ", 1, Integer.MAX_VALUE);

        t = insertSorted(t, newValue);
        System.out.print("The new array, with the new element included "
                + "and sorted: ");
        printArray(t);
    }
}
