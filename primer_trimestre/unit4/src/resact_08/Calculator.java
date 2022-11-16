package resact_08;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program is a calculator that asks for two numbers and then, gives the
 * choice to add, substract, multiply or divide those numbers.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Calculator {

    public static void main(String[] args) {
        double result, num1, num2;
        num1 = get_num("first");
        num2 = get_num("second");
        result = calculator(num1, num2);
        System.out.printf("The result of the operation is: %,.2f\n",
                result);
    }

    /**
     * This is a calculator that makes additions, subtractions, multiplications
     * and divisions between two numbers
     *
     * @param num1 the first number
     * @param num2 the second number, if it's '0', division won't be possible
     * @return the result of the operation
     */
    static double calculator(double num1, double num2) {
        double result = 0;
        int choice;
        do {
            System.out.println("""
                               Select operation with a number between 1 and 4: 
                               1. Addition 
                               2. Subtraction 
                               3. Multiplication 
                               4. Division""");
            choice = (int) get_num("");
            switch (choice) {
                case 1 ->
                    result = num1 + num2;
                case 2 ->
                    result = num1 - num2;
                case 3 ->
                    result = num1 * num2;
                case 4 -> {
                    if (num2 == 0) {
                        System.out.print("ERROR: zero division not possible. "
                                + "Choose another option. ");
                        choice = 0;
                    } else {
                        result = num1 / num2;
                    }
                }
                default ->
                    System.out.print("IMPUT ERROR. ");
            }
        } while (choice < 1 || choice > 4);

        return (result);
    }

    /**
     * This function gets a number
     *
     * @param ordinal this string is shown in the message asking for the number
     * @return the number
     */
    static double get_num(String ordinal) {
        double num;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.printf("Enter %s number: ", ordinal);
        num = sc.nextDouble();
        return (num);
    }

}
