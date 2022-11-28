package resact_06;

import java.util.Scanner;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Lottery {

    static int[] generateRandomNumbers() {
        int[] randomList = new int[6];
        for (int i = 0; i < randomList.length; i++) {
            randomList[i] = (int) (Math.random() * 10);
        }
        return (randomList);
    }

    static int[] getUserNumbers(String message, String error) {
        int[] userList = new int[6];
        boolean validNum;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userList.length; i++) {
            do {
                System.out.printf(message, i);
                userList[i] = sc.nextInt();
                validNum = (userList[i] >= 0) && (userList[i] <= 9);
                if (!validNum) {
                    System.out.print(error);
                }
            } while (!validNum);
        }
        return (userList);
    }

    static int[] generateList(boolean userBet) {
        int[] numbers = new int[6];
        if (userBet) {
            numbers = getUserNumbers("Enter your bet for position '%d': ",
                    "ERROR: the number must be between '0' and '9'. ");
        } else {
            numbers = generateRandomNumbers();
        }
        return (numbers);
    }

    public static void main(String[] args) {
        int[] winnerNum = new int[6];
        int[] userNum = new int[6];
        int hits = 0;
        winnerNum = generateList(false);
        userNum = generateList(true);

    }

}
