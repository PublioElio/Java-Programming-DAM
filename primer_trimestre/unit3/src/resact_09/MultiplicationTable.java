package resact_09;

import java.util.Scanner;

/**
 * This program asks for a number and displays its multiplication table
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int num, res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            res = num * i;
            System.out.printf("%d   X   %d  =   %d\n",
                    num, i, res);
        }
    }
}
