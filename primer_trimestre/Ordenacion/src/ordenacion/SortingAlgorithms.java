package ordenacion;

public class SortingAlgorithms {

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
        int indiceMenor;
        for (int indice = 0; indice < array.length - 1; indice++) {
            indiceMenor = indice;
            for (int recorrido = indice + 1; recorrido < array.length; recorrido++) {
                indiceMenor = (array[recorrido] < array[indiceMenor]) ? recorrido : indiceMenor;
            }
            if (indiceMenor != indice) {
                swap(array, indiceMenor, indice);
            }
        }
    }

    public static void insertionSort(int[] array) {
        int anterior, valorAInsertar;
        for (int indice = 1; indice < array.length; indice++) { // empiezo en la posición '1' del array
            valorAInsertar = array[indice]; // guardo el valor a insertar
            anterior = indice - 1; // guardo la posición anterior al índice para comparar
            while (anterior >= 0 && (array[anterior] > valorAInsertar)) {
                array[anterior + 1] = array[anterior];
                anterior--;
            }
            array[anterior + 1] = valorAInsertar;
        }
    }

}
