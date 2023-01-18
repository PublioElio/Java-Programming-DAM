package appact_15;

import java.util.Scanner;

/**
 * This program asks the user to enter the ratings for a classroom of five
 * students during three trimesters. Then shows the average of the class in a
 * trimester and the average score for a student in a year
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CheckStudentsRatings {

    /**
     * This function gets a number from the user using terminal, the number must
     * be between a minimum and a maximum value
     *
     * @param message a messaje to show to the user in the terminal
     * @param error an error if the imput is incorrect
     * @param min the minimum value
     * @param max the maximum value
     * @return
     */
    static int getNumber(String message, String error, int min, int max) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < min || num > max) {
                System.out.print(error);
            }
        } while (num < min || num > max);
        return (num);
    }

    /**
     * This function calculates and prints on terminal the average score of a
     * class in a trimester
     *
     * @param group the group of students to check average score
     */
    static void printTrimesterAverage(int[][] group) {
        int trimester, count = 0;
        double average = 0;
        trimester = getNumber("Enter the trimester to check: ",
                "ERROR. Trimester go from 1 to 3. ",
                1, 3) - 1;
        while (count < group[trimester].length) {
            average += group[trimester][count];
            count++;
        }
        System.out.printf("The average score for this trimester (%d) is: "
                + "%,.2f\n", (trimester + 1), (average / count));
    }

    /**
     * This function asks the user to enter the ratings for every student in a
     * group for a year
     *
     * @param group
     */
    static void enterRatings(int[][] group) {
        for (int i = 0; i < group.length; i++) {
            for (int j = 0; j < group[i].length; j++) {
                group[i][j] = getNumber("Enter rating for student "
                        + (j + 1) + " in trimester " + (i + 1) + ": ",
                        "ERROR. Ratings go from 1 to 10. ",
                        0, 10);
            }
        }
    }

    /**
     * This function shows on terminal the average score for a student in all
     * the course
     *
     * @param group
     */
    static void printStudentAverage(int[][] group) {
        int student;
        double average = 0;
        student = getNumber("Enter student number to check average "
                + "score: ", "ERROR. In each class there're five students "
                + "max. ", 1, 5) - 1;
        for (int i = 0; i < group.length; i++) {
            average += group[i][student];
        }
        System.out.printf("The average score for the student %d in the course "
                + "is: %,.2f\n", (student + 1), (average / group.length));
    }

    public static void main(String[] args) {
        int[][] clase = new int[3][5];
        enterRatings(clase);
        System.out.println("-----------------------------------------------");
        printTrimesterAverage(clase);
        System.out.println("-----------------------------------------------");
        printStudentAverage(clase);

    }

}
