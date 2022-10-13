package appact_18;

import java.util.Scanner;
import java.util.Random;

/**
 * this program generates two random numbers and a random arithmetic operation
 * (between subtraction, addition and multiplication), finally the user must
 * guess the result
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GuessTheNumber {

    public static void main(String[] args) {
        int num1, num2, num3, res;
        char symbol;
        boolean answer;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        num1 = random.nextInt(1, 99);
        num2 = random.nextInt(1, 99);
        num3 = random.nextInt(1, 4);
        /* 
        We can also get random numbers with Math.random
        num1 = Math.random() * 99 +1; 
         */

        symbol = switch (num3) { // here we get the symbol
            case 1 ->
                '+';
            case 2 ->
                '-';
            case 3 ->
                'x';
            default ->
                '\0';
        };

        System.out.printf("Enter the result of the next operation: "
                + "%d %c %d: ", num1, symbol, num2);
        res = sc.nextInt();

        answer = switch (symbol) { // check the answer
            case '+' ->
                (res == (num1 + num2));
            case '-' ->
                (res == (num1 - num2));
            case 'x' ->
                (res == (num1 * num2));
            default ->
                false;
        };

        if (!answer) {
            System.out.println("That's incorrect!");
        } else {
            System.out.println("That's correct!");
        }
    }
}
