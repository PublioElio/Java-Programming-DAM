package addact_10;

import java.util.Scanner;

/**
 * This is a program where the user puts a bishop on a chessboard and the
 * positions it can take are shown
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class BishopMoves {

    /**
     * This function gets an integer from the terminal, between a minimum and a
     * maximum
     *
     * @param messagea messaje to show to the user
     * @param error an error messaje if parameters are incorrect
     * @param mina minimum value
     * @param max a maximum value
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
     * This function gets a character from terminal, from a minimum to a maximum
     * values in the ASCII table
     *
     * @param messagea messaje to show to the user
     * @param error an error messaje if parameters are incorrect
     * @param mina minimum value
     * @param max a maximum value
     * @return
     */
    static char getChar(String message, String error, int min, int max) {
        char cha;
        boolean validChar;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            cha = sc.nextLine().toLowerCase().charAt(0);
            validChar = (cha >= min) && (cha <= max);
            if (!validChar) {
                System.out.print(error);
            }
        } while (!validChar);
        return (cha);
    }

    /**
     * This function gets the coodinates to move the bishop in the board, making
     * the calculations for its representation on the board (from '8' to '1' and
     * from 'a' to 'h')
     *
     * @param coords
     */
    static void getCoords(int[] coords) {
        coords[0] = (9 - getNum("Enter the row: ", "ERROR. Number"
                + " must be between '1' and '8'. ", 1, 8));
        coords[1] = (96 - (int) getChar("Enter the column: ",
                "ERROR. Only characters from 'a' to 'h'. ",
                97, 104)) * -1;
    }

    /**
     * This function prints a chessboard in console
     *
     * @param board
     */
    static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j != (board[0].length - 1)) {
                    System.out.print(board[i][j] + " | ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            if (i != (board.length - 1)) {
                System.out.println("\n---------------------------------------"
                        + "--------");
            } else {
                System.out.println();
            }

        }
    }

    /**
     * This funcion fills the sides of the board, the top row and the bottom
     * row, with numbers form '8' to '1' and characters from 'a' to 'h'
     *
     * @param board
     */
    static void fillBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (((i == (board.length - 1)) || (i == 0)) && (j != 0)
                        && (j != board[0].length - 1)) {
                    board[i][j] = " " + (char) (97 + j - 1);
                } else if ((i != 0) && (i != board.length - 1) && ((j == 0)
                        || (j == board[0].length - 1))) {
                    board[i][j] = " " + (9 - i);
                } else {
                    board[i][j] = "  ";
                }
            }
        }
    }

    /**
     * This function translates coordinates to string
     *
     * @param coords the coords to turn into a string.
     * @return
     */
    static String coordsToString(int[] coords) {
        String s;
        s = "" + (9 - (coords[0])) + (char) (coords[1] + 96);
        return (s);
    }

    /**
     * This function prints on terminal the top and bottom positions where the
     * bishop can be moved
     *
     * @param board the board where to print the coordinates
     * @param coords the coordinates where the bishop will be moved
     */
    static void printMoves(String[][] board, int[] coords) {
        int count = 1;
        board[coords[0]][coords[1]] = coordsToString(coords);
        for (int row = (coords[0] - 1); row > 0; row--) {
            for (int col = 1; col < (board[0].length - 1); col++) {
                printConditions(col, coords, count, row, board);
            }
            count++;
        }
        count = 1;
        for (int row = (coords[0] + 1); row < (board.length - 1); row++) {
            for (int col = 1; col < (board[0].length - 1); col++) {
                printConditions(col, coords, count, row, board);
            }
            count++;
        }

    }

    /**
     * This function evaluates the positions in which the coordinates for moving
     * the bishop are to be printed
     *
     * @param col the column to check
     * @param coords the coordinates entered by the user
     * @param count a counter to go up/down in the matrix
     * @param row the row to check
     * @param board the chessboard
     */
    static void printConditions(int col, int[] coords, int count, int row,
            String[][] board) {
        int temp[] = new int[2];
        if ((col == (coords[1] - count))
                || (col == (coords[1] + count))) {
            temp[0] = row;
            temp[1] = col;
            board[row][col] = coordsToString(temp);
        }
    }

    public static void main(String[] args) {
        String[][] board = new String[10][10];
        int[] coords = new int[2];
        fillBoard(board); // this is the base board with characters and numbers
        printBoard(board);
        getCoords(coords);
        printMoves(board, coords);
        printBoard(board);
    }

}