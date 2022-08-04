package Wrappers;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String email;
    private double salario;
    private String cpf;



    //#region Contrutores e Encapsuladores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", cpf='" + cpf + '\'' +
                '}';
    }
    //#endregion

    //#region Regras de Negocios
    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        setNome(valorSeparado[0]);
        setEmail(valorSeparado[1]);
        setSalario(Double.parseDouble(valorSeparado[2]));
        setCpf(valorSeparado[3]);
    }

    public void separaCpf(){
        String cpf = getCpf();
        String[] cpfSep = cpf.split("-");
        System.out.println(cpfSep[0]);
        System.out.println(cpfSep[1]);

        String campos = cpfSep[0];
        String troca = campos.replace(".", ";");
        System.out.println(troca);
        String[] camposSep = troca.split(";");
        int c1 = Integer.parseInt(camposSep[0]);
        int c2 = Integer.parseInt(camposSep[1]);
        int c3 = Integer.parseInt(camposSep[2]);
        int d1 = Integer.parseInt(cpfSep[1]);


        System.out.println("Inteiro c1:"+ c1+"Inteiro c2:"+ c2 +"Inteiro c3:"+ c3+ "Digito:"+d1);

    }

    //#endregion

}
/*
 * Construir método de separação de inteiros do CPF
 * 1. Coletar a String do CPF
 * 2. Separe o CPF em grupos de numros e digito.
 * 3. Imprima a separação destes numeros.
 * 4. Converta em variaveis inteiras com nomes de c1, c2, c3 e d1.
 */