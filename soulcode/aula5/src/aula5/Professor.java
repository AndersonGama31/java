package aula5;

import java.lang.Math;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;


    //#region Encasulamento [ Getters and Setters ]


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    //#endregion

    //#region Regras de Negócio
    private double calculaSalario() {
        return Math.round((this.salario * 44) * 4.5);
    }

    public double calculaINSS() {
        if (calculaSalario() <= 1212) {
            return calculaSalario() *  0.075;
        }
        if (calculaSalario() >= 1212 && calculaSalario() <= 2427.35) {
            return calculaSalario() *  0.09;
        }
        if (calculaSalario() >= 2427.35 && calculaSalario() <= 3641.03) {
            return calculaSalario() *  0.12;
        }
        if (calculaSalario() >= 3641.03 && calculaSalario() <= 7087.22) {
            return calculaSalario() *  0.14;
        } else {

            return 0;
        }
    }
    public double calculaIRPF() {
        if (calculaSalario() <= 1903.98) {
            return 0;
        }
        if (calculaSalario() >= 1903.98 && calculaSalario() <= 2826.65) {
            return ((calculaSalario() - calculaINSS()) *  0.075) - 142.80;
        }
        if (calculaSalario() >= 2826.65 && calculaSalario() <= 3751.05) {
            return ((calculaSalario() - calculaINSS()) * 0.225) - 354.80;
        }
        if (calculaSalario() >= 3751.05 && calculaSalario() <= 4664.68) {
            return ((calculaSalario() - calculaINSS()) * 0.225) - 636.13;
        }else {
            return ((calculaSalario() - calculaINSS()) * 0.275) - 869.36;
        }
    }

        public String montaHolerite() {
            String holerite;
            holerite = ("Nome do professor: " + super.getNome() +
                    System.lineSeparator());
            holerite += ("  |  CPF: " + super.getCpf() + System.lineSeparator());
            holerite += ("  |  Valor Salario: " + this.calculaSalario() + System.lineSeparator());
            holerite += ("  |  Valor Hora : " + this.getSalario() + System.lineSeparator());
            holerite += ("  |  Curso Referente: " + this.getNomeCurso() + System.lineSeparator());
            holerite += ("  |  Imposto a ser descontado INSS: " + this.calculaINSS() + System.lineSeparator());
            holerite += ("  |  Imposto a ser descontado IRRF: " + this.calculaIRPF() + System.lineSeparator());

            return holerite;

        }

        //#endregion
    }


/*
 * Montar o método que calcula o INSS.
 * https://www.jornalcontabil.com.br/como-calcular-o-desconto-do-inss-nos-salarios-em-2022/#:~:text=At%C3%A9%20R%24%201.100%2C00%20(,e%206.433%2C57%20%E2%80%93%2014%25
 * Montar o método que calcula o IRPF com aliquotas a seguir:
 * https://www.gov.br/receitafederal/pt-br/assuntos/orientacao-tributaria/tributos/irpf-imposto-de-renda-pessoa-fisica
 * Montar o método de adição de planejamento de aula: 0,3 e DSR 0,2.
 */