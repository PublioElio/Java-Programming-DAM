package appact_18;

import java.util.Scanner;

/**
 * This program gets a phrase by terminal and converts it to camel case
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CamelCaseConverter {

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
     * This function gets an string and turns all the words into camel case
     *
     * @param str the string (phrase) to convert to camel case
     * @return
     */
    static String toCamelCase(String str) {
        String[] words = str.split(" ");
        str = words[0];
        for (int i = 1; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1);
            str += words[i];
        }
        return (str);
    }

    public static void main(String[] args) {
        String phrase = getString("Enter a phrase to convert to camel"
                + " case: ");
        phrase = toCamelCase(phrase);
        System.out.println(phrase);

    }

}
