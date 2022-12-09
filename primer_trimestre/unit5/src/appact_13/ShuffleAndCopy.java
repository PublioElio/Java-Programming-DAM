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
     * This function fills an array with the same value (the length of the array
     * + 1)
     *
     * @param array the array to fill
     */
    static void fillWithNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length;
        }
    }

    /**
     * This function checks if an index is already saved in the auxiliary array
     *
     * @param array the array to check
     * @param key the position (index) to search
     * @return if the key is found or not
     */
    static boolean isRepeated(int[] array, int key) {
        boolean repeated = false;
        for (int i = 0; i < array.length && !repeated; i++) {
            repeated = array[i] == key;
        }
        return (repeated);
    }

    /**
     * This function shuffles the elements of an array randomly and copies them
     * in a new array
     *
     * @param array the array to copy shuffled
     */
    static int[] shuffleAndCopy(int[] array) {
        int randomPosition, counter = 0;
        boolean repeated;
        int[] newArray = new int[array.length];
        int[] aux = new int[array.length]; // to save the used positions
        fillWithNumbers(aux);

        for (int i = 0; i < newArray.length; i++) {
            do {
                randomPosition = (int) (Math.random() * array.length);
                repeated = isRepeated(aux, randomPosition);
                if (!repeated) {
                    aux[counter++] = randomPosition;
                }
            } while (repeated);
            newArray[i] = array[randomPosition];
        }
        return (newArray);
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(num));
        int[] copy = shuffleAndCopy(num);
        System.out.println("Shuffled array: "
                + Arrays.toString(copy));
    }

}
