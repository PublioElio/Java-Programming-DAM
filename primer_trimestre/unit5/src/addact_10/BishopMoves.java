package addact_10;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class BishopMoves {

    static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j != (board[0].length - 1)) {
                    System.out.print(board[i][j] + " | ");
                }
            }
            if (i != (board.length - 1)) {
                System.out.println("\n-----------------------------------------------");
            } else {
                System.out.println();
            }

        }
    }

    static void fillBoard(String[][] board, String symbol) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = symbol;
            }
        }
    }

    public static void main(String[] args) {
        String[][] board = new String[10][10];
        fillBoard(board, "  ");
        printBoard(board);
    }

}
