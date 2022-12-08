package binary_search;

import java.util.Arrays;

/**
 * This program makes the binary search in a sorted array
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class binarySearch {

    static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    static void bubbleSort(int[] array) {
        boolean swapped = false;
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

    static int binarySearch(int[] array, int value) {
        int position = -1, index = 0, end = (array.length -1);
        do {

        } while((position < 0) && (end > index));
        return (position);
    }

    public static void main(String[] args) {

        int[] numeros = {29, 10, 14, 37, 14, 25, 3};
        System.out.println("Unsorted array: " + Arrays.toString(numeros));

        bubbleSort(numeros);
        System.out.println("Sorted array with bubble sort: "
                + Arrays.toString(numeros));
    }

}
