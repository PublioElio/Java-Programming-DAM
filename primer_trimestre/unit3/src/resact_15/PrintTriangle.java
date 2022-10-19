package resact_15;

import java.util.Scanner;

/**
 * This program prinst a triangle with sides entered by the user
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class PrintTriangle {

    public static void main(String[] args) {
        int num, sides;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        num = sc.nextInt();
        num = Math.abs(num);
        sides = num;
        for (int i = 0; i < num; i++) {
            for (int j = sides; j > 0; j--) {
                System.out.print("*");
            }
            sides--;
            System.out.println("");
        }
    }

}
