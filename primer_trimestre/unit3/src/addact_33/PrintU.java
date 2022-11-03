package addact_33;

import java.util.Scanner;

/**
 * This program prints an 'u' with the '*' character, using a given height/width
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrintU {

    public static void main(String[] args) {
        int height;
        height = get_height();
        for (int i = 1; i <= height; i++) {
            if (i != height) {
                print_u(height, '*', ' ');
            } else {
                print_u(height, ' ', '*');
            }
            System.out.println();
        }

    }

    /**
     * This function prints the files to make an 'u' with the '*' character
     *
     * @param width width of the 'u', the number of characters printed
     * @param sides the character that will be printed in the sides
     * @param inside the character that will be printed in the inside
     */
    static void print_u(int width, char sides, char inside) {
        for (int j = 1; j <= width; j++) {
            if (j == 1 || j == width) {
                System.out.print(sides);
            } else {
                System.out.print(inside);
            }
        }
    }

    /**
     * This function gets a positive integer number
     *
     * @return the height of the 'u' that will be printed
     */
    static int get_height() {
        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter height: ");
            height = sc.nextInt();
            if (height < 0) {
                System.out.println("The height must be a positive"
                        + " integer number.");
            }
        } while (height < 0);
        return (height);
    }

}
