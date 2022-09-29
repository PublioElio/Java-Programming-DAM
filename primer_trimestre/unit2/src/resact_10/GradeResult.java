package resact_10;

import java.util.Scanner;

/**
 * This program asks for a score a grades a student
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GradeResult {

    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        grade = sc.nextInt();
        switch (grade) {
            case 0, 1, 2, 3, 4 -> {
                System.out.println("Fail");
            }
            case 5 -> {
                System.out.println("Pass");
            }
            case 6 -> {
                System.out.println("Good");
            }
            case 7, 8 -> {
                System.out.println("Very good");
            }
            case 9, 10 -> {
                System.out.println("Outstanding");
            }
            default -> {
                System.out.println("That's not a valid grade");
            }
        }
    }
}
