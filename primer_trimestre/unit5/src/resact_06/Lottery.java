package resact_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program is a simulation of a lottery: user enters a bet of six numbers,
 * and the program generates a random array of another six numbers, then both
 * arrays are compared and the number of hits is shown on terminal
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Lottery {

    /**
     * This function generates an array of six random numbers and sorts it
     *
     * @return
     */
    static int[] generateRandomNumbers() {
        int[] randomList = new int[6];
        for (int i = 0; i < randomList.length; i++) {
            randomList[i] = (int) ((Math.random() * 11) - 1);
        }
        Arrays.sort(randomList); // introducir algoritmo de ordenación
        return (randomList);
    }

    /**
     * This function asks the user for six digits from '0' to '9'
     *
     * @param message the message tho show in terminal
     * @param error the error messaje to show in terminal
     * @return an array of six integers
     */
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

    /**
     * This function generates two types of arrays: one is the user's bet, and
     * the other is a random generated array of six digits
     *
     * @param userBet true if the array to be generated is the user's bet
     * @return an array of six integers from '0' to '9'
     */
    static int[] generateList(boolean userBet) {
        int numbers[];
        if (userBet) {
            numbers = getUserNumbers("Enter your bet for position '%d': ",
                    "ERROR: the number must be between '0' and '9'. ");
        } else {
            numbers = generateRandomNumbers();
        }
        return (numbers);
    }

    /**
     * This function compares two arrays
     *
     * @param winnerNum the random generated array
     * @param userNum the user generated array
     * @return the number of coincidences
     */
    static int lottery(int[] winnerNum, int[] userNum) {
        int hits = 0;
        for (int i = 0; i < winnerNum.length; i++) {
            hits = (winnerNum[i] == userNum[i]) ? hits + 1 : hits;
        }
        return (hits);
    }

    /**
     * This function prints a list on terminal
     *
     * @param list the list to print
     */
    static void printList(int[] list) {
        for (int num : list) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int winnerNum[], userNum[];
        int hits;
        winnerNum = generateList(false);
        userNum = generateList(true);
        hits = lottery(winnerNum, userNum);
        System.out.print("Your bet: ");
        printList(userNum);
        System.out.print("\nWinning combination: ");
        printList(winnerNum);
        System.out.printf("\nNumber of hits %d.\n", hits);

    }

}
