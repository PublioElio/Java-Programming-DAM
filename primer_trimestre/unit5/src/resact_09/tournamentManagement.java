package resact_09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a program for managing a tournament, first it creates an ordered
 * array with the scores of all the competitors (the minimum score is '0'). It
 * then continues to add additional participants scores in an orderly fashion,
 * until a '-1' is entered.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class tournamentManagement {

    /**
     * This function copies in another array a number of elements
     *
     * @param src the source array to copy
     * @param srcPos the position to start copying
     * @param dst the destination array
     * @param dstPos the position to start copying
     * @param length the number of elements to copy
     */
    static void arrayCopy(int[] src, int srcPos,
            int[] dst, int destPos, int length) {
        for (int i = 0; i < length; i++) {
            dst[destPos + i] = src[srcPos + i];
        }
    }

    /**
     * This method inserts a value in a sorted integer array
     *
     * @param src the sorted array where to insert a new element
     * @param newElement the new element to insert
     * @return the array with the new element
     */
    static int[] sortedInsertion(int[] src, int newElement) {
        int insertionIndex = Arrays.binarySearch(src, newElement);
        if (insertionIndex < 0) {
            insertionIndex = -insertionIndex - 1;
        }
        int copy[] = new int[src.length + 1];
        arrayCopy(src, 0, copy, 0,
                insertionIndex);
        arrayCopy(src, insertionIndex, copy,
                (insertionIndex + 1), (src.length - insertionIndex));
        copy[insertionIndex] = newElement;
        return (copy);
    }

    /**
     * This function gets the first competitor scores and adds them to an
     * integer array, sorting it
     *
     * @param src the source array
     * @param min the minimum value
     * @param maxCompetitors the max number of competitors (elements in the
     * array)
     * @param message a message to show to the user
     * @param error an error message if the imput is invalid
     * @return the array, with all the values sorted
     */
    static int[] askForFirstScores(int[] src, int min, int maxCompetitors,
            String message, String error) {
        Scanner sc = new Scanner(System.in);
        int score;
        do {
            System.out.print(message);
            score = sc.nextInt();
            if (score < min) {
                System.out.print(error);
            } else {
                src = sortedInsertion(src, score);
                maxCompetitors--;
            }
        } while (maxCompetitors > 0);
        return (src);
    }

    /**
     * This method prints an integer array on termminal
     *
     * @param array the array to print
     */
    public static void arrayPrint(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " | ");
            }
        }
        System.out.println("]");
    }

    /**
     * This function is used for entering extra competitors in the tournament,
     * if an score of '-1' is entered, it stops asking for scores
     *
     * @param scores the array whith all the previous scores
     * @return the array whith all scores, sorted
     */
    static int[] enterExtraCompetitorScore(int[] scores) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter additional competitor score "
                + "(enter '-1' to exit): ");
        int extraScore = sc.nextInt();
        while (extraScore != -1) {
            if (extraScore < -1) {
                System.out.print("ERROR: invalid imput. ");
            } else {
                scores = sortedInsertion(scores, extraScore);
            }
            System.out.print("Enter additional competitor score "
                    + "(enter '-1' to exit): ");
            extraScore = sc.nextInt();
        }
        return (scores);
    }

    public static void main(String[] args) {
        int MAX_COMPETITORS = 5;
        int[] scores = new int[0];
        scores = askForFirstScores(scores, 0, MAX_COMPETITORS,
                "Enter competitor score: ",
                "ERROR: score minimum is '0'.");
        System.out.println("Total scores before extra competitors: ");
        arrayPrint(scores);

        scores = enterExtraCompetitorScore(scores);
        System.out.println("Final classification: ");
        arrayPrint(scores);
    }

}
