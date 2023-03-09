package appact_19;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Pila {

    private int pila[];
    private int numElementos;

    public Pila(int capacidad) {
        capacidad = capacidad <= 0 ? 10 : capacidad;
        pila = new int[capacidad];
        numElementos = 0;
    }

    public Pila() {
        this(10);
    }

    public boolean pilaLlena() {
        return (pila.length == numElementos);
    }

    public boolean colaVacia() {
        // si Pila fuera una estructura dinámica, este método devuelve siempre false
        return (numElementos == 0);
    }

    public void push(int elemento) {
        if (numElementos < pila.length) {
            pila[numElementos] = elemento;
            numElementos++;
        }
    }

    public Integer pop() {
        Integer elemento = null; // utilizamos un wrapper
        if (numElementos != 0) {
            elemento = pila[numElementos - 1];
            numElementos--;
        }
        return (elemento);
    }
}
