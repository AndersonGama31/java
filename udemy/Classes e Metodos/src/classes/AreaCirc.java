package classes;

public class AreaCirc {
    double raio;
    static final double PI = 3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return raio * raio * PI;
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}

