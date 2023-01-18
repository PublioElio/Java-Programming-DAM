package addact_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program makes the binary search in a sorted array
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class BinarySearch {

    /**
     * This function makes a binary search in a sorted array
     *
     * @param array the array where we're going to search
     * @param key the key to search
     * @return the first occurrence of that key in the array
     */
    static int binarySearch(int[] array, int key) {
        int position = -1, start = 0, end = (array.length - 1), mid;
        while ((start <= end) && (position < 0)) {
            mid = (start + end) / 2;
            if (array[mid] < key) {
                start = mid + 1;
            } else if (array[mid] == key) {
                position = mid;
            } else {
                end = mid - 1;
            }
        }
        return (position);
    }

    /**
     * This function gets an integer
     *
     * @param args
     */
    static int getInt(boolean mustBePositive, String message) {
        int num;
        do {
            System.out.print(message);
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if ((num < 0) && mustBePositive) {
                System.out.print("ERROR: number must be positive. ");
            } else {
                mustBePositive = false;
            }
        } while (mustBePositive);
        return (num);
    }

    public static void main(String[] args) {
        int pos, num;
        
        /* uncomment different arrays to test */
        int[] numbers = {0, 1, 2, 3, 4};
//        int[] numbers = {15, 20, 25, 30, 35, 40, 45};
//        int[] numbers = {-5, -10, 2, 20, 40, 112, 125};

        num = getInt(false,
                "Enter a value to search in the array: ");

        pos = binarySearch(numbers, num);

        if (pos < 0) {
            System.out.printf("The number '%d' isn't in the array: ",
                    num);
            System.out.println(Arrays.toString(numbers));

        } else {
            System.out.printf("The number '%d' is in the position '%d' of "
                    + "the array: ", num, pos);
            System.out.println(Arrays.toString(numbers));
        }
    }

}
