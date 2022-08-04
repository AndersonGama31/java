package Wrappers;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.println("Digite as informaç~oes do aluno: [nome;email;salario;cpf]");
        String valor = entrada.nextLine();
        a1.guardaAluno(valor);
        a1.separaCpf();
        System.out.println(a1);

    }
}
