package resact_04;

import java.util.Scanner;

/**
 * This program asks for a string, then shows the total number of blank spaces
 * in the string
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class CountBlankSpaces {

    /**
     * This function gets an String from terminal and returns it in lower case
     *
     * @param message a message to show to the user
     * @return the string in lower case
     */
    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return (sc.nextLine().toLowerCase());
    }

    /**
     * This function counts the total number os blank spaces in a given string
     *
     * @param string the string to search blank spaces
     * @return
     */
    static int countBlankSpaces(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                counter++;
            }
        }
        return (counter);
    }

    public static void main(String[] args) {
        String phrase;
        int blankSpaceTotal;
        phrase = getString("Enter a phrase to count the blank spaces: ");
        blankSpaceTotal = countBlankSpaces(phrase);
        System.out.printf("The total blank spaces in that string is: %d\n",
                blankSpaceTotal);
    }

}
