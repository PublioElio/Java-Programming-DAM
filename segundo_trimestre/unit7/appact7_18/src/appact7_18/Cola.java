package appact7_18;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Cola {

    private int[] cola;
    private int numElementos; // viene bien para conocer el número de elementos que habrá en la cola, los va contando conforme introducimos elementos en la cola

    public Cola(int capacidad) {
        capacidad = capacidad <= 0 ? 10 : capacidad;
        cola = new int[capacidad];
        numElementos = 0;
    }

    public Cola() {
        this(10);
    }

    public boolean colaLlena() {
        return (cola.length == numElementos);
    }

    public boolean colaVacia() {
        // si Cola fuera una estructura dinámica, este método devuelve siemopre false
        return (numElementos == 0);
    }

    public void push(int elemento) {
        if (numElementos < cola.length) {
            cola[numElementos] = elemento;
            numElementos++;
        }
    }

    public Integer pop() {
        Integer elemento = null; // utilizamos un wrapper
        if (numElementos != 0) {
            elemento = cola[0];
            for (int i = 0; i < (numElementos - 1); i++) {
                cola[i] = cola[i + 1];
            }
            numElementos--;
        }
        return (elemento);
    }
}
