package exam_03;

import java.util.Scanner;

/**
 * This is the exercise 1 of the unit 3 exam
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ExamUnit3_01 {

    public static void main(String[] args) {
        int height;
        height = get_height();
        print_pyramid(height);
    }

    /**
     * This function gets a valid height for the pyramid, a number between 1 and
     * 10
     *
     * @return a valid positive integer number
     */
    static int get_height() {
        int height;
        boolean validHeight;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number between 1 and 10: ");
            height = sc.nextInt();
            validHeight = ((height > 0) && (height < 11));
            if (!validHeight) {
                System.out.print("Invalid height. ");
            }
        } while (!validHeight);
        return (height);
    }

    /**
     * This function prints a pyramid of number, stating from '3'
     *
     * @param height the height of the pyramid
     */
    static void print_pyramid(int height) {
        for (int i = 0; i < height; i++) {

            for (int spaces = i; spaces <= height; spaces++) {
                System.out.print(" ");
            }
            /*left side*/
            for (int j = (i + 3); j >= 3; j--) {
                if (j > 9) {
                    int aux = j % 10;
                    System.out.printf("%d", aux);
                } else {
                    System.out.printf("%d", j);
                }
            }
            /*right side*/
            for (int k = 4; (i > 0) && (k <= i + 3); k++) {
                if (k > 9) {
                    int aux = k % 10;
                    System.out.printf("%d", aux);
                } else {
                    System.out.printf("%d", k);
                }
            }
            System.out.println();
        }
    }

}
