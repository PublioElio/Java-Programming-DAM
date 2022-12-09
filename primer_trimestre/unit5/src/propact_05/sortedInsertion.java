package propact_05;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class sortedInsertion {

    /**
     * This function gets a integer number by terminal
     *
     * @param mustBePositive if the number must be positive
     * @param message the message to print on terminal
     * @param errorMessage an error messaje
     * @return an integer
     */
    static int getInteger(boolean mustBePositive, String message,
            String errorMessage) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < 0 && mustBePositive) {
                System.out.print(errorMessage);
            } else {
                mustBePositive = false;
            }
        } while (mustBePositive);

        return (num);
    }

    /**
     * This function asks the user to fill an array with integers
     *
     * @param array the array to fill of elements
     */
    static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getInteger(false,
                    "Enter an integer for position " + i + " : ", "");
        }
    }

    /**
     * This function sorts an array using the bubble method
     *
     * @param array the array to sort
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
     * This function swaps two values in an array
     *
     * @param array the array to swap values
     * @param i the first index
     * @param j the second index
     */
    static void swap(int[] array, int i, int j) {
        int aux;
        aux = array[i];
        array[i] = array[i + 1];
        array[i + 1] = aux;
    }

    static int[] sortedInsertion(int[] array, int newValue) {
        int[] newArray = new int[array.length + 1];
        int pos = 0;
        boolean found = false;
        while ((array[pos] < newValue) && (pos < array.length)) {
            pos++;
        }

        return (newArray);
    }

    public static void main(String[] args) {
        /* we get the length for a new arrat, fill it with numbers 
        and sort it */
        int num = getInteger(true,
                "Enter the length for the array: ",
                "ERROR: number must be a positive integer. ");
        int[] array = new int[num];
        fillArray(array);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        int newNum = getInteger(false,
                "Enter a new element to insert in the array: ",
                "");
        int[] newArray = sortedInsertion(array, newNum);
        System.out.println(Arrays.toString(newArray));

    }

}
