package resact_13;

import java.util.Scanner;

/**
 * This program asks for six student's grades, and shows on console: number of
 * passing students, students with a score of four and failed students
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class FailGradeRedux {

    public static void main(String[] args) {
        int grade, fail = 0, four = 0, pass = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a student's grade: ");
            grade = sc.nextInt();
            if (grade >= 5) {
                pass++;
            } else if (grade == 4) {
                four++;
            } else {
                fail++;
            }
        }
        System.out.printf("There are %d passing students, %d students with"
                + " a score of four and %d failed students\n",
                pass, four, fail);

    }
}
