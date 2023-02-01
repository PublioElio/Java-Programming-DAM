package resact_02;

import java.util.Scanner;

/**
 * This program compares the length of two strings
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ComparePhrases {

    /**
     * This function gets a string form console
     *
     * @return
     */
    static String getPhrase(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return (sc.nextLine());
    }

    /**
     * This funcion compares the value of two strings
     *
     * @param phrase1
     * @param phrase2
     */
    static void comparePhrases(String phrase1, String phrase2) {
        if (phrase1.length() > phrase2.length()) {
            System.out.println("\"" + phrase1 + "\"" + " is longer.");
        } else if (phrase1.length() < phrase2.length()) {
            System.out.println("\"" + phrase2 + "\"" + " is longer.");
        } else {
            System.out.println("Both phrases are equal.");
        }
    }

    public static void main(String[] args) {
        String phrase1, phrase2;
        phrase1 = getPhrase("Enter a phrase: ");
        phrase2 = getPhrase("Enter a second phrase: ");
        comparePhrases(phrase1, phrase2);
    }
}
