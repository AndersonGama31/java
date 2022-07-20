package bhaskara;


public class Delta extends Equacao {
    protected double delta;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double calculaDelta() {
        this.delta = ((getB() * getB()) - (4 * getA() * getC()));
        return delta;
    }
}
