package resact7_09;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Lightbulb {

    public static boolean masterSwitch = true;
    private boolean singleSwitch;

    public Lightbulb() {
        singleSwitch = false;
    }

    public void on() {
        singleSwitch = true;
    }

    public void off() {
        singleSwitch = false;
    }

    public boolean status() {
        return (singleSwitch && masterSwitch);
    }

    public String showStatus() {
        return (status() ? "ON" : "OFF");
    }

    public boolean isSingleSwitch() {
        return singleSwitch;
    }

    public void setSingleSwitch(boolean singleSwitch) {
        this.singleSwitch = singleSwitch;
    }

    public static boolean isMasterSwitch() {
        return masterSwitch;
    }

    public static void setMasterSwitch(boolean aMasterSwitch) {
        masterSwitch = aMasterSwitch;
    }
}
