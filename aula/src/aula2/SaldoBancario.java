package aula2;
import java.util.Random;

public class SaldoBancario {

    public static void main(String[] args) {

        Random randomico = new Random();


        double saldoAtual = 10000;
        double movimentacao = 0;
        double t = 0;
        int c = 0;
        double credito = 0;
        double debito = 0;
        while (c < 5) {
            c++;

            movimentacao = randomico.nextInt(-2500, 2500);



            if (movimentacao > 0) {
                saldoAtual += movimentacao;
                System.out.println("Creditado o valor de " + movimentacao);
                System.out.println("Saldo atual de " + saldoAtual);
                debito+=movimentacao;
            }
            if(movimentacao < 0) {
                saldoAtual += movimentacao;
                System.out.println("Debitado o valor de " + movimentacao);
                System.out.println("Saldo atual de " + saldoAtual);
                credito+=movimentacao;
            }
            System.out.println("Foi creditado: "+credito+ " e foi debitado: " +debito);
            System.out.println("Saldo final de "+saldoAtual);

        }
    }
}

