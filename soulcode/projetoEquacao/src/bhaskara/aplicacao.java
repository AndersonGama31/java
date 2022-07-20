package bhaskara;


import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Delta delta1 = new Delta();


        System.out.println("Passe o valor de (a): ");
        delta1.setA(scan.nextInt());

        System.out.println("Passe o valor de (b): ");
        delta1.setB(scan.nextInt());

        System.out.println("Passe o valor de (c): ");
        delta1.setC(scan.nextInt());

        double delta = delta1.calculaDelta();


        if (delta >= 0) {
            EquacaoX eq1 = new EquacaoX(delta1.getA(), delta1.getB(), delta1.getC());

            System.out.println("Delta:" + delta);
            System.out.printf("X1 : %.2f%n", eq1.calculaX1(delta));
            System.out.printf("X2 : %.2f%n", eq1.calculaX2(delta));

        } else {
            System.out.println("A raiz não existe!");
        }

    }
}
