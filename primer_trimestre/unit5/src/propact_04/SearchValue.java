package propact_04;

import java.util.Scanner;

/**
 * This program asks for a length, creates an array of values entered by the
 * user, and searchs in the array for a value entered by the user
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SearchValue {

    /**
     * This function searchs for a value in an array
     *
     * @param list the array to make the search
     * @param key the value to find in the array
     * @return the first position where the value is found, or '-1' if the value
     * isn't in the array
     */
    static int search(int list[], int key) {
        int pos = -1;
        for (int i = 0; (i < list.length) && (pos == -1); i++) {
            pos = list[i] == key ? i : -1;
        }
        return (pos);
    }

    /**
     * This function gets an integer from console
     *
     * @param min the minimum value if the integer needs to be positive
     * @return the integer
     */
    static int getInteger(int min) {
        int num;
        Scanner sc = new Scanner(System.in);
        if (min < 0) {
            System.out.print("Enter a integer value: ");
            num = sc.nextInt();
        } else {
            do {
                System.out.printf("Enter a integer of value %d or more: ",
                        min);
                num = sc.nextInt();
                if (num < min) {
                    System.out.printf("ERROR: integer value must be"
                            + " higher than %d. ", min);
                }
            } while (num < min);
        }
        return (num);
    }

    /**
     * This function fills an array of values entered by the user
     *
     * @param list the array to fill of values
     * @return the filled list
     */
    static void fillList(int list[]) {
        int element;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("Enter a value for position '%d': ", i);
            element = sc.nextInt();
            list[i] = element;
        }
    }

    public static void main(String[] args) {
        int key, found;
        System.out.print("List length. ");
        int list[] = new int[getInteger(1)];
        System.out.print("Fill the list with values. ");
        fillList(list);
        System.out.print("Enter a value to search in the list. ");
        key = getInteger(-1);
        found = search(list, key);
        if (found >= 0) {
            System.out.printf("The value '%d' is found in the"
                    + " position '%d'.\n", key, found);
        } else {
            System.out.printf("The entered value of '%d' isn't in the"
                    + " list.\n", key);
        }
    }

}
