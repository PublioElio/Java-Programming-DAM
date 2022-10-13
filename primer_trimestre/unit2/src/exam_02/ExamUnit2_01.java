package exam_02;

import java.util.Scanner;

/**
 * This program receives two numbers and an operator, and performs the resulting
 * operation
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ExamUnit2_01 {

    public static void main(String[] args) {
        double num1, num2, result = 0;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter operator: ");
        operator = sc.nextLine().charAt(0);
        switch (operator) {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num2;
            case '*' ->
                result = num1 * num2;
            case '/' ->
                result = num1 / num2;
            default ->
                System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }

}
