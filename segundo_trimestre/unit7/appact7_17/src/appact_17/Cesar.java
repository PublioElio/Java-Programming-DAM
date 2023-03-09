package appact_17;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Cesar {

    public static String cifrar(int n, String texto) {
        String textoCifrado = "";
        char c;
        while (n > 26) {
            n %= 26;
        }
        for (int i = 0; i < texto.length(); i++) {
            c = texto.charAt(i);
            if (esAlfabetico(c)) {
                if ((esMayus(c) && ((n + c) > 90)) || (esMinus(c) && ((n + c) > 122))) {
                    textoCifrado += Character.toString(c + n - 26);
                } else {
                    textoCifrado += Character.toString(c + n);
                }
            } else {
                textoCifrado += Character.toString(c);
            }
        }
        return (textoCifrado);
    }

    private static boolean esMayus(char c) {
        return ((c >= 65 && c <= 90));
    }

    private static boolean esMinus(char c) {
        return ((c >= 97 && c <= 122));
    }

    private static boolean esAlfabetico(char c) {
        return (esMayus(c) || esMinus(c));
    }

}
