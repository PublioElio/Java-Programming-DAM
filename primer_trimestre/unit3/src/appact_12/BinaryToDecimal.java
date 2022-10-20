package appact_12;

import java.util.Scanner;

/**
 * This program calculates de decimal value of a binary number
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class BinaryToDecimal {

    public static void main(String[] args) {
        int binaryNum, decimalNum = 0;
        boolean isBinary = true;
        Scanner sc = new Scanner(System.in);
        do {
            int testBinary;
            System.out.print("Enter a valid binary integer number: ");
            binaryNum = sc.nextInt();
            testBinary = binaryNum;
            while (testBinary > 0) {
                int temp = testBinary % 10;
                if (temp > 1) {
                    isBinary = false;
                }
                testBinary = testBinary / 10;
            }
        } while (!isBinary); // this while checks that the number is valid

        while (binaryNum > 0) {
            int i = 0, temp = binaryNum % 10;
            decimalNum += temp * Math.pow(2, i);
            binaryNum = binaryNum / 10;
            i++;
        }
        System.out.printf("That number in decimal base is: %d\n",
                decimalNum);
    }

}
