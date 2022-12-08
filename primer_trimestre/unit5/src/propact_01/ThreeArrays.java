package propact_01;

/**
 * This program shows the pointer to three arrays tipe integer, double and
 * boolean, and also, the content of each array
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ThreeArrays {

    /**
     * This function prints the content of an array of integers
     *
     * @param list the array to print
     */
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    /**
     * This function prints the content of an array of booleans
     *
     * @param list the array to print
     */
    public static void printArray(boolean[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    /**
     * This function prints the content of an array of doubles
     *
     * @param list the array to print
     */
    public static void printArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int integerArray[] = {4, 10, -12, 5, 0};
        double doubleArray[] = {0.0, 10.0, -12.25, 4.525, 8.4};
        boolean booleanArray[] = {true, false, false, true, true};

        System.out.println("The pointer to 'integerArray' is: " + integerArray);
        System.out.print("The content of 'integerArray' is: ");
        printArray(integerArray);
        System.out.println("The pointer to 'doubleArray' is: " + doubleArray);
        System.out.print("The content of 'doubleArray' is: ");
        printArray(doubleArray);
        System.out.println("The pointer to 'booleanArray' is: " + booleanArray);
        System.out.print("The content of 'booleanArray' is: ");
        printArray(booleanArray);
    }

}
