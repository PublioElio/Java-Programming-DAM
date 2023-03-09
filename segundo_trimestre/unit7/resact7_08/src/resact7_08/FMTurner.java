package resact7_08;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class FMTurner {

    private double frequency;
    private final double MIN = 80;
    private final double MAX = 108;

    public FMTurner(double initialFrequency) {
        if (initialFrequency < MIN) {
            this.frequency = MIN;
        } else if (initialFrequency > MAX) {
            this.frequency = MAX;
        } else {
            this.frequency = initialFrequency;
        }
    }

    public FMTurner() {
        this(80);
    }

    public void up() {
        this.frequency += 0.5;
        checkRange();
    }

    public void down() {
        this.frequency -= 0.5;
        checkRange();
    }

    public String display() {
        String s;
        s = "Frequency tuned: " + this.frequency + " FM.";
        return (s);
    }

    private void checkRange() {
        if (frequency < MIN) {
            setFrequency(MAX);
        } else if (frequency > MAX) {
            setFrequency(MIN);
        }
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
