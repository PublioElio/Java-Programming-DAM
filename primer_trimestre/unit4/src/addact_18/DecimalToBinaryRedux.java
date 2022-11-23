package addact_18;

import static addact_14.CustomMathLib.*;

/**
 * This program converts a decimal number into binary base
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class DecimalToBinaryRedux {

    public static void main(String[] args) {
        int num, binaryNum = 0;
        System.out.print("Enter a number in decimal base: ");
        num = getPositiveInt();
        

        if (num != 0) {
            binaryNum = 1;
            while (num > 1) {
                binaryNum = appendRight(binaryNum, num % 2);
                num /= 2;
            }
        }

        binaryNum = appendRight(binaryNum, 1);
        binaryNum = reverse(binaryNum);
        binaryNum = eraseRight(binaryNum, 1);

        System.out.printf("That number in binary is: %d\n", binaryNum);
    }
}
