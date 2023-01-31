package appact_20;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program gets a sentence or list of words from terminal and prints the
 * words sorted alphabetically
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class SortWords {

    /**
     * This function gets an String from terminal
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
     * This function separates all the words in a sentence (string) and sorts
     * them alphabetically.
     *
     * @param str the phrase to sort words
     * @return
     */
    static String[] sortWords(String str) {
        String[] wordList = str.split(" ");
        Arrays.sort(wordList);
        return (wordList);
    }

    /**
     * This function prints an array on terminal
     *
     * @param t
     */
    static void printArray(String[] t) {
        for (String element : t) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String phrase = getString("Enter a list of words, separated by space, "
                + "and the program will sort them alphabetically: ");
        String[] sortedWords = sortWords(phrase);
        printArray(sortedWords);

    }

}
