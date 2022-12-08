package sorting;

public class SortingAlgorithms {

    /**
     * This is a function to swap values in an array
     *
     * @param array
     * @param i first position
     * @param j second position
     */
    public static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void bubbleSort(int[] array) {
        boolean swapped = false;
        int last = 0;

        do {
            swapped = false;
            for (int i = 0; i < (array.length - 1 - last); i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            last++;
        } while (swapped);
    }

    public static void selectionSort(int[] array) {
        int min; // here we are going to save the minimum value
        for (int index = 0; index < array.length - 1; index++) {
            min = index; // first value is allways the minimum
            for (int range = index + 1; range < array.length; range++) {
                /* then, we compare if the next position is lower than the 
                minimum */
                min = (array[range] < array[min]) ? range : min;
            }
            /* if the value has changed, we swap the value in each position of 
            the array */
            if (min != index) {
                swap(array, min, index);
            }
        }
    }

    public static void insertionSort(int[] array) {
        int previous, valueToInsert;
        
        /* we start the first loop in the position '1' of the array */
        for (int index = 1; index < array.length; index++) { 
            valueToInsert = array[index]; // we save the value to insert
            previous = index - 1; // also the previous value, to compare
            
            /* if the value of 'previous' is negative, we are out of bounds */
            while (previous >= 0 && (array[previous] > valueToInsert)) {
                array[previous + 1] = array[previous];
                previous--;
            }
            array[previous + 1] = valueToInsert;
        }
    }

}
