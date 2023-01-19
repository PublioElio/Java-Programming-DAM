package addact_07;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Minesweeper {

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

    static void printMinefield(int[][] minefield) {
        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[0].length; j++) {
                System.out.print(minefield[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void generateMinesTresaure(int[][] minefield, int numberOfElements, 
            int value) {
        int row, col;
        while (numberOfElements > 0) {
            row = generateRandomNum(0, (minefield.length - 1));
            col = generateRandomNum(0, (minefield[0].length - 1));
            if (minefield[row][col] != value) {
                minefield[row][col] = value;
            }
            numberOfElements--;
        }
    }

    public static void main(String[] args) {
        int height = 5, width = 10;
        int[][] minefield = new int[height][width];
        generateMinesTresaure(minefield, 5, 1);
        generateMinesTresaure(minefield, 1, 2);
        printMinefield(minefield);

    }

}
