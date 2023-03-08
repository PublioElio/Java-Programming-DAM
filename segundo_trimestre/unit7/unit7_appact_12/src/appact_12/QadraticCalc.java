package appact_12;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class QadraticCalc {

    private double a;
    private double b;
    private double c;
    private double d;
    private double[] result = new double[2];
    private boolean positiveDisc;

    public QadraticCalc(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        d = calcDisc();
        result = equation();
    }

    private double calcDisc() {
        d = ((Math.pow(b, 2)) - (4 * a * c));
        positiveDisc = (d >= 0);
        return (d);
    }

    public double[] equation() {
        result[0] = (-b + (Math.sqrt(d))) / (2 * a);
        result[1] = (b + (Math.sqrt(d))) / (2 * a);
        return (result);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        d = calcDisc();
        result = equation();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        d = calcDisc();
        result = equation();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        d = calcDisc();
        result = equation();
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double[] getResult() {
        return result;
    }

    public boolean isPositiveDisc() {
        return positiveDisc;
    }
    
}
