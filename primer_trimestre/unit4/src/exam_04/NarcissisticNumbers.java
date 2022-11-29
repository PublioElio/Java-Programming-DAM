package exam_04;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class NarcissisticNumbers {

    public static int potencia(int base, int exponente) {
        int potencia = 1;
        if (exponente == 0) {
            potencia = 1;
        } else {
            for (int i = 1; i <= exponente; i++) {
                potencia *= base;
            }
        }
        return (potencia);
    }

    static boolean esNarcisista(int num) {
        int numDigitos = longitudNumero(num);
        int rdo = 0, resto = 0, aux = num;
        while (aux > 0) {
            resto = aux % 10;
            rdo += potencia(resto, numDigitos);
            aux /= 10;
        }
        return (rdo == num);
    }

    static int longitudNumero(int num) {
        int digitos = 0;
        while (num > 0) {
            digitos++;
            num /= 10;
        }
        return (digitos);
    }

    static void imprimeNarcisistas(int LIMITE) {
        int cont = 0, num = 0;
        while (cont < LIMITE) {
            if (esNarcisista(num)) {
                System.out.println(num + " ");
                cont++;
                num++;
            } else {
                num++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Primeros 20 números narcisistas: ");
        int LIMITE = 20;
        imprimeNarcisistas(LIMITE);
    }

}
