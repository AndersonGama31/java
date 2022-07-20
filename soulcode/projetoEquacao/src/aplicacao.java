import java.util.Scanner;

public class aplicacao {


    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Passe os valores: (a), (b) e (c) :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Equacao baskara = new Equacao(a,b,c);
        baskara.print();
    }
}
