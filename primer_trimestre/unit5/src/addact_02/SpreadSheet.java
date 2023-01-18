package addact_02;

import java.util.Scanner;

/**
 *
 * This program simulates a spreadsheet with five rows and six columns, where
 * the last row is the sum of each column and the last column is the sum of each
 * row. The last box is the sum of the total
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SpreadSheet {

    /**
     * This function gets an integer by terminal
     *
     * @param message
     * @return en integer number
     */
    static int getNum(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return (sc.nextInt());
    }

    /**
     * This function asks the user to fill the table with integers. Last row and
     * last column aren't filled
     *
     * @param t the matrix to fill with numbers
     */
    static void fillTable(int[][] t) {
        for (int row = 0; row < (t.length - 1); row++) {
            for (int col = 0; col < (t[row].length - 1); col++) {
                t[row][col] = getNum("Enter a value for columm " + (col + 1)
                        + ", row " + (row + 1) + ": ");
            }
            System.out.println();
        }
    }

    /**
     * This function sums the total of a given column, the last number is the
     * total
     *
     * @param t the two-dimension array to calculate
     * @param col the column to make the sum
     */
    static void sumCol(int[][] t, int col) {
        int total = 0;
        for (int row = 0; row < t.length; row++) {
            if (row != (t.length - 1)) {
                total += t[row][col];
            } else {
                t[row][col] = total;
            }
        }
    }

    /**
     * This function sums the total of a given row, the last number is the total
     *
     * @param t the two-dimension array to calculate
     * @param row the row to make the sum
     */
    static void sumRow(int[][] t, int row) {
        int total = 0;
        for (int col = 0; col < t[row].length; col++) {
            if (col != (t[row].length - 1)) {
                total += t[row][col];
            } else {
                t[row][col] = total;
            }
        }
    }

    /**
     * This function makes all the calculations in the matrix, adding the total
     * of each row, column, and then the last row
     *
     * @param t the two-dimension array to calculate
     */
    static void sumAll(int[][] t) {
        int total = 0;
        for (int i = 0; i < (t.length - 1); i++) {
            sumRow(t, i);
        }
        for (int i = 0; i < t[0].length; i++) {
            sumCol(t, i);
        }
        for (int i = 0; i < t[0].length; i++) {
            total += t[t.length - 1][i];
            if (i == (t[0].length - 1)) {
                t[t.length - 1][i] = total;
            }
        }
    }

    /**
     * This function prints the two-dimensional array as a spreadwheet
     *
     * @param t the two-dimension array to print
     */
    static void printMatrix(int t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] < 10) {
                    System.out.print("   " + t[i][j] + " |");
                } else if (t[i][j] < 100) {
                    System.out.print("  " + t[i][j] + " |");
                } else {
                    System.out.print(" " + t[i][j] + " |");
                }
            }
            System.out.println("\n-------------------------------------");
        }

    }

    public static void main(String[] args) {
        int[][] excelTable = new int[5][6];
        fillTable(excelTable);
        sumAll(excelTable);
        printMatrix(excelTable);
    }

}
