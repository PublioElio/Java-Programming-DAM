package addact_23;

import java.util.Scanner;

/**
 * This program asks for numbers until the total is 10.000 or less. Then, shows
 * the total amount, the quantity of numbers entered and the arithmetic mean
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class TenThousand {

    public static void main(String[] args) {
        int num, total = 0, count = 0;
        double mean;
        while (total <= 10_000) {
            num = get_num();
            total += num;
            count++;
        }
        mean = (total / (double) count);
        System.out.printf("""
                          Total numbers entered: %d;
                          Total sumatory of numbers entered: %d;
                          Arithmetic mean: %,.2f;
                          """, count, total, mean);
    }

    /**
     * This function gets a positive integer number
     *
     * @return a positive integer number
     */
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
