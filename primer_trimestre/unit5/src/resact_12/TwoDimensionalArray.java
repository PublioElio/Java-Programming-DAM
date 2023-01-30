package resact_12;

/**
 * This program creates a two-dimensional array of integer numbers whith 5x5
 * length, and every element of position '[n][m]' contains the value '10 x n +
 * n'
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class TwoDimensionalArray {

    /**
     * This function prints a bidimensional array on terminal
     *
     * @param array
     */
    static void printArray(int[][] array) {
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] < 10) {
                    System.out.print(" | 0" + array1[j] + " | ");
                } else {
                    System.out.print(" | " + array1[j] + " | ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 10 * i + j;
            }
        }
        printArray(array);
    }

}
