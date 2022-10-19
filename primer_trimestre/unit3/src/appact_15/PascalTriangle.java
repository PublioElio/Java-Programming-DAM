package appact_15;

import java.util.Scanner;

/**
 * This program prints a pascal triangle
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class PascalTriangle {

    public static void main(String[] args) {
        int triangleRows, number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in the pascal triangle: ");
        triangleRows = scanner.nextInt();

        for (int i = 0; i <= triangleRows; i++) {
            number = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
