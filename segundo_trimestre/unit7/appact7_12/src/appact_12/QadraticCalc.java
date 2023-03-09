package appact_12;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class QadraticCalc {

    private double[] coef = new double[3];

    public QadraticCalc(double a, double b, double c) {
        this.coef[0] = a;
        this.coef[1] = b;
        this.coef[2] = c;
    }

    private double calcDisc() {
        double d;
        d = ((Math.pow(getCoef()[1], 2)) - (4 * getCoef()[0] * getCoef()[2]));
        return (d);
    }

    public double[] calculate() {
        double[] result = new double[2];
        if (isPositiveDisc() && (getCoef()[0] != 0)) {
            result[0] = (-getCoef()[1] + (Math.sqrt(calcDisc()))) /
                    (2 * getCoef()[0]);
            result[1] = (-getCoef()[1] - (Math.sqrt(calcDisc()))) /
                    (2 * getCoef()[0]);
        }
        return (result);
    }

    public boolean isPositiveDisc() {
        boolean positiveDisc = calcDisc() >= 0;
        return positiveDisc;
    }

    public double[] getCoef() {
        return coef;
    }

    public void setCoef(double[] coef) {
        this.coef = coef;
    }

}
