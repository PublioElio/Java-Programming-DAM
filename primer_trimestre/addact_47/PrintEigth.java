package addact_47;

import java.util.Scanner;

/**
 * This program prints an '8' on the screen using the character 'M'. The user
 * must enter the height, which must be an odd integer greater than or equal to
 * 5. The width of the figure will always be 6 characters.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrintEigth {

    public static void main(String[] args) {
        int h;
        h = get_height();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= 6; j++) {
                if ((i == 1) || (i == h) || (j == 1) || (j == 6)
                        || (i == (h / 2 + 1))) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    /**
     * This function returns a odd number of five or more
     *
     * @return an odd number of five or more
     */
    static int get_height() {
        int num;
        boolean isValid;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the height of the 8: ");
            num = sc.nextInt();
            isValid = (num >= 5) && (num % 2 != 0);
            if (!isValid) {
                System.out.println("The number must be odd of five or more.");
            }
        } while (!isValid);
        return (num);
    }
}
