package appact_17;

import java.util.Scanner;

/**
 * This program gets a word and and a positive integer number by terminal, them
 * cuts the word in substrings with the size of the number, and displays the
 * result on terminal
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CutWords {

    /**
     * This method inserts an element at the end of an unordered array
     *
     * @param src the source array
     * @param element the element to insert
     * @return a new array
     */
    static String[] insertNonSort(String[] src, String element) {
        src = copyOf(src, src.length + 1);
        src[src.length - 1] = element;
        return (src);
    }

    /**
     * This method mimics the behavior of the copyOf method, copying an array in
     * another of a certain length. If the new array is greater than the
     * previous, fills the "gaps" with zeros, if the length of the new array is
     * lesser, copys up to specified length
     *
     * @param src the array to copy
     * @param length the new array length
     * @return a new array
     */
    static String[] copyOf(String[] src, int length) {
        String[] dst = new String[length];
        for (int i = 0; (i < length) && (i < src.length); i++) {
            dst[i] = src[i];
        }
        return (dst);
    }

    /**
     * This function cuts a string in substrings of a given length, returning an
     * array of substrings
     *
     * @param str the string to cut
     * @param length the size of the substrings
     * @return an array of substrings
     */
    static String[] cutWords(String str, int length) {
        String[] substrings = {};
        int index = 0, times = (int) Math.ceil(str.length() / (double) length);
        while (times > 0) {
            if (times == 1) {
                /* in the last loop, it gets the rest of the source string */
                substrings = insertNonSort(substrings,
                        str.substring(index));
            } else {
                substrings = insertNonSort(substrings,
                        str.substring(index, (index + length)));
                index += length;
            }
            times--;
        }
        return (substrings);
    }

    /**
     * This function prints an array on terminal, one element by one
     *
     * @param t
     */
    static void printArray(String[] t) {
        for (String element : t) {
            System.out.println(element);
        }
    }

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
     * This function gets an integer from terminal
     *
     * @param message a message to show to the user
     * @param error an error message to show to the user, if the imput is wrong
     * @param min the minimum value of the integer
     * @param max the maximum value of the ingeger
     * @return
     */
    static int getInt(String message, String error, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < min || num > max) {
                System.out.print(error);
            }
        } while (num < min || num > max);
        return (num);
    }

    public static void main(String[] args) {
        String word = getString("Enter a word: ");
        int cut = getInt("Enter the size of the substrings you want to "
                + "split the word into: ",
                "ERROR. Minimum length between '1' and " + word.length() + ". ",
                1, word.length());
        String[] sequence = cutWords(word, cut);
        printArray(sequence);
    }

}
