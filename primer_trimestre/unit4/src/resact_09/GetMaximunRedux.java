package resact_09;

import java.util.Scanner;

/**
 * This program gets the maximum value between two or three numbers
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GetMaximunRedux {

    /**
     * This function gets the maximum value between two integer numbers
     *
     * @param num1 first number
     * @param num2 second number
     * @return the maximum value
     */
    static int getMax(int num1, int num2) {
        int max;
        max = num1 >= num2 ? num1 : num2;
        return (max);
    }

    /**
     * This function gets the maximum value between three variables
     *
     * @param num1 first number
     * @param num2 second number
     * @param num3 third number
     * @return the maximum value
     */
    static int getMax(int num1, int num2, int num3) {
        int max;
        max = getMax(getMax(num1, num2), num3);
        return (max);
    }

    /**
     * This function gets a number from the user
     *
     * @param ordinal this string is the ordinal of the number
     * @return a integer
     */
    static int getNum(String ordinal) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter %s number: ", ordinal);
        num = sc.nextInt();
        return (num);
    }

    public static void main(String[] args) {
        int num1, num2, num3, max = 0;

        String thirdNum;
        Scanner sc = new Scanner(System.in);

        num1 = getNum("first");
        num2 = getNum("second");

        do {
            System.out.print("Enter a third number? (yes/no): ");
            thirdNum = sc.nextLine();
            thirdNum = thirdNum.toLowerCase();
            switch (thirdNum) {
                case "yes" -> {
                    num3 = getNum("third");
                    max = getMax(num1, num2, num3);
                }
                case "no" -> {
                    max = GetMaximunRedux.getMax(num1, num2);
                }
                default ->
                    thirdNum = "error";
            }
            if (thirdNum.equals("error")) {
                System.out.print("ERROR: invalid imput. ");
            }
        } while (thirdNum.equals("error"));
        System.out.printf("The maximum value is: %d\n", max);
    }

}
