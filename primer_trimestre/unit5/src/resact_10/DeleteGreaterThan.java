package resact_10;

import java.util.Scanner;

/**
 * This program asks for an array (size and elements), then asks for a maximum
 * value. All values above that one are deleted from the array.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DeleteGreaterThan {

    /**
     * This function prints an array on terminal
     *
     * @param array
     */
    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " | ");
            }
        }
        System.out.println("]");
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
    static int[] copyOf(int[] src, int length) {
        int[] dst = new int[length];
        for (int i = 0; (i < length) && (i < src.length); i++) {
            dst[i] = src[i];
        }
        return (dst);
    }

    /**
     * This funcion makes a copy of a given array, deletig all occurrences
     * greater than a given value
     *
     * @param t the source array
     * @param value the value
     * @return a new array with no elements greater than the indicated value
     */
    static int[] deleteGreaterThan(int[] t, int value) {
        int[] copy = copyOf(t, t.length);
        int i = 0;
        while (i < copy.length) {
            if (copy[i] > value) {
                copy[i] = copy[copy.length - 1];
                copy = copyOf(copy, copy.length - 1);
            } else {
                i++;
            }
        }
        return (copy);
    }

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
            if (size < 0) {
                System.out.print(error);
            }
        } while (size < 0);
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
            System.out.printf("Enter number for position %d: ", (i + 1));
            filledList[i] = sc.nextInt();
        }
        return (filledList);
    }

    public static void main(String[] args) {
        int value;
        int[] t = new int[getListSize("Enter the size of the array: ",
                "ERROR. The list size minimum is 1. ")];
        t = getListElements(t.length);
        System.out.println("The array and it content is: ");
        printArray(t);
        value = getListSize("Enter a value, all elements above that value will"
                + " be deleted from the array: ",
                "ERROR. Minimum value is '1'. ");
        t = deleteGreaterThan(t, value);
        System.out.printf("The array without all elements above %d: ",
                value);
        printArray(t);
    }
}
