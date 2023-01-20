package addact_07;

import java.util.Scanner;

/**
 * This program is a simple version of the game "minesheeper"
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Minesweeper {

    /**
     * This function gets an integer number from console, between a minimum and
     * a maximum
     *
     * @param message a messaje to show to the user
     * @param error an error message if the imput is incorrect
     * @param min the minimum value
     * @param max the maximum value
     * @return an integer number
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
     * This function prints a two-dimensional array on console as a board for
     * the minesheeper
     *
     * @param minefield
     */
    static void printMinefield(char[][] minefield) {
        System.out.println("-------------------------");
        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[0].length; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(minefield[i][j] + " | ");
            }
            System.out.println("\n-------------------------");
        }
    }

    /**
     * This function deploys randomly a number of elements in a matrix
     *
     * @param minefield
     * @param elementNum the number of elements to deploy
     * @param elementSymbol the symbol for that element
     */
    static void deployElements(char[][] minefield, int elementNum,
            char elementSymbol) {
        int row, col;
        boolean emptySpot;
        while (elementNum > 0) {
            row = generateRandomNum(0, (minefield.length - 1));
            col = generateRandomNum(0, (minefield[0].length - 1));
            emptySpot = (minefield[row][col] == '0');
            if (emptySpot) {
                minefield[row][col] = elementSymbol;
                elementNum--;
            }
        }
    }

    /**
     * This function fills a two-dimensional array of chars with a given symbol
     *
     * @param minefield the matrix
     * @param symbol the symbol to print
     */
    static void fillMinefield(char[][] minefield, char symbol) {
        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[0].length; j++) {
                minefield[i][j] = symbol;
            }
        }
    }

    /**
     * This function checks for mines surrounding given coordinates in a
     * two-dimensional character array, and modifyes the map of the player
     *
     * @param minefield the matrix to check
     * @param playerMap a map to help the player find the prize
     * @param row the row to check
     * @param col the column to check
     */
    static void checkForCloseMines(char[][] minefield, char[][] playerMap,
            int row, int col) {
        playerMap[row][col] = ' ';
        if ((row != 0) && (minefield[row - 1][col] == 'X')) {
            System.out.println("Look out! Mine at " + row + "-" + (col + 1));
            playerMap[row - 1][col] = 'X';
        }
        if ((row != 0) && (col != (minefield[0].length - 1))
                && (minefield[row - 1][col + 1] == 'X')) {
            System.out.println("Look out! Mine at " + row + "-" + (col + 2));
            playerMap[row - 1][col + 1] = 'X';
        }
        if ((col != (minefield[0].length - 1))
                && (minefield[row][col + 1] == 'X')) {
            System.out.println("Look out! Mine at "
                    + (row + 1) + "-" + (col + 2));
            playerMap[row][col + 1] = 'X';
        }
        if ((row != (minefield.length - 1))
                && (col != (minefield[0].length - 1))
                && (minefield[row + 1][col + 1] == 'X')) {
            System.out.println("Look out! Mine at " + (row + 2) + "-"
                    + (col + 2));
            playerMap[row + 1][col + 1] = 'X';
        }
        if ((row != (minefield.length - 1))
                && (minefield[row + 1][col] == 'X')) {
            System.out.println("Look out! Mine at " + (row + 2) + "-"
                    + (col + 1));
            playerMap[row + 1][col] = 'X';
        }
        if ((row != (minefield.length - 1)) && (col != 0)
                && (minefield[row + 1][col - 1] == 'X')) {
            System.out.println("Look out! Mine at " + (row + 1) + "-" + col);
            playerMap[row + 1][col - 1] = 'X';
        }
        if ((col != 0) && (minefield[row][col - 1] == 'X')) {
            System.out.println("Look out! Mine at " + (row + 1) + "-" + col);
            playerMap[row][col - 1] = 'X';
        }
        if ((col != 0) && (row != 0) && (minefield[row - 1][col - 1] == 'X')) {
            System.out.println("Look out! Mine at " + row + "-" + col);
            playerMap[row - 1][col - 1] = 'X';
        }
    }

    /**
     * This function ask the user for a row and a column, then checks the
     * content. If the player don't wins or loses, prints the map givin clues to
     * the player
     *
     * @param minefield the minefiel where the elements are hidden
     * @param playerMap a matrix to help the player play the game
     * @return if the user wins or loses
     */
    static boolean play(char[][] minefield, char[][] playerMap) {
        int col, row;
        char result;
        boolean winner = false, playing = true;
        do {
            row = getNum("Enter row: ", "ERROR: enter number between "
                    + "'1' " + "and '" + minefield.length + "'. ",
                    1, minefield.length) - 1;
            col = getNum("Enter column: ", "ERROR: enter number between "
                    + "'1' " + "and '" + minefield[0].length + "'. ",
                    1, minefield[0].length) - 1;
            result = minefield[row][col];
            switch (result) {
                case 'X' ->
                    playing = false;
                case '*' -> {
                    playing = false;
                    winner = true;
                }
                default -> {
                    if (playerMap[row][col] == ' ') {
                        System.out.print("Space already cleared, enter "
                                + "another coordinates. ");
                    } else {
                        checkForCloseMines(minefield, playerMap, row, col);
                        printMinefield(playerMap);
                    }
                }
            }
        } while (playing);
        return (winner);
    }

    public static void main(String[] args) {
        int height = 5, width = 6;
        boolean winner;
        char[][] minefield = new char[height][width];
        char[][] playerMap = new char[height][width];
        fillMinefield(minefield, '0'); // fill the board
        fillMinefield(playerMap, '0'); // fill the user board
        deployElements(minefield, 5, 'X'); // mines
        deployElements(minefield, 1, '*'); // prize
        printMinefield(playerMap);
        winner = play(minefield, playerMap);
        printMinefield(minefield);
        if (winner) {
            System.out.println("CONGRATULATIONS, YOU WON!!");
        } else {
            System.out.println("""
                               BOOOOOMMM!!!
                               You lose :( 
                               Better luck next time! :D
                               """);
        }
    }
}
