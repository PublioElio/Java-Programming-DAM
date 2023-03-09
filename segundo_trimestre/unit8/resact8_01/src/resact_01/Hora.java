package resact_01;

/**
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class Hora {

    private int h;
    private int min;

    public Hora(int h, int min) {
        this.h = h >= 0 && h <= 23 ? h : 0;
        this.min = min >= 1 && min <= 60 ? min : 1;
    }

    public void inc() {
        if (this.min < 60) {
            this.min++;
        } else {
            this.min = 1;
            this.h = this.h == 23 ? 0 : this.h + 1;
        }
    }

    public boolean setMinutos(int valor) {
        boolean minSet = valor >= 1 && valor <= 60;
        this.min = minSet ? valor : this.min;
        return (minSet);
    }
    /*
    public boolean setHora(){
    
    }*/
}
