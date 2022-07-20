package aula4;

import java.lang.Math;

public class Carro {
    //#region Atributos
    String marca;
    String modelo;

    int numPassageiro;
    double capacidadeFuel;
    double consumoFuel;

    String tipoFuel;
    //#endregion


    //#region Métodos: Regras de Negócios da Classe
    public double calculaAutonomia(){
        return Math.round((this.capacidadeFuel * this.consumoFuel));
    }

    public double avaliaFuel(String fuel){
        if(fuel == "diesel") {
           return 1.6;
        } else if (fuel == "etanol") {
            return 0.7;

        }else {
            return 1;
        }
    }

    public double verificarDesempenho(){
        double eco = (this.calculaAutonomia()/this.numPassageiro) * this.avaliaFuel(this.tipoFuel);
        return Math.round(eco);
    }
    public boolean validaEcoDesempenho(double indice){
        if(this.verificarDesempenho() > indice ){
            return true;
        }else{
            return false;
        }

    }



    //#endregion
}
