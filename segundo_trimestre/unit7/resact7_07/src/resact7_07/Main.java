package resact7_07;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    public static void main(String[] args) {
        Text string = new Text(20);
        System.out.println(string.showTextInfo());
        string.addCharEnd(' ');
        string.addStringEnd("Hello world!");
        string.addCharEnd(' ');
        System.out.println(string.showTextInfo());
        System.out.println("Total number of vowels: " + string.getTotalVowels());
        
    }

}
