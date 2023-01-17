package propact_07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program calculates the 'lucky number' from an array of integers, with a
 * size from '1' to '10' positions and a maximum value of '50'. To calculate the
 * 'lucky number', two elements are randomly extracted from the array, then the
 * program calculates the arithmetic mean of these two elements and this new
 * value is entered into the array, until only one number remains, which will be
 * the 'lucky number'
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class LuckyNumber {

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
        int[] dst = new int[length];
        for (int i = 0; (i < length) && (i < src.length); i++) {
            dst[i] = src[i];
        }
        return (dst);
    }

    /**
     * This function deletes an element from a sorted array of integer numbers
     *
     * @param src the original array
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
     * This function copies in another array a number of elements
     *
     * @param src the source array to copy
     * @param srcPos the position to start copying
     * @param dst the destination array
     * @param dstPos the position to start copying
     * @param length the number of elements to copy
     */
    static void arrayCopy(int[] src, int srcPos,
            int[] dst, int dstPos, int length) {
        for (int i = 0; i < length; i++) {
            dst[dstPos + i] = src[srcPos + i];
        }
    }

    /**
     * This method inserts a value in a sorted integer array
     *
     * @param src the sorted array where to insert a new element
     * @param newValue the new element to insert
     * @return the array with the new element
     */
    static int[] insertSorted(int[] src, int newValue) {
        int insertIndex = Arrays.binarySearch(src, newValue);
        if (insertIndex < 0) {
            insertIndex = -insertIndex - 1;
        }
        int copy[] = new int[src.length + 1];
        arrayCopy(src, 0, copy, 0,
                insertIndex);
        arrayCopy(src, insertIndex, copy,
                (insertIndex + 1), (src.length - insertIndex));
        copy[insertIndex] = newValue;
        return (copy);
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

    /**
     * This function calculates the 'lucky number' from a sorted array of
     * integer numbers: two elements are randomly extracted from the array, then
     * the program calculates the arithmetic mean of these two elements and this
     * new value is entered into the array, until only one number remains, which
     * will be the 'lucky number'
     *
     * @param t the array of integers to calculate the lucky number
     * @return the remaining value in the array, the 'lucky number'
     */
    static int calculateLuckyNumber(int[] t) {
        int firstNum, secondNum;
        while (t.length > 1) {
            firstNum = t[(int) (Math.random() * t.length)];
            t = deleteSorted(t, firstNum);
            secondNum = t[(int) (Math.random() * t.length)];
            t = deleteSorted(t, secondNum);
            t = insertSorted(t, ((firstNum + secondNum) / 2));
        }
        return (t[0]);
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
                "ERROR. Length must be between '1' and '10'. ",
                1, 10)];
        fillArray(t, 1, 50);
        bubbleSort(t);
        System.out.print("Original sorted array: ");
        printArray(t);
        System.out.println("Your lucky number is: " + calculateLuckyNumber(t));

    }

}
