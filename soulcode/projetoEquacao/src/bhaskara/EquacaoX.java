package bhaskara;

public class EquacaoX extends Equacao {
    private double x1;
    private double x2;

    public EquacaoX(double a, double b, double c) {
        super.setA(a);
        super.setB(b);
        super.setC(c);
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double calculaX2(double delta) {
        setX2((-getB() - (Math.sqrt(delta))) / (2 * getA()));
        return getX2();
    }

    public double calculaX1(double delta) {
        setX1((-getB() + (Math.sqrt(delta))) / (2 * getA()));
        return getX1();
    }
}
