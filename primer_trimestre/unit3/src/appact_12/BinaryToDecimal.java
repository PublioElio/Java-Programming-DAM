package appact_12;

import java.util.Scanner;

/**
 * This program calculates de decimal value of a binary number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class BinaryToDecimal {

    public static void main(String[] args) {
        int binaryNum, decimalNum = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary integer number: ");
        binaryNum = sc.nextInt();

        while (binaryNum > 0) {
            int temp = binaryNum % 10;
            decimalNum += temp * Math.pow(2, i);
            binaryNum = binaryNum / 10;
            i++;
        }
        System.out.printf("That number in decimal base is: %d\n",
                decimalNum);
    }

}
