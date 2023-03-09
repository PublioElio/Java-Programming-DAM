package resact7_06;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Hour {

    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public void setHour(int h) {
        if (0 <= h && h <= 23) {
            this.hour = h;
        } else {
            this.hour = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (0 <= min && min <= 59) {
            this.min = min;
        } else {
            this.min = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (0 <= sec && sec <= 59) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }

    public void increaseSecs() {
        sec++;
        if (sec == 60) {
            sec = 0;
            min++;
            if (min == 60) {
                min = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }
}
