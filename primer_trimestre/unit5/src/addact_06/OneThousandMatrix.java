package addact_06;

/**
 * This program generates a two-dimensional array with integer values from '0'
 * to '1000', without repeated values. Then prints on terminal the minimum and
 * maximum values, with both coordinates
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class OneThousandMatrix {

    /**
     * This function searchs for the position of an integer value in a
     * two-dimensional array, if it dosen't finds the position for the value,
     * returns '-1'.
     *
     * @param t the matrix to check
     * @param key the value to search
     * @param currentRow the limit row to search
     * @param currentCol the limit column to search
     * @return the position of the value or '-1' if the value isn't present
     */
    static int search(int t[][], int key, int currentRow, int currentCol) {
        int pos = -1;
        for (int i = 0; (i <= currentRow) && (pos == -1); i++) {
            for (int j = 0; (j <= currentCol) && (pos == -1); j++) {
                pos = t[i][j] == key ? i : -1;
            }
        }
        return (pos);
    }

    /**
     * This function generates random values ​​with a given minimum and maximum.
     *
     * @param min
     * @param max
     * @return a random integer between the specified bounds
     */
    static int generateRandomNum(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    /**
     * This function asks the user to fill the table with integers from '0' to
     * '1000', without repeated values
     *
     * @param t the matrix to fill with numbers
     */
    static void fillTable(int[][] t) {
        int num;
        boolean notValid;
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++) {
                do {
                    num = generateRandomNum(0, 1000);
                    notValid = (search(t, num, row,
                            col) != -1);
                } while (notValid);
                t[row][col] = num;
            }
        }
    }

    /**
     * This function prints the two-dimensional array
     *
     * @param t the two-dimension array to print
     */
    static void printMatrix(int t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * This function searchs for the minimum and maximum values in a matrix,
     * then prints on terminal both values, with their positions on the
     * two-dimensional array
     *
     * @param t
     */
    static void printMinMax(int[][] t) {
        int min = 1000, max = 0, minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] < min) {
                    min = t[i][j];
                    minRow = (i + 1);
                    minCol = (j + 1);
                }
                if (t[i][j] > max) {
                    max = t[i][j];
                    maxRow = (i + 1);
                    maxCol = (j + 1);
                }
            }
        }
        System.out.printf("Minimum value is %d, in row %d, column %d.\n",
                min, minRow, minCol);
        System.out.printf("Maximum value is %d, in row %d, column %d.\n",
                max, maxRow, maxCol);
    }

    public static void main(String[] args) {
        int[][] t = new int[6][10];
        fillTable(t);
        printMatrix(t);
        printMinMax(t);
    }

}
