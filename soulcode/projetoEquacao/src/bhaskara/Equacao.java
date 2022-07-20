package bhaskara;

public class Equacao {

    private double a;
    private double b;
    private double c;

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return Math.pow(b, 2) - (4*a*c);
    }

    public double denominador(){
        return 2*a;
    }

    public double numeradorx1(){
        return -b+Math.sqrt(delta());
    }
    public double numeradorx2(){
        return -b-Math.sqrt(delta());
    }

    public double x1(){
       return numeradorx1()/denominador();
    }
    public double x2(){
        return numeradorx2()/denominador();
    }

public void print(){
        if(delta() == 0){
            System.out.println(" X1 - X2= "+String.format("%.2f", x1()));
        } else if (delta() !=0 && delta()>0) {
            System.out.println("X1 : "+ x1());
            System.out.println("X2 : "+ x2());
        }else{
            System.out.println("Raíz não existe!");
        }

}

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}