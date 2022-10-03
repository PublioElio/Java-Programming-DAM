package exam_01;

import java.util.Scanner;

/**
 * This program asks for two numbers and checks if the bigger one is
 * divisible by the smallest
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class exam1 {

    public static void main(String[] args) {
        int num1, num2, biggest, smallest;
        boolean answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        num1 = sc.nextInt();
        System.out.print("Second number: ");
        num2 = sc.nextInt();

        biggest = num1 > num2 ? num1 : num2;
        smallest = num1 < num2 ? num1 : num2;
        /* alternative way, with Math library:
        Math.max(num1, num2);
        Math.min(num1, num2);
         */
        answer = (biggest % smallest) == 0;
        System.out.printf("Is '%d' divisible by '%d'?: %b\n",
                biggest, smallest, answer);
    }

}
