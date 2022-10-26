package addact_07;

import java.util.Scanner;

/**
 * This program generates a random four-digit number (the lock of a safe), the
 * user has 4 attempts to gess it
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class UnlockSafe {

    public static void main(String[] args) {
        int attempts = 0;
        String num, userNum;
        num = generate_num(); // uncomment next line to know the lock
        // System.out.println(num); 
        do {
            attempts++;
            userNum = get_user_num();
            if ((userNum.length() == 4) && (!userNum.equals(num))
                    && (attempts != 4)) {
                System.out.printf("You failed to break the safe!\n %d "
                        + "attempt(s) left\n", (4 - attempts));
            }
        } while ((attempts < 4) && (!userNum.equals(num)));
        if (!userNum.equals(num)) {
            System.out.println("You failed to break the safe!");
        } else {
            System.out.println("You managed to gess the lock!");
        }
    }

    /**
     * This function generates a random four-digit String
     *
     * @return a four-digit random String
     */
    static String generate_num() {
        String num = "";
        for (int i = 1; i < 5; i++) {
            num += (int) (Math.random() * 10);
        }
        return (num);
    }

    /**
     * This function gets a four-digit String from the user
     *
     * @return a four-digit String
     */
    static String get_user_num() {
        int num;
        String userNum = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer number "
                    + "from 0 to 9: ");
            num = sc.nextInt();
            if ((num < 0) || (num > 9)) {
                System.out.println("That's not a valid number");
            } else {
                userNum += num;
            }
        } while (userNum.length() < 4);
        return (userNum);
    }
}
