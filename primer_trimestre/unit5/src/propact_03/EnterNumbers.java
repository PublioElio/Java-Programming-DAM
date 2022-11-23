package propact_03;

import java.util.Scanner;

/**
 * This program creates an array of 'n' integers (entered by the user, ask the
 * user to fill it and shows on terminal: the average of positive and negative
 * values and total number of zeroes entered.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class EnterNumbers {

    /**
     * This function gets a positive integer number of value '1' or more
     *
     * @return a positive integer number
     */
    static int getPositiveInteger() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number ('1' or higher): ");
            num = sc.nextInt();
            if (num < 1) {
                System.out.print("ERROR: number must be '1' or higher. ");
            }
        } while (num < 1);
        return (num);
    }

    public static void main(String[] args) {
        int num, totalPositive = 0, positiveCount = 0, totalNegative = 0,
                negativeCount = 0, zeroCount = 0;
        Scanner sc = new Scanner(System.in);
        num = getPositiveInteger();

        int numberList[] = new int[num];

        for (int i = 0; i < numberList.length; i++) {
            System.out.printf("Enter an integer for position %d: ",
                    numberList[i]);
            numberList[i] = sc.nextInt();
            if (numberList[i] < 0) {
                totalNegative -= numberList[i];
                negativeCount++;
            } else if (numberList[i] > 0) {
                totalPositive += numberList[i];
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        if (positiveCount > 0) {
            System.out.printf("%d positive numbers entered. The average"
                    + " of positive numbers is: %,.2f\n", positiveCount,
                    ((double) totalPositive / (double) positiveCount));
        } else {
            System.out.println("No positive numbers entered.");
        }

        if (negativeCount > 0) {
            System.out.printf("%d negative numbers entered. The average "
                    + "of negative numbers is: %,.2f\n", negativeCount,
                    (((double) totalNegative / (double) negativeCount) * -1));
        } else {
            System.out.println("Not negative numbers entered");
        }
        System.out.printf("The total number of zeroes is: %d\n",
                zeroCount);
    }
}
