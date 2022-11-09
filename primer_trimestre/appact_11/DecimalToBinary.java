package appact_11;

import java.util.Scanner;

/**
 * This program ask for a number in decimal base and shows the same number in
 * binary
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNum, binaryNum;
        // int rev = 0, digit, i = 0;
        String binary = "", binaryRev = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer decimal number: ");
        decimalNum = Math.abs(sc.nextInt());
        /* calculate the value in binary */
        while (decimalNum > 0) {
            binaryNum = decimalNum % 2;
            decimalNum /= 2;
            binary += (binaryNum + ""); // casting the int to String
        }
        /* rotate the string */
        for (int x = binary.length() - 1; x >= 0; x--) {
            binaryRev += binary.charAt(x);
        }
        /*
        alternative way:
        while(decimalNum > 0){
        digit = decimalNum % 2;
        rev = (digit * (int)Math.pow(10, i)) + rev;
        decimalNum = decimalNum / 2;
        i++;
        } 
        */

        System.out.printf("This number in binary is: %s\n",
                binaryRev);
    }

}
