package appact_13;

import java.util.Arrays;

/**
 * This program gets an array and makes a copy of it, but with the elements
 * randomly shuffled
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class ShuffleAndCopy {

    /**
     * This function copys an array
     *
     * @param array the array to copy
     * @return
     */
    static int[] arrayCopy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return (copy);
    }
    
        /**
     * This function swaps two elements of an array
     *
     * @param array the array to swap
     * @param i first element
     * @param j second element
     */
    static void swap(int[] array, int i, int j) {
        int aux;
        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    /**
     * This function shuffles the elements of an array randomly
     *
     * @param array the array to modify
     */
    static void shuffleArray(int[] array) {
        int randomPosition;
        for (int i = 0; i < array.length; i++) {
            do {
                randomPosition = (int) (Math.random() * array.length);
            } while (randomPosition == i);
            swap(array, i, randomPosition);
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(num));
        int[] copy = arrayCopy(num);
        shuffleArray(copy);
        System.out.println("Shuffled array: "
                + Arrays.toString(copy));
    }

}
