package resact7_09;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Main {

    public static void main(String[] args) {
        Lightbulb b1 = new Lightbulb();
        Lightbulb b2 = new Lightbulb();
        b1.on();
        b2.off();
        System.out.println("b1: " + b1.showStatus() + "\nb2: " + b2.showStatus());
        Lightbulb.setMasterSwitch(false);
        System.out.println("After turning off master switch: ");
        System.out.println("b1: " + b1.showStatus() + "\nb2: " + b2.showStatus());
        Lightbulb.setMasterSwitch(false);
        System.out.println("After turning on master switch: ");
        System.out.println("b1: " + b1.showStatus() + "\nb2: " + b2.showStatus());
        
    }

}
