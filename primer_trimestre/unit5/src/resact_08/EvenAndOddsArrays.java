package resact_08;

import java.util.Scanner;

/**
 * This program gets an array of integers from the terminal and creates two new
 * arrays: one with even numbers and other with odd numbers
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class EvenAndOddsArrays {

    /**
     * This function gets an integer number to use as list size for the array
     *
     * @param message a String to print on terminal for the user
     * @param error a String to print on termial if the imput is wrong
     * @return a valid size of '1' or more
     */
    static int getListSize(String message, String error) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            size = sc.nextInt();
            if (size <= 0) {
                System.out.print(error);
            }
        } while (size <= 0);
        return (size);
    }

    /**
     * This function is for filling the array with values, asking them to the
     * user
     *
     * @param size the size of the array (quantity of values asked)
     * @return the list, filled with values
     */
    static int[] getListElements(int size) {
        int[] filledList = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < filledList.length; i++) {
            System.out.printf("Enter number for position %d: ", i);
            filledList[i] = sc.nextInt();
        }
        return (filledList);
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
     * This function inserts a new element in a non-sorted integer array
     *
     * @param src the unsorted array
     * @param key the element to insert
     * @return the array with the new element
     */
    static int[] insertNonSorted(int[] src, int key) {
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
     * @param length the lenth of the new array
     * @return a new array
     */
    static int[] copyOf(int[] src, int length) {
        int[] dest = new int[length];
        for (int i = 0; (i < length) && (i < src.length); i++) {
            dest[i] = src[i];
        }
        return (dest);
    }

    public static void main(String[] args) {
        int size;
        int[] even = new int[0];
        int[] odds = new int[0];
        size = getListSize("Enter the total number of elements for the "
                + "list: ", "ERROR: total number of elements in the list "
                + "must be more than zero.");
        int[] src = getListElements(size);

        for (int i = 0; i < src.length; i++) {
            if ((src[i] % 2) == 0) {
                even = insertNonSorted(even, src[i]);
            } else {
                odds = insertNonSorted(odds, src[i]);
            }
        }

        System.out.println("Array with even elements: ");
        printArray(even);
        System.out.println("Array with odd elements: ");
        printArray(odds);
    }

}
