package addact_24;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class NumbersTriangle {

    public static void main(String[] args) {
        int n, sides;
        n = get_num();
        for (int i = 0; i < n; i++) {
            sides = 1;
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                sides += k;
                System.out.printf("%d ",sides);
            }
            System.out.println();
        }
    }

    static int get_num() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Invalid number");
            }
        } while (num <= 0);
        return (num);
    }
}
