package appact_18;

import java.util.Scanner;

/**
 * This program checks if a 4x4 square (two-dimensional array) is a 'magic
 * square', that is, that the sums of the values in each row and each column are
 * the same
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class MagicSquare {

    /**
     * This function gets an integer number from terminal
     *
     * @param message a messaje to show to the user in the terminal
     * @return
     */
    static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return (sc.nextInt());
    }

    /**
     * This function asks the user to enter values for a matrix of integers
     *
     * @param square
     */
    static void fillMatrix(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                square[i][j] = getNumber("Enter value " + (j + 1)
                        + " for columm " + (i + 1) + ": ");
                if (j == (square[i].length - 1)) {
                    System.out.println();
                }
            }
        }
    }

    /**
     * This function adds all values of a columm in a matrix
     *
     * @param square the two-dimensional array
     * @param columm the columm to add
     * @return the total sum
     */
    static int sumColumms(int[][] square, int columm) {
        int total = 0;
        for (int i = 0; i < square[columm].length; i++) {
            total += square[columm][i];
        }
        return (total);
    }

    /**
     * This function adds all values of a row in a matrix
     *
     * @param square the two-dimensional array
     * @param row the row to sum
     * @return the total value
     */
    static int sumRows(int[][] square, int row) {
        int total = 0;
        for (int i = 0; i < square.length; i++) {
            total += square[i][row];
        }
        return (total);
    }

    /**
     * This funcion checks if the sum of all columms in a two-dimensional array
     * have the same value
     *
     * @param square the two-dimensional array
     * @param value the value to check
     * @return
     */
    static boolean checkColumms(int[][] square, int value) {
        boolean magicSquare = true;
        for (int i = 1; i < square.length && magicSquare; i++) {
            if (value != sumColumms(square, i)) {
                magicSquare = false;
            }
        }
        return (magicSquare);
    }

    /**
     * This funcion checks if the sum of all rows in a two-dimensional array
     * have the same value
     *
     * @param square the two-dimensional array
     * @param value the value to check
     * @return
     */
    static boolean checkRows(int[][] square, int value) {
        boolean magicSquare = true;
        for (int i = 0; i < square[0].length && magicSquare; i++) {
            if (value != sumRows(square, i)) {
                magicSquare = false;
            }
        }
        return (magicSquare);
    }

    public static void main(String[] args) {
        int[][] square = new int[4][4];
        int total;
        boolean magicSquare;
        fillMatrix(square);
        total = sumColumms(square, 0);
        magicSquare = (checkColumms(square, total)
                && checkRows(square, total));
        if (magicSquare) {
            System.out.println("That's a magic square!");
        } else {
            System.out.println("That's not a magic square!");
        }
    }
}
