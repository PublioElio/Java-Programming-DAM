package exam_02;

import java.util.Scanner;

/**
 * This program receives an integer (positive or negative) of up to three digits
 * and flips it
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ExamUnit2_02 {

    public static void main(String[] args) {
        int num;
        boolean validNumber = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive or negative number "
                + "up to 3 digits: ");
        num = sc.nextInt();
        // num = Math.abs(num);
        num = num < 0 ? num * -1 : num;
        validNumber = (num <= 999);
        if (validNumber) {
            if (num < 10) {
                System.out.println("Result: " + num);
            } else if ((num >= 10) && (num < 100)) {
                num = (((num % 10) * 10) + (num / 10));
                System.out.println("Result: " + num);
            } else {
                num = ((num % 10) * 100) + (((num / 10) % 10) * 10)
                        + ((num / 100) % 10);
                System.out.println("Result: " + num);
            }
        } else {
            System.out.println("The number entered does not meet the required"
                    + " format");
        }
    }

}
