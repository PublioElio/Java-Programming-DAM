package addact_10;

import java.util.Arrays;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class EvenAndOdds {

    static void fillRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }

    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    static void arrangeEvenAndOdds(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = new int[20];
        fillRandomNumbers(array);
        printArray(array);
        System.out.println("");
        arrangeEvenAndOdds(array);
        printArray(array);
    }

}
