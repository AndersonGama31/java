package aula4;
/*
 * Criar uma classe chamada Aeronave:
 * [tripulacao, combustivel, consumo, passageiros, passagem, tanque]
 * Criar os métodos da classe Aeronave:
 * 1. calcular a autonomia da Aeronave.
 * 2. calcular o indice por passageiro.
 * 3. Media de valor por autonomia de voo.
 * Depois usar a classe programa para mostrar estes dados em
 * 4 objetos e seu local fisico de armazenamento.
 *
 * Criar uma classe chamada Aeronave com atributos:
[int: tripulação, double: combustível, double: consumo, int: passageiros, double: passagem, double: tank]


1. Calcule a autonomia autonomia da Aeronave.
2. Calcule o indice por passageiro.
3. Media de valor por autonomia de voo.

Depois use a classe programa para mostrar esses dados em  4 objetos e seu local fisico de armazenamento.
 */

import java.lang.Math;

public class Aeronave {

    //#region Atributos

    String modelo;

    int tripulacao;


    double consumoFuel;

    int numPassageiro;


    double capacidadeFuel;

    //#endregion

    //#region Métodos: Regras de Negócios da Classe

    public double calculaAutonomia() {
        return Math.round((this.capacidadeFuel * this.consumoFuel));
    }


    public double verificarDesempenho() {
        double eco = (this.calculaAutonomia() / (numPassageiro + tripulacao));
        return Math.round(eco);
    }

    public boolean validaEcoDesempenho(double indice) {
        if (this.verificarDesempenho() > indice) {
            return true;
        } else {
            return false;
        }

    }


    //#endregion
}

