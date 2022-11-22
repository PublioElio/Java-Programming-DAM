package addact_17;

import static addact_14.CustomMathLib.*;

/**
 * This program changes a number from binary to decimal base
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class BinaryToDecimalRedux {

    public static void main(String[] args) {
        int num, binaryNum, decimalNum = 0, exponent = 0, digit;
        do {
            System.out.print("Enter a positive binary number: ");
            num = getPositiveInt();
            if (!isBinary(num)) {
                System.out.print("That's not a valid binary number. ");
            }
        } while (!isBinary(num));

        binaryNum = num; // save the original value

        while (binaryNum != 0) {
            digit = binaryNum % 10;
            decimalNum += digit * power(2, exponent);
            binaryNum /= 10;
            exponent++;
        }

        System.out.printf("%d in decimal base is %d\n",
                num, decimalNum);
    }

}
