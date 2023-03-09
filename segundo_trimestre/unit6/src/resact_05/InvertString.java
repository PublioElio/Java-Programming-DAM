package resact_05;

import java.util.Scanner;

/**
 * This program gets an string form terminal and iverts it
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class InvertString {

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
     * This function inverts a String
     * @param s
     * @return 
     */
    static String invertString(String s) {
        String inverted = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            inverted += s.charAt(i);
        }
        return (inverted);
    }

    public static void main(String[] args) {
        String string;
        string = getString("Enter a phrase to invert: ");
        string = invertString(string);
        System.out.printf("The inverted string is: %s\n", string);
    }
}
