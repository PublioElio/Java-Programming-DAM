package resact_12;

import java.util.Scanner;

/**
 * This program asks for five student's grades, and shows the number of fail
 * scores
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class FailGrade {

    public static void main(String[] args) {
        int grade, counter = 0;
        boolean fail = false;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a student's grade "
                    + "(integer number from 0 to 10): ");
            grade = sc.nextInt();
            if(grade < 5){
                fail = true;
                counter++;
            }
        }
        
        if (!fail){
            System.out.print("All students passed the tests! Well done!\n");
        }else{
            System.out.printf("Number of failed students: %d\n",
                    counter);
        }

    }
}
