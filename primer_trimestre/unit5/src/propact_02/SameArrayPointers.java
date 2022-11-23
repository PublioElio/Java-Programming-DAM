package propact_02;

/**
 * This program has three integer array variables, all of them references to the
 * same directio memory, as is shown on terminal
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class SameArrayPointers {

    public static void main(String[] args) {
        int a[], b[], c[];
        a = new int[5];
        b = a;
        c = a;

        System.out.println("The next three variables references the same "
                + "direction memory.");
        System.out.println("The pointer to 'a' is: " + a);
        System.out.println("The pointer to 'b' is: " + b);
        System.out.println("The pointer to 'c' is: " + c);

    }

}
