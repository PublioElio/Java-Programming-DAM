package exam_05;

import java.util.Scanner;

/**
 * This program is a game for sorting numbers in a two-dimensional array, from
 * the lesser value to the greater value
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SortingGame {

    /**
     * This function generates a random integer number between a minimum and a
     * maximum
     *
     * @param min minimum value
     * @param max maximum value
     * @return a random integer number
     */
    static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    /**
     * This function gets a number form console between a minimum and a maximum
     *
     * @param message a messaje to show to the user
     * @param error an error messaje if the value is incorrect
     * @param min the minimum value
     * @param max the maximum value
     * @return
     */
    static int getNum(String message, String error, int min, int max) {
        int num;
        boolean validNum;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            validNum = (num >= min) && (num <= max);
            if (!validNum) {
                System.out.print(error);
            }
        } while (!validNum);
        return (num);
    }

    /**
     * This function prints the content of a two-dimensional array on terminal
     *
     * @param board
     */
    static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0 && (i != board.length - 1)) {
                    System.out.print("|   "); // prints empty rows
                } else if (board[i][j] != 0 && (i != board.length - 1)) {
                    /* prints columns with values */
                    System.out.print("| " + board[i][j] + " ");
                } else {
                    System.out.print("| C" + (j + 1)); // last row
                }
                if (j == board[0].length - 1) {
                    System.out.print("|"); // bar after the last column
                }
            }
            if (i == board.length - 2) { // line before the penultimate row
                System.out.println();
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print("----");
                }
            }
            System.out.println();
        }
    }

    /**
     * Function that checks if a position of an array is different than '0'. In
     * case that that position has a value, it prints a message of error by
     * terminal.
     *
     * @param lastRow the last row of the matrix to check if it is full
     * @param col the position to check
     * @return
     */
    static boolean checkColumn(int[] lastRow, int col) {
        boolean validCol = true;
        if (lastRow[col] != 0) {
            System.out.println("ERROR. Selected column full. ");
            validCol = false;
        }
        return (validCol);
    }

    /**
     * This function inserts a number into a column, provided that finds an
     * 'empty' space. Returns the row where the item has been inserted.
     *
     * @param board
     * @param num the value to insert
     * @param col the column where to insert the number
     * @return
     */
    static int insertNum(int[][] board, int num, int col) {
        boolean insertedNum = false;
        int insertedRow = -1;
        for (int i = 0; i < board.length - 1 && !insertedNum; i++) {
            if (board[i][col] == 0) {
                board[i][col] = num;
                insertedNum = true;
                insertedRow = i;
            }
        }
        return (insertedRow);
    }

    /**
     * This function checks that the numbers are in the correct order in each
     * row. I send only the row in which I want to check that the order is
     * right.
     *
     * @param row the row to check
     * @return
     */
    static boolean checkCorrectOrder(int[] row) {
        boolean correctOrder = true;
        int prevNum = row[0];
        for (int i = 1; i < row.length && correctOrder; i++) {
            if (row[i] < prevNum && row[i] != 0) {
                correctOrder = false;
            } else if (row[i] > prevNum) {
                prevNum = row[i];
            }
        }
        return (correctOrder);
    }

    /**
     * This function executes the game
     *
     * @param board
     */
    static void play(int[][] board) {
        int chosenCol, numToInsert, insertedRow, count = 0, LAST_ROW = 4,
                totalNum = ((board.length - 1) * board[0].length);
        boolean correctOrder;
        do { // this loop is what makes the game continue
            numToInsert = generateRandomNumber(1, 9);
            System.out.println("Place number: " + numToInsert);
            do { // this loop is to ask for a correct column
                chosenCol = getNum("Enter column (1 - " + board[0].length
                        + ") to place number " + numToInsert + ": ",
                        "ERROR. Columns go fro '1' to '"
                        + board[0].length + "'. ", 1,
                        board[0].length);
                chosenCol--;
            } while (!checkColumn(board[LAST_ROW], chosenCol));
            insertedRow = insertNum(board, numToInsert,
                    chosenCol); // I place the number and keep the row 
            count++; // this counter is the number of items inserted
            printBoard(board);
            /* I check that the numbers are inserted correctly in the row */
            correctOrder = checkCorrectOrder(board[insertedRow]);
            /* if the player enters the numbers incorrectly, I end the loop 
            and the game */
        } while (correctOrder && (count < totalNum));
        if (!correctOrder) {
            System.out.println("Final result: ");
            printBoard(board);
            System.out.println("GAME OVER.\nYou put correctly "
                    + (count - 1) + " numbers of " + totalNum);
        } else {
            System.out.println("CONGRATULATIONS! YOU WON THE GAME!");
        }
    }

    public static void main(String[] args) {
        int ROWS = 6;
        int cols = getNum("Enter the number of rows (4/6): ",
                "ERROR. Number of rows between '4' and '6'. ",
                4, 6);
        int[][] board = new int[ROWS][cols];
        printBoard(board);
        play(board);
    }
}
