package exam_05;

/**
 * This program creates an array of random size, between '5' and '15'. Then
 * fills the entire array with odd random values between '1' and '100'. Next,
 * orders the array with the following concepts: placing the prime numbers
 * first; the prime numbers will be ordered in ascending order (from lower to
 * greater value); non-prime numbers will be sorted in descending order (from
 * highest to lowest). Finally, the program displays the content of the
 * resulting array on terminal.
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Sorting {

    /**
     * This function generates random values ​​with a given minimum and maximum.
     *
     * @param min
     * @param max
     * @return a random integer between the specified bounds
     */
    static int generateRandomNum(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    /**
     * This function fills an array with random odd values ​​between '1' and
     * '100'
     *
     * @param array
     */
    static void fillArray(int[] array) {
        int num;
        for (int i = 0; i < array.length; i++) {
            do {
                num = generateRandomNum(1, 100);
            } while (num % 2 == 0);
            array[i] = num;
        }
    }

    /**
     * This function prints the elements of an array, followed by a space and,
     * at the end, a newline.
     *
     * @param array
     */
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * This function checks if a number is prime
     *
     * @param num the number to check
     * @return true if the number is prime
     */
    static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= (num / 2) && isPrime; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        return (isPrime);
    }

    /**
     * This function puts the prime numbers at the beginning of an array,
     * unsorted
     *
     * @param array
     */
    static void sortPrimeStart(int[] array) {
        int last = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                for (int j = i; j > 0 + last; j--) {
                    swap(array, (j - 1), j);
                }
                last++;
            }
        }
    }

    /**
     * This function sorts the prime numbers in the array in ascending order,
     * using the selection method
     *
     * @param array
     */
    static void selectionSortPrime(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                min = (array[j] < array[min]) && (isPrime(array[j])) ? j : min;
            }
            if (min != i) {
                swap(array, min, i);
            }
        }
    }

    /**
     * This function sorts the non-prime numbers of an array in descending order
     * using the bubble method
     *
     * @param array
     */
    static void bubbleSortNonPrime(int[] array) {
        boolean swapped;
        int last = 0;

        do {
            swapped = false;
            for (int i = 0; i < (array.length - 1 - last); i++) {
                if ((array[i] < array[i + 1]) && !isPrime(array[i])) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            last++;
        } while (swapped);
    }

    /**
     * This function swaps two positions in an array
     *
     * @param array
     * @param i
     * @param j
     */
    static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void main(String[] args) {

        int[] array = new int[generateRandomNum(1, 15)];

        fillArray(array);

        System.out.println("Random size of the array, from '5' to '15': "
                + array.length);
        System.out.print("Array filled with random odd numbers from '1' to"
                + " '100', unsorted: ");
        printArray(array);

        sortPrimeStart(array);
        System.out.print("Array with prime numbers at the beginning: ");
        printArray(array);

        selectionSortPrime(array);
        System.out.print("Array with the prime numbers ordered in ascending"
                + " order: ");
        printArray(array);

        bubbleSortNonPrime(array);
        System.out.print("Array with non-prime numbers ordered in descending"
                + " order: ");
        printArray(array);
    }
}
