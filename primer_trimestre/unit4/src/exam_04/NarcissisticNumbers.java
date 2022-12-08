package exam_04;

/**
 * This program prints on terminal the 20 first narcissistic numbers
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class NarcissisticNumbers {

    /**
     * This function calculates the power of a number
     *
     * @param base the base number
     * @param power
     * @return the result
     */
    public static int power(int base, int power) {
        int result = 1;
        if (power == 0) {
            result = 1;
        } else {
            for (int i = 1; i <= power; i++) {
                result *= base;
            }
        }
        return (result);
    }

    /**
     * This function checks if a number is narcissistic
     *
     * @param num
     * @return true or false
     */
    static boolean isNarcissistic(int num) {
        int digitNumber = length(num);
        int rdo = 0, resto = 0, aux = num;
        while (aux > 0) {
            resto = aux % 10;
            rdo += power(resto, digitNumber);
            aux /= 10;
        }
        return (rdo == num);
    }

    /**
     * This function gives the length (in digits) of a number
     *
     * @param num
     * @return
     */
    static int length(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return (digits);
    }

    /**
     * This function prints a list of narcissistic numbers
     *
     * @param LIMIT how many numbers will be printed on terminal
     */
    static void printNarcissistic(int LIMIT) {
        int count = 0, num = 0;
        while (count < LIMIT) {
            if (isNarcissistic(num)) {
                System.out.println(num + " ");
                count++;
                num++;
            } else {
                num++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("First 20 narcissistic numbers: ");
        int LIMIT = 20;
        printNarcissistic(LIMIT);
    }

}
