package addact_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program makes the binary search in a sorted array, entered by the user
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class binarySearch {

    /**
     * This is a function to swap values in an array
     *
     * @param array
     * @param i
     * @param j
     */
    static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    /**
     * This is the bubble sorting method
     *
     * @param array
     */
    static void bubbleSort(int[] array) {
        boolean swapped = false;
        int end = 0;

        do {
            swapped = false;
            for (int i = 0; i < (array.length - 1 - end); i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            end++;
        } while (swapped);
    }

    /**
     * This function makes a binary search in a sorted array
     *
     * @param array the array where we're going to search
     * @param key the key to search
     * @return the first occurrence of that key in the array
     */
    static int binarySearch(int[] array, int key) {
        int position = -1, start = 0, end = (array.length - 1),
                mid = ((start + end) / 2);
        while ((start <= end) && (position < 0)) {
            if (array[mid] < key) {
                start = mid + 1;
            } else if (array[mid] == key) {
                position = mid;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return (position);
    }

    /**
     * This function gets an integer
     *
     * @param args
     */
    static int getInt(boolean mustBePositive, String message) {
        int num;
        do {
            System.out.print(message);
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if ((num < 0) && mustBePositive) {
                System.out.print("ERROR: number must be positive. ");
            } else {
                mustBePositive = false;
            }
        } while (mustBePositive);
        return (num);
    }

    /**
     * This function fills an array woth integers
     * 
     * @param array 
     */
    static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getInt(false, 
                    "Enter a value for position " + i + " : ");
        }
    }

    public static void main(String[] args) {
        int num, pos;
        int[] numbers = new int[getInt(true, 
                "Enter the lenght of the array: ")];
        
        fillArray(numbers);
        
        bubbleSort(numbers);
        
        System.out.println("Sorted array with bubble sort: "
                + Arrays.toString(numbers));
        
        num = getInt(false, 
                "Enter a value to search in the array: ");
        pos = binarySearch(numbers, num);

        if (pos < 0) {
            System.out.printf("The number '%d' isn't in the array: ",
                    num);
            System.out.println(Arrays.toString(numbers));

        } else {
            System.out.printf("The number '%d' is in the position '%d' of "
                    + "the array: ", num, pos);
            System.out.println(Arrays.toString(numbers));
        }
    }

}
