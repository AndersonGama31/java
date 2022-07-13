package primeiroprojeto;

public class AvaliaAluno {
    public static void main(String[] args) {
        String aluno = "Anderson Gama";
        double nota1 = 8.6;
        double nota2 = 5.2;
        double nota3 = 7.1;
        double media;
        double fator1 = 0.6;
        double fator2 = 0.2;
        boolean skl = false;

        /*
         * se o aluno for estagiário a soma das notas tem maior fator
         * a n1 caso não, o maior fator será estagio n3.
         * Para o aluno ser aprovado ele precisa somar 7 no total.
         */

        if (skl) {
            media = (nota1 * fator1) + (nota2 * fator2) + (nota3 * fator2);
            System.out.println("Nome do Aluno:" + aluno);
            System.out.println("Sua media:" + media);
            if (media >= 7) {
                System.out.println("O aluno " + aluno + "teve a média:" + media + " e está aprovado");
            } else {
                System.out.println("O aluno " + aluno + "teve a média:" + media + " e está reprovado");
            }
        } else {
            media = (nota1 * fator2) + (nota2 * fator2) + (nota3 * fator1);
            System.out.println("Aluno:" + aluno + " com média: " + media);
        }
        if (media >= 7) {
            System.out.println("Aluno sem estágio aprovado");
        } else {
            System.out.println("Aluno sem estágio reprovado");
        }
    }
}
