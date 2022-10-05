package resact_10;

import java.util.Locale;
import java.util.Scanner;

/**
 * This program asks for a score and grades a student
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GradeResult {

    public static void main(String[] args) {
        int grade;
        double realGrade;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Enter your score (integer number): ");
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
        System.out.println("""
                           -----------------------------------------------------
                           Alternative solution (with if-else): """);
        System.out.print("Enter your score "
                + "(real number with period, not comma): ");
        realGrade = sc.nextDouble();
        if (realGrade >= 5){
            if(realGrade >= 5 && realGrade < 6){
                System.out.println("Pass");
            } else if (realGrade >= 6 && realGrade < 7){
                System.out.println("Good");
            } else if (realGrade >= 7 && realGrade < 9){
                System.out.println("Very good");
            } else {
                System.out.println("Outstanding");
            }
        }else{
            System.out.println("Fail");
        }
    }
}
