package addact_35;

import java.util.Scanner;

/**
 * This program prints a 'X' pattern using '*' character. The height is entered
 * by the user and is always an odd number bigger or equal than three.
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class PrintX {

    public static void main(String[] args) {
        int h;
        h = get_height();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j == i || ((j + i) == (h + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    /**
     * This function gets a valid height: positive odd integer number, bigger
     * than 2
     *
     * @return a odd positive integer number (3 or more)
     */
    static int get_height() {
        int num;
        boolean validNum;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter height of the X, it must be a odd "
                    + "positive integer number, bigger than 2: ");
            num = sc.nextInt();
            validNum = (num >= 3) && (num % 2 != 0);
            if (!validNum) {
                System.out.println("That's not a valid number.");
            }
        } while (!validNum);
        return (num);
    }
}
