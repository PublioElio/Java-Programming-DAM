package resact_03;

import java.util.Scanner;

/**
 * This function is a game for guessing a password (string)
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class GuessPassword {

    /**
     * This function gets an string from terminal
     *
     * @param message a message to show to the user
     * @return
     */
    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return (sc.nextLine());
    }

    /**
     * This function compares two strings, printing on terminal if one is longer
     * or shorter than another
     *
     * @param word1 the password
     * @param word2 the user's guess
     * @return if the user's guess is correct
     */
    static boolean compareString(String word1, String word2) {
        boolean result = false;
        if (word1.length() > word2.length()) {
            System.out.printf("The password is longer than \"%s\".\n",
                    word2);
        } else if (word1.length() < word2.length()) {
            System.out.printf("The password is lower than \"%s\".\n",
                    word2);
        } else {
            result = true;
            System.out.println("You guessed the password!");
        }
        return (result);
    }

    public static void main(String[] args) {
        String password, guess;
        Boolean winner = false;
        password = getString("Player 1, enter the password to guess: ");
        do {
            guess = getString("Player 2, guess the password: ");
            winner = compareString(password, guess);
        } while (!winner);
    }

}
