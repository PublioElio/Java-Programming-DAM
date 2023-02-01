package resact_01;

/**
 * This program lists all unicode characters with the code point value (from
 * \u0000 to \uFFFF)
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class ListUnicodeChars {

    public static void main(String[] args) {
        /* we use hexadecimal base to show the code point value, and it starts 
        with 0x */
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            /* turns a number into its hexadecimal base */
            String a = Integer.toHexString(codePoint);
            System.out.println("\\u" + a + ": " + (char) codePoint);
        }
    }

}
