package addact_10;

/**
 * This program generates a random array of integers, then sorts it, putting the
 * even numbers first
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class EvenAndOdds {

    /**
     * This function fills the array with random numbers
     *
     * @param array
     */
    static void fillRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }

    /**
     * This funtion prints the array on terminal
     *
     * @param array
     */
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    /**
     * This function arranges the array
     *
     * @param array
     */
    static void arrangeEvenAndOdds(int[] array) {
        int aux, end = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                for (int j = i; j > 0 + end; j--) {
                    swap(array, (j - 1), j);
                }
                end++;
            }
        }
    }

    /**
     * This function swaps the value of two positions in an array
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

    public static void main(String[] args) {
        int array[] = new int[20];
        fillRandomNumbers(array);
        System.out.println("The unsorted array: ");
        printArray(array);
        System.out.println();
        System.out.println("The array with even numbers first: ");
        arrangeEvenAndOdds(array);
        printArray(array);
    }

}
